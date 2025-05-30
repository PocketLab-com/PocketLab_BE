package pocket_lab.card.domain;

import jakarta.persistence.*;
import pocket_lab.card.domain.enums.Attribute;

import java.util.List;

@Entity
public class Pokemons {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer hp;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Attribute attribute;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Attribute weakness = Attribute.NONE;

    @Column(nullable = false)
    private Integer stage;

    @Column(nullable = false)
    private Integer retreat = 0;

    @OneToMany(mappedBy = "pokemon", fetch = FetchType.LAZY)
    private List<PokemonType> types;

    @OneToMany(mappedBy = "pokemon", fetch = FetchType.LAZY)
    private List<Skills> skills;

    @OneToMany(mappedBy = "pokemon", fetch = FetchType.LAZY)
    private List<Abilities> abilities;
}
