import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.Array._
import util.control.Breaks._
import scala.collection.mutable._

object q1{
    def is_prime(num:Int = 2, d_fac:Int = 2): Boolean = {
        if( num <=0 ){
            false
        }// negative or zero number
        else if( num == 1 ){
            false
        }// exception of 1
        else{//positive number
            if( num%d_fac == 0 ){//no modules
                if( num == d_fac ){// by it self
                    true
                }
                else{
                    false;
                }
            }
            else{
                is_prime(num,d_fac+1)
            }
        }
    }

    def main( args: Array[String] ): Unit = {// main ----------
        while(true){
            var user: Int = 0;
            print(f"number -> ");
            user = readInt()
            println(is_prime(user))
            print("\n");
        }
    }
}

