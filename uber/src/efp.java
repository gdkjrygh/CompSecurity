// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efp
    implements efj
{

    private final Handler a = new Handler();
    private final cev b;

    public efp(cev cev)
    {
        b = cev;
    }

    static cev a(efp efp1)
    {
        return efp1.b;
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        a.post(new Runnable(mobilemessage) {

            final MobileMessage a;
            final efp b;

            public final void run()
            {
                efp.a(b).c(new efl(a));
            }

            
            {
                b = efp.this;
                a = mobilemessage;
                super();
            }
        });
        return (new eex()).a(true).a().a(n.bb).a(mobilemessage.getId()).b();
    }
}
