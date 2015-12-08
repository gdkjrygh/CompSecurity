// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.app.Activity;
import android.util.Log;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;

// Referenced classes of package com.sessionm.core:
//            Session

class dX
    implements Runnable
{

    final Session dU;
    final SessionM dX;
    final Activity dZ;

    public void run()
    {
        ((SessionListener)dZ).onUnclaimedAchievement(dX, Session.k(dU));
_L1:
        return;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Activity exception calling SessionListener.onUnclaimedAchievement()", throwable);
            return;
        }
          goto _L1
    }

    ner(Session session, Activity activity, SessionM sessionm)
    {
        dU = session;
        dZ = activity;
        dX = sessionm;
        super();
    }
}
