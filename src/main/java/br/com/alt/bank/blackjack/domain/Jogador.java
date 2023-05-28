package br.com.alt.bank.blackjack.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "usuario")
@Entity(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name="VALOR_As")
    private Integer valorAs;
    private Integer ponto;
    @ManyToOne
    @JoinColumn(name = "RODADA_ID")
    private Rodada rodada;
}
