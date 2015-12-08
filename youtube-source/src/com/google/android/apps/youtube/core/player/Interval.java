// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            v

public class Interval
{

    protected final v a;
    protected final v b;
    protected final String c;
    protected final int d;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Interval[")).append(Long.toString(a.a())).append(", ").append(Long.toString(b.a()));
        String s;
        if (a.a() == b.a())
        {
            s = "]";
        } else
        {
            s = ")";
        }
        return stringbuilder.append(s).toString();
    }
}
