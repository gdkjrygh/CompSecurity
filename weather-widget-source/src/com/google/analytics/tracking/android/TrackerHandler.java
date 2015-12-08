// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Tracker

interface TrackerHandler
{

    public abstract void closeTracker(Tracker tracker);

    public abstract void sendHit(Map map);
}
