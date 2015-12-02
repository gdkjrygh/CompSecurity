// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbt extends Enum
    implements TreatmentGroup
{

    public static final dbt a;
    public static final dbt b;
    private static final dbt c[];

    private dbt(String s, int i)
    {
        super(s, i);
    }

    public static dbt valueOf(String s)
    {
        return (dbt)Enum.valueOf(dbt, s);
    }

    public static dbt[] values()
    {
        return (dbt[])c.clone();
    }

    static 
    {
        a = new dbt("SETTING_CTA", 0);
        b = new dbt("TEST_NO_PROFILES", 1);
        c = (new dbt[] {
            a, b
        });
    }
}
