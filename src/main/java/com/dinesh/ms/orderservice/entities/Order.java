package com.dinesh.ms.orderservice.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "product_id", nullable = false)
    private Long productId;
    @Column(name = "ordered_date", nullable = false)
    private Instant orderedDate;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "total_amount", nullable = false)
    private Double totalAmount;
}
