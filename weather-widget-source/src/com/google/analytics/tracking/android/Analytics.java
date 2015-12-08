// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            Tracker

public interface Analytics
{
    public static interface AppOptOutCallback
    {

        public abstract void reportAppOptOut(boolean flag);
    }


    public abstract boolean debugEnabled();

    public abstract Tracker getDefaultTracker();

    public abstract Tracker getTracker(String s);

    public abstract void requestAppOptOut(AppOptOutCallback appoptoutcallback);

    public abstract void setAppOptOut(boolean flag);

    public abstract void setDebug(boolean flag);

    public abstract void setDefaultTracker(Tracker tracker);
}
