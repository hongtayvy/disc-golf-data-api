package hongtay.vy.discgolfdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscCompany {
    INNOVA("Innova"),
    DISCRAFT("Discraft"),
    UNKNOWN("Unknown");

    private final String company;
}