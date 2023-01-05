package com.example.tejas.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tejas.domain.TourPackage;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage, String>{

}
