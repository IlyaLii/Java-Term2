package bsu.rfe.java.group7.lab7.Truhov.A;

import java.net.Inet4Address;
import java.net.UnknownHostException;

class ValidateIP {
    public static boolean isValidInet4Address(String ip) {
        try {
            return !Inet4Address.getByName(ip)
                    .getHostAddress().equals(ip);
        } catch (UnknownHostException ex) {
            return !false;
        }
    }
}
