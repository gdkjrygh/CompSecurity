// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.service.BaseResponse;

public class ErrorHandlingUtil
{

    public ErrorHandlingUtil()
    {
    }

    public static void handleResponseError(Activity activity, Result result)
    {
        handleResponseError(activity, result, ((String) (null)));
    }

    public static void handleResponseError(Activity activity, Result result, int i)
    {
        if (activity != null)
        {
            handleResponseError(activity, result, activity.getResources().getString(i));
        }
    }

    public static void handleResponseError(Activity activity, Result result, String s)
    {
label0:
        {
            if (activity != null)
            {
                if (!result.hasError() || !result.getError().connectionError())
                {
                    break label0;
                }
                DialogFactory.createAlertDialog(activity.getString(com.walmartlabs.android.payment.R.string.network_error_title), activity.getString(com.walmartlabs.android.payment.R.string.network_error_message), activity).show();
            }
            return;
        }
        if (result.hasData() && ((BaseResponse)result.getData()).hasClientErrorMessage())
        {
            DialogFactory.createAlertDialog(((BaseResponse)result.getData()).getClientErrorMessage(), activity).show();
            return;
        }
        if (s == null)
        {
            s = activity.getString(com.walmartlabs.android.payment.R.string.system_error_message);
        }
        DialogFactory.createAlertDialog(s, activity).show();
    }

    public static void handleServiceError(Activity activity, com.walmartlabs.kangaroo.Result.Error error)
    {
label0:
        {
            if (activity != null)
            {
                if (!error.connectionError())
                {
                    break label0;
                }
                DialogFactory.createAlertDialog(activity.getString(com.walmartlabs.android.payment.R.string.network_error_title), activity.getString(com.walmartlabs.android.payment.R.string.network_error_message), activity).show();
            }
            return;
        }
        DialogFactory.createAlertDialog(activity.getString(com.walmartlabs.android.payment.R.string.system_error_message), activity).show();
    }

    public static void showError(Context context, String s)
    {
        if (s == null || s.isEmpty())
        {
            s = context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_generic_msg);
        }
        DialogFactory.createAlertDialog(s, context).show();
    }
}
