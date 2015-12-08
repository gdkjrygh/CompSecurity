// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.exceptions;


public abstract class WxFrameworkException extends Exception
{

    private static final long serialVersionUID = 0x8cfa720187933485L;

    public WxFrameworkException()
    {
    }

    public WxFrameworkException(String s)
    {
        super(s);
    }

    public WxFrameworkException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public WxFrameworkException(Throwable throwable)
    {
        super(throwable);
    }
}
