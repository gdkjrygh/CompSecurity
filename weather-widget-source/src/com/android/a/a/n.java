// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import com.android.a.ab;
import com.android.a.p;
import com.android.a.u;
import com.android.a.v;
import java.io.UnsupportedEncodingException;

public abstract class n extends p
{

    private static final String a = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private final v b;
    private final String c;

    public n(int i, String s, String s1, v v1, u u)
    {
        super(i, s, u);
        b = v1;
        c = s1;
    }

    protected void b(Object obj)
    {
        b.a(obj);
    }

    public String l()
    {
        return p();
    }

    public byte[] m()
    {
        return q();
    }

    public String p()
    {
        return a;
    }

    public byte[] q()
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
            ab.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                c, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

}
