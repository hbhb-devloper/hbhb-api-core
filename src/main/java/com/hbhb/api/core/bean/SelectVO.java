package com.hbhb.api.core.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectVO implements Serializable {
    private static final long serialVersionUID = 3661010659703441995L;
    private Long id;
    private String label;
}
