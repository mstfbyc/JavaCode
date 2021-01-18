package com.bilgeadam.enums;

public enum TodoStatusEnums {
    OPEN_STATUS("Açık",2),
    CLOSED_STATUS("Kapatıldı",5),
    OLD_STATUS("Arşivlendi",6),
    AWAITING_REPLY("Cevap bekliyor",4),
    NEW("Yeni",1),
    IN_PROGRES("Üzerinde Çalışılıyor",3);

    String value;
    Integer code;

    TodoStatusEnums(String value, Integer code) {
        this.value = value;
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public Integer getCode() {
        return code;
    }

    public static TodoStatusEnums findCode(Integer code){
        for (TodoStatusEnums statu: values()) {
            if(statu.getCode().equals(code)){
                return statu;
            }
        }
        return null;
    }
}

