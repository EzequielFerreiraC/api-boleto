package br.com.ezequiel.demo.dto;

import br.com.ezequiel.demo.entity.enums.SituacaoBoleto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class BoletoDto {

    private String codigoBarras;
    private SituacaoBoleto situacaoBoleto;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
}
