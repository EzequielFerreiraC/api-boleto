package br.com.ezequiel.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoletoRequestDto {

    @NotNull(message = "Não pode ser nulo")
    @NotEmpty(message = "Não pode ser vazio")
    private String codigoBarras;
}
