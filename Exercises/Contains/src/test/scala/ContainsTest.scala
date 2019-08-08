import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.alphaStr

class ContainsTest extends Properties("StringUtils"){
  property("doesn't contain") = forAll(alphaStr, Int) {
    (s1, s2) =>
      !StringUtils.contains(s1, s2.toString)
  }

  property("contains") = forAll {
    (s1: String, s2: String, s3: String) =>
      StringUtils.contains(s1 + s2 + s3, s2)
  }
}
