// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.params;

import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.params:
//            ConnPerRoute, ConnManagerParams

static final class 
    implements ConnPerRoute
{

    public int getMaxForRoute(HttpRoute httproute)
    {
        return 2;
    }

    ()
    {
    }
}
