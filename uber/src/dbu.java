// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbu extends Enum
    implements TreatmentGroup
{

    public static final dbu a;
    public static final dbu b;
    private static final dbu c[];

    private dbu(String s, int i)
    {
        super(s, i);
    }

    public static dbu valueOf(String s)
    {
        return (dbu)Enum.valueOf(dbu, s);
    }

    public static dbu[] values()
    {
        return (dbu[])c.clone();
    }

    static 
    {
        a = new dbu("FREE_RIDES_SCREEN", 0);
        b = new dbu("SHOW_POPUP", 1);
        c = (new dbu[] {
            a, b
        });
    }
}
