object fahrenheit {
    def main (args:Array[String]){
        println("convert fahrenheit to celsiuc\nuser input");
        val userin = scala.io.StdIn.readInt()
        println(userin+" in celius is --> "+f_to_c(userin));
    }

    def f_to_c (faren:Double): Double = {
        var cel = ((faren - 32)/1.8)
        cel.toDouble
    }
}