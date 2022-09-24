package com.example.calc;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;


public class Operations {
    private final String operations = "+*-/";
    private final String priority = "()";
    private final ArrayList<String> extendedOperations =
            new ArrayList<String>(Arrays.asList("sin(", "cos(", "tan(", "^", "!", "ln(", "(", ")", "pi", "%", "√"));

    public String addExtendOperation(View view, String text){
        switch (view.getId()) {
            case R.id.buSin:
                return text + this.extendedOperations.get(0);
            case R.id.buCos:
                return  text + this.extendedOperations.get(1);
            case R.id.buTan:
                return  text + this.extendedOperations.get(2);
            case R.id.buPower:
                return text + this.extendedOperations.get(3);
            case  R.id.buFactorial:
                return text + this.extendedOperations.get(4);
            case  R.id.buLn:
                return text + this.extendedOperations.get(5);
            case  R.id.buBracketOpen:
                return text + this.extendedOperations.get(6);
            case  R.id.buBracketClose:
                return text + this.extendedOperations.get(7);
            case  R.id.buPi:
                return text + this.extendedOperations.get(8);
            case  R.id.buPercent:
                return text + this.extendedOperations.get(9);
            case R.id.buSqrt:
                return text + this.extendedOperations.get(10);
            case R.id.buLog:
                return text + this.extendedOperations.get(11);
        }
        return text;
    }


    public String mathOperation(View view, String text) {
        if(text == null || text.length() == 0) return "";
        switch (view.getId()) {
            case R.id.buClear:
                return "";
            case R.id.buDelete:
                return (text.substring(0, text.length() - 1));
        }
        if (!"+".equals(text.substring(text.length() - 1)) &&
                !"-".equals(text.substring(text.length() - 1)) &&
                !"/".equals(text.substring(text.length() - 1)) &&
                !"*".equals(text.substring(text.length() - 1))) {
            switch (view.getId()) {
                case R.id.buPlus:
                    return text + "+";
                case R.id.buDivide:
                    return  text + "/";
                case R.id.buMinus:
                    return  text + "-";
                case R.id.buMultiply:
                    return text + "*";
            }

        }
        return text;
    }
}