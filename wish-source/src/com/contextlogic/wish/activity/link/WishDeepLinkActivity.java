// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.activity.link;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.WishBaseActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import java.net.URLDecoder;

public class WishDeepLinkActivity extends WishBaseActivity
{

    public WishDeepLinkActivity()
    {
    }

    public static String getDeepLinkProtocol()
    {
        return WishApplication.getAppInstance().getString(0x7f0604c7);
    }

    public static ApplicationDeepLinkConfig getDeepLinkTarget(Uri uri)
    {
        if (uri == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        String s6;
        s6 = uri.getPath();
        obj = uri.getHost();
        obj2 = parseParams(uri.getFragment());
        if (obj != null && !((String) (obj)).equals("") && !((String) (obj)).equals("home")) goto _L4; else goto _L3
_L3:
        obj = getParam("tag", uri, ((Bundle) (obj2)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        uri = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Feed, uri, ((java.io.Serializable) (obj)));
_L7:
        return uri;
_L6:
        return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Feed, uri);
_L4:
        if ((((String) (obj)).equals("c") || ((String) (obj)).equals("contest")) && s6 != null)
        {
            String s1 = null;
            if (s6.length() >= 25 && s6.charAt(s6.length() - 25) == '-')
            {
                obj = s6.substring(s6.length() - 24);
            } else
            {
                obj = s1;
                if (s6.length() >= 25)
                {
                    obj = s1;
                    if (s6.charAt(s6.length() - 25) == '/')
                    {
                        obj = s6.substring(s6.length() - 24);
                    }
                }
            }
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = ((String) (obj)).toLowerCase();
            if (!validateHexString(((String) (obj))))
            {
                break; /* Loop/switch isn't completed */
            }
            s1 = getParam("recommended_by", uri, ((Bundle) (obj2)));
            obj2 = getParam("credit", uri, ((Bundle) (obj2)));
            obj = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Product, uri, ((java.io.Serializable) (obj)));
            if (s1 != null)
            {
                ((ApplicationDeepLinkConfig) (obj)).setRecommendedByInfo(s1);
            }
            uri = ((Uri) (obj));
            if (obj2 != null)
            {
                ((ApplicationDeepLinkConfig) (obj)).setCreditInfo(((String) (obj2)));
                return ((ApplicationDeepLinkConfig) (obj));
            }
        } else
        if (((String) (obj)).equals("profile"))
        {
            Object obj1 = getParam("uid", uri, ((Bundle) (obj2)));
            obj = obj1;
            if (obj1 != null)
            {
                obj = ((String) (obj1)).toLowerCase();
            }
            obj2 = getParam("set_id", uri, ((Bundle) (obj2)));
            obj1 = obj2;
            if (obj2 != null)
            {
                obj1 = ((String) (obj2)).toLowerCase();
            }
            if (s6 != null && obj != null && validateHexString(((String) (obj))))
            {
                obj = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Profile, uri, ((java.io.Serializable) (obj)));
                uri = ((Uri) (obj));
                if (obj1 != null)
                {
                    uri = ((Uri) (obj));
                    if (validateHexString(((String) (obj1))))
                    {
                        ((ApplicationDeepLinkConfig) (obj)).setSetId(((String) (obj1)));
                        return ((ApplicationDeepLinkConfig) (obj));
                    }
                }
            } else
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Profile, uri);
            }
        } else
        {
            if (((String) (obj)).equals("notifications"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Notifications, uri);
            }
            if (((String) (obj)).equals("wallet"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Wallet, uri);
            }
            if (((String) (obj)).equals("invite"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Invite, uri);
            }
            if (((String) (obj)).equals("app") && getParam("l", uri, ((Bundle) (obj2))) != null)
            {
                obj = getParam("l", uri, ((Bundle) (obj2)));
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.AnotherApp, uri, ((java.io.Serializable) (obj)));
            }
            if (((String) (obj)).equals("change-password"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.ChangePassword, uri);
            }
            if (((String) (obj)).equals("brand") && s6 != null && !s6.equals("") && !s6.equals("/"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Brand, uri, new WishBrandFilter(s6.substring(1)));
            }
            if (((String) (obj)).equals("merchant") && s6 != null && !s6.equals("") && !s6.equals("/"))
            {
                obj = s6.substring(1);
                String s2 = getParam("cids", uri, ((Bundle) (obj2)));
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Brand, uri, new WishBrandFilter(((String) (obj)), null, null, null, s2, null, true, true));
            }
            if (((String) (obj)).equals("search") && s6 != null && !s6.equals("") && !s6.equals("/"))
            {
                obj = s6.substring(1);
                String s3 = getParam("shop", uri, ((Bundle) (obj2)));
                if (s3 != null && s3.equals("1"))
                {
                    return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CommerceSearch, uri, ((java.io.Serializable) (obj)));
                } else
                {
                    return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Search, uri, ((java.io.Serializable) (obj)));
                }
            }
            if (((String) (obj)).equals("shopping"))
            {
                obj = getParam("brand", uri, ((Bundle) (obj2)));
                String s4;
                String s7;
                String s8;
                String s9;
                if (obj == null)
                {
                    obj = "wishwall";
                }
                s4 = getParam("tag", uri, ((Bundle) (obj2)));
                s7 = getParam("cids", uri, ((Bundle) (obj2)));
                s8 = getParam("price", uri, ((Bundle) (obj2)));
                s9 = getParam("credit", uri, ((Bundle) (obj2)));
                obj2 = getParam("force_title", uri, ((Bundle) (obj2)));
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Brand, uri, new WishBrandFilter(((String) (obj)), ((String) (obj2)), s8, s4, s7, s9, true, false));
            }
            if (((String) (obj)).equals("cart"))
            {
                obj = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Cart, uri);
                String s5 = getParam("add_product", uri, ((Bundle) (obj2)));
                uri = getParam("add_variation", uri, ((Bundle) (obj2)));
                if (s5 != null && uri != null)
                {
                    ((ApplicationDeepLinkConfig) (obj)).setCartInfo(s5, uri);
                }
                return ((ApplicationDeepLinkConfig) (obj));
            }
            if (((String) (obj)).equals("data-control"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.DataControlSettings, uri);
            }
            if (((String) (obj)).equals("push-notifications"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.PushNotificationsSettings, uri);
            }
            if (((String) (obj)).equals("rate-app"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.RateApp, uri);
            }
            if (((String) (obj)).equals("edit-list-tutorial"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.EditListTutorial, uri);
            }
            if (((String) (obj)).equals("update-profile"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.UpdateProfile, uri);
            }
            if (((String) (obj)).equals("change-profile-pic"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.ChangeProfilePic, uri);
            }
            if (((String) (obj)).equals("category-home"))
            {
                obj = getParam("category", uri, ((Bundle) (obj2)));
                if (obj != null)
                {
                    return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CategoryHome, uri, ((java.io.Serializable) (obj)));
                } else
                {
                    return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CategoryHome, uri);
                }
            }
            if (((String) (obj)).equals("collection-feed"))
            {
                obj = getParam("collection", uri, ((Bundle) (obj2)));
                if (obj != null)
                {
                    return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CollectionsFeed, uri, ((java.io.Serializable) (obj)));
                } else
                {
                    return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CollectionsFeed, uri);
                }
            }
            if (((String) (obj)).equals("signup-gift"))
            {
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.SignupGift, uri);
            } else
            {
                String s = uri.toString().replace((new StringBuilder()).append(getDeepLinkProtocol()).append("://").toString(), String.format("https://%s/", new Object[] {
                    WishApi.getInstance().getConfig().getApiBaseUrlString()
                }));
                return new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Website, uri, s);
            }
        }
        if (true) goto _L7; else goto _L2
