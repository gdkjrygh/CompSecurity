// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import java.util.Map;

public final class dqw extends dcq
{

    private final hjk a;
    private final dqx b;
    private final RiderApplication c;
    private icl d;

    public dqw(hjk hjk1, dqx dqx, RiderApplication riderapplication)
    {
        a = hjk1;
        b = dqx;
        c = riderapplication;
    }

    static dqx a(dqw dqw1)
    {
        return dqw1.b;
    }

    static RiderApplication b(dqw dqw1)
    {
        return dqw1.c;
    }

    protected final void a()
    {
        d = a.b().a(ico.a()).b(new ick() {

            final dqw a;

            private void a(Error error)
            {
                error = error.getRealtimeError();
                if (error != null && "rtapi.device.force_upgrade".equals(error.getCode()) && error.getData() != null)
                {
                    dqw.a(a).c();
                    error = (String)error.getData().get("url");
                    dqw.b(a).startActivity((new Intent("com.ubercab.intent.ForceUpgrade")).setFlags(0x10008000).putExtra("forceUpgradeUrl", error));
                }
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((Error)obj);
            }

            public final void a(Throwable throwable)
            {
            }

            
            {
                a = dqw.this;
                super();
            }
        });
    }

    protected final void b()
    {
        if (d != null && !d.c())
        {
            d.b();
        }
    }
}
