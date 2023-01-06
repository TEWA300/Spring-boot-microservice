package com.example.tejas.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.example.tejas.domain.TourPackage;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage, String>{
	Optional<TourPackage> findByName(String name);

	/*
	 * @Override default Iterable<TourPackage> findAll() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default Iterable<TourPackage>
	 * findAllById(Iterable<String> ids) { // TODO Auto-generated method stub return
	 * null; }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteById(String id) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void delete(TourPackage entity) { //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteAllById(Iterable<? extends
	 * String> ids) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteAll(Iterable<? extends
	 * TourPackage> entities) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @RestResource(exported = false) default void deleteAll() { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 */	

}
