/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author Md Mamin
 */
public class Calculator {

    public double getResult(String f, String l, String s) {
        double fn=0;
        double ln =0;
        if (f.length() != 0 ) {
             fn = Double.parseDouble(f);
           
        }if (l.length() != 0) {
              ln = Double.parseDouble(l);
        }

        double result = 0;
        switch (s) {

            case "+":
                result = fn + ln;
                break;
            case "-":
                result = fn - ln;
                break;
            case "/":
                result = fn / ln;
                break;
            case "*":
                result = fn * ln;
                break;
        }
        return result;
    }
}
