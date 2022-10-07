import javax.swing.*;
import java.awt.event.ActionListener;


    public class view{
    public class CalculatorView extends JFrame{

        private final JTextField FirstNumber = new JTextField(10);
        private final JTextField SecondNumber = new JTextField(10);
        private final JLabel AdditionLabel = new JLabel("+");
        private final JButton calculateButton = new JButton("Beräkna");
        private final JLabel EqualsLabel = new JLabel("=");
        private final JLabel svar = new JLabel("svar");



        CalculatorView() {
            JPanel calcPanel = new JPanel();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(800,600);
            calcPanel.add(FirstNumber);
            calcPanel.add(SecondNumber);
            calcPanel.add(AdditionLabel);
            calcPanel.add(EqualsLabel);
            calcPanel.add(calculateButton);
            calcPanel.add(svar);
            this.add(calcPanel);
        }

        public void setCalcSolution(int calcSolution) {
            String s = Integer.toString(calcSolution);
            String toString = Integer.toString(calcSolution);
        }

        void addCalculateListener(ActionListener listenForCalcButton) {
            calculateButton.addActionListener(listenForCalcButton);
            }
        }
    }




