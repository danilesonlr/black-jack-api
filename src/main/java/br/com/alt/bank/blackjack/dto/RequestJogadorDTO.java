package br.com.alt.bank.blackjack.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestJogadorDTO {
    private String nome;
    private Integer valorA;
}
