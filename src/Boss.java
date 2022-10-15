public class Boss {
    private int BossHeals ;
    private int BossDamage;
    private String BossAbility;

    public Boss(int bossHeals, int bossDamage, String bossAbility) {
        BossHeals = bossHeals;
        BossDamage = bossDamage;
        BossAbility = bossAbility;
    }

    public int getBossHeals() {
        return BossHeals;
    }

    public void setBossHeals(int bossHeals) {
        BossHeals = bossHeals;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public String getBossAbility() {
        return BossAbility;
    }

    public void setBossAbility(String bossAbility) {
        BossAbility = bossAbility;
    }
}
