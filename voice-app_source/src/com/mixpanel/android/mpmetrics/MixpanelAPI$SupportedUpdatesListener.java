// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI, DecideMessages, OnMixpanelUpdatesReceivedListener

private class <init>
    implements <init>, Runnable
{

    private final Executor mExecutor;
    private final Set mListeners;
    final MixpanelAPI this$0;

    public void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (MixpanelAPI.access$1(MixpanelAPI.this).hasUpdatesAvailable())
        {
            onNewResults();
        }
        mListeners.add(onmixpanelupdatesreceivedlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        onmixpanelupdatesreceivedlistener;
        throw onmixpanelupdatesreceivedlistener;
    }

    public void onNewResults()
    {
        mExecutor.execute(this);
    }

    public void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
    {
        this;
        JVM INSTR monitorenter ;
        mListeners.remove(onmixpanelupdatesreceivedlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        onmixpanelupdatesreceivedlistener;
        throw onmixpanelupdatesreceivedlistener;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = mListeners.iterator();
_L1:
        boolean flag = iterator.hasNext();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ((OnMixpanelUpdatesReceivedListener)iterator.next()).onMixpanelUpdatesReceived();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private I()
    {
        this$0 = MixpanelAPI.this;
        super();
        mListeners = new HashSet();
        mExecutor = Executors.newSingleThreadExecutor();
    }

    mExecutor(mExecutor mexecutor)
    {
        this();
    }
}
