package com.gb.sellerysc.user;

import com.gb.sellerysc.shared.utils.SectionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreateRequest {

    private String username;

    private String email;

    private SectionTypeEnum mainSection;

    private String passwordHash;

}
