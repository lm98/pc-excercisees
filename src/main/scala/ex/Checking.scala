package ex

object Checking:
  import pc.modelling.SystemAnalysis.*
  import pc.modelling.System
  import pc.modelling.PetriNet.*
  import pc.utils.MSet
  def safe[S](p: pc.modelling.System[S], toExclude: S, start: S, depth: Int): Boolean =
    !p.paths(start, depth).toList.flatten.contains(toExclude)

  def safeMany[S](p: pc.modelling.System[S], toExclude: Seq[S], start: S, depth: Int): Boolean =
    val res = for
      e <- toExclude
      r = safe(p, e, start, depth)
    yield r
    res.foldLeft(true)(_ && _)