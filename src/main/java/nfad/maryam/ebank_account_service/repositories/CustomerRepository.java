package nfad.maryam.ebank_account_service.repositories;

import nfad.maryam.ebank_account_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


}
