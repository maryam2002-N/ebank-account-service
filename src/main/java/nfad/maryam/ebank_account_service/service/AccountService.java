package nfad.maryam.ebank_account_service.service;

import nfad.maryam.ebank_account_service.dto.BankAccountRequestDTO;
import nfad.maryam.ebank_account_service.dto.BankAccountResponseDTO;
import nfad.maryam.ebank_account_service.repositories.BankAccountRepository;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
