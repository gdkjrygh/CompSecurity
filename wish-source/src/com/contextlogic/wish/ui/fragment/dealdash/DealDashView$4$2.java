// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.os.Handler;
import android.view.View;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.DealDashPageInfo;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedProductView;
import java.util.EnumMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView, DealDashModal

class val.modal
    implements Runnable
{

    final val.modal this$1;
    final DealDashModal val$modal;

    public void run()
    {
        DealDashView.access$900(_fld0).showOverlay(val$modal, true);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$modal = DealDashModal.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/dealdash/DealDashView$4

/* anonymous class */
    class DealDashView._cls4
        implements com.contextlogic.wish.ui.components.timer.CountdownTimerView.DoneCallback
    {

        final DealDashView this$0;

        public void onCountdownEnd()
        {
            changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_BLOCKED);
            Object obj = DealDashView.access$900(DealDashView.this).getActivity();
            if (DealDashView.access$900(DealDashView.this).getCurrentIndex() == DealDashView.access$900(DealDashView.this).getDealDashPosition())
            {
                trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_MODAL);
                obj = new DealDashModal(((android.content.Context) (obj)));
                ((DealDashModal) (obj)).setup((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.TIMES_UP), new DealDashView._cls4._cls1());
                DealDashView.access$1000(DealDashView.this).post(((DealDashView._cls4._cls2) (obj)). new DealDashView._cls4._cls2());
            }
            DealDashView.access$900(DealDashView.this).getDealDashProdView().updateFeed(null, null);
        }

            
            {
                this$0 = DealDashView.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/dealdash/DealDashView$4$1

/* anonymous class */
        class DealDashView._cls4._cls1
            implements android.view.View.OnClickListener
        {

            final DealDashView._cls4 this$1;

            public void onClick(View view)
            {
                trackEvent(WishAnalyticsEvent.CLICK_DEAL_DASH_GO_TO_CART_MODAL);
                DealDashView.access$900(this$0).clearOverlay();
                ((RootActivity)DealDashView.access$900(this$0).getActivity()).showCart(null, null, null, 0);
            }

                    
                    {
                        this$1 = DealDashView._cls4.this;
                        super();
                    }
        }

    }

}
