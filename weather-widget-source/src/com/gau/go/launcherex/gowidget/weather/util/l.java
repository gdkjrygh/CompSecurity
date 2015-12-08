// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.util.SparseArray;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            m

public class l
{

    private String a;
    private SparseArray b;

    public l()
    {
        b = new SparseArray();
    }

    public static final int a(int i, int j)
    {
        byte byte0 = -1;
        int k = byte0;
        if (i != -1)
        {
            k = byte0;
            if (j != -1)
            {
                StringBuffer stringbuffer = new StringBuffer();
                stringbuffer.append(i).append("#").append(j);
                k = stringbuffer.toString().hashCode();
            }
        }
        return k;
    }

    public void a(m m1)
    {
        int i = a(m1.a, m1.b);
        if (i != -1)
        {
            b.put(i, m1);
        }
    }

    public void a(String s)
    {
        a = s;
    }
}
