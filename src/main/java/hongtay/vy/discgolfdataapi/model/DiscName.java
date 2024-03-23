package hongtay.vy.discgolfdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscName {
    TEEBIRD("TeeBird"),
    BUZZZ("Buzzz"),
    ROC("Roc"),
    UNKNOWN("UNKNOWN");

    private final String name;
}
