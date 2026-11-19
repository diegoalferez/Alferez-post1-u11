package com.tienda.pedidos.service;

import com.tienda.pedidos.dto.PedidoRequestDTO;
import com.tienda.pedidos.dto.PedidoResponseDTO;

import java.util.List;

/** Abstraccion de la logica de pedidos (DIP: el controller depende de esta interfaz). */
public interface PedidoService {

    PedidoResponseDTO crear(PedidoRequestDTO dto);

    PedidoResponseDTO buscarPorId(Long id);

    List<PedidoResponseDTO> listarPorCliente(String clienteEmail);
}
