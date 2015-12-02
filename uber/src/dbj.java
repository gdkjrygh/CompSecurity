// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbj extends Enum
    implements TreatmentGroup
{

    public static final dbj a;
    public static final dbj b;
    public static final dbj c;
    private static final dbj d[];

    private dbj(String s, int i)
    {
        super(s, i);
    }

    public static dbj valueOf(String s)
    {
        return (dbj)Enum.valueOf(dbj, s);
    }

    public static dbj[] values()
    {
        return (dbj[])d.clone();
    }

    static 
    {
        a = new dbj("SHARE_AS_TEXT", 0);
        b = new dbj("SHARE_AS_URL", 1);
        c = new dbj("SHARE_SINGLE_IMAGE", 2);
        d = (new dbj[] {
            a, b, c
        });
    }
}
