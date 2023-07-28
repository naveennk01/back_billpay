package com.iamneo.security.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iamneo.security.entity.VendorEntity;

//import com.example.demo.Model.VendorEntity;
@Repository
public interface Repo extends JpaRepository<VendorEntity,Integer> {
}
