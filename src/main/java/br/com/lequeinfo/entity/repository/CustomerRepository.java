package br.com.lequeinfo.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.lequeinfo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	public Customer findByName(String name);
	
	@Query("select c from Customer c where c.name like %:name%")
	public List<Customer> findByPartName(@Param("name")String name);
}
