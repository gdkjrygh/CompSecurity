// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbx extends Enum
    implements TreatmentGroup
{

    public static final dbx a;
    public static final dbx b;
    public static final dbx c;
    private static final dbx d[];

    private dbx(String s, int i)
    {
        super(s, i);
    }

    public static dbx valueOf(String s)
    {
        return (dbx)Enum.valueOf(dbx, s);
    }

    public static dbx[] values()
    {
        return (dbx[])d.clone();
    }

    static 
    {
        a = new dbx("NEAREST", 0);
        b = new dbx("NONE_REQUIRED", 1);
        c = new dbx("NONE_OPTIONAL", 2);
        d = (new dbx[] {
            a, b, c
        });
    }
}
