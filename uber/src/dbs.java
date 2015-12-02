// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbs extends Enum
    implements TreatmentGroup
{

    public static final dbs a;
    public static final dbs b;
    public static final dbs c;
    private static final dbs d[];

    private dbs(String s, int i)
    {
        super(s, i);
    }

    public static dbs valueOf(String s)
    {
        return (dbs)Enum.valueOf(dbs, s);
    }

    public static dbs[] values()
    {
        return (dbs[])d.clone();
    }

    static 
    {
        a = new dbs("TREATMENT", 0);
        b = new dbs("TREATMENT_HOTSPOTS_V2", 1);
        c = new dbs("TEST_HOTSPOT_MANAGER", 2);
        d = (new dbs[] {
            a, b, c
        });
    }
}
