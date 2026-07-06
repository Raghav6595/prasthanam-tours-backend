package com.prasthanam.tours.prasthanam_tours_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.prasthanam.tours.prasthanam_tours_backend.model.Package;
import com.prasthanam.tours.prasthanam_tours_backend.repository.PackageRepository;

@RestController
public class TestController {
    private final PackageRepository repo;

    public TestController(PackageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/test")
    public List<Package> getAll() {
        return repo.findAll();
    }
}
