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
    return (att - 10)/2;
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
