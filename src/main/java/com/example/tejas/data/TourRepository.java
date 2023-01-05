package com.example.tejas.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tejas.domain.Tour;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer>{

}
