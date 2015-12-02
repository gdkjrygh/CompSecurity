// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbv extends Enum
    implements TreatmentGroup
{

    public static final dbv a;
    public static final dbv b;
    public static final dbv c;
    public static final dbv d;
    public static final dbv e;
    public static final dbv f;
    public static final dbv g;
    public static final dbv h;
    private static final dbv i[];

    private dbv(String s, int j)
    {
        super(s, j);
    }

    public static dbv valueOf(String s)
    {
        return (dbv)Enum.valueOf(dbv, s);
    }

    public static dbv[] values()
    {
        return (dbv[])i.clone();
    }

    static 
    {
        a = new dbv("CANCEL_SURVEY", 0);
        b = new dbv("PICKUP_AND_CANCEL_SURVEY", 1);
        c = new dbv("PICKUP_SURVEY", 2);
        d = new dbv("POOL_CANCELLATION_SURVEY", 3);
        e = new dbv("POOL_IN_CAR_SURVEY", 4);
        f = new dbv("POOL_NO_WALKING_PICKUP_SURVEY", 5);
        g = new dbv("POOL_VALUE_PROP_SURVEY", 6);
        h = new dbv("POOL_WALKING_PICKUP_SURVEY", 7);
        i = (new dbv[] {
            a, b, c, d, e, f, g, h
        });
    }
}
