package hongtay.vy.discgolfdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscType {
    PUTTANDAPPROACH("Putt and Approach"),
    MIDRANGE("Midrange"),
    FAIRWAY("Fairway"),
    DISTANCE("Distance"),
    UNKNOWN("UNKNOWN");

    private final String type;
}
