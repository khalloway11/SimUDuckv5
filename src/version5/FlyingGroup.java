/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author khalloway
 */
public interface FlyingGroup extends DuckGroup{
    public abstract void fly();
    public abstract void setFlyBehavior(FlyBehavior fb);
    
}
