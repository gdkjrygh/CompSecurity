// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Session, AchievementImpl

class en
    implements Runnable
{

    final Session dU;
    final boolean em;
    final AchievementImpl en;

    public void run()
    {
        if (!em && en != null)
        {
            Session.a(dU, en);
        }
    }

    Impl(Session session, boolean flag, AchievementImpl achievementimpl)
    {
        dU = session;
        em = flag;
        en = achievementimpl;
        super();
    }
}
