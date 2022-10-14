import javax.swing.*;
import java.awt.event.ActionListener;


    public class view{




    public class CalculatorView extends JFrame{

        private final JTextField Message = new JTextField(10);
        private final JTextField Key = new JTextField(10);
        private final JButton calculateButton = new JButton("cryptera");
        private final JLabel CryptT = new JLabel("crypterad kod");


        CalculatorView() {
            JPanel calcPanel = new JPanel();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(800,600);
            calcPanel.add(Message);
            calcPanel.add(Key);
            calcPanel.add(calculateButton);
            calcPanel.add(CryptT);
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




