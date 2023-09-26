package com.taesan.mydata.domain.bank.service;

import com.taesan.mydata.domain.bank.api.dto.inner.AccountInfo;
import com.taesan.mydata.domain.bank.api.dto.inner.AccountList;
import com.taesan.mydata.domain.bank.api.dto.response.AccountInfoResponse;
import com.taesan.mydata.domain.bank.api.dto.response.AccountListResponse;
import com.taesan.mydata.domain.bank.repository.AccountQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountQueryService {

    private final AccountQueryRepository accountQueryRepository;

    public AccountListResponse findAccountList(long memberCi, long cursor, int limit) {

        List<AccountList> accountList = accountQueryRepository.findAccountListByMemberCi(memberCi, cursor, limit);

        return AccountListResponse.builder()
                .accountList(accountList)
                .regDate("20170203")
                .nextPage(cursor + limit + 1)
                .build();
    }

    public AccountInfoResponse findAccountInfo(String accountNum) {

        List<AccountInfo> accountInfos = accountQueryRepository.findAccountInfoByAccountNum(accountNum);

        return AccountInfoResponse.builder()
                .basicList(accountInfos)
                .build();
    }

}
