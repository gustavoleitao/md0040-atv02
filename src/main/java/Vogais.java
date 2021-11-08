
public class Vogais {

    /**
     * Método responsável por contar as vogais de um texto
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public int contarVogais(String text){
        var minusculo = text.toLowerCase();
        var lookingFor = "aáàâãeéêèiíìîoóòôõuúùû";

        var chars = minusculo.toCharArray();

        int total = 0;

        for (int i = 0; i < chars.length; i++) {
            String item = String.valueOf(chars[i]);
            if (lookingFor.indexOf(item) > -1){
                total++;
            }
        }

        return total;
    }

}
