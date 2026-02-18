package com.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.model.AppModel;

public interface AppRepository extends JpaRepository<AppModel, Long> {
}