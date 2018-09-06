package view;

import model.ConvertRomanNumerals;
import presenter.InteractionViewListener;
import presenter.MainPresenter;

import javax.swing.*;

/***
 * @author Gustavo levandowski
 * @version 1.0
 */
public class Main {

    public static void main(String[] args){
        InteractionViewListener mainPresenter = new MainPresenter();

        int numberInput = 0;
        String numberRoman = "";

        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Let's convert some Roman numerals ?!");

        String optionsConvert = mainPresenter.openDialogs("You have the need to:\n 1- Convert decimal to roman number\n 2- Convert roman number to decimal",true);

        switch (optionsConvert) {
            case "1":
                numberInput = Integer.parseInt(mainPresenter.openDialogs("Enter the number you want to convert:",true));

                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                        mainPresenter.checkResult(String.valueOf(numberInput), new ConvertRomanNumerals(numberInput, numberRoman).getConvertToNumberRoman()));
                break;

            case "2":
                numberRoman = mainPresenter.openDialogs("Enter the Roman number you want to convert:",false);

                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                        mainPresenter.checkResult(numberRoman, String.valueOf(new ConvertRomanNumerals(numberInput, numberRoman).getConvertToNumber())));
                break;
            default:
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Option not found");
                break;
        }
    }
}
