public class AnalizData{
    public void analizName(String text) throws LimitExeption{
        if (text.length() > 20){
            throw new LimitExeption("Превышен лимит входных данных (20)");
        }
    }

    public void analizPhone(String phone) throws LimitExeption, NotEquelsPhoneExeption{
        if (phone.length() > 11){
            throw new LimitExeption("Превышен лимит входных данных (11)");
        }   
        for (int i = 0; i < phone.length(); i++) {
            char a = phone.charAt(i);
            if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0'){
                continue;
            } else {
                throw new NotEquelsPhoneExeption("Данный текст не является номером телефона");
            }
        }
    }

    public void analizFloor(Integer floor) throws FloorExeption{
        if (floor != 0 || floor != 1 || floor != null){
            throw new FloorExeption("Существует только 2 пола");
        }
    } 

    // public void AnalizDataBurn(String dataBurn) throws DataBurnExeption, LimitExeption {
    //     StringBuilder sb = new StringBuilder(dataBurn);
        
    //     if(sb.length() != 10){
    //         throw new LimitExeption("Длина текста больше лимита (10)");
    //     }

    //     if(sb.charAt(2) != '.' || sb.charAt(5) != '.'){
    //         throw new DataBurnExeption("Неправильное разделение даты");
    //     }

    //     for (int i = 0; i < dataBurn.length(); i++) {
            
    //     }
    // }
}
