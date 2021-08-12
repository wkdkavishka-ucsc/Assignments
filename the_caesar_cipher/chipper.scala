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

        while(true){// infinite loop
            var name = ArrayBuffer[Char]();
            // user input ---------
            var user_in:String = readLine("\nuser input (string) -> ");
            print("encrypt key value -> ");
            var key:Int = readInt();

            // processing -------------
            print("\nencrypted user input\n")
            for(x <- user_in){
                print(enc(x,key));      name += enc(x,key);
            }
            print("\ndecrypted user input\n")
            for(x <- name){
                print(dec(x,key));
            }
        }    
    }
}
