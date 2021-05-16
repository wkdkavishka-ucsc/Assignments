object sphere_volume {
    def main (args:Array[String]){
        println("calculate volume of a sphere\nuser input");
        val userin = scala.io.StdIn.readInt()
        println("volume of sphere with radius " + userin + " is --> " + sphere(userin));
    }

    def sphere (radius:Int): Double = {
        var volume = (4/3*22/7*radius*radius*radius)
        volume.toDouble
    }
}
