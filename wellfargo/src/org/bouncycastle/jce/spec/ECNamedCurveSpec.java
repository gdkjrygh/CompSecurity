// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

public class ECNamedCurveSpec extends ECParameterSpec
{

    private String name;

    public ECNamedCurveSpec(String s, EllipticCurve ellipticcurve, ECPoint ecpoint, BigInteger biginteger)
    {
        super(ellipticcurve, ecpoint, biginteger, 1);
        name = s;
    }

    public ECNamedCurveSpec(String s, EllipticCurve ellipticcurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        super(ellipticcurve, ecpoint, biginteger, biginteger1.intValue());
        name = s;
    }

    public ECNamedCurveSpec(String s, ECCurve eccurve, org.bouncycastle.math.ec.ECPoint ecpoint, BigInteger biginteger)
    {
        super(convertCurve(eccurve, null), convertPoint(ecpoint), biginteger, 1);
        name = s;
    }

    public ECNamedCurveSpec(String s, ECCurve eccurve, org.bouncycastle.math.ec.ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        super(convertCurve(eccurve, null), convertPoint(ecpoint), biginteger, biginteger1.intValue());
        name = s;
    }

    public ECNamedCurveSpec(String s, ECCurve eccurve, org.bouncycastle.math.ec.ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        super(convertCurve(eccurve, abyte0), convertPoint(ecpoint), biginteger, biginteger1.intValue());
        name = s;
    }

    private static EllipticCurve convertCurve(ECCurve eccurve, byte abyte0[])
    {
        if (eccurve instanceof org.bouncycastle.math.ec.ECCurve.Fp)
        {
            return new EllipticCurve(new ECFieldFp(((org.bouncycastle.math.ec.ECCurve.Fp)eccurve).getQ()), eccurve.getA().toBigInteger(), eccurve.getB().toBigInteger(), abyte0);
        }
        org.bouncycastle.math.ec.ECCurve.F2m f2m = (org.bouncycastle.math.ec.ECCurve.F2m)eccurve;
        if (f2m.isTrinomial())
        {
            int i = f2m.getK1();
            return new EllipticCurve(new ECFieldF2m(f2m.getM(), new int[] {
                i
            }), eccurve.getA().toBigInteger(), eccurve.getB().toBigInteger(), abyte0);
        } else
        {
            int j = f2m.getK3();
            int k = f2m.getK2();
            int l = f2m.getK1();
            return new EllipticCurve(new ECFieldF2m(f2m.getM(), new int[] {
                j, k, l
            }), eccurve.getA().toBigInteger(), eccurve.getB().toBigInteger(), abyte0);
        }
    }

    private static ECPoint convertPoint(org.bouncycastle.math.ec.ECPoint ecpoint)
    {
        return new ECPoint(ecpoint.getX().toBigInteger(), ecpoint.getY().toBigInteger());
    }

    public String getName()
    {
        return name;
    }
}
