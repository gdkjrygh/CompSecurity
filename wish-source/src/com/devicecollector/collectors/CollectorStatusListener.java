// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;


// Referenced classes of package com.devicecollector.collectors:
//            CollectorEnum, SoftErrorCode

public interface CollectorStatusListener
{

    public abstract void onCollectorError(CollectorEnum collectorenum, SoftErrorCode softerrorcode, Exception exception);

    public abstract void onCollectorStart(CollectorEnum collectorenum);

    public abstract void onCollectorSuccess(CollectorEnum collectorenum);
}
