package pocket_lab.card.domain;

import jakarta.persistence.*;
import pocket_lab.card.domain.enums.TrainersCategory;

@Entity
public class Trainers {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TrainersCategory category;
}
