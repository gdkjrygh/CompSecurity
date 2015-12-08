// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            be, bf

public class bg extends be
{

    public bg(bf bf1, Exception exception)
    {
        this(bf1.toString(), ((Throwable) (exception)));
    }

    public bg(String s)
    {
        super("RequestError", s);
    }

    public bg(String s, String s1, String s2)
    {
        super("RequestError", s, s1, s2);
    }

    public bg(String s, Throwable throwable)
    {
        super(throwable.getClass().toString(), s, throwable.toString(), throwable.getMessage());
    }
}
