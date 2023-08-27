package xRep.homework.variant4;

public enum Character {

    CONSIST_SPEAKER("Состоит в партии", "speaker"),

    NOT_CONSIST_SPEAKER( "Не состоит в партии","speaker"),

    NOT_CONSIST( "Не состоит в партии","not_a_speaker"),

    CONSIST("Состоит в партии", "not_a_speaker");

    private String characterTranslate;

    private String skill;

    Character(String characterTranslate, String skill) {
        this.characterTranslate = characterTranslate;
        this.skill=skill;
    }

    public String getCharacterTranslate() {
        return characterTranslate;
    }

    public void setCharacterTranslate(String characterTranslate) {
        this.characterTranslate = characterTranslate;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
