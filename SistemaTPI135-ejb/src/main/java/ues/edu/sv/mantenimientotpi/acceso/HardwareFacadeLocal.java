/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.mantenimientotpi.acceso;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.mantenimientolib.Hardware;

/**
 *
 * @author esperanza
 */
@Local
public interface HardwareFacadeLocal extends AbstractFacadeInterface<Hardware>{

    
    List<Hardware> findRange(int lower, int higher);
    
    List<Hardware> findByName(String nombre);
    
}
