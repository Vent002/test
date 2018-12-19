package com.exam.stem.last.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class StemContentInfo {
    private int id;
    private int stemId;
    private Date stemContent;
}
