package com.newportcapital.sia_erp.adapter.web.authentication.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTokenPayload {
    private Integer id;
    private String user;
    private String editionDate;

    public String getEditionDateOrDefault() {
        return editionDate != null ? editionDate : "";
    }
}
