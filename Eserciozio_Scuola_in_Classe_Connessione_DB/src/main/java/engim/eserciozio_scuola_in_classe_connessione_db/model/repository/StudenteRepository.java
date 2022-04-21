package engim.eserciozio_scuola_in_classe_connessione_db.model.repository;

import engim.eserciozio_scuola_in_classe_connessione_db.model.Studente;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudenteRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/scuola";
    private static final String USER = "java";
    private static final String PW = "java";

    public static List<Studente> selezioneStudenti() {
        List<Studente> studenteList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PW);
            String query = "{CALL seleziona_sudenti()}";
            PreparedStatement statement = connection.prepareCall(query);    // prepareCall() è store procedure
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Studente studente = new Studente(
                        rs.getLong("ID"),
                        rs.getString("NOME"),
                        rs.getString("COGNOME"),
                        rs.getString("INDIRIZZO")
                );
                studenteList.add(studente);
            }
            connection.close();
            statement.close();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return studenteList;
    }
}
