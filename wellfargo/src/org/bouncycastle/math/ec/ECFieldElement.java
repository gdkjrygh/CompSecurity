// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants

public abstract class ECFieldElement
    implements ECConstants
{

    public ECFieldElement()
    {
    }

    public abstract ECFieldElement add(ECFieldElement ecfieldelement);

    public abstract ECFieldElement divide(ECFieldElement ecfieldelement);

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public abstract ECFieldElement multiply(ECFieldElement ecfieldelement);

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public abstract ECFieldElement subtract(ECFieldElement ecfieldelement);

    public abstract BigInteger toBigInteger();

    public String toString()
    {
        return toBigInteger().toString(2);
    }
}
