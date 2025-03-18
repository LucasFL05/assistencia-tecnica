package com.cltech.assistencia_tecnica.service;

import com.cltech.assistencia_tecnica.dto.DispositivoDTO;

import java.util.List;

public interface DispositivoService {
    DispositivoDTO criarDispositivo(DispositivoDTO dispositivoDTO);
    DispositivoDTO buscarDispositivoPorId(Long id);
    List<DispositivoDTO> listarDispositivos();
    DispositivoDTO atualizarDispositivo(Long id, DispositivoDTO dispositivoDTO);
    void deletarDispositivo(Long id);
}