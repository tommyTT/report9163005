import org.bouncycastle.jce.provider.BouncyCastleProvider;

import sun.security.x509.AlgorithmId;

public class Test {
  public static void main(String[] args) throws Exception {
    new BouncyCastleProvider();

    AlgorithmId alg = AlgorithmId.get("HmacSHA512");
    System.out.println(alg);
  }
}
