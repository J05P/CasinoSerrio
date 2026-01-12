package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Users;

public interface IUsersServices extends JpaRepository<Users, Integer> {

	//meter query que no existan en JPA y añadirlas en el model con @NamedQuery( blablablablabla)
	//pa crear aqui la query hay que hacer @Query(blablalblabla) y abajo lo que da ejeplo una lista
}
