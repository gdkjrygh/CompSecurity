// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;

public final class aD extends RuntimeException
{

    private static final long serialVersionUID = 0xefc1aa7964bcfdc9L;

    protected aD(IOException ioexception)
    {
        super(ioexception);
    }

    public final volatile Throwable getCause()
    {
        return (IOException)super.getCause();
    }
}
