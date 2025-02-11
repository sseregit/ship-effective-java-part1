package jang.effective.java.chapter04.item17.part3;

import java.math.BigInteger;

public class BigIntegerUtils {

    public static BigInteger safeInstance(BigInteger val) {
        return val.getClass() == BigInteger.class ? (BigInteger) val : new BigInteger(val.toByteArray());
    }
}
