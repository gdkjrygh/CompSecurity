// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.activity.link;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.WishBaseActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.activity.link:
//            WishDeepLinkActivity

public class PushNotificationLinkActivity extends WishBaseActivity
{

    public PushNotificationLinkActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Bundle bundle1;
        super.onCreate(bundle);
        if (!Analytics.getInstance().isStarted())
        {
            Analytics.getInstance().startAnalytics(WishApplication.getAppInstance());
        }
        Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.PushNotification);
        obj = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Notifications, Uri.parse((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://notifications").toString()));
        bundle1 = getIntent().getExtras();
        bundle = ((Bundle) (obj));
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        bundle = ((Bundle) (obj));
        if (!bundle1.containsKey("url"))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        obj = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(bundle1.getString("url")));
        bundle = ((Bundle) (obj));
        if (!bundle1.containsKey("notification_id"))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        bundle = ((Bundle) (obj));
        if (!bundle1.containsKey("bucket_id"))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        ((ApplicationDeepLinkConfig) (obj)).setNotificationInfo(Integer.parseInt(bundle1.getString("notification_id")), Integer.parseInt(bundle1.getString("bucket_id")));
        bundle = ((Bundle) (obj));
_L2:
        if (bundle1 != null && bundle1.containsKey("cancel_notification"))
        {
            try
            {
                ((NotificationManager)getSystemService("notification")).cancel(bundle1.getInt("cancel_notification"));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        WishApplication.getAppInstance().setDeepLinkConfig(bundle);
        bundle = new Intent();
        bundle.setFlags(0x14000000);
        bundle.setClass(this, com/contextlogic/wish/ui/activity/root/RootActivity);
        startActivity(bundle);
        finish();
        return;
        bundle;
        bundle = ((Bundle) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }
}
