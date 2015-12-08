// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.sessionm.c.b;
import com.sessionm.c.d;
import com.sessionm.net.RequestQueue;
import com.sessionm.ui.ButtonManager;

// Referenced classes of package com.sessionm.core:
//            Session, d

class ee
    implements Runnable
{

    final  ee;

    public void run()
    {
        ee..();
    }

    ( )
    {
        ee = ;
        super();
    }

    // Unreferenced inner class com/sessionm/core/Session$18

/* anonymous class */
    static final class Session._cls18
        implements Runnable
    {

        final Session.a ed;
        final Context val$context;
        final Session val$session;

        public void run()
        {
            Session session1 = Session.D();
            session1;
            JVM INSTR monitorenter ;
            RequestQueue requestqueue;
            Session.a(session, context.getApplicationContext());
            CookieSyncManager.createInstance(context);
            CookieManager.getInstance().removeAllCookie();
            ButtonManager.reset();
            session.P();
            session.U();
            session.b(0L);
            requestqueue = session.N();
            if (requestqueue == null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            requestqueue.reset();
            Session.a(session, null);
            session.T();
            session.R();
            session.aj();
            Session.a(session, null);
            if (ed != null)
            {
                (new Handler(context.getMainLooper())).post(new Session._cls18._cls1(this));
            }
            session.as().g(context);
            b.i(false);
            d.t(context);
            session1;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            session1;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                session = session1;
                context = context1;
                ed = a;
                super();
            }
    }

}
