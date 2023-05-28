package br.com.alt.bank.blackjack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestSelecionarCartaDTO{
    String nomeJogador;
    Integer carta;
}
