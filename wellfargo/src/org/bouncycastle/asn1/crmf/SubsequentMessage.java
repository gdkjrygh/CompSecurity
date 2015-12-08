// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Integer;

public class SubsequentMessage extends ASN1Integer
{

    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);

    private SubsequentMessage(int i)
    {
        super(i);
    }

    public static SubsequentMessage valueOf(int i)
    {
        if (i == 0)
        {
            return encrCert;
        }
        if (i == 1)
        {
            return challengeResp;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown value: ").append(i).toString());
        }
    }

}
