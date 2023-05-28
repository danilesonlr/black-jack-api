package br.com.alt.bank.blackjack.dto;

import br.com.alt.bank.blackjack.domain.Jogador;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePontosJogadoresDTO {
    String nome;
    Integer pontos;

    public ResponsePontosJogadoresDTO(Jogador jogador) {
        this(jogador.getNome(), jogador.getPonto());
    }
}

