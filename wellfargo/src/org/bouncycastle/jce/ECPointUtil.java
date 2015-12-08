// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

public class ECPointUtil
{

    public ECPointUtil()
    {
    }

    public static ECPoint decodePoint(EllipticCurve ellipticcurve, byte abyte0[])
    {
        if (ellipticcurve.getField() instanceof ECFieldFp)
        {
            ellipticcurve = new org.bouncycastle.math.ec.ECCurve.Fp(((ECFieldFp)ellipticcurve.getField()).getP(), ellipticcurve.getA(), ellipticcurve.getB());
        } else
        {
            int ai[] = ((ECFieldF2m)ellipticcurve.getField()).getMidTermsOfReductionPolynomial();
            if (ai.length == 3)
            {
                ellipticcurve = new org.bouncycastle.math.ec.ECCurve.F2m(((ECFieldF2m)ellipticcurve.getField()).getM(), ai[2], ai[1], ai[0], ellipticcurve.getA(), ellipticcurve.getB());
            } else
            {
                ellipticcurve = new org.bouncycastle.math.ec.ECCurve.F2m(((ECFieldF2m)ellipticcurve.getField()).getM(), ai[0], ellipticcurve.getA(), ellipticcurve.getB());
            }
        }
        ellipticcurve = ellipticcurve.decodePoint(abyte0);
        return new ECPoint(ellipticcurve.getX().toBigInteger(), ellipticcurve.getY().toBigInteger());
    }
}
