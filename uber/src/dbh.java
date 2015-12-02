// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbh extends Enum
    implements TreatmentGroup
{

    public static final dbh a;
    public static final dbh b;
    public static final dbh c;
    private static final dbh d[];

    private dbh(String s, int i)
    {
        super(s, i);
    }

    public static dbh valueOf(String s)
    {
        return (dbh)Enum.valueOf(dbh, s);
    }

    public static dbh[] values()
    {
        return (dbh[])d.clone();
    }

    static 
    {
        a = new dbh("ARRIVED", 0);
        b = new dbh("ACCEPTED_AND_ARRIVED", 1);
        c = new dbh("MESSAGE", 2);
        d = (new dbh[] {
            a, b, c
        });
    }
}
