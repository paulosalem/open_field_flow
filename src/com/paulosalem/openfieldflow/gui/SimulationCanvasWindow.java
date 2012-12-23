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

package com.paulosalem.openfieldflow.gui;

import com.paulosalem.openfieldflow.engine.ParticleSystemSimulatorEngine;
import com.paulosalem.openfieldflow.engine.Simulation;
import com.paulosalem.openfieldflow.engine.SimulationObserver;
import com.paulosalem.openfieldflow.engine.SimulationStrategy;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author  Paulo
 */
public class SimulationCanvasWindow extends javax.swing.JFrame  implements SimulationObserver{
    
    ParticleSystemSimulatorEngine engine;
    
    /** Creates new form SimulationCanvasWindow */
    public SimulationCanvasWindow(ParticleSystemSimulatorEngine engine, Color backgroundColor) {
        initComponents();
        
        this.engine = engine;
        
        //this.pnlCanvas.setBackground(new Color(74,3,3));
        this.setBackground(backgroundColor);
        this.pnlCanvas.setBackground(backgroundColor);

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCanvas = new com.paulosalem.openfieldflow.gui.SimulationCanvasPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Particle System");
        setBackground(new java.awt.Color(82, 6, 1));
        setResizable(false);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        pnlCanvas.setBackground(new java.awt.Color(74, 3, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
          setVisible(false);
          engine.stop();
      }
    }//GEN-LAST:event_formKeyPressed
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paulosalem.openfieldflow.gui.SimulationCanvasPanel pnlCanvas;
    // End of variables declaration//GEN-END:variables
    
    
    public void observeStart(Simulation s) {
        this.pnlCanvas.setSimulation(s);
        
        // Show the window and prepare to receive further commands
        this.setVisible(true);
    }
    
    public void observeUpdate(Simulation s) {
        pnlCanvas.repaint();
    }

    public void observeStop(Simulation s) {
        this.setVisible(false);
    }

    public void setSimulation(Simulation s){
        pnlCanvas.setSimulation(s);
    }
    
    public void setStrategy(SimulationStrategy st){
        pnlCanvas.setStrategy(st);
        
    }

}