// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.payment.service.pin.PinPreferences;
import com.walmartlabs.utils.WLog;

public class MobilePayPinController
{

    private static final String TAG = com/walmartlabs/payment/controller/pin/MobilePayPinController.getSimpleName();
    private static MobilePayPinController sInstance;
    private AuthenticationStatusEvent mAuthenticationStatus;
    private Class mPinActivityClass;

    public MobilePayPinController()
    {
    }

    public static void create(Class class1)
    {
        MobilePayPinController mobilepaypincontroller = get();
        mobilepaypincontroller.mPinActivityClass = class1;
        MessageBus.getBus().register(mobilepaypincontroller);
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            MessageBus.getBus().unregister(sInstance);
        }
        sInstance = null;
    }

    private static MobilePayPinController get()
    {
        if (sInstance == null)
        {
            sInstance = new MobilePayPinController();
        }
        return sInstance;
    }

    public static void launchPin(Activity activity, int i, boolean flag, boolean flag1)
    {
        if (get().mPinActivityClass == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        Intent intent = new Intent(activity, get().mPinActivityClass);
        intent.putExtra("EXTRA_CHANGE_PASSCODE", flag);
        intent.putExtra("EXTRA_SUPPRESS_VERIFICATION", flag1);
        activity.startActivityForResult(intent, i);
        return;
        activity;
        WLog.e(TAG, "Could not launch PIN", activity);
        return;
    }

    public static void launchPin(Context context, boolean flag)
    {
        if (get().mPinActivityClass == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Intent intent = new Intent(context, get().mPinActivityClass);
        intent.putExtra("EXTRA_CHANGE_PASSCODE", flag);
        context.startActivity(intent);
        return;
        context;
        WLog.e(TAG, "Could not launch PIN", context);
        return;
    }

    public static void launchPin(Fragment fragment, int i)
    {
        launchPin(fragment, i, false);
    }

    public static void launchPin(Fragment fragment, int i, boolean flag)
    {
        if (get().mPinActivityClass == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        Intent intent = new Intent(fragment.getActivity(), get().mPinActivityClass);
        intent.putExtra("EXTRA_CHANGE_PASSCODE", flag);
        fragment.startActivityForResult(intent, i);
        return;
        fragment;
        WLog.e(TAG, "Could not launch PIN", fragment);
        return;
    }

    public static void start(Context context)
    {
        MobilePayPinController mobilepaypincontroller = get();
        if (mobilepaypincontroller.mAuthenticationStatus != null)
        {
            PinPreferences.resetPinPassed(context, mobilepaypincontroller.mAuthenticationStatus.cid);
        }
    }

    public static void stop(Context context)
    {
        MobilePayPinController mobilepaypincontroller = get();
        if (mobilepaypincontroller.mAuthenticationStatus != null)
        {
            PinPreferences.resetPinPassed(context, mobilepaypincontroller.mAuthenticationStatus.cid);
        }
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        mAuthenticationStatus = authenticationstatusevent;
    }

}
