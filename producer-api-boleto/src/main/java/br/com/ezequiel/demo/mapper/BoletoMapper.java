package br.com.ezequiel.demo.mapper;

import br.com.ezequiel.demo.dto.BoletoDto;
import br.com.ezequiel.demo.entity.BoletoEntity;

public class BoletoMapper {
    public static BoletoDto toDto(BoletoEntity boleto) {
        return BoletoDto.builder()
                .codigoBarras(boleto.getCodigoBarras())
                .situacaoBoleto(boleto.getSituacaoBoleto())
                .dataCriacao(boleto.getDataCriacao())
                .dataAtualizacao(boleto.getDataAtualizacao())
                .build();
    }

}
