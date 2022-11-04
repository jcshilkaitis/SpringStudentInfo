package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.StudentInfo;



/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Oct 29, 2022
 */
@Repository
public interface StudentRepository extends
JpaRepository<StudentInfo, Long> { }