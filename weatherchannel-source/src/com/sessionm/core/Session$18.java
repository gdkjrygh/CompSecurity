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

static final class ed
    implements Runnable
{

    final val.context ed;
    final Context val$context;
    final Session val$session;

    public void run()
    {
        Session session1 = Session.D();
        session1;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue;
        Session.a(val$session, val$context.getApplicationContext());
        CookieSyncManager.createInstance(val$context);
        CookieManager.getInstance().removeAllCookie();
        ButtonManager.reset();
        val$session.P();
        val$session.U();
        val$session.b(0L);
        requestqueue = val$session.N();
        if (requestqueue == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        requestqueue.reset();
        Session.a(val$session, null);
        val$session.T();
        val$session.R();
        val$session.aj();
        Session.a(val$session, null);
        if (ed != null)
        {
            (new Handler(val$context.getMainLooper())).post(new Runnable() {

                final Session._cls18 ee;

                public void run()
                {
                    ee.ed.aw();
                }

            
            {
                ee = Session._cls18.this;
                super();
            }
            });
        }
        val$session.as().g(val$context);
        b.i(false);
        d.t(val$context);
        session1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        session1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    _cls1.ee(Session session1, Context context1, _cls1.ee ee)
    {
        val$session = session1;
        val$context = context1;
        ed = ee;
        super();
    }
}
