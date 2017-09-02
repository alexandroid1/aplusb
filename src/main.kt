import java.io.FileReader
import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(FileReader("aplusb.in"))
    val a = sc.nextInt()
    val b = sc.nextInt()
    sc.close()

    val out = PrintWriter("aplusb.out")
    out.print(a+b)
    out.close()
}