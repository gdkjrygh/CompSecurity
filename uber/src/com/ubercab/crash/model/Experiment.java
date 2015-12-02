// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_Experiment

public abstract class Experiment
{

    public Experiment()
    {
    }

    public static Experiment create(String s, String s1)
    {
        return (new Shape_Experiment()).setName(s).setGroup(s1);
    }

    public abstract String getGroup();

    public abstract String getName();

    abstract Experiment setGroup(String s);

    abstract Experiment setName(String s);
}
