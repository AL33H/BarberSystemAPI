package com.BarberShopAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BarberShopAPI.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

}
