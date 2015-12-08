// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;

import ch.boye.httpclientandroidlib.ProtocolException;

public class RedirectException extends ProtocolException
{

    private static final long serialVersionUID = 0x3d52d180ff443ddeL;

    public RedirectException()
    {
    }

    public RedirectException(String s)
    {
        super(s);
    }

    public RedirectException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
