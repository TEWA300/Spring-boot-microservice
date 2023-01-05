package com.example.tejas.data.business;

import org.springframework.stereotype.Service;

import com.example.tejas.data.TourPackageRepository;
import com.example.tejas.domain.TourPackage;

@Service
public class TourPackageService {
	private final TourPackageRepository tourPackageRepository;

	public TourPackageService(TourPackageRepository tourPackageRepository) {
		this.tourPackageRepository = tourPackageRepository;
	}
	
	public TourPackage createTourPackage(String code, String name) {
		return this.tourPackageRepository.findById(code).orElse(this.tourPackageRepository.save(new TourPackage(code, name)));
	}
	
	public Iterable<TourPackage> lookUp() {
		return this.tourPackageRepository.findAll();
	}
	
	public long total() {
		return this.tourPackageRepository.count();
	}
}
