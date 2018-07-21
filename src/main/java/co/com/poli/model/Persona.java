/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author santi
 */
@Data
@AllArgsConstructor
public class Persona {
    String nombre, apellidos;
    int edad;
}
