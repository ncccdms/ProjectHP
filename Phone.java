/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPhone;

/**
 *
 * @author LENOVO
 */
public interface Phone {
    int MAX_VOLUMN = 100;
    int MIN_VOLUMN = 0;
    
    public void powerOn();

    public void powerOff();

    public void volumeUp();

    public void volumeDown();

    public void volumeValue();
    
}
