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

class >
    implements Runnable
{

    final Context dS;
    final t fn;
    final boolean fo;
    final g fp;
    final Session val$session;

    public void run()
    {
        Session session1 = val$session;
        session1;
        JVM INSTR monitorenter ;
        if (fp.isOptedOut())
        {
            val$session.as().g(val$session.getApplicationContext());
        }
        com.sessionm.core.g.a(fp);
        if (val$session.getSessionState() != com.sessionm.api.ionM.State.STOPPED) goto _L2; else goto _L1
_L1:
        val$session.a(new SessionListener() {

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
        });
        if (!val$session.b(dS, val$session.E()) && fn != null)
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
        obj = new Request(com.sessionm.net.est.Type.gW);
        ((Request) (obj)).d(((a) (obj1)));
        obj1 = val$session.N();
        ((RequestQueue) (obj1)).a(((Request) (obj)), new c() {

            final g._cls1 fq;

            public void onReplyReceived(Request request)
            {
                if (request.bd() == com.sessionm.net.Request.State.gI)
                {
                    if (fq.fn != null)
                    {
                        fq.fn.onOptInSucceeded();
                    }
                } else
                if (fq.fn != null)
                {
                    fq.fn.onOptInFailed();
                    return;
                }
            }

            
            {
                fq = g._cls1.this;
                super();
            }
        });
        ((RequestQueue) (obj1)).e(((Request) (obj)));
          goto _L3
        obj;
        session1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    t(Session session1, ion ion, boolean flag, Context context)
    {
        fp = final_g1;
        val$session = session1;
        fn = ion;
        fo = flag;
        dS = context;
        super();
    }
}
