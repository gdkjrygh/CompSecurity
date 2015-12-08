// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import java.io.InterruptedIOException;

public class ConnectTimeoutException extends InterruptedIOException
{

    private static final long serialVersionUID = 0xbd27b46b62131d0bL;

    public ConnectTimeoutException()
    {
    }

    public ConnectTimeoutException(String s)
    {
        super(s);
    }
}
