package com.br.jalves.biblioteca.paylod.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BookPutRequestBody {

    private Long id;
    private String name;
    private String autor;
}
