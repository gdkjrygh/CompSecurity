// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;


final class I extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEvent$a, s);
    }

    public static I[] values()
    {
        return (I[])j.clone();
    }

    static 
    {
        a = new <init>("ID", 0);
        b = new <init>("INSTANCEID", 1);
        c = new <init>("STARTTIME", 2);
        d = new <init>("STOPTIME", 3);
        e = new <init>("CLASSIFICATIONRESULT", 4);
        f = new <init>("CLASSIFICATIONCONFIDENCE", 5);
        g = new <init>("IMAGEID", 6);
        h = new <init>("DOCUMENTID", 7);
        i = new <init>("SESSIONKEY", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private I(String s, int k)
    {
        super(s, k);
    }
}
