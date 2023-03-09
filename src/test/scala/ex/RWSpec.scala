package ex

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatest.matchers.should.Matchers.shouldBe

class RWSpec extends AnyFunSuite with Matchers:
  import ex.Checking.*
  import ex.RW.*


  test("RW fair") {
    safeMany(pnRW, Seq(MSet(P6, P7)), MSet(P1, P5), 10) shouldBe true
    safeMany(pnRW, Seq(MSet(P1, P5)), MSet(P1, P5), 10) shouldBe false
  }
