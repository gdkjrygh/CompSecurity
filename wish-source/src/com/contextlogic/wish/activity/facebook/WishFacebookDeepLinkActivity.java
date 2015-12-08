// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.activity.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.WishBaseActivity;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.service.LogInboundRequestService;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.user.LoggedInUser;

public class WishFacebookDeepLinkActivity extends WishBaseActivity
{

    public WishFacebookDeepLinkActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        super.onCreate(bundle);
        if (!Analytics.getInstance().isStarted())
        {
            Analytics.getInstance().startAnalytics(WishApplication.getAppInstance());
        }
        Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.FacebookDeepLink);
        obj = null;
        bundle = null;
        obj1 = null;
        String s = getIntent().getStringExtra("access_token");
        bundle = s;
        if (!getIntent().hasExtra("expires_in"))
        {
            break MISSING_BLOCK_LABEL_78;
        }
        bundle = s;
        obj = getIntent().getExtras().get("expires_in");
        bundle = s;
_L5:
        Uri uri;
        String s1;
        long l;
        long l1;
        try
        {
            uri = getIntent().getData();
        }
        catch (Throwable throwable)
        {
            throwable = obj1;
        }
        l1 = -1L;
        l = l1;
        if (obj != null)
        {
            if (obj instanceof String)
            {
                obj = (String)obj;
                try
                {
                    l = Long.parseLong(((String) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    l = -1L;
                }
            } else
            {
                l = l1;
                if (obj instanceof Long)
                {
                    l = ((Long)obj).longValue();
                }
            }
        }
        if (bundle != null && l >= 0L && !LoggedInUser.getInstance().isLoggedIn())
        {
            if (l == 0L)
            {
                l = 0L;
            } else
            {
                l = System.currentTimeMillis() + 1000L * l;
            }
            FacebookManager.getInstance().resetFacebook(bundle, l);
        }
        obj1 = null;
        bundle = obj1;
        if (uri == null) goto _L2; else goto _L1
_L1:
        bundle = uri.toString();
        (new LogInboundRequestService()).requestService(bundle, null, null);
        if (uri.getQueryParameter("request_ids") == null) goto _L4; else goto _L3
_L3:
        bundle = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Notifications, Uri.parse((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://notifications").toString()));
_L2:
        obj = bundle;
        if (uri != null)
        {
            obj = bundle;
            if (bundle == null)
            {
                bundle = uri.toString();
                obj = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Website, uri, bundle);
            }
        }
        WishApplication.getAppInstance().setDeepLinkConfig(((ApplicationDeepLinkConfig) (obj)));
        bundle = new Intent();
        bundle.setFlags(0x14000000);
        bundle.setClass(this, com/contextlogic/wish/ui/activity/root/RootActivity);
        startActivity(bundle);
        finish();
        return;
        obj;
        obj = null;
          goto _L5
_L4:
        s1 = uri.getPath();
        bundle = obj1;
        if (s1 == null) goto _L2; else goto _L6
_L6:
        if (s1.contains("/c/")) goto _L8; else goto _L7
_L7:
        bundle = obj1;
        if (!s1.contains("/contest/")) goto _L2; else goto _L8
_L8:
        obj = null;
        if (s1.length() > 25 && s1.charAt(s1.length() - 25) == '-')
        {
            bundle = s1.substring(s1.length() - 24);
        } else
        {
            bundle = ((Bundle) (obj));
            if (s1.length() > 25)
            {
                bundle = ((Bundle) (obj));
                if (s1.charAt(s1.length() - 25) == '/')
                {
                    bundle = s1.substring(s1.length() - 24);
                }
            }
        }
        obj = bundle;
        if (bundle != null)
        {
            bundle = bundle.toLowerCase();
            obj = bundle;
            if (!WishDeepLinkActivity.validateHexString(bundle))
            {
                obj = null;
            }
        }
        bundle = obj1;
        if (obj != null)
        {
            bundle = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Product, Uri.parse((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://c/").append(((String) (obj))).toString()), ((java.io.Serializable) (obj)));
        }
          goto _L2
    }
}
