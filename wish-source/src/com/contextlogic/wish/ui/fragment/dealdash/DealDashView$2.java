// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.content.res.Resources;
import android.widget.ImageView;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;
import java.util.Date;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class val.time
    implements Runnable
{

    final DealDashView this$0;
    final long val$time;

    public void run()
    {
        DealDashView.access$400(DealDashView.this).setVisibility(8);
        DealDashView.access$600(DealDashView.this).setVisibility(8);
        DealDashView.access$700(DealDashView.this).setVisibility(8);
        if (DealDashView.access$800(DealDashView.this) != null)
        {
            DealDashView.access$800(DealDashView.this).pauseTimer();
        }
        DealDashView.access$800(DealDashView.this).setVisibility(0);
        DealDashView.access$800(DealDashView.this).setup(new Date(System.currentTimeMillis() + val$time * 1000L), 40, getResources().getColor(0x7f0c00e8), getResources().getColor(0x7f0c006d), getResources().getColor(0x7f0c00e8), 0x7f0201aa, true, new com.contextlogic.wish.ui.components.timer.CountdownTimerView.DoneCallback() {

            final DealDashView._cls2 this$1;

            public void onCountdownEnd()
            {
                changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_GRANTED);
            }

            
            {
                this$1 = DealDashView._cls2.this;
                super();
            }
        });
        DealDashView.access$800(DealDashView.this).startTimer();
    }

    _cls1.this._cls1()
    {
        this$0 = final_dealdashview;
        val$time = J.this;
        super();
    }
}
