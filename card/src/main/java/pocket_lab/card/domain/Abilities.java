package pocket_lab.card.domain;

import jakarta.persistence.*;

@Entity
public class Abilities {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemons_id", nullable = false)
    private Pokemons pokemons;
}
