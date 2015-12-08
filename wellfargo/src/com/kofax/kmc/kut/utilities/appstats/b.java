// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    private static final b m[];

    private b(String s, int i1)
    {
        super(s, i1);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/b, s);
    }

    public static b[] values()
    {
        return (b[])m.clone();
    }

    static 
    {
        a = new b("TASK_NONE", 0);
        b = new b("TASK_INIT_APPSTATS", 1);
        c = new b("TASK_PURGE", 2);
        d = new b("TASK_START_RECORD", 3);
        e = new b("TASK_STOP_RECORD", 4);
        f = new b("TASK_WRITE", 5);
        g = new b("TASK_WRITE_COMPLETE", 6);
        h = new b("TASK_EXPORT", 7);
        i = new b("TASK_BEGIN_SESSION", 8);
        j = new b("TASK_LOG_SESSION", 9);
        k = new b("TASK_END_SESSION", 10);
        l = new b("TASK_UPGRADE", 11);
        m = (new b[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
