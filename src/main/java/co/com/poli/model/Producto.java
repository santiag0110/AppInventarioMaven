/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author santi
 */

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Producto {
    @NonNull private String codigo;
    @EqualsAndHashCode.Exclude private String nombre;
    @EqualsAndHashCode.Exclude private double stock, cantidad;
}