_L2:
        return null;
    }

    public static String getParam(String s, Uri uri, Bundle bundle)
    {
        String s1 = null;
        if (uri != null)
        {
            s1 = uri.getQueryParameter(s);
        }
        uri = s1;
        if (s1 == null)
        {
            uri = s1;
            if (bundle != null)
            {
                uri = bundle.getString(s);
            }
        }
        return uri;
    }

    public static Bundle parseParams(String s)
    {
        Bundle bundle = new Bundle();
        if (s != null)
        {
            s = s.split("&");
            int j = s.length;
            for (int i = 0; i < j; i++)
            {
                String as[] = s[i].split("=");
                if (as.length < 2)
                {
                    continue;
                }
                String s1 = URLDecoder.decode(as[1]);
                if (s1 != null && as[0] != null)
                {
                    bundle.putString(as[0], s1);
                }
            }

        }
        return bundle;
    }

    public static boolean validateHexString(String s)
    {
        s = s.toLowerCase();
        for (int i = 0; i < s.length();)
        {
            char c = s.charAt(i);
            if (Character.isDefined(c) || c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f')
            {
                i++;
            } else
            {
                return false;
            }
        }

        return true;
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            if (!Analytics.getInstance().isStarted())
            {
                Analytics.getInstance().startAnalytics(WishApplication.getAppInstance());
            }
            Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.DeepLink);
            Uri uri = getIntent().getData();
            bundle = uri;
            if (uri == null)
            {
                break label0;
            }
            bundle = uri;
            if (uri.getHost() == null)
            {
                break label0;
            }
            if (!uri.getHost().equalsIgnoreCase("wish.com"))
            {
                bundle = uri;
                if (!uri.getHost().equalsIgnoreCase("www.wish.com"))
                {
                    break label0;
                }
            }
            bundle = uri.toString();
            bundle = bundle.substring(bundle.indexOf(".com") + 4);
            if (bundle.startsWith("/"))
            {
                bundle = (new StringBuilder()).append(getDeepLinkProtocol()).append(":/").append(bundle).toString();
            } else
            {
                bundle = (new StringBuilder()).append(getDeepLinkProtocol()).append("://").append(bundle).toString();
            }
            bundle = Uri.parse(bundle);
        }
        bundle = getDeepLinkTarget(bundle);
        WishApplication.getAppInstance().setDeepLinkConfig(bundle);
        bundle = new Intent();
        bundle.setFlags(0x14000000);
        bundle.setClass(this, com/contextlogic/wish/ui/activity/root/RootActivity);
        startActivity(bundle);
        finish();
    }
}
