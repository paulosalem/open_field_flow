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

package com.paulosalem.openfieldflow.domain;

import com.paulosalem.openfieldflow.util.ColorHelper;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Paulo Salem
 */
public class BackgroundAgent extends Agent{

    private JPanel panel;
    
    public BackgroundAgent(Color color, JPanel panel){
        super(new Vector(0.0, 0.0, 0.0), 1.0, 0.0, new Vector(0,0,0), color);
        this.panel = panel;
        //panel.setBackground(color);
    }
    
    @Override
    public void step(Iterable<Agent> all) {
        
    }

    @Override
    public void draw(Graphics2D canvas) {
        
        // TODO
        //panel.setBackground(color);
        
    }

}
