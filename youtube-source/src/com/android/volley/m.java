// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            b, VolleyError

public final class m
{

    public final Object a;
    public final b b;
    public final VolleyError c;
    public boolean d;

    private m(VolleyError volleyerror)
    {
        d = false;
        a = null;
        b = null;
        c = volleyerror;
    }

    private m(Object obj, b b1)
    {
        d = false;
        a = obj;
        b = b1;
        c = null;
    }

    public static m a(VolleyError volleyerror)
    {
        return new m(volleyerror);
    }

    public static m a(Object obj, b b1)
    {
        return new m(obj, b1);
    }
}
