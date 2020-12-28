package com.hbhb.api.core.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileVO implements Serializable {
    private static final long serialVersionUID = 4058087556231244561L;

    private Long id;
    private String fileName;
    private String fileSize;
}
