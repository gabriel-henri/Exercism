class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder neword = new StringBuilder();
        boolean hifen = false;
        for(int i = 0; i < identifier.length(); i++){
            char let = identifier.charAt(i);
            if(let != ' '){
                if(Character.isLetter(let)){
                    if(!(let >= 'α' && let <= 'ω')){
                        if(hifen == false)
                            neword.append(let);
                        else{
                            neword.append(Character.toUpperCase(let));
                            hifen = false;
                        }
                    }
                }
                else if(Character.isISOControl(let)){
                    neword.append("CTRL");
                }
                else if(let == '-')
                    hifen = true;
            }
            else
                neword.append('_');
        }
        return neword.toString();
    }
}
