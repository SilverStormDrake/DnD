package Classes;

public class Barbarian extends Classes{
    private String _name;
  
    public Barbarian(String name, int lvl, int str, int dex, int con, int inte, int wis, int cha){
        _hitDie = 12;
        this._name = name;
        this._lvl = lvl;
        this._str = str;
        this._dex = dex;
        this._con = con;
        this._int = inte;
        this._wis = wis;
        this._cha = cha;
        setMods();
        this._hp = _hitDie + _conMod;
    }
    
    public String toString(){
      return "Name: " + _name + "\nHP: " + _hp +"\nLevel: " + _lvl + "\nSTR: " + _str + " " + _strMod + "\nDEX: " + _dex + " " + _dexMod + "\nCON: " + _con + " " + _conMod + "\nINT: " + _int + " " + _intMod + "\nWIS: " + _wis + " " + _wisMod + "\nCHA: " + _cha + " " + _chaMod;
    }
}
