class IsogramChecker {

    boolean isIsogram(String phrase) {
        int[] alfa = new int[26];

        for(int i = 0; i  < phrase.length(); i++){
            char minc = Character.toLowerCase(phrase.charAt(i));
            if(minc >= 'a' && minc <= 'z')
                alfa[minc - 'a'] += 1;
        }

        for(int i = 0; i < 26; i++){
            if(alfa[i] >1)
                return false;
        }
        return true;
    }

}
