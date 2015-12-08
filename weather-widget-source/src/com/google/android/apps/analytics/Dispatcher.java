// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Hit

interface Dispatcher
{

    public abstract void dispatchHits(Hit ahit[]);

    public abstract void init(Callbacks callbacks);

    public abstract boolean isDryRun();

    public abstract void setDryRun(boolean flag);

    public abstract void stop();
}
