import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.Array._
import util.control.Breaks._
import scala.collection.mutable._

object chipper{

    def enc(char:Char = 'A', key:Int = 5):Char = {// encrypt
        // argument handelling
        var new_key:Int = 0;
        if(key > 26){// handelling large key value
            new_key = key % 26;
        }
        else{
            new_key = key;
        }
        //--------------------------------------------------------------------------

        var char_val:Int = char.toInt;      var new_val:Int = char_val + new_key;
        
        if((char_val >= 'A'.toInt) && (char_val <= 'Z'.toInt)){// uper case
            if(new_val <= 'Z'.toChar){// with in range
                return new_val.toChar;
            }
            else{// not with in range
                new_val = new_val - 26;
                return new_val.toChar;
            }
        }
        else if((char_val >= 'a'.toInt) && (char_val <= 'z'.toInt)){// lower case
            if(new_val <= 'z'.toChar){// with in range
                return new_val.toChar;
            }
            else{// not with in range
                new_val = new_val - 26;
                return new_val.toChar;
            }
        }
        else{// not a letter
            return char;
        }
    }

    def dec(char:Char = 'F', key:Int = 5):Char = {// decrypt
        // argument handelling
        var new_key:Int = 0;
        if(key > 26){// handelling large key value
            new_key = key % 26;
        }
        else{
            new_key = key;
        }
        //--------------------------------------------------------------------------------

        var char_val = char.toInt;      var new_val:Int = char_val - new_key;

        if((char_val >= 'A'.toInt) && (char_val <= 'Z'.toInt)){// uper case
            if(new_val >= 'A'.toInt){// with in range
                return new_val.toChar;
            }
            else{// not with in range
                new_val = new_val + 26;
                return new_val.toChar;
            }
        }
        else if((char_val >= 'a'.toInt) && (char_val <= 'z'.toInt)){// lower case
            if(new_val >= 'a'.toInt){// with in range
                return new_val.toChar;
            }
            else{// not with in range
                new_val = new_val + 26;
                return new_val.toChar;
            }
        }
        else{// not a letter
            return char;
        }
    }

    def main( args:Array[String] ): Unit = {
        var alph = ArrayBuffer[Char]();
        for(x <- 'A' to 'Z'){ alph += x; }// create aplhabet
  
        breakable{
        while(true){// infinite loop
            var tempstr = ArrayBuffer[Char](); // to store the encrypted string
            // user input ---------
            var user_in:String = readLine("\nuser input (string) -> ");
            print("key value -> ");
            var key:Int = readInt();

            breakable{
            while(true){
                
                // choise ----------
                print("\n................ choise ....................\n");
                print("1.) encrypt\n2.) decrypt\n3.) enter new string\n4.) change key value");
                print("\nchoise -> ");
                var choise:Int = readInt();
                print("....................................\n");
                // resolving
                if(choise == 1){// encrypt 
                    print("encrypted \"user input\"\n--> ")
                    for(x <- user_in){
                    print(enc(x,key));      tempstr += enc(x,key);
                    }
                }
                else if(choise == 2){// decrypt
                    print("decrypted \"user input\"\n--> ")
                    for(x <- user_in){
                        print(dec(x,key));
                    }
                    //print("\n");
                }
                else if(choise == 3){
                    break();// jump to main loop
                }
                else if(choise == 4){
                    print("\ncurrent key value --> "+key);
                    print("\nnew key value -> ");
                    key = readInt();
                }
                else{
                    print("\n\tno such option...");
                }
            }
            }
        }
        }
    }
}
