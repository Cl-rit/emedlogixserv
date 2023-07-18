package com.emedlogix.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emedlogix.entity.Eindex;

@Repository
public interface EindexRepository extends JpaRepository<Eindex, Integer> {

	@Query("SELECT e from eindex e where e.code = :code")
	List<Eindex> findMainTermBySearch(String code);
	
	@Query(value = "SELECT t.parent_id as id,e.title as title,t.level as level from eindex e "
			+ "join term_hierarchy t on t.parent_id=e.id where t.child_id = :id", nativeQuery = true)
	List<Map<String,Object>> getParentChildList(Integer id);
}
