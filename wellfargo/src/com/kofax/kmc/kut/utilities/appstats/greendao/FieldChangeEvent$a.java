// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;


final class  extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/greendao/FieldChangeEvent$a, s);
    }

    public static [] values()
    {
        return ([])l.clone();
    }

    static 
    {
        a = new <init>("ID", 0);
        b = new <init>("DOCUMENTID", 1);
        c = new <init>("EVENTTIME", 2);
        d = new <init>("ORIGINALVALUE", 3);
        e = new <init>("CHANGEDVALUE", 4);
        f = new <init>("FIELDNAME", 5);
        g = new <init>("ISVALID", 6);
        h = new <init>("ERRORDESCRIPTION", 7);
        i = new <init>("SESSIONEVENTID", 8);
        j = new <init>("CONFIDENCE", 9);
        k = new <init>("FORMATTINGFAILED", 10);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
