// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            my

public abstract class k6
{

    String a;

    public k6()
    {
    }

    public abstract String a();

    public void a(String s)
    {
        a = s;
    }

    public boolean b()
    {
        return a != null && a.equals(my.g);
    }

    public abstract void c();

    public String toString()
    {
        return a();
    }
}
