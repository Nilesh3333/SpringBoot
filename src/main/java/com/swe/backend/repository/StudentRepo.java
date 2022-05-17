package com.swe.backend.repository;

//Author : Nilesh Bommisetty


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swe.backend.model.Student;

//specific extension of Repository. It contains the full API of CrudRepository and PagingAndSortingRepository
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}
