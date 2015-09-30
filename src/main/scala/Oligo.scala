
case class Oligo(strand: String) {
  def isValid: Boolean = {
    strand.matches("[ATGC]+")
  }
}
