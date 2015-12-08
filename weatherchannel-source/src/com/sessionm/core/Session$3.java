// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.api.AchievementActivity;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;

// Referenced classes of package com.sessionm.core:
//            Session, AchievementImpl

class dV
    implements Runnable
{

    final Session dU;
    final AchievementActivity dV;

    public void run()
    {
        a a1 = a.aJ();
        Object obj = (AchievementImpl)dV.getAchievement();
        a1.put("achievement_id", (new StringBuilder()).append("").append(((AchievementImpl) (obj)).getAchievementId()).toString());
        obj = new Request(com.sessionm.net.pe.gR, new Object[] {
            dU.E()
        });
        ((Request) (obj)).d(a1);
        dU.N().f(((Request) (obj)));
    }

    Activity(Session session, AchievementActivity achievementactivity)
    {
        dU = session;
        dV = achievementactivity;
        super();
    }
}
