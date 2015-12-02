// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.tray.TrayRidepoolSavingsLayout;

final class g.Object
    implements Runnable
{

    final a a;

    public final void run()
    {
        gfc.b(a.a);
        gfc.a(a.a, a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class gfc$1

/* anonymous class */
    final class gfc._cls1
        implements Runnable
    {

        final String a;
        final gfc b;

        public final void run()
        {
            gfc.a(b);
            b.a.postDelayed(new gfc._cls1._cls1(this), 1600L);
        }

            
            {
                b = gfc1;
                a = s;
                super();
            }
    }

}
