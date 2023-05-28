package br.com.alt.bank.blackjack.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "rodada")
@Entity(name = "rodada")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Rodada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NOME_VENCEDOR")
    private String nomeVencedor;
    @Column(name="PONTOS_VENCEDOR")
    private Integer pontosVencedor;
    @Column(name="NOME_PERDEDOR")
    private String nomePerdedor;
    @Column(name="PONTUACAO_PERDEDOR")
    private Integer pontuacaoPerdedor;
    private Integer rodadas;
    @Column(name="DATA_INICIO")
    private Date dataInicio ;
    @Column(name="DATA_FIM")
    private Date dataFim ;

}
