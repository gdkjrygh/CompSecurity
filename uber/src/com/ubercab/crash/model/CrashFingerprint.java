// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;

import java.util.List;

// Referenced classes of package com.ubercab.crash.model:
//            Shape_CrashFingerprint

public abstract class CrashFingerprint
{

    public CrashFingerprint()
    {
    }

    public static CrashFingerprint create(List list)
    {
        return (new Shape_CrashFingerprint()).setSortedAnalyticsNames(list);
    }

    public abstract List getSortedAnalyticsNames();

    abstract CrashFingerprint setSortedAnalyticsNames(List list);
}
