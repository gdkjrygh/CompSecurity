// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbm extends Enum
    implements TreatmentGroup
{

    public static final dbm a;
    public static final dbm b;
    public static final dbm c;
    public static final dbm d;
    public static final dbm e;
    public static final dbm f;
    public static final dbm g;
    public static final dbm h;
    private static final dbm i[];

    private dbm(String s, int j)
    {
        super(s, j);
    }

    public static dbm valueOf(String s)
    {
        return (dbm)Enum.valueOf(dbm, s);
    }

    public static dbm[] values()
    {
        return (dbm[])i.clone();
    }

    static 
    {
        a = new dbm("NEW_MAGIC_SCREEN", 0);
        b = new dbm("NEW_MAGIC_SCREEN_CHANGE_BUTTON", 1);
        c = new dbm("NEW_MAGIC_BLACK_BLUE_NO_SHEET", 2);
        d = new dbm("NEW_MAGIC_BW_NO_SHEET", 3);
        e = new dbm("NEW_MAGIC_NO_COPY", 4);
        f = new dbm("NEW_MAGIC_V2", 5);
        g = new dbm("NEW_MAGIC_WHITE_BLUE_NO_SHEET", 6);
        h = new dbm("NEW_MAGIC_WHITE_BLUE_WITH_SHEET", 7);
        i = (new dbm[] {
            a, b, c, d, e, f, g, h
        });
    }
}
