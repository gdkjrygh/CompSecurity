// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.gcm:
//            Task, GcmNetworkManager

public static abstract class ager
{

    protected String gcmTaskService;
    protected boolean isPersisted;
    protected int requiredNetworkState;
    protected boolean requiresCharging;
    protected String tag;
    protected boolean updateCurrent;

    public abstract Task build();

    protected void checkConditions()
    {
        boolean flag;
        if (gcmTaskService != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
        GcmNetworkManager.zzcY(tag);
    }

    public abstract tag setPersisted(boolean flag);

    public abstract tag setRequiredNetwork(int i);

    public abstract tag setRequiresCharging(boolean flag);

    public abstract tag setService(Class class1);

    public abstract tag setTag(String s);

    public abstract tag setUpdateCurrent(boolean flag);

    public ager()
    {
    }
}
