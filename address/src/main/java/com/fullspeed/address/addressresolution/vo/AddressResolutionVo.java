package com.fullspeed.address.addressresolution.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResolutionVo {

    /**
     * 省
     * */
    private String province;

    /**
     * 市
     * */
    private String city;

    /**
     * 区/县
     * */
    private String county;

    /**
     * 地址
     * */
    private String address;

}
