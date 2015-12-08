// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import com.sessionm.api.AchievementData;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import com.sessionm.net.c;

// Referenced classes of package com.sessionm.core:
//            g, Session, d

class > extends c
{

    final OptInFailed fq;

    public void onReplyReceived(Request request)
    {
        if (request.bd() == com.sessionm.net.t.State.gI)
        {
            if (fq. != null)
            {
                fq..OptInSucceeded();
            }
        } else
        if (fq. != null)
        {
            fq..OptInFailed();
            return;
        }
    }

    ( )
    {
        fq = ;
        super();
    }

    // Unreferenced inner class com/sessionm/core/g$1

/* anonymous class */
    class g._cls1
        implements Runnable
    {

        final Context dS;
        final g.a fn;
        final boolean fo;
        final g fp;
        final Session val$session;

        public void run()
        {
            Session session1 = session;
            session1;
            JVM INSTR monitorenter ;
            if (fp.isOptedOut())
            {
                session.as().g(session.getApplicationContext());
            }
            com.sessionm.core.g.a(fp);
            if (session.getSessionState() != com.sessionm.api.SessionM.State.STOPPED) goto _L2; else goto _L1
_L1:
            session.a(new g._cls1._cls1());
            if (!session.b(dS, session.E()) && fn != null)
            {
                fn.onOptInFailed();
            }
_L3:
            return;
_L2:
            Object obj1 = a.aJ();
            Object obj;
            if (fo)
            {
                obj = "1";
            } else
            {
                obj = "0";
            }
            ((a) (obj1)).put("member[opted_out]", ((String) (obj)));
            obj = new Request(com.sessionm.net.Request.Type.gW);
            ((Request) (obj)).d(((a) (obj1)));
            obj1 = session.N();
            ((RequestQueue) (obj1)).a(((Request) (obj)), new g._cls1._cls2(this));
            ((RequestQueue) (obj1)).e(((Request) (obj)));
              goto _L3
            obj;
            session1;
            JVM INSTR monitorexit ;
            throw obj;
        }

            
            {
                fp = final_g1;
                session = session1;
                fn = a1;
                fo = flag;
                dS = context;
                super();
            }

        // Unreferenced inner class com/sessionm/core/g$1$1

/* anonymous class */
        class g._cls1._cls1
            implements SessionListener
        {

            final g._cls1 fq;

            public void onSessionFailed(SessionM sessionm, int i)
            {
                if (fq.fn != null)
                {
                    fq.fn.onOptInFailed();
                }
                fq.session.b(this);
            }

            public void onSessionStateChanged(SessionM sessionm, com.sessionm.api.SessionM.State state)
            {
                if (fq.fn != null && state.isStarted())
                {
                    if (state == com.sessionm.api.SessionM.State.STARTED_ONLINE && fq.session.C().isOptedOut() == fq.fo)
                    {
                        fq.fn.onOptInSucceeded();
                    } else
                    {
                        fq.fn.onOptInFailed();
                    }
                    fq.session.b(this);
                }
            }

            public void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata)
            {
            }

            public void onUserUpdated(SessionM sessionm, User user)
            {
            }

                    
                    {
                        fq = g._cls1.this;
                        super();
                    }
        }

    }

}
