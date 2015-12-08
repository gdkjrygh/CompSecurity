// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.net.Uri;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.GetRatingPendingTransactionsService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.prompt.PromptManager;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class this._cls1
    implements com.contextlogic.wish.api.service.ransactionsService.SuccessCallback
{

    final back this$1;

    public void onServiceSucceeded(String s, String s1)
    {
        s = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(s1));
        if (s.getType() == com.contextlogic.wish.nkConfig.DeepLinkType.Website)
        {
            s = s.getStringData();
            RootActivity.access$000(_fld0, s);
        } else
        {
            processDeepLink(s, false);
        }
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_RATE_TRANSACTION_PROMPT.getValue()), null, null, null);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/activity/root/RootActivity$3

/* anonymous class */
    class RootActivity._cls3
        implements Runnable
    {

        final RootActivity this$0;

        public void run()
        {
            if (PromptManager.getInstance().showAvailablePrompts(RootActivity.this))
            {
                return;
            } else
            {
                (new GetRatingPendingTransactionsService()).requestService(new RootActivity._cls3._cls1(), null);
                return;
            }
        }

            
            {
                this$0 = RootActivity.this;
                super();
            }
    }

}
