// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;


// Referenced classes of package com.go.weatherex.setting:
//            b, c

class e
{

    String a;
    String b;
    int c;
    boolean d;
    final b e;

    private e(b b1)
    {
        e = b1;
        super();
        c = -1;
    }

    e(b b1, c c1)
    {
        this(b1);
    }

    public String a()
    {
        StringBuffer stringbuffer = new StringBuffer(a);
        if (c != 1)
        {
            stringbuffer.append(e.getString(0x7f0803d7));
        }
        return stringbuffer.toString();
    }
}
