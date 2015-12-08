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

class this._cls0
    implements com.contextlogic.wish.ui.components.timer.iew.DoneCallback
{

    final DealDashView this$0;

    public void onCountdownEnd()
    {
        changeState(com.contextlogic.wish.api.data.o.PAGE.ACCESS_BLOCKED);
        final DealDashModal modal = DealDashView.access$900(DealDashView.this).getActivity();
        if (DealDashView.access$900(DealDashView.this).getCurrentIndex() == DealDashView.access$900(DealDashView.this).getDealDashPosition())
        {
            trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_MODAL);
            modal = new DealDashModal(modal);
            modal.setup((DealDashPageInfo)DealDashView.access$100(DealDashView.this).getPageMap().get(com.contextlogic.wish.api.data.o.PAGE.TIMES_UP), new android.view.View.OnClickListener() {

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
            });
            DealDashView.access$1000(DealDashView.this).post(new Runnable() {

                final DealDashView._cls4 this$1;
                final DealDashModal val$modal;

                public void run()
                {
                    DealDashView.access$900(this$0).showOverlay(modal, true);
                }

            
            {
                this$1 = DealDashView._cls4.this;
                modal = dealdashmodal;
                super();
            }
            });
        }
        DealDashView.access$900(DealDashView.this).getDealDashProdView().updateFeed(null, null);
    }

    _cls2.val.modal()
    {
        this$0 = DealDashView.this;
        super();
    }
}
