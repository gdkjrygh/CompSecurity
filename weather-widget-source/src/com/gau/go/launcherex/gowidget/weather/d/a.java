// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.d:
//            c

public class a
{

    static final boolean a;

    private a()
    {
    }

    public static String a(byte abyte0[], int i)
    {
        try
        {
            abyte0 = new String(b(abyte0, i), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    public static byte[] a(byte abyte0[], int i, int j, int k)
    {
        c c1;
        int l;
        c1 = new c(k, null);
        l = (j / 3) * 4;
        if (!c1.d) goto _L2; else goto _L1
_L1:
        k = l;
        if (j % 3 > 0)
        {
            k = l + 4;
        }
_L4:
        l = k;
        if (c1.e)
        {
            l = k;
            if (j > 0)
            {
                int i1 = (j - 1) / 57;
                if (c1.f)
                {
                    l = 2;
                } else
                {
                    l = 1;
                }
                l = k + l * (i1 + 1);
            }
        }
        c1.a = new byte[l];
        c1.a(abyte0, i, j, true);
        if (!a && c1.b != l)
        {
            throw new AssertionError();
        } else
        {
            return c1.a;
        }
_L2:
        k = l;
        switch (j % 3)
        {
        default:
            k = l;
            break;

        case 1: // '\001'
            k = l + 2;
            break;

        case 2: // '\002'
            k = l + 3;
            break;

        case 0: // '\0'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] b(byte abyte0[], int i)
    {
        return a(abyte0, 0, abyte0.length, i);
    }

    static 
    {
        boolean flag;
        if (!com/gau/go/launcherex/gowidget/weather/d/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
