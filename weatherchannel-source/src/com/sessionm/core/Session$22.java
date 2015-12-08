// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.util.Log;
import com.sessionm.api.ActivityListener;
import com.sessionm.api.SessionM;
import java.util.Map;

// Referenced classes of package com.sessionm.core:
//            Session

class eh
    implements Runnable
{

    final Session dU;
    final com.sessionm.api.tener.UserAction eg;
    final Map eh;

    public void run()
    {
        SessionM sessionm = SessionM.getInstance();
        ActivityListener activitylistener = sessionm.getActivityListener();
        android.app.Activity activity;
        if (activitylistener != null)
        {
            try
            {
                activitylistener.onUserAction(sessionm, eg, eh);
            }
            catch (Throwable throwable1)
            {
                if (Log.isLoggable("SessionM", 6))
                {
                    Log.e("SessionM.Session", "Exception calling ActivityListener.onUserAction()", throwable1);
                }
                continue; /* Loop/switch isn't completed */
            }
        }
_L4:
        activity = dU.K();
        if (!(activity instanceof ActivityListener) || activity == activitylistener)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ((ActivityListener)activity).onUserAction(sessionm, eg, eh);
_L2:
        return;
        Throwable throwable;
        throwable;
        if (!Log.isLoggable("SessionM", 6)) goto _L2; else goto _L1
_L1:
        Log.e("SessionM.Session", "Exception calling ActivityListener.onUserAction()", throwable);
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    tion(Session session, com.sessionm.api.tener.UserAction useraction, Map map)
    {
        dU = session;
        eg = useraction;
        eh = map;
        super();
    }
}
