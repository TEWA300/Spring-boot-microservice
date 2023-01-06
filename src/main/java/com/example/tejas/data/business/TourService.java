package com.example.tejas.data.business;

import org.springframework.stereotype.Service;

import com.example.tejas.data.TourPackageRepository;
import com.example.tejas.data.TourRepository;
import com.example.tejas.domain.Difficulty;
import com.example.tejas.domain.Region;
import com.example.tejas.domain.Tour;
import com.example.tejas.domain.TourPackage;

@Service
public class TourService {
	private final TourRepository tourRepository;
	private final TourPackageRepository tourPackageRepository;

	public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
		this.tourRepository = tourRepository;
		this.tourPackageRepository = tourPackageRepository;
	}
	
	public Tour createTour(String title, String description, String blurb, Integer price, String duration, String bullets,
            String keywords, String tourPackageName, Difficulty difficulty, Region region) {
		TourPackage tourPackage = this.tourPackageRepository.findByName(tourPackageName).orElseThrow(() -> new RuntimeException("Tour Package Not Found"));
		return this.tourRepository.save((new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region)));
	}
	
	public Long total() {
		return this.tourRepository.count();
	}

}
