package Classes;

import java.util.Scanner;

public class Classes{
  protected int _lvl;
  protected int _hitDie;
  protected int _hp;
  
  protected int _str;
  protected int _dex;
  protected int _con;
  protected int _int;
  protected int _wis;
  protected int _cha;

  protected int _strMod;
  protected int _dexMod;
  protected int _conMod;
  protected int _intMod;
  protected int _wisMod;
  protected int _chaMod;

  private int setMod(int att){
    if(att == 1){
      return -5;
    }else if(att == 2 || att == 3){
      return -4;
    }else if(att == 4 || att == 5){
      return -3;
    }else if(att == 6 || att == 7){
      return -2;
    }else if(att == 8 || att == 9){
      return -1;
    }else if(att == 10 || att == 11){
      return 0;
    }else if(att == 12 || att == 13){
      return 1;
    }else if(att == 14 || att == 15){
      return 2;
    }else if(att == 16 || att == 17){
      return 3;
    }else if(att == 18 || att == 19){
      return 4;
    }else if(att == 20 || att == 21){
      return 5;
    }else if(att == 22 || att == 23){
      return 6;
    }else if(att == 24 || att == 25){
      return 7;
    }else if(att == 26 || att == 27){
      return 8;
    }else if(att == 28 || att == 29){
      return 9;
    }else if(att == 30){
      return 10;
    }else
      return -10;
  }

  protected void setMods(){
    _strMod = setMod(_str);
    _dexMod = setMod(_dex);
    _conMod = setMod(_con);
    _intMod = setMod(_int);
    _wisMod = setMod(_wis);
    _chaMod = setMod(_cha);
  }

  public void lvlup(){
    _lvl += 1;
    _hp += _hitDie/2 + _conMod;

    if(_lvl % 4 == 0){
      for(int i = 0; i <2; i++){
        System.out.println("Chosse a attribute to upgrade:\n1.STR\n2.DEX\n3.CON\n4.INT\n5.WIS\n6.CHA");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        switch(choice){
          case 1:
            _str += 1;
            break;
          case 2:
            _dex += 1;
            break;
          case 3:
            _con += 1;
            break;
          case 4:
            _int +=1;
            break;
          case 5:
            _wis += 1;
            break;
          case 6:
            _cha +=1;
            break;
        }
      }
    }
    setMods();
  }
}
