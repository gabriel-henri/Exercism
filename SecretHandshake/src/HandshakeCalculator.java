import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Character> intToBinary(int num){
        List<Character> binario = new ArrayList<>(List.of('0', '0', '0', '0', '0'));
        for(int i = binario.size()-1; i >= 0; i--){
            int div = num%2;
            char n = '0';
            if(div == 1){
                n = '1';
            }
            
            binario.set(i, n);
            num /= 2;
        }
        return binario;
    }

    List<Signal> calculateHandshake(int number) {
        List<Character> binario = intToBinary(number);
        List<Signal> sinais = new ArrayList<>();

        for(int i = binario.size()-1; i > 0; i--){
            if(binario.get(i) == '1'){
                switch(i){
                    case 4:
                        sinais.add(Signal.WINK);
                        break;
                    case 3:
                        sinais.add(Signal.DOUBLE_BLINK);
                        break;
                    case 2:
                        sinais.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 1:
                        sinais.add(Signal.JUMP);
                        break;
                }
            }
            }
            char revOrNo = binario.get(0);
            if(revOrNo == '1'){
                Collections.reverse(sinais);
            }
        return sinais;
    }

}
