package br.com.ezequiel.demo.controller;

import br.com.ezequiel.demo.dto.BoletoDto;
import br.com.ezequiel.demo.dto.BoletoRequestDto;
import br.com.ezequiel.demo.service.BoletoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/boleto")
public class BoletoController {
    private final BoletoService boletoService;

    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @PostMapping
    public ResponseEntity<BoletoDto> salvar(@RequestBody BoletoRequestDto boletoRequestDto) {
        var boleto = BoletoService.salvar(boletoRequestDto.getCodigoBarras());
        return new ResponseEntity<>(boleto, HttpStatus.CREATED);
    }
}
