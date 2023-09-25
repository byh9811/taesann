package com.ts.taesan.domain.transaction.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoResult {
    private List<Specific> documents;
//private String place_name;
//    private String category_group_code;
//    private String keyword;
}
