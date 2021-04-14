package com.challente.rights;

import org.junit.Test;
import java.util.HashSet;
import static com.challente.rights.DatabaseGateway.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestGenericUser {

    @Test
    public void shouldNotGetValueOfAccessRightWhenRightIsProtected() {
        HashSet<String> protectedRights = new HashSet<>();
        protectedRights.add(WRITE_TO_DB);

        GenericUser genericUser = new GenericUser(protectedRights);
        genericUser.setUpAccessRight(WRITE_TO_DB, true);

        assertFalse(genericUser.getValueOfAccessRight(WRITE_TO_DB));
    }

    @Test
    public void shouldGetValueOfAccessRightWhenRightIsNotProtected() {
        final String CHANGE_IN_DATABASE = "change in database";

        GenericUser genericUser = new GenericUser(new HashSet<String>());
        genericUser.setUpAccessRight(CHANGE_IN_DATABASE, true);

        assertTrue(genericUser.getValueOfAccessRight(CHANGE_IN_DATABASE));
    }
}