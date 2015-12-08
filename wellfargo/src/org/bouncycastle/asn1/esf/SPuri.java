// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;

public class SPuri
{

    private DERIA5String uri;

    public SPuri(DERIA5String deria5string)
    {
        uri = deria5string;
    }

    public static SPuri getInstance(Object obj)
    {
        if (obj instanceof SPuri)
        {
            return (SPuri)obj;
        }
        if (obj instanceof DERIA5String)
        {
            return new SPuri(DERIA5String.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERIA5String getUri()
    {
        return uri;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return uri.toASN1Primitive();
    }
}
