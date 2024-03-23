package hongtay.vy.discgolfdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscParameter {
    COMPANY("company"),
    NAME("name"),
    PLASTIC("plastic"),
    TYPE("type"),
    UNKNOWN("unknown");

    private final String parameter;
}