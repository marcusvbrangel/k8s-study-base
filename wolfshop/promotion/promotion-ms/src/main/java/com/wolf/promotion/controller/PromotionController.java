package com.wolf.promotion.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolf.promotion.model.Promotion;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @GetMapping
    public ResponseEntity<List<Promotion>> getPromotions() {
        return ResponseEntity.ok(generatePromotions());
    }
    
    private List<Promotion> generatePromotions() {
        return List.of(
                new Promotion(UUID.randomUUID(), "iPhone 15 128GB", new BigDecimal("5299.90"), new BigDecimal("500.00")),
                new Promotion(UUID.randomUUID(), "Samsung Galaxy S24 256GB", new BigDecimal("4799.90"), new BigDecimal("450.00")),
                new Promotion(UUID.randomUUID(), "Xiaomi Redmi Note 13", new BigDecimal("1699.90"), new BigDecimal("120.00")),
                new Promotion(UUID.randomUUID(), "Motorola Edge 50 Pro", new BigDecimal("2999.90"), new BigDecimal("250.00")),
                new Promotion(UUID.randomUUID(), "Notebook Dell Inspiron 15", new BigDecimal("3899.90"), new BigDecimal("300.00")),
                new Promotion(UUID.randomUUID(), "Notebook Lenovo IdeaPad 3", new BigDecimal("3299.90"), new BigDecimal("220.00")),
                new Promotion(UUID.randomUUID(), "Smart TV Samsung 55 QLED", new BigDecimal("3499.90"), new BigDecimal("350.00")),
                new Promotion(UUID.randomUUID(), "Smart TV LG 50 UHD", new BigDecimal("2699.90"), new BigDecimal("200.00")),
                new Promotion(UUID.randomUUID(), "PlayStation 5 Slim", new BigDecimal("3799.90"), new BigDecimal("300.00")),
                new Promotion(UUID.randomUUID(), "Xbox Series X", new BigDecimal("4299.90"), new BigDecimal("350.00")),
                new Promotion(UUID.randomUUID(), "Fone JBL Tune 520BT", new BigDecimal("249.90"), new BigDecimal("20.00")),
                new Promotion(UUID.randomUUID(), "Caixa de Som JBL Flip 6", new BigDecimal("799.90"), new BigDecimal("70.00")),
                new Promotion(UUID.randomUUID(), "Echo Dot 5a Geracao", new BigDecimal("379.90"), new BigDecimal("30.00")),
                new Promotion(UUID.randomUUID(), "Kindle 11a Geracao", new BigDecimal("499.90"), new BigDecimal("45.00")),
                new Promotion(UUID.randomUUID(), "Cafeteira Nespresso Essenza Mini", new BigDecimal("549.90"), new BigDecimal("50.00")),
                new Promotion(UUID.randomUUID(), "Air Fryer Mondial 4L", new BigDecimal("329.90"), new BigDecimal("25.00")),
                new Promotion(UUID.randomUUID(), "Geladeira Brastemp Frost Free 375L", new BigDecimal("3299.00"), new BigDecimal("280.00")),
                new Promotion(UUID.randomUUID(), "Maquina de Lavar Consul 12kg", new BigDecimal("2199.00"), new BigDecimal("180.00")),
                new Promotion(UUID.randomUUID(), "Fogao Atlas 5 Bocas", new BigDecimal("999.00"), new BigDecimal("90.00")),
                new Promotion(UUID.randomUUID(), "Micro-ondas Electrolux 31L", new BigDecimal("699.00"), new BigDecimal("60.00")),
                new Promotion(UUID.randomUUID(), "Arroz Tio Joao 5kg", new BigDecimal("34.23"), new BigDecimal("3.34")),
                new Promotion(UUID.randomUUID(), "Feijao Camil Carioca 1kg", new BigDecimal("8.99"), new BigDecimal("1.20")),
                new Promotion(UUID.randomUUID(), "Cafe Pilao Tradicional 500g", new BigDecimal("19.90"), new BigDecimal("2.50")),
                new Promotion(UUID.randomUUID(), "Leite Ninho Integral 400g", new BigDecimal("21.90"), new BigDecimal("2.10")),
                new Promotion(UUID.randomUUID(), "Azeite Gallo Extra Virgem 500ml", new BigDecimal("42.90"), new BigDecimal("4.20")),
                new Promotion(UUID.randomUUID(), "Macarrao Barilla Spaghetti 500g", new BigDecimal("11.90"), new BigDecimal("1.30")),
                new Promotion(UUID.randomUUID(), "Oleo de Soja Liza 900ml", new BigDecimal("8.49"), new BigDecimal("0.90")),
                new Promotion(UUID.randomUUID(), "Acucar Uniao Refinado 1kg", new BigDecimal("5.49"), new BigDecimal("0.60")),
                new Promotion(UUID.randomUUID(), "Detergente Ype Neutro 500ml", new BigDecimal("2.99"), new BigDecimal("0.30")),
                new Promotion(UUID.randomUUID(), "Sabao em Po OMO 1,6kg", new BigDecimal("24.90"), new BigDecimal("2.80")),
                new Promotion(UUID.randomUUID(), "Amaciante Comfort 1,8L", new BigDecimal("18.90"), new BigDecimal("2.00")),
                new Promotion(UUID.randomUUID(), "Shampoo Pantene 400ml", new BigDecimal("17.90"), new BigDecimal("1.90")),
                new Promotion(UUID.randomUUID(), "Condicionador Dove 400ml", new BigDecimal("16.90"), new BigDecimal("1.70")),
                new Promotion(UUID.randomUUID(), "Fralda Pampers Confort Sec XXG", new BigDecimal("79.90"), new BigDecimal("8.00")),
                new Promotion(UUID.randomUUID(), "Racao Pedigree Adulto 10,1kg", new BigDecimal("149.90"), new BigDecimal("15.00")),
                new Promotion(UUID.randomUUID(), "Racao Whiskas Gatos Castrados 3kg", new BigDecimal("62.90"), new BigDecimal("6.30")),
                new Promotion(UUID.randomUUID(), "Cadeira Gamer ThunderX3", new BigDecimal("1299.90"), new BigDecimal("120.00")),
                new Promotion(UUID.randomUUID(), "Monitor LG 24 IPS", new BigDecimal("899.90"), new BigDecimal("80.00")),
                new Promotion(UUID.randomUUID(), "Teclado Logitech K120", new BigDecimal("79.90"), new BigDecimal("8.00")),
                new Promotion(UUID.randomUUID(), "Mouse Logitech M170", new BigDecimal("69.90"), new BigDecimal("7.00"))
        );
    }

}
