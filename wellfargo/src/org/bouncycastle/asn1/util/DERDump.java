// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.util;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;

// Referenced classes of package org.bouncycastle.asn1.util:
//            ASN1Dump

public class DERDump extends ASN1Dump
{

    public DERDump()
    {
    }

    public static String dumpAsString(ASN1Encodable asn1encodable)
    {
        StringBuffer stringbuffer = new StringBuffer();
        _dumpAsString("", false, asn1encodable.toASN1Primitive(), stringbuffer);
        return stringbuffer.toString();
    }

    public static String dumpAsString(ASN1Primitive asn1primitive)
    {
        StringBuffer stringbuffer = new StringBuffer();
        _dumpAsString("", false, asn1primitive, stringbuffer);
        return stringbuffer.toString();
    }
}
