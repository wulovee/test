package com.fullspeed.address.addressresolution.until;

import com.fullspeed.address.addressresolution.constant.AddressResolutionConstant;
import com.fullspeed.address.addressresolution.vo.AddressResolutionVo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressResolutionUntil {

    public static AddressResolutionVo addressResolution(String address){
        Matcher m= Pattern.compile(AddressResolutionConstant.CONSTANT).matcher(address);
        AddressResolutionVo vo = new AddressResolutionVo();
        while(m.find()){
            vo.setProvince(m.group("province"));
            vo.setCity(m.group("city"));
            vo.setCounty(m.group("county"));
            vo.setAddress(m.group("address"));
        }
        return vo;
    }

    public static String getProvince(String address){
        return addressResolution(address).getProvince();
    }

    public static String getCity(String address){
        return addressResolution(address).getCity();
    }

    public static String getCounty(String address){
        return addressResolution(address).getCounty();
    }

    public static String getAddress(String address){
        return addressResolution(address).getAddress();
    }

}
