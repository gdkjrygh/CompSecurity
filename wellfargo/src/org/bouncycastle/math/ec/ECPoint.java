// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9IntegerConverter;

// Referenced classes of package org.bouncycastle.math.ec:
//            FpNafMultiplier, ECCurve, ECMultiplier, PreCompInfo, 
//            ECFieldElement

public abstract class ECPoint
{

    private static X9IntegerConverter converter = new X9IntegerConverter();
    ECCurve curve;
    protected ECMultiplier multiplier;
    protected PreCompInfo preCompInfo;
    protected boolean withCompression;
    ECFieldElement x;
    ECFieldElement y;

    protected ECPoint(ECCurve eccurve, ECFieldElement ecfieldelement, ECFieldElement ecfieldelement1)
    {
        multiplier = null;
        preCompInfo = null;
        curve = eccurve;
        x = ecfieldelement;
        y = ecfieldelement1;
    }

    public abstract ECPoint add(ECPoint ecpoint);

    void assertECMultiplier()
    {
        this;
        JVM INSTR monitorenter ;
        if (multiplier == null)
        {
            multiplier = new FpNafMultiplier();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ECPoint))
            {
                return false;
            }
            obj = (ECPoint)obj;
            if (isInfinity())
            {
                return ((ECPoint) (obj)).isInfinity();
            }
            if (!x.equals(((ECPoint) (obj)).x) || !y.equals(((ECPoint) (obj)).y))
            {
                return false;
            }
        }
        return true;
    }

    public ECCurve getCurve()
    {
        return curve;
    }

    public abstract byte[] getEncoded();

    public ECFieldElement getX()
    {
        return x;
    }

    public ECFieldElement getY()
    {
        return y;
    }

    public int hashCode()
    {
        if (isInfinity())
        {
            return 0;
        } else
        {
            return x.hashCode() ^ y.hashCode();
        }
    }

    public boolean isCompressed()
    {
        return withCompression;
    }

    public boolean isInfinity()
    {
        return x == null && y == null;
    }

    public ECPoint multiply(BigInteger biginteger)
    {
        if (biginteger.signum() < 0)
        {
            throw new IllegalArgumentException("The multiplicator cannot be negative");
        }
        if (isInfinity())
        {
            return this;
        }
        if (biginteger.signum() == 0)
        {
            return curve.getInfinity();
        } else
        {
            assertECMultiplier();
            return multiplier.multiply(this, biginteger, preCompInfo);
        }
    }

    public abstract ECPoint negate();

    void setPreCompInfo(PreCompInfo precompinfo)
    {
        preCompInfo = precompinfo;
    }

    public abstract ECPoint subtract(ECPoint ecpoint);

    public abstract ECPoint twice();


}
