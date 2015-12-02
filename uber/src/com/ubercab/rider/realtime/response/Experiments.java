// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.List;
import java.util.Map;

public abstract class Experiments
{

    public Experiments()
    {
    }

    public abstract Map getAppConfig();

    public abstract List getExperiments();

    abstract Experiments setAppConfig(Map map);

    abstract Experiments setExperiments(List list);
}
