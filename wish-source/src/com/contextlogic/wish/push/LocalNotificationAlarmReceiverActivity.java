// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.WishBaseActivity;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.service.LogLocalNotificationService;
import com.contextlogic.wish.ui.activity.root.RootActivity;

public class LocalNotificationAlarmReceiverActivity extends WishBaseActivity
{

    public static final String ARG_NOTIFICATION_ID = "NotificationSpecId";
    public static final String ARG_NOTIFICATION_TARGET = "NotificationSpecTarget";

    public LocalNotificationAlarmReceiverActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!Analytics.getInstance().isStarted())
        {
            Analytics.getInstance().startAnalytics(WishApplication.getAppInstance());
        }
        Object obj = null;
        String s = getIntent().getStringExtra("NotificationSpecId");
        String s1 = getIntent().getStringExtra("NotificationSpecTarget");
        bundle = obj;
        if (s != null)
        {
            bundle = obj;
            if (s1 != null)
            {
                (new LogLocalNotificationService()).requestService(s, "clicked", null, null);
                bundle = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(s1));
            }
        }
        WishApplication.getAppInstance().setDeepLinkConfig(bundle);
        bundle = new Intent();
        bundle.setFlags(0x14000000);
        bundle.setClass(this, com/contextlogic/wish/ui/activity/root/RootActivity);
        startActivity(bundle);
        finish();
    }
}
