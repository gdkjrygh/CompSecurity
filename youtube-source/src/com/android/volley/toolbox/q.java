// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.o;
import com.android.volley.r;
import java.io.UnsupportedEncodingException;

public abstract class q extends Request
{

    private static final String a = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private final o b;
    private final String c;

    public q(int i1, String s, String s1, o o1, n n)
    {
        super(i1, s, n);
        b = o1;
        c = s1;
    }

    protected abstract m a(j j1);

    protected final void a(Object obj)
    {
        b.a(obj);
    }

    public final String i()
    {
        return a;
    }

    public final byte[] j()
    {
        return l();
    }

    public final String k()
    {
        return a;
    }

    public final byte[] l()
    {
        if (c == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = c.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            r.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                c, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

}
