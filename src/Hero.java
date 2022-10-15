public class Hero {
    private int HeroHeals;
    private int HeroDamage;
    private String HeroAbility;

    public Hero(int heroHeals, int heroDamage, String heroAbility) {
        HeroHeals = heroHeals;
        HeroDamage = heroDamage;
        HeroAbility = heroAbility;
    }

    public Hero(int heroHeals, int heroDamage) {
        HeroHeals = heroHeals;
        HeroDamage = heroDamage;
    }

    public int getHeroHeals() {
        return HeroHeals;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public String getHeroAbility() {
        return HeroAbility;
    }
}
