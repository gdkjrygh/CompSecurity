// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.asn1:
//            DEREnumerated

public class ASN1Enumerated extends DEREnumerated
{

    public ASN1Enumerated(int i)
    {
        super(i);
    }

    public ASN1Enumerated(BigInteger biginteger)
    {
        super(biginteger);
    }

    ASN1Enumerated(byte abyte0[])
    {
        super(abyte0);
    }
}
