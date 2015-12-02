// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbo extends Enum
    implements TreatmentGroup
{

    public static final dbo a;
    public static final dbo b;
    private static final dbo c[];

    private dbo(String s, int i)
    {
        super(s, i);
    }

    public static dbo valueOf(String s)
    {
        return (dbo)Enum.valueOf(dbo, s);
    }

    public static dbo[] values()
    {
        return (dbo[])c.clone();
    }

    static 
    {
        a = new dbo("PAYMENT_WALL_REQUEST_ALLOWS_SKIP", 0);
        b = new dbo("PAYMENT_WALL_REQUEST_HIDDEN", 1);
        c = (new dbo[] {
            a, b
        });
    }
}
