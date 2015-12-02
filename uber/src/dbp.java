// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbp extends Enum
    implements TreatmentGroup
{

    public static final dbp a;
    public static final dbp b;
    private static final dbp c[];

    private dbp(String s, int i)
    {
        super(s, i);
    }

    public static dbp valueOf(String s)
    {
        return (dbp)Enum.valueOf(dbp, s);
    }

    public static dbp[] values()
    {
        return (dbp[])c.clone();
    }

    static 
    {
        a = new dbp("CASH_OPTION", 0);
        b = new dbp("CASH_OPTION_FORCED_ON_SIGNUP", 1);
        c = (new dbp[] {
            a, b
        });
    }
}
