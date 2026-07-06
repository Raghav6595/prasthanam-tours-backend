package com.prasthanam.tours.prasthanam_tours_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.prasthanam.tours.prasthanam_tours_backend.model.Package;

public interface PackageRepository extends MongoRepository<Package, String> {
}
