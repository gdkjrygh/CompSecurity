// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class this._cls0 extends TimerTask
{

    final DealDashView this$0;

    public void run()
    {
        DealDashView.access$1000(DealDashView.this).post(new Runnable() {

            final DealDashView._cls7 this$1;

            public void run()
            {
                DealDashView.access$1200(this$0);
            }

            
            {
                this$1 = DealDashView._cls7.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = DealDashView.this;
        super();
    }
}
