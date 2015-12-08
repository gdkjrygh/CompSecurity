// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.util.Log;
import com.sessionm.api.ActivityListener;
import com.sessionm.api.SessionM;

// Referenced classes of package com.sessionm.core:
//            Session

class dU
    implements Runnable
{

    final Session dU;

    public void run()
    {
        SessionM sessionm = SessionM.getInstance();
        ActivityListener activitylistener = sessionm.getActivityListener();
        android.app.Activity activity;
        if (activitylistener != null)
        {
            try
            {
                activitylistener.onPresented(sessionm);
            }
            catch (Throwable throwable1)
            {
                if (Log.isLoggable("SessionM", 6))
                {
                    Log.e("SessionM", "Exception calling ActivityListener.onPresented()", throwable1);
                }
                continue; /* Loop/switch isn't completed */
            }
        }
_L4:
        activity = dU.K();
        if (!(activity instanceof ActivityListener) || activity == activitylistener)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        ((ActivityListener)activity).onPresented(sessionm);
_L2:
        return;
        Throwable throwable;
        throwable;
        if (!Log.isLoggable("SessionM", 6)) goto _L2; else goto _L1
_L1:
        Log.e("SessionM", "Exception calling ActivityListener.onPresented()", throwable);
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    ener(Session session)
    {
        dU = session;
        super();
    }
}
