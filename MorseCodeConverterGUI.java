import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MorseCodeConverterGUI extends JFrame implements ActionListener {
    private JTextArea inputTextArea;
    private final JTextArea outputTextArea;
    private JButton convertButton;
    private JButton clearButton;

    public MorseCodeConverterGUI() {
        setTitle("Morse Code Converter");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the background color for the frame
        getContentPane().setBackground(Color.blue); // Change the background color to blue

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.setBackground(Color.white);// Change the panel background color to blue

        inputTextArea = new JTextArea();
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setLineWrap(true);
        inputTextArea.setForeground(Color.blue);
        panel.add(new JScrollPane(inputTextArea));

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        convertButton.setPreferredSize(new Dimension(50, 30));
        panel.add(convertButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        clearButton.setPreferredSize(new Dimension(100, 30));
        panel.add(clearButton);

        outputTextArea = new JTextArea();
        outputTextArea.setWrapStyleWord(true);
        outputTextArea.setLineWrap(true);
        outputTextArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
        outputTextArea.setEditable(false);
        panel.add(new JScrollPane(outputTextArea));

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            String inputText = inputTextArea.getText();
            // Implement your Morse code conversion logic here
            // This is a simplified example; you may need to build a Morse code dictionary

            String morseCode = convertTextToMorse(inputText);
            outputTextArea.setText(morseCode);
        } else if (e.getSource() == clearButton) {
            inputTextArea.setText("");
            outputTextArea.setText("");
        }
    }

    private String convertTextToMorse(String text) {
        // Implement your Morse code conversion logic here
        // This is a simplified example; you may need to build a Morse code dictionary

        StringBuilder morseCode = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            switch (c) {
                case 'A':
                    morseCode.append(".- ");
                    break;
                case 'B':
                    morseCode.append("-... ");
                    break;
                case 'C':
                    morseCode.append("-.-. ");
                    break;
                case 'D':
                    morseCode.append("-.. ");
                    break;
                case 'E':
                    morseCode.append(". ");
                    break;
                case 'F':
                    morseCode.append("..-. ");
                    break;
                case 'G':
                    morseCode.append("--. ");
                    break;
                case 'H':
                    morseCode.append(".... ");
                    break;
                case 'I':
                    morseCode.append(".. ");
                    break;
                case 'J':
                    morseCode.append(".--- ");
                    break;
                case 'K':
                    morseCode.append("-.- ");
                    break;
                case 'L':
                    morseCode.append(".-.. ");
                    break;
                case 'M':
                    morseCode.append("-- ");
                    break;
                case 'N':
                    morseCode.append("-. ");
                    break;
                case 'O':
                    morseCode.append("--- ");
                    break;
                case 'P':
                    morseCode.append(".--. ");
                    break;
                case 'Q':
                    morseCode.append("--.- ");
                    break;
                case 'R':
                    morseCode.append(".-. ");
                    break;
                case 'S':
                    morseCode.append("... ");
                    break;
                case 'T':
                    morseCode.append("- ");
                    break;
                case 'U':
                    morseCode.append("..- ");
                    break;
                case 'V':
                    morseCode.append("...- ");
                    break;
                case 'W':
                    morseCode.append(".-- ");
                    break;
                case 'X':
                    morseCode.append("-..- ");
                    break;
                case 'Y':
                    morseCode.append("-.-- ");
                    break;
                case 'Z':
                    morseCode.append("--.. ");
                    break;
                case ' ':
                    morseCode.append(" ");
                    break;
                case '.':
                    morseCode.append(".-.-.- ");
                    break;
                case ',':
                    morseCode.append("--..-- ");
                    break;
                case '@':
                    morseCode.append(".--.-. ");
                    break;
                case '%':
                    morseCode.append("...-.- ");
                    break;
                case '#':
                    morseCode.append("-.-.-- ");
                    break;
                case '&':
                    morseCode.append(".-... ");
                    break; // Morse code for '&'
                case '!':
                    morseCode.append("-.-.-- ");
                    break;
                case '0':
                    morseCode.append("----- ");
                    break;
                case '1':
                    morseCode.append(".---- ");
                    break;
                case '2':
                    morseCode.append("..--- ");
                    break;
                case '3':
                    morseCode.append("...-- ");
                    break;
                case '4':
                    morseCode.append("....- ");
                    break;
                case '5':
                    morseCode.append("..... ");
                    break;
                case '6':
                    morseCode.append("-.... ");
                    break;
                case '7':
                    morseCode.append("--... ");
                    break;
                case '8':
                    morseCode.append("---.. ");
                    break;
                case '9':
                    morseCode.append("----. ");
                    break;

                // Add more cases for other letters and digits
                default:
                    // Handle unsupported characters
                    break;
            }
        }
        return morseCode.toString().trim();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MorseCodeConverterGUI converterGUI = new MorseCodeConverterGUI();
            converterGUI.setVisible(true);
        });
    }
}
