package hongtay.vy.discgolfdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscPlastic {
    STAR("Star"),
    TITANIUM("Titanium"),
    KCPRO("KC Pro"),
    UNKNOWN("UNKNOWN");;

    private final String plastic;
}
