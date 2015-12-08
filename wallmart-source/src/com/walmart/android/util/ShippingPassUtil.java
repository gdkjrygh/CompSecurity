// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import com.walmart.android.service.shippingpass.ShippingPassManager;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;

public class ShippingPassUtil
{

    private static final String SHIPPING_PASS = "ShippingPass";
    private static final String SHIPPING_PASS_BROWSER_SIGNUP = "http://www.walmart.com/shippingpass?targeted=email";
    private static final String TAG = com/walmart/android/util/ShippingPassUtil.getSimpleName();

    public ShippingPassUtil()
    {
    }

    public static Spannable getShippingPassImageText(Context context, int i)
    {
        String s = context.getString(i);
        SpannableString spannablestring = new SpannableString(s);
        context = new ImageSpan(context, 0x7f0201b8, 1);
        i = s.indexOf("ShippingPass");
        if (i >= 0)
        {
            spannablestring.setSpan(context, i, "ShippingPass".length() + i, 0);
        }
        return spannablestring;
    }

    public static CharSequence getShippingPassText(Context context, int i)
    {
        context = context.getString(i);
        SpannableString spannablestring = new SpannableString(context);
        StyleSpan stylespan = new StyleSpan(2);
        i = context.indexOf("ShippingPass");
        if (i >= 0)
        {
            spannablestring.setSpan(stylespan, i, "Shipping".length() + i, 0);
            return spannablestring;
        } else
        {
            return context;
        }
    }

    public static boolean isEligibleNonMember()
    {
        return !Services.get().getAuthentication().isShippingPassMember() && Services.get().getAuthentication().isShippingPassEligibleOrMember();
    }

    private static boolean launchBrowser(Context context, String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        if (intent.resolveActivity(context.getPackageManager()) != null)
        {
            context.startActivity(intent);
            return true;
        } else
        {
            return false;
        }
    }

    private static void launchBrowserSignup(Context context)
    {
        ShippingPassManager.get().setPendingRefreshFlag();
        launchBrowser(context, "http://www.walmart.com/shippingpass?targeted=email");
    }

    public static void launchShippingPassSignup(Activity activity)
    {
        (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setTitle(0x7f090565).setMessage(getShippingPassText(activity, 0x7f090564)).setPositiveButton(0x7f090563, new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                ShippingPassUtil.launchBrowserSignup(activity);
            }

            
            {
                activity = activity1;
                super();
            }
        }).setNegativeButton(0x7f090567, null).create().show();
    }


}
