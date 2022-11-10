package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Marketer;

public interface MarketRepositor extends JpaRepository<Marketer, Long> {

}
