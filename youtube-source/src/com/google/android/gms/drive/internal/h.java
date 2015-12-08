// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.js;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.ll;

public final class h extends jt
{

    public static final h a[] = new h[0];
    public int b;
    public String c;
    public long d;
    public long e;
    private int g;

    public h()
    {
        b = 1;
        c = "";
        d = -1L;
        e = -1L;
        g = -1;
    }

    public static h a(byte abyte0[])
    {
        return (h)jt.b(new h(), abyte0, 0, abyte0.length);
    }

    public final int a()
    {
        int i = b;
        int j = ll.a(1);
        String s;
        int k;
        if (i >= 0)
        {
            i = ll.c(i);
        } else
        {
            i = 10;
        }
        s = c;
        k = ll.a(2);
        i = i + j + 0 + (ll.a(s) + k) + ll.b(3, d) + ll.b(4, e);
        g = i;
        return i;
    }

    public final jt a(js js1)
    {
        do
        {
            int i = js1.a();
            switch (i)
            {
            default:
                if (jw.a(js1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                b = js1.b();
                break;

            case 18: // '\022'
                c = js1.c();
                break;

            case 24: // '\030'
                d = js1.d();
                break;

            case 32: // ' '
                e = js1.d();
                break;
            }
        } while (true);
    }

    public final void a(ll ll1)
    {
        int i = b;
        ll1.a(1, 0);
        String s;
        byte abyte0[];
        if (i >= 0)
        {
            ll1.b(i);
        } else
        {
            ll1.a(i);
        }
        s = c;
        ll1.a(2, 2);
        abyte0 = s.getBytes("UTF-8");
        ll1.b(abyte0.length);
        ll1.b(abyte0, 0, abyte0.length);
        ll1.a(3, d);
        ll1.a(4, e);
    }

}
