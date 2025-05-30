package pocket_lab.card.domain;

import jakarta.persistence.*;
import pocket_lab.card.domain.enums.ActionType;

@Entity
public class Actions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActionType actionType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skills_id", nullable = true)
    private Skills skill = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "abilities_id", nullable = true)
    private Abilities abilities = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainers_id", nullable = true)
    private Trainers trainers = null;
}
