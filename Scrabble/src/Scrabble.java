class Scrabble {
    int score = 0;
    
    Scrabble(String word) {
        int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        for(int i = 0; i < word.length(); i++){
            int pos;
            char c = word.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                pos = c - 'A';
            }
            else{
                pos = c - 'a';
            }
            score += points[pos];
        }
    }

    int getScore() {
        return this.score;
    }

}
