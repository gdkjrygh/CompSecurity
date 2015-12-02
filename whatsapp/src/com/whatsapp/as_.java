// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, k

public class as_
{

    public boolean a;
    public String b;
    public int c;
    public boolean d;

    public as_(String s, boolean flag, boolean flag1)
    {
        b = s;
        d = flag;
        a = flag1;
    }

    public boolean a()
    {
        return App.az.d(b);
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(" ").append(d).append(" ").append(a).toString();
    }
}
