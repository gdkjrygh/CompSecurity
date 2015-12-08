// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;


// Referenced classes of package com.go.weatherex.setting:
//            ba, bb

class bi
{

    String a;
    String b;
    int c;
    boolean d;
    final ba e;

    private bi(ba ba1)
    {
        e = ba1;
        super();
        c = -1;
    }

    bi(ba ba1, bb bb)
    {
        this(ba1);
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
