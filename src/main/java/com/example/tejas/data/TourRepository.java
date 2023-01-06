package com.example.tejas.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.example.tejas.domain.Tour;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer>{
	List<Tour> findByTourPackageCode(@Param("code") String code);

	/*
	 * @Override
	 * 
	 * @RestResource(exported = false) default Optional<Tour> findById(Integer id) {
	 * // TODO Auto-generated method stub return Optional.empty(); }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default Iterable<Tour> findAll() { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default Iterable<Tour>
	 * findAllById(Iterable<Integer> ids) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteById(Integer id) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void delete(Tour entity) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteAllById(Iterable<? extends
	 * Integer> ids) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteAll(Iterable<? extends
	 * Tour> entities) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteAll() { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
	

}
