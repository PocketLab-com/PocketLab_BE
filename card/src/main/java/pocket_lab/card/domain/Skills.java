package pocket_lab.card.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Skills {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemons_id", nullable = false)
    private Pokemons pokemons;

    @OneToMany(mappedBy = "skill", fetch = FetchType.LAZY)
    private List<SkillEnergies> energies;
}
