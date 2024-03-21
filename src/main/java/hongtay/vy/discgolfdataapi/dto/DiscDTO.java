package hongtay.vy.discgolfdataapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiscDTO {
    String company;
    String name;
    String plastic;
    int speed;
    int glide;
    int turn;
    int fade;
}
