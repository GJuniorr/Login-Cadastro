/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


/**
 *
 * @author JC
 */
public class SoNumeros extends PlainDocument{
    @Override
public void insertString(int offset, String str, AttributeSet attr)
        throws BadLocationException {
    if (str == null)
        return;
    
    try {
        Integer.parseInt(str);
    } catch (Exception e) {
        return;
    }
    
    super.insertString(offset, str, attr);
}
}
