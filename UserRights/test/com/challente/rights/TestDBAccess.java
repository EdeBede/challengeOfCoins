package com.challente.rights;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.challente.rights.DatabaseGateway.*;
public class TestDBAccess {

    @Test
    public void testPowerUser() {

        PowerUser powerUser = new PowerUser();

        writeToDBForce(powerUser, "payload");
        assertEquals(readFromDB(), "payload");
    }
}