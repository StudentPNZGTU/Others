package edu.penzgtu.oop.task22;


import org.junit.jupiter.api.Test;

import static edu.penzgtu.oop.task22.Ipv6.isValidIpv6;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ipv6Test {

    @Test
    public void validIpv6Test() {
        String[] strings = {
        "22e4:fe1c:6c53:c7b7:e30d:5735:29db:dfe4",
        "aca1:fe5c:2c1a:aaf6:1a7b:5953:a7ed:144f",
        "5064:674a:26c:8e97:e651:b2e9:913d:b813",
        "2bb5:600e:2ec4:adcd:b4af:7a5a:f9fc:3202",
        "4c1d:aeb8:5908:f8c7:a968:8543:c68f:f659",
        "f872:ced2:ea5b:8d3e:649a:6e0e:c333:3f4b",
        "4b14:c07e:a5ee:7e27:125b:9113:4280:da60",
        "5587:9e8b:5928:7e1c:82be:434e:e13d:68d6",
        "2469:96:fa8c:d2db:8b27:d47a:9b2d:fd80",
        "4925:2154:1f34:fc22:df11:5bec:b4ae:961b",
        };
        for (String s : strings) {
            assertEquals(isValidIpv6(s), true);
        }
    }

    @Test
    public void invalidIpv6Test() {
        assertEquals(isValidIpv6("1234"), false);
        assertEquals(isValidIpv6("4925:2154:1f34:fc22:df11:5bec:b4ae:961w"), false);
        assertEquals(isValidIpv6("4925:2154:1f34:fc22:df11:5becb4ae:961f"), false);
    }
}
