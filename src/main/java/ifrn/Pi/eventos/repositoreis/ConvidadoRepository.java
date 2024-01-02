package ifrn.Pi.eventos.repositoreis;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.Pi.eventos.models.Convidado;
import ifrn.Pi.eventos.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{

	List<Convidado> findByEvento(Evento evento);
	
}
