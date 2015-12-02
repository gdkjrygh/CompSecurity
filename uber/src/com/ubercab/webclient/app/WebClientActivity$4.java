// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.webclient.app;

import java.util.TimerTask;

// Referenced classes of package com.ubercab.webclient.app:
//            WebClientActivity

final class a extends TimerTask
{

    final WebClientActivity a;

    public final void run()
    {
        a.runOnUiThread(new Runnable() {

            final WebClientActivity._cls4 a;

            public final void run()
            {
                WebClientActivity.a(a.a);
            }

            
            {
                a = WebClientActivity._cls4.this;
                super();
            }
        });
    }

    _cls1.a(WebClientActivity webclientactivity)
    {
        a = webclientactivity;
        super();
    }
}
