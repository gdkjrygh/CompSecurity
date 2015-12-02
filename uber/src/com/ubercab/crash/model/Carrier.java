// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_Carrier

public abstract class Carrier
{

    private static final String UNKNOWN = "unknown";

    public Carrier()
    {
    }

    public static Carrier create(String s, String s1, String s2)
    {
        Shape_Carrier shape_carrier = new Shape_Carrier();
        if (s == null)
        {
            s = "unknown";
        }
        s = shape_carrier.setName(s);
        if (s1 == null)
        {
            s1 = "unknown";
        }
        s = s.setMnc(s1);
        if (s2 == null)
        {
            s2 = "unknown";
        }
        return s.setMcc(s2);
    }

    public abstract String getMcc();

    public abstract String getMnc();

    public abstract String getName();

    public abstract Carrier setMcc(String s);

    public abstract Carrier setMnc(String s);

    public abstract Carrier setName(String s);
}
