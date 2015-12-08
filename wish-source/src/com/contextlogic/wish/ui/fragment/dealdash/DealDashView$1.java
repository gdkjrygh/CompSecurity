// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.view.View;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.DealDashPageInfo;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import java.util.EnumMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class val.state
    implements Runnable
{

    final DealDashView this$0;
    final com.contextlogic.wish.api.data.o.PAGE val$state;

    public void run()
    {
        setVisibility(0);
        DealDashView.access$000(DealDashView.this).setVisibility(8);
        DealDashView.access$200(DealDashView.this).setText(((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(val$state)).getTitle());
        DealDashView.access$300(DealDashView.this).setText(((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(val$state)).getTopSubtitle());
        DealDashView.access$400(DealDashView.this).setText(((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(val$state)).getBottomSubtitle());
        DealDashView.access$500(DealDashView.this).setText(((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(val$state)).getBottomSubtitle());
        DealDashView.access$600(DealDashView.this).setText(((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(val$state)).getButtonText());
    }

    on()
    {
        this$0 = final_dealdashview;
        val$state = com.contextlogic.wish.api.data.o.PAGE.this;
        super();
    }
}
