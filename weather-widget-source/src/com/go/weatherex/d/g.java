// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.text.TextUtils;

// Referenced classes of package com.go.weatherex.d:
//            a, b

class g
{

    String a;
    String b;
    String c;
    String d;
    long e;
    boolean f;
    final a g;

    private g(a a1)
    {
        g = a1;
        super();
    }

    g(a a1, b b1)
    {
        this(a1);
    }

    public String a()
    {
        StringBuffer stringbuffer = new StringBuffer(b);
        if (!TextUtils.isEmpty(d))
        {
            stringbuffer.append((new StringBuilder()).append(", ").append(d).toString());
        }
        if (!TextUtils.isEmpty(c))
        {
            stringbuffer.append((new StringBuilder()).append("(").append(c).append(")").toString());
        }
        return stringbuffer.toString();
    }
}
