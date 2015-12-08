// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.cert.CRLException;

class cause extends CRLException
{

    Throwable cause;

    public Throwable getCause()
    {
        return cause;
    }

    (String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }
}
