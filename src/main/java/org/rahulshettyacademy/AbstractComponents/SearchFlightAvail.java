package org.rahulshettyacademy.AbstractComponents;
import java.util.HashMap;

/*public interface SearchFlightAvail
{
    void checkAvail(String origin, String destination);
}*/

public interface SearchFlightAvail
{
    void checkAvail(HashMap<String, String> reservationDetails);
}


