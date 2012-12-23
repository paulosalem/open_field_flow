/*
 * Open Field Flow - A particle system simulator in which particles 
 * flow through  and interact with a vector field.
 * 
 * Copyright (C) 2012  Paulo Salem (paulosalem@paulosalem.com)
 *
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.paulosalem.openfieldflow.engine;

import com.paulosalem.openfieldflow.gui.SimulationCanvasWindow;

/**
 *
 * @author Paulo Salem
 */
public class ParticleSystemSimulatorEngine {
    
    private Simulation simulation = null;
    
    
    
    public void start(SimulationStrategy strategy, SimulationCanvasWindow cw, int regionSideSize, int largerSide){
        simulation = new Simulation(regionSideSize, largerSide);
        
        simulation.attachObserver(strategy);
        simulation.attachObserver(cw);
        cw.setSimulation(simulation);
        
        Thread t = new Thread(simulation);
        t.start();
    }
    
    public void stop(){
        if(simulation != null){
            simulation.stop();
        }
    }

}
