package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月18日 14:43:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ct_add_Bean {
    public Ct_scan_info ct_scan_info;
    public Ct_Definiteness ct_definiteness;
    public Ct_Quantification ct_quantification;
}
