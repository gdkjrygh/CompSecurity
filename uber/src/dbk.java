// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbk extends Enum
    implements TreatmentGroup
{

    public static final dbk a;
    public static final dbk b;
    private static final dbk c[];

    private dbk(String s, int i)
    {
        super(s, i);
    }

    public static dbk valueOf(String s)
    {
        return (dbk)Enum.valueOf(dbk, s);
    }

    public static dbk[] values()
    {
        return (dbk[])c.clone();
    }

    static 
    {
        a = new dbk("GET_UBER_CN", 0);
        b = new dbk("GET_UBER_CC", 1);
        c = (new dbk[] {
            a, b
        });
    }
}
