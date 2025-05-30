package pocket_lab.card.domain;

import jakarta.persistence.*;
import pocket_lab.card.domain.enums.PokemonCategory;

@Entity
public class PokemonType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemons_id", nullable = false)
    private Pokemons pokemon;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PokemonCategory category;
}
