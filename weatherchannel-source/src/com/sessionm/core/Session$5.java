// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.app.Activity;
import android.util.Log;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;

// Referenced classes of package com.sessionm.core:
//            Session, g

class dY
    implements Runnable
{

    final Session dU;
    final SessionM dX;
    final g dY;
    final Activity dZ;

    public void run()
    {
        ((SessionListener)dZ).onUserUpdated(dX, dY);
_L1:
        return;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception calling SessionListener.onUserUpdated()", throwable);
            return;
        }
          goto _L1
    }

    ener(Session session, Activity activity, SessionM sessionm, g g)
    {
        dU = session;
        dZ = activity;
        dX = sessionm;
        dY = g;
        super();
    }
}
