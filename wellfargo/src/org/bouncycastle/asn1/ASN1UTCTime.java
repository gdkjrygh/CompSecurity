// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Date;

// Referenced classes of package org.bouncycastle.asn1:
//            DERUTCTime

public class ASN1UTCTime extends DERUTCTime
{

    public ASN1UTCTime(String s)
    {
        super(s);
    }

    public ASN1UTCTime(Date date)
    {
        super(date);
    }

    ASN1UTCTime(byte abyte0[])
    {
        super(abyte0);
    }
}
