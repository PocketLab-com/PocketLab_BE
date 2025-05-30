package pocket_lab.card.domain;

import jakarta.persistence.*;
import pocket_lab.card.domain.enums.Attribute;

@Entity
public class SkillEnergies {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Attribute attribute;

    @Column(nullable = false)
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skills_id", nullable = false)
    private Skills skill;
}
