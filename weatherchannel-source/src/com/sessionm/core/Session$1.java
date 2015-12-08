// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;

// Referenced classes of package com.sessionm.core:
//            Session

class dT
    implements Runnable
{

    final Context dS;
    final String dT;
    final Session dU;

    public void run()
    {
        dU.b(dS, dT);
    }

    (Session session, Context context, String s)
    {
        dU = session;
        dS = context;
        dT = s;
        super();
    }
}
