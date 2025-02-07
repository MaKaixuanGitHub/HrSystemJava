package com.dis.hrsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contract {
    private String index;
    private String kaisiDate;
    private String shuryouDate;
    private String kigenNasi;
}
