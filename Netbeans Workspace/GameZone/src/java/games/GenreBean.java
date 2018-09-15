package games;


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harjit
 */
public class GenreBean {
    private String id,genre,platform;
    private GameBean game,game2,game3;
    public GenreBean(String id,String genre ,String platform,GameBean game, GameBean game2,GameBean game3){
        this.id = id;
        this.game = game;
        this.game2 = game2;
        this.game3 = game3;
        this.genre = genre;
        this.platform = platform;
    }
    public void setgenre(String genre){
        this.genre= genre;
    }
    public void setplatform(String platform){
        this.platform = platform;
    }
    public void setid(String id){
        this.id = id;
    }
     public void setgame(GameBean game){
        this.game= game;
    }
     public void setgame2(GameBean game2){
        this.game2 = game2;
    }
     public void setgame3(GameBean game3){
        this.game3 = game3;
    }
     public String getid(){
         return id;
     }
     public String getgenre(){
         return genre;
     }
     public String getplatform(){
         return platform;
     }
     public GameBean getgame(){
         return game;
     }
     public GameBean getgame2(){
         return game2;
     }
     public GameBean getgame3(){
         return game3;
     }
  private static HashMap<String,GenreBean> Games;
 
  static {
    Games = new HashMap<String,GenreBean>();
    Games.put("rpgs",
                  new GenreBean("rpgs","RPG","PS",
                                   new GameBean("The witcher3: Wild hunt","Game_Posters/Witcher3.png",""),
                                   new GameBean("Fallout 4","Game_Posters/Fallout4.png",""),
                                   new GameBean("Final FantasyXV","Game_Posters/Final_Fantasy_XV.png","")));
    Games.put("rpg1",
                  new GenreBean("rpg1","RPG","XBOX ONE",
                                   new GameBean("Dark Souls III","Game_Posters/Dark_Souls_3.png",""),
                                   new GameBean("Rise of the Tomb Raider","Game_Posters/Rise_of_the_Tomb_Raider.png",""),
                                   new GameBean("Fallout 4","Game_Posters/Fallout4.png","")));
    Games.put("rpgc",
                  new GenreBean("rpgc","RPG","PC",
                                   new GameBean("The Elder Scrolls V: Skyrim","Game_Posters/Skyrim.png",""),
                                   new GameBean("Fallout 4","Game_Posters/Fallout4.png",""),
                                   new GameBean("The witcher3: Wild hunt","Game_Posters/Witcher3.png","")));
    
     Games.put("as",
                  new GenreBean("as","ACTION","PS",
                                   new GameBean("Uncharted 4: A Thief's End","Game_Posters/Uncharted_4.png",""),
                                   new GameBean("The Witcher 3: Wild Hunt","Game_Posters/Witcher3.png",""),
                                   new GameBean("Fallout 4","Game_Posters/Fallout4.png","")));
    Games.put("a1",
                  new GenreBean("a1","ACTION","XBOX ONE",
                                   new GameBean("Halo 5: Guardians","Game_Posters/Halo_5.png",""),
                                   new GameBean("Rise of the Tomb Raider","Game_Posters/Rise_of_the_Tomb_Raider.png",""),
                                   new GameBean("Fallout 4","Game_Posters/Fallout4.png","")));
    Games.put("ac",
                  new GenreBean("ac","ACTION","PC",
                                   new GameBean("Grand Theft Auto V","Game_Posters/GTAV.png",""),
                                   new GameBean("Fallout 4","Game_Posters/Fallout4.png",""),
                                   new GameBean("The Witcher 3: Wild Hunt","Game_Posters/Witcher3.png","")));
    Games.put("adc",
                  new GenreBean("adc","ADVENTURE","PC",
                                   new GameBean("That Dragon, Cancer","Game_Posters/That_Dragon_Cancer.png",""),
                                   new GameBean("No Man's Sky","Game_Posters/No_Mans_Sky.png",""),
                                   new GameBean("Firewatch","Game_Posters/Firewatch.png","")));
    Games.put("ad1",
                  new GenreBean("ad1","ADVENTURE","XBOX ONE",
                                   new GameBean("Rise of the Tomb Raider","Game_Posters/Rise_of_the_Tomb_Raider.png",""),
                                   new GameBean(" Life Is Strange","Game_Posters/Life_Is_Strange.png",""),
                                   new GameBean("Tales from the Borderland","Game_Posters/Tales_fromthe_Borderlands.png","")));
    Games.put("ads",
                  new GenreBean("ads","ADVENTURE","PS",
                                   new GameBean("Assassin's Creed Syndicate","Game_Posters/Assassin_Creed_Syndicate.png",""),
                                   new GameBean("Until Dawn","Game_Posters/Until_Dawn.png",""),
                                   new GameBean("Tales from the Borderlands","Game_Posters/Tales_fromthe_Borderlands.png","")));
     Games.put("rs",
                  new GenreBean("rs","RACING","PS",
                                   new GameBean("Project CARS","Game_Posters/Project_CARS.png",""),
                                   new GameBean("F1 2015;","Game_Posters/F1_2015.png",""),
                                   new GameBean("Dirt Rally","Game_Posters/Dirt_Rally.png","")));
     Games.put("r1",
                  new GenreBean("r1","RACING","XBOX ONE",
                                   new GameBean("Project CARS","Game_Posters/Project_CARS.png",""),
                                   new GameBean("Forza Motorsport 6","Game_Posters/Forza_Motorsport6.png",""),
                                   new GameBean("F1 2015","Game_Posters/F1_2015.png","")));
     Games.put("rc",
                  new GenreBean("rc","RACING","PC",
                                   new GameBean("Rocket League","Game_Posters/Rocket_League.png",""),
                                   new GameBean("F1 2015","Game_Posters/F1_2015.png",""),
                                   new GameBean("Project CARS","Game_Posters/Project_CARS.png","")));
     Games.put("ss",
                  new GenreBean("ss","SIMULATION","PS",
                                   new GameBean("FIFA 16","Game_Posters/FIFA_2016.png",""),
                                   new GameBean("NBA 2K16","Game_Posters/NBA_2K16.png",""),
                                   new GameBean("Madden NFL 16","Game_Posters/Madden_NFL16.png","")));
     Games.put("s1",
                  new GenreBean("s1","SIMULATION","XBOX ONE",
                                   new GameBean("FIFA 16","Game_Posters/FIFA_2016.png",""),
                                   new GameBean("NBA 2K16","Game_Posters/NBA_2K16.png",""),
                                   new GameBean("Madden NFL 16","Game_Posters/Madden_NFL16.png","")));
     Games.put("sc",
                  new GenreBean("sc","SIMULATION","PC",
                                   new GameBean("The Sims 4","Game_Posters/Sims_4.png",""),
                                   new GameBean("Euro Truck Simulator","Game_Posters/Euro_Truck_Simulator.png",""),
                                   new GameBean("Kerbal Space Program","Game_Posters/Kerbal_Space_Program.png","")));
     Games.put("rtss",
                  new GenreBean("rtss","RTS","PS",
                                   new GameBean("This War of Mine: The Little One","Game_Posters/This_War_of_Mine.png",""),
                                   new GameBean("Awesomenauts Assemble!","Game_Posters/Awesomenauts_Assemble.png",""),
                                   new GameBean("Anomaly 2","Game_Posters/Anomaly_2.png","")));
      Games.put("rts1",
                  new GenreBean("rts1","RTS","XBOX ONE",
                                   new GameBean("Dungeon of the Endless","Game_Posters/Dungeon_of_the_Endless.png",""),
                                   new GameBean("This War of Mine: The Little Ones","Game_Posters/This_War_of_Mine.png",""),
                                   new GameBean("Plague Inc: Evolved","Game_Posters/Plague_Inc.png","")));
      Games.put("rtsc",
                  new GenreBean("rtsc","RTS","PC",
                                   new GameBean("StarCraft II: Legacy of the Void","Game_Posters/StarCraft_II.png",""),
                                   new GameBean("Heroes of the Storm","Game_Posters/Heroes_of_the_Storm.png",""),
                                   new GameBean("Anno 2205","Game_Posters/Anno_2205.png","")));
      Games.put("shs",
                  new GenreBean("shs","SHOOTING","PS",
                                   new GameBean("Destiny","Game_Posters/Destiny.png",""),
                                   new GameBean("Call of Duty Black Ops III","Game_Posters/Black_Ops3.png",""),
                                   new GameBean("Battlefield 4","Game_Posters/Battlefield_4.png","")));
      Games.put("sh1",
                  new GenreBean("sh1","SHOOTING","XBOX ONE",
                                   new GameBean("Destiny","Game_Posters/Destiny.png",""),
                                   new GameBean("Halo 5: Guardians","Game_Posters/Halo_5.png",""),
                                   new GameBean("Titanfall","Game_Posters/Titanfall.png","")));
      Games.put("shc",
                  new GenreBean("shc","SHOOTING","PC",
                                   new GameBean("Counter-Strike: Global Offensive","Game_Posters/CS_GO.png",""),
                                   new GameBean( "Battleborn","Game_Posters/Battleborn.png",""),
                                   new GameBean("DOOM","Game_Posters/DOOM.png","")));
     

  }
  public static GenreBean getgames(String id){
      return (Games.get(id));
  }
}
