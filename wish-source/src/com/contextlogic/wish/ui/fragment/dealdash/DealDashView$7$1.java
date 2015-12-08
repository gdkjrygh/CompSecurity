// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        DealDashView.access$1200(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/dealdash/DealDashView$7

/* anonymous class */
    class DealDashView._cls7 extends TimerTask
    {

        final DealDashView this$0;

        public void run()
        {
            DealDashView.access$1000(DealDashView.this).post(new DealDashView._cls7._cls1());
        }

            
            {
                this$0 = DealDashView.this;
                super();
            }
    }

}
