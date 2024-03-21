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
    String company;
    String name;
    String plastic;
    int speed;
    int glide;
    int turn;
    int fade;
}
