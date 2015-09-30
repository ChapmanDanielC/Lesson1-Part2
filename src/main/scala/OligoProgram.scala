

object OligoProgram {

  def main(args: Array[String]): Unit = {
    val vectorOfSequences = args.toVector
    val oligos = vectorOfSequences.map(Oligo)
    println(oligos)
    val test = oligos.map(upordown)
    println(test)


  }

  def upordown(strand: Oligo): Boolean = {
    strand.isValid
  }


  def validatesequence(sequence: String) = {
    val myFirstOligo = Oligo(sequence)

    myFirstOligo.isValid match {
      case true => println("Valid sequence")
      case false => println("you gave me an invalid sequence")
    }
  }
}

