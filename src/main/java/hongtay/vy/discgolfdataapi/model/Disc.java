package hongtay.vy.discgolfdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Disc {
    private String company;
    private String name;
    private String plastic;
    private String type;
    private int speed;
    private int glide;
    private int turn;
    private int fade;
}
