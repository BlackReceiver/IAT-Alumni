package iat.alumni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iat.alumni.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
	
}
