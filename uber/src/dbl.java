// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbl extends Enum
    implements TreatmentGroup
{

    public static final dbl a;
    public static final dbl b;
    public static final dbl c;
    private static final dbl d[];

    private dbl(String s, int i)
    {
        super(s, i);
    }

    public static dbl valueOf(String s)
    {
        return (dbl)Enum.valueOf(dbl, s);
    }

    public static dbl[] values()
    {
        return (dbl[])d.clone();
    }

    static 
    {
        a = new dbl("FREE_RIDES_FIRST", 0);
        b = new dbl("FREE_RIDES_LAST", 1);
        c = new dbl("FREE_RIDES_AFTER_PROFILE", 2);
        d = (new dbl[] {
            a, b, c
        });
    }
}
