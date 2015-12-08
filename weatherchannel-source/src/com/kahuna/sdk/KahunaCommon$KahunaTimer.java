// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon

private class <init> extends Timer
{

    final KahunaCommon this$0;
    private long timerFireTime;

    public long getTimerFireTime()
    {
        return timerFireTime;
    }

    public void schedule(TimerTask timertask, long l)
    {
        timerFireTime = System.currentTimeMillis() + l;
        super.schedule(timertask, l);
    }

    private ()
    {
        this$0 = KahunaCommon.this;
        super();
        timerFireTime = -1L;
    }

    timerFireTime(timerFireTime timerfiretime)
    {
        this();
    }
}
