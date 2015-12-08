// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Session, d

class ef
    implements Runnable
{

    final Session dU;
    final float ef;

    public void run()
    {
        dU.as().a(ef);
    }

    (Session session, float f)
    {
        dU = session;
        ef = f;
        super();
    }
}
