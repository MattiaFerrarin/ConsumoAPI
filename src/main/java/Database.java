import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance = null;
    private Connection connection;

    private Database(){
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Database getInstance(){
        if(instance != null){
            return instance;
        }else {
            instance = new Database();
            return instance;
        }
    }
}
