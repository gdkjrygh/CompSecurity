// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.surge.SurgeActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.model.DropNotification;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import java.util.Map;

public final class fom
    implements icg
{

    final SurgeActivity a;

    private fom(SurgeActivity surgeactivity)
    {
        a = surgeactivity;
        super();
    }

    public fom(SurgeActivity surgeactivity, byte byte0)
    {
        this(surgeactivity);
    }

    private DynamicFare b()
    {
        DynamicFare dynamicfare = null;
        Object obj = a.i.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            dynamicfare = (DynamicFare)((Map) (obj)).get(SurgeActivity.a(a));
        }
        return dynamicfare;
    }

    private void c()
    {
        a.setResult(0);
        a.finish();
    }

    public final void a()
    {
        a.u();
        Object obj = b();
        if (obj == null)
        {
            return;
        }
        obj = ((DynamicFare) (obj)).getDropNotification();
        int i;
        if (obj != null)
        {
            i = (int)((DropNotification) (obj)).getDefaultExpirationTime() / 60;
        } else
        {
            i = 0;
        }
        a.a_(a.getString(0x7f070451, new Object[] {
            Integer.valueOf(i)
        }));
        c();
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable != null)
        {
            a.u();
            a.a_(throwable.getMessage());
            c();
        }
    }
}
