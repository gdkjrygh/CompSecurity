// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException
{

    private Throwable cause;

    ASN1Exception(String s)
    {
        super(s);
    }

    ASN1Exception(String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
