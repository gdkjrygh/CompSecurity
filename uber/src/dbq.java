// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbq extends Enum
    implements TreatmentGroup
{

    public static final dbq a;
    private static final dbq b[];

    private dbq(String s)
    {
        super(s, 0);
    }

    public static dbq valueOf(String s)
    {
        return (dbq)Enum.valueOf(dbq, s);
    }

    public static dbq[] values()
    {
        return (dbq[])b.clone();
    }

    static 
    {
        a = new dbq("NO_BONUS");
        b = (new dbq[] {
            a
        });
    }
}
