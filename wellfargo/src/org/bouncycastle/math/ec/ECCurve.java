// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, ECPoint

public abstract class ECCurve
{

    ECFieldElement a;
    ECFieldElement b;

    public ECCurve()
    {
    }

    public abstract ECPoint createPoint(BigInteger biginteger, BigInteger biginteger1, boolean flag);

    public abstract ECPoint decodePoint(byte abyte0[]);

    public abstract ECFieldElement fromBigInteger(BigInteger biginteger);

    public ECFieldElement getA()
    {
        return a;
    }

    public ECFieldElement getB()
    {
        return b;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();
}
