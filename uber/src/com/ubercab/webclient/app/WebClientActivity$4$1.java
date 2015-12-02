// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.webclient.app;

import java.util.TimerTask;

// Referenced classes of package com.ubercab.webclient.app:
//            WebClientActivity

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        WebClientActivity.a(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/ubercab/webclient/app/WebClientActivity$4

/* anonymous class */
    final class WebClientActivity._cls4 extends TimerTask
    {

        final WebClientActivity a;

        public final void run()
        {
            a.runOnUiThread(new WebClientActivity._cls4._cls1(this));
        }

            
            {
                a = webclientactivity;
                super();
            }
    }

}
