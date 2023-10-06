package edu.penzgtu.oop.task22;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ipv6Test {

    Ipv6 obj = new Ipv6();
    @Test
    public void validIpv6Test() {

        assertTrue( obj.validIpv6("") );
    }
}
