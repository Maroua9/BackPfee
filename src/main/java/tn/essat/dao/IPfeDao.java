package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.essat.model.Pfe;

public interface IPfeDao extends JpaRepository<Pfe, Integer> {
	
	@Query("select p from pfe p where p.type.id=?1")
	public List<Pfe> getAllPfeByTypePfe(int id);
	
	@Query(value="select * from pfe p where p.titre COLLATE 'utf8_general_ci' like %:search% ", nativeQuery = true)
	public List<Pfe> search(@Param("search") String search);

}
