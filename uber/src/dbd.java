// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.rider.realtime.model.City;

final class dbd
    implements ide
{

    final dbc a;

    private dbd(dbc dbc1)
    {
        a = dbc1;
        super();
    }

    dbd(dbc dbc1, byte byte0)
    {
        this(dbc1);
    }

    private void a(gjy gjy1)
    {
        if (a.a == null)
        {
            ((RiderApplication)dbc.a(a).getApplicationContext()).b().a(a);
        }
        if (!a.a.n() || !gjy1.b())
        {
            return;
        }
        gjy1 = ((City)gjy1.c()).getCityName();
        if (a.b != null && !gjx.a(a.b, gjy1) && dbc.b(a) != null)
        {
            dbc.c(a);
        }
        a.b = gjy1;
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
