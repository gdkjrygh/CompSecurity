// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.util.Log;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;

// Referenced classes of package com.sessionm.core:
//            Session

class dX
    implements Runnable
{

    final Session dU;
    final SessionListener dW;
    final SessionM dX;

    public void run()
    {
        dW.onUnclaimedAchievement(dX, Session.k(dU));
_L1:
        return;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Listener exception calling SessionListener.onUnclaimedAchievement()", throwable);
            return;
        }
          goto _L1
    }

    ner(Session session, SessionListener sessionlistener, SessionM sessionm)
    {
        dU = session;
        dW = sessionlistener;
        dX = sessionm;
        super();
    }
}
