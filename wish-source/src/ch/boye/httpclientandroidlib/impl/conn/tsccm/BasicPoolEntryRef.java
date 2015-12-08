// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            BasicPoolEntry

public class BasicPoolEntryRef extends WeakReference
{

    private final HttpRoute route;

    public BasicPoolEntryRef(BasicPoolEntry basicpoolentry, ReferenceQueue referencequeue)
    {
        super(basicpoolentry, referencequeue);
        if (basicpoolentry == null)
        {
            throw new IllegalArgumentException("Pool entry must not be null.");
        } else
        {
            route = basicpoolentry.getPlannedRoute();
            return;
        }
    }

    public final HttpRoute getRoute()
    {
        return route;
    }
}
