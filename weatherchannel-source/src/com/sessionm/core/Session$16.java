// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.util.Log;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;

// Referenced classes of package com.sessionm.core:
//            Session

class ec
    implements Runnable
{

    final Session dU;
    final SessionListener dW;
    final SessionM dX;
    final com.sessionm.api.ate ec;

    public void run()
    {
        dW.onSessionStateChanged(dX, ec);
_L1:
        return;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception calling SessionListener.onSessionStateChanged()", throwable);
            return;
        }
          goto _L1
    }

    te(Session session, SessionListener sessionlistener, SessionM sessionm, com.sessionm.api.ate ate)
    {
        dU = session;
        dW = sessionlistener;
        dX = sessionm;
        ec = ate;
        super();
    }
}
