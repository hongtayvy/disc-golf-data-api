package hongtay.vy.discgolfdataapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "disc")
public class DiscEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "company")
    private String company;
    @Column(name = "name")
    private String name;
    @Column(name = "plastic")
    private String plastic;
    @Column(name = "type")
    private String type;
    @Column(name = "speed")
    private int speed;
    @Column(name = "glide")
    private int glide;
    @Column(name = "turn")
    private int turn;
    @Column(name = "fade")
    private int fade;
}
