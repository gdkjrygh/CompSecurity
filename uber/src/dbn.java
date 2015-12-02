// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.experiment.model.TreatmentGroup;

public final class dbn extends Enum
    implements TreatmentGroup
{

    public static final dbn a;
    public static final dbn b;
    public static final dbn c;
    private static final dbn d[];

    private dbn(String s, int i)
    {
        super(s, i);
    }

    public static dbn valueOf(String s)
    {
        return (dbn)Enum.valueOf(dbn, s);
    }

    public static dbn[] values()
    {
        return (dbn[])d.clone();
    }

    static 
    {
        a = new dbn("ONE_TAP_EDU_CLASSIC", 0);
        b = new dbn("ONE_TAP_EDU_TOOLTIP", 1);
        c = new dbn("ONE_TAP_NO_EDUCATION", 2);
        d = (new dbn[] {
            a, b, c
        });
    }
}
