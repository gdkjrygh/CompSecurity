// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Date;

// Referenced classes of package org.bouncycastle.asn1:
//            DERGeneralizedTime

public class ASN1GeneralizedTime extends DERGeneralizedTime
{

    public ASN1GeneralizedTime(String s)
    {
        super(s);
    }

    public ASN1GeneralizedTime(Date date)
    {
        super(date);
    }

    ASN1GeneralizedTime(byte abyte0[])
    {
        super(abyte0);
    }
}
