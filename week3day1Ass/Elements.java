package week3day1Ass;

public class Elements extends Button {
    public static void main(String[] args) {
      
        WebElement webElement = new WebElement();
        webElement.click();
        webElement.setText("Bhavanni");
        System.out.println();
       
        Button button = new Button();
        button.click();
        button.setText("Indhu");
        button.submit();
        System.out.println();
       
        TextField textField = new TextField();
        textField.click();
        textField.setText("Devi");
        textField.getText();
        System.out.println();
       
        CheckBoxButton checkBoxButton = new CheckBoxButton();
        checkBoxButton.clickCheckButton();
        checkBoxButton.submit();
        System.out.println();
        
        RadioButton radioButton = new RadioButton();
        radioButton.selectRadioButton();
        radioButton.submit();
        System.out.println();
        
    }
}
