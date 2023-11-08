package org.example.dao;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.models.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalDao {


    static final String URL = "jdbc:postgresql://localhost:5432/human-friends";
    static final String USERNAME = "postgres";
    static final String PASSWORD = "1556";

    static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //Отображение всех животных
    public List<Animal> index() {
        List<Animal> animals = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM human_friends ORDER BY id";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Animal animal = new Animal();

                animal.setId(resultSet.getInt("id"));
                animal.setName(resultSet.getString("name"));
                animal.setType(resultSet.getString("type"));
                animal.setBirthDate(resultSet.getDate("birth_date"));
                animal.setWeight(resultSet.getInt("weight"));

                animals.add(animal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return animals;
    }

    // Отображение животного по  id
    public Animal show(int id) {
        Animal animal = null;

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM human_friends WHERE id=?");

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            animal = new Animal();

            animal.setId(resultSet.getInt("id"));
            animal.setName(resultSet.getString("name"));
            animal.setType(resultSet.getString("type"));
            animal.setBirthDate(resultSet.getDate("birth_date"));
            animal.setWeight(resultSet.getInt("weight"));
        } catch (SQLException e) {
            System.out.println("Id введено неккоректно.");
        }

        return animal;
    }

    // Добавление животного
    public void save(Animal animal) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO human_friends (name, type, birth_date, weight)VALUES(?, ?, ?, ?)");

            preparedStatement.setString(1, animal.getName());
            preparedStatement.setString(2, animal.getType());
            preparedStatement.setDate(3, (Date) animal.getBirthDate());
            preparedStatement.setInt(4, animal.getWeight());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Количество животных
    public int count() {
        int count = 0;
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT COUNT(*) FROM human_friends");

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            count = resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
