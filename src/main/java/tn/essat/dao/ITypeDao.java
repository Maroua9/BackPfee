package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.essat.model.TypePfes;

public interface ITypeDao extends JpaRepository<TypePfes, Integer> {

}
