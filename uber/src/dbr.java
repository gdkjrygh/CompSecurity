// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbr extends Enum
    implements TreatmentGroup
{

    public static final dbr a;
    private static final dbr b[];

    private dbr(String s)
    {
        super(s, 0);
    }

    public static dbr valueOf(String s)
    {
        return (dbr)Enum.valueOf(dbr, s);
    }

    public static dbr[] values()
    {
        return (dbr[])b.clone();
    }

    static 
    {
        a = new dbr("TREATMENT");
        b = (new dbr[] {
            a
        });
    }
}
