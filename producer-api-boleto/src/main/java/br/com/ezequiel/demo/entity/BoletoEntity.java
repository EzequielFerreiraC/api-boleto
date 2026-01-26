package br.com.ezequiel.demo.entity;

import br.com.ezequiel.demo.entity.enums.SituacaoBoleto;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoletoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "situacao_boleto")
    private SituacaoBoleto situacaoBoleto;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;
}
