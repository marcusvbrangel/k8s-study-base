package com.wolf.promotion.model;

import java.math.BigDecimal;
import java.util.UUID;

public record Promotion(UUID id, String productName, BigDecimal price, BigDecimal discount) {

}
