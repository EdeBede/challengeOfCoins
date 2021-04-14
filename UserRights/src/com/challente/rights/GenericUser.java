package com.challente.rights;

import java.util.HashSet;
import java.util.Set;

public class GenericUser extends PowerUser {
    private Set<String> protectedRights;

    GenericUser(HashSet<String> protectedRights){
        this.protectedRights= protectedRights;
    }

    @Override
    void setUpAccessRight(String right, boolean value) {
        if (!protectedRights.contains(right)){
            accessRights.put(right,value);
        }
    }
}
