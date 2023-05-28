package br.com.alt.bank.blackjack.dto;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseJogadorDTO{
    Long id;
    Date inicioJogo; 
    Date fimDoJogo;
}
