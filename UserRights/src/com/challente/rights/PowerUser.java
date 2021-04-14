package com.challente.rights;

import java.util.HashMap;
import java.util.Map;

public class PowerUser {
    Map<String, Boolean> accessRights = new HashMap<>();

    void setUpAccessRight(String right,boolean value){
        accessRights.put(right,value);
    }

    boolean getValueOfAccessRight(String accessRight){
        return accessRights.getOrDefault(accessRight, false);
    }
}
