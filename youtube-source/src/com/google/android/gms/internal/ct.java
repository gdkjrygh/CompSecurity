// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ac, ce, db, cv, 
//            ds, q, do

final class ct
    implements Runnable
{

    final Context a;
    final ce b;
    final cv c;
    final String d;

    ct(Context context, ce ce1, cv cv1, String s)
    {
        a = context;
        b = ce1;
        c = cv1;
        d = s;
        super();
    }

    public final void run()
    {
        db db1 = db.a(a, new ac(), false, false, null, b.en);
        db1.setWillNotDraw(true);
        c.a(db1);
        ds ds1 = db1.e();
        ds1.a("/invalidRequest", c.a);
        ds1.a("/loadAdURL", c.b);
        ds1.a("/log", q.f);
        com.google.android.gms.internal.do.a("Getting the ad request URL.");
        db1.loadDataWithBaseURL("http://googleads.g.doubleclick.net", (new StringBuilder("<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(")).append(d).append(");</script></head><body></body></html>").toString(), "text/html", "UTF-8", null);
    }
}
