// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.photo.WalmartIntegrationProvider;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.WalmartUri;
import com.walmartlabs.android.photo.controller.MainActivity;
import com.walmartlabs.utils.WLog;

public class NavigationItemUtils
{

    public static final int ERECEIPTS = 5;
    public static final int PHARMACY = 6;
    public static final int PHOTO = 7;
    public static final int ROLLBACKS = 8;
    public static final int SHOP_BY_DEPT = 1;
    public static final int SHOWCASE = 9;
    public static final int STORE_FINDER = 3;
    private static final String TAG = com/walmart/android/app/main/NavigationItemUtils.getSimpleName();
    public static final int TRACK_ORDER = 4;
    public static final int WEEKLY_AD = 2;

    public NavigationItemUtils()
    {
    }

    public static void launch(Activity activity, int i)
    {
        Bundle bundle;
        Object obj;
        obj = null;
        bundle = null;
        i;
        JVM INSTR tableswitch 1 9: default 56
    //                   1 86
    //                   2 109
    //                   3 116
    //                   4 123
    //                   5 130
    //                   6 152
    //                   7 161
    //                   8 175
    //                   9 198;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        WLog.w(TAG, "Unknown option");
        activity = obj;
_L12:
        if (activity != null)
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(activity, bundle));
        }
        return;
_L2:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.SHOP;
        bundle = new Bundle();
        bundle.putString("start_mode", "root");
        continue; /* Loop/switch isn't completed */
_L3:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD;
        continue; /* Loop/switch isn't completed */
_L4:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.STORE_FINDER;
        continue; /* Loop/switch isn't completed */
_L5:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.TRACK_ORDER;
        continue; /* Loop/switch isn't completed */
_L6:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD;
        bundle = new Bundle();
        bundle.putBoolean("START_SYNC", true);
        continue; /* Loop/switch isn't completed */
_L7:
        PharmacyActivity.launch(activity);
        activity = obj;
        continue; /* Loop/switch isn't completed */
_L8:
        MainActivity.launch(activity, com/walmart/android/app/photo/WalmartIntegrationProvider.getName());
        activity = obj;
        continue; /* Loop/switch isn't completed */
_L9:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.SHOP;
        bundle = new Bundle();
        bundle.putString("start_mode", "rollbacks");
        continue; /* Loop/switch isn't completed */
_L10:
        activity = com.walmart.android.config.FragmentConfig.FragmentName.SHOP;
        bundle = new Bundle();
        bundle.putString("start_mode", "savings_showcase");
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static void launchFromUri(Context context, String s)
    {
        launchFromUri(context, s, false);
    }

    public static void launchFromUri(Context context, String s, boolean flag)
    {
        Object obj = WalmartUri.parse(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((WalmartUri) (obj)).getType();
        JVM INSTR tableswitch 0 28: default 144
    //                   0 180
    //                   1 180
    //                   2 229
    //                   3 485
    //                   4 144
    //                   5 267
    //                   6 337
    //                   7 377
    //                   8 144
    //                   9 144
    //                   10 144
    //                   11 144
    //                   12 144
    //                   13 144
    //                   14 417
    //                   15 144
    //                   16 144
    //                   17 641
    //                   18 144
    //                   19 610
    //                   20 622
    //                   21 144
    //                   22 144
    //                   23 523
    //                   24 572
    //                   25 144
    //                   26 144
    //                   27 144
    //                   28 302;
           goto _L3 _L4 _L4 _L5 _L6 _L3 _L7 _L8 _L9 _L3 _L3 _L3 _L3 _L3 _L3 _L10 _L3 _L3 _L11 _L3 _L12 _L13 _L3 _L3 _L14 _L15 _L3 _L3 _L3 _L16
_L14:
        break MISSING_BLOCK_LABEL_523;
_L15:
        break MISSING_BLOCK_LABEL_572;
_L12:
        break MISSING_BLOCK_LABEL_610;
_L13:
        break MISSING_BLOCK_LABEL_622;
_L11:
        break MISSING_BLOCK_LABEL_641;
_L3:
        WLog.e(TAG, (new StringBuilder()).append("Unknown URI type: ").append(((WalmartUri) (obj)).getType()).toString(), new Exception());
_L2:
        return;
_L4:
        context = new Bundle();
        context.putString("search_query", ((WalmartUri) (obj)).getParam(1));
        context.putString("search_department", ((WalmartUri) (obj)).getParam(0));
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, context, flag));
        return;
_L5:
        context = new Bundle();
        context.putString("browse_token", ((WalmartUri) (obj)).getParam(0));
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, context, flag));
        return;
_L7:
        context = new Bundle();
        context.putString("start_mode", "rollbacks");
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, context, flag));
        return;
_L16:
        context = new Bundle();
        context.putString("start_mode", "savings_showcase");
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, context, flag));
        return;
_L8:
        context = ((WalmartUri) (obj)).getParam(0);
        s = new Bundle();
        s.putString("shelf_id", context);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, s, flag));
        return;
_L9:
        context = ((WalmartUri) (obj)).getParam(1);
        s = new Bundle();
        s.putString("item_id", context);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.PRODUCT_DETAILS, s, flag));
        return;
_L10:
        try
        {
            obj = new Intent("android.intent.action.VIEW", Uri.parse(((WalmartUri) (obj)).getOriginalUri()));
            if (((Intent) (obj)).resolveActivity(context.getPackageManager()) != null)
            {
                ((Intent) (obj)).addFlags(0x10000000);
                context.startActivity(((Intent) (obj)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WLog.w(TAG, (new StringBuilder()).append("Could not launch activity for: ").append(s).toString());
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
        context = new Bundle();
        context.putString("promotion", ((WalmartUri) (obj)).getParam(0));
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD, context, flag));
        return;
        context = new Bundle();
        context.putString("flyer_type", ((WalmartUri) (obj)).getParam(0));
        context.putString("flyer_id", ((WalmartUri) (obj)).getParam(1));
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD, context, flag));
        return;
        context = new Bundle();
        context.putString("preview_code", ((WalmartUri) (obj)).getParam(0));
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD, context, flag));
        return;
        launchWebView(Uri.decode(((WalmartUri) (obj)).getParam(0)));
        return;
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HOME, null, flag));
        return;
        context = new Bundle();
        s = ((WalmartUri) (obj)).getParam(0);
        if (s != null)
        {
            context.putString("EXTRA_TC_NUMBER", s);
        }
        context.putBoolean("START_SYNC", true);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD, context, flag));
        return;
    }

    public static void launchWebView(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            Bundle bundle = new Bundle();
            bundle.putString("webview_url", s);
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.WEB_FRAGMENT, bundle, true));
        }
    }

}
