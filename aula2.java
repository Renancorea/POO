import javax.swing.JOptionPane;
class lyrane{
    public static void main(String args[]) {
        String nome;
        nome = JOptionPane.showInputDialog("teu nome arronbado");
        JOptionPane.showMessageDialog(null," olha o teu nome aqui nome otario"+ nome);
        float a;
        float b;
        a = Float.parseFloat(JOptionPane.showInputDialog("diga um valor ai"));
        b = Float.parseFloat(JOptionPane.showInputDialog("diga outro valor ai"));

        JOptionPane.showInputDialog("a soma dos dois valores é "+ (a+b)+ "\n a subtraçao é " +(a-b) + "\n a soma das duas equacoes é "+((a+b)+(a-b))+ "\n e a subtraçao das duas é "+ ((a+b)-(a-b))+"\n gostou ?"+ nome);

    }

}
