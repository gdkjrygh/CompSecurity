// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;


class cause extends RuntimeException
{

    private Throwable cause;

    public Throwable getCause()
    {
        return cause;
    }

    (Throwable throwable)
    {
        super(throwable.toString());
        cause = throwable;
    }
}
