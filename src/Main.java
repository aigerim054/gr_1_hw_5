public class Main {
    public static void main(String[] args){
        Boss boss = new Boss(300,45,"magical");
        System.out.println("boss health : "+ boss.getBossHeals()+ "\nboss damage : "+ boss.getBossDamage()+ "\nbossAbility : "+ boss.getBossAbility());
        for (Hero hero:createHeros()
             ) {
            System.out.println("hero health : "+ hero.getHeroHeals()+ "\nhero damage : "+ hero.getHeroDamage()+ "\nhero ability : " + hero.getHeroAbility());

        }


    }
    public static Hero[] createHeros(){
        Hero hero = new Hero(200,14,"water");
        Hero hero1 = new Hero(250,20,"fire");
        Hero hero2 = new Hero(250,20);
        Hero[] heroes ={ hero,hero1,hero2};
        return heroes;
    }
}