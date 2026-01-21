package br.com.ezequiel.demo.service;

import br.com.ezequiel.demo.dto.BoletoDto;
import br.com.ezequiel.demo.entity.BoletoEntity;
import br.com.ezequiel.demo.entity.enums.SituacaoBoleto;
import br.com.ezequiel.demo.mapper.BoletoMapper;
import br.com.ezequiel.demo.repository.BoletoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoletoService {
    private static BoletoRepository boletoRepository = null;

    public BoletoService(BoletoRepository boletoRepository) {
        this.boletoRepository = boletoRepository;
    }

    public static BoletoDto salvar(String codigoBarras) {
        var boletoOptional = boletoRepository.findByCodigoBarras(codigoBarras);

        if(boletoOptional.isPresent()) {
            throw new RuntimeException("Já existe uma solicitação de pagamento para esse boleto");
        }

        var boletoEntity = BoletoEntity.builder()
                .codigoBarras(codigoBarras)
                .situacaoBoleto(SituacaoBoleto.INICIALIZADO)
                .dataCriacao(LocalDateTime.now())
                .dataAtualizacao(LocalDateTime.now())
                .build();
        boletoRepository.save(boletoEntity);

        return BoletoMapper.toDto(boletoEntity);
    }


}
