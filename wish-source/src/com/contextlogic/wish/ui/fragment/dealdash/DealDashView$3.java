// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.widget.ImageView;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class this._cls0
    implements Runnable
{

    final DealDashView this$0;

    public void run()
    {
        if (DealDashView.access$800(DealDashView.this) != null)
        {
            DealDashView.access$800(DealDashView.this).pauseTimer();
            DealDashView.access$800(DealDashView.this).setVisibility(8);
        }
        DealDashView.access$500(DealDashView.this).setVisibility(8);
        DealDashView.access$600(DealDashView.this).setVisibility(0);
        DealDashView.access$700(DealDashView.this).setVisibility(0);
    }

    on()
    {
        this$0 = DealDashView.this;
        super();
    }
}
