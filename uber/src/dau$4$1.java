// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.crash.model.Crash;

final class g.Object
    implements chs
{

    final ick a;
    final g.String b;

    public final void a()
    {
        Log.i(dau.getSimpleName(), "onCompleted analytics observable");
        a.a();
    }

    public final void b()
    {
        Log.i(dau.getSimpleName(), "onError analytics observable");
        a.a(new Throwable("AnalyticsClient: failed sending analytics event."));
    }

    ( , ick ick1)
    {
        b = ;
        a = ick1;
        super();
    }

    // Unreferenced inner class dau$4

/* anonymous class */
    final class dau._cls4
        implements icc
    {

        final Crash a;
        final dau b;

        private void a(ick ick1)
        {
            if (a.isExperimentOn(dbf.I.toString()))
            {
                dau.c(b).a(AnalyticsEvent.create("lifecycle").setName(dcz.b));
                dau.c(b).a(new dau._cls4._cls1(this, ick1));
                return;
            } else
            {
                Log.i(dau.getSimpleName(), "onCompleted analytics observable");
                ick1.a();
                return;
            }
        }

        public final void call(Object obj)
        {
            a((ick)obj);
        }

            
            {
                b = dau1;
                a = crash;
                super();
            }
    }

}
