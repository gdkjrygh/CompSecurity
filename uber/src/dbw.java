// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbw extends Enum
    implements TreatmentGroup
{

    public static final dbw a;
    public static final dbw b;
    public static final dbw c;
    private static final dbw d[];

    private dbw(String s, int i)
    {
        super(s, i);
    }

    public static dbw valueOf(String s)
    {
        return (dbw)Enum.valueOf(dbw, s);
    }

    public static dbw[] values()
    {
        return (dbw[])d.clone();
    }

    static 
    {
        a = new dbw("HIDE_ALL_THIRD_PARTY", 0);
        b = new dbw("HIDE_FACEBOOK", 1);
        c = new dbw("HIDE_GOOGLE_PLUS", 2);
        d = (new dbw[] {
            a, b, c
        });
    }
}
