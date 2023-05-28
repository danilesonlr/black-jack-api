package br.com.alt.bank.blackjack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RodadaEncerradaDTO {
    Long id;
    String jogadadorVencedor;
    Integer pontuacaoVencedor;
    String nomePerderdor;
    Integer pontuacaoPerderdor;
    Date inicioJogo;
    Date fimDoJogo;


}

