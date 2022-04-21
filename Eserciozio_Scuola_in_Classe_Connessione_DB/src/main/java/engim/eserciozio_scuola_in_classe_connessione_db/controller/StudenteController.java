package engim.eserciozio_scuola_in_classe_connessione_db.controller;

import engim.eserciozio_scuola_in_classe_connessione_db.model.Studente;
import engim.eserciozio_scuola_in_classe_connessione_db.model.repository.StudenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/studente")
public class StudenteController {
    //manca la store procedure -> vado in DB -> Selezione DB -> Menu routine -> aggiungo una routine
    // -> stesso nome di CALL di "String query = "{CALL seleziona_studenti()}";" ->  "seleziona_studenti" ->
    // tolgo parametri di default e a mano -> BEGIN SELECT * FROM studenti; END // tra BEGIN e END va posta la query SQL
    @GetMapping(value = "/selezionaStudenti")
    public List<Studente> selezionaStudenti(){
        return StudenteRepository.selezioneStudenti();
    }
}
