// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbi extends Enum
    implements TreatmentGroup
{

    public static final dbi a;
    public static final dbi b;
    private static final dbi c[];

    private dbi(String s, int i)
    {
        super(s, i);
    }

    public static dbi valueOf(String s)
    {
        return (dbi)Enum.valueOf(dbi, s);
    }

    public static dbi[] values()
    {
        return (dbi[])c.clone();
    }

    static 
    {
        a = new dbi("CASH_OPTION", 0);
        b = new dbi("CASH_ONLY", 1);
        c = (new dbi[] {
            a, b
        });
    }
}
