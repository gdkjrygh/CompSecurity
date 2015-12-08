// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.CustomProgressDialog;

public abstract class SaverSubmitReceipt extends AsyncCallbackOnThread
{
    public static abstract class EReceiptCallback extends SaverSubmitReceipt
    {

        public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
        {
label0:
            {
                if (isTop())
                {
                    dismissDialog(1001);
                    if (404 != integer.intValue())
                    {
                        break label0;
                    }
                    onNotFoundFailure();
                }
                return;
            }
            showDialog(1003);
            trackError("General Server Error");
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj1);
        }

        protected abstract void onNotFoundFailure();

        protected abstract void onReceipt(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt);

        public void onSuccessSameThread(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
        {
            if (isTop())
            {
                onReceipt(receipt);
            }
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj);
        }

        public EReceiptCallback(Handler handler)
        {
            super(handler);
        }
    }

    public static abstract class SaverCallback extends SaverSubmitReceipt
    {

        protected abstract boolean isEReceipt();

        public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
        {
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
label4:
                            {
                                if (isTop())
                                {
                                    dismissDialog(1001);
                                    if (statusresponse == null)
                                    {
                                        break label0;
                                    }
                                    int i = statusresponse.getErrorCode();
                                    integer = statusresponse.message;
                                    statusresponse = new Bundle();
                                    statusresponse.putString("DIALOG_ARG_MESSAGE", integer);
                                    switch (i)
                                    {
                                    case 1119: 
                                    case 1120: 
                                    case 1123: 
                                    default:
                                        trackError("General Server Error");
                                        showDialog(1003, statusresponse);
                                        break;

                                    case 1117: 
                                    case 1118: 
                                        break label2;

                                    case 1121: 
                                        break label3;

                                    case 1122: 
                                        break label4;

                                    case 1124: 
                                        break label1;
                                    }
                                }
                                return;
                            }
                            if (!isEReceipt())
                            {
                                showDialog(1002, statusresponse);
                                trackError("Error Handling - Text Entry Not Recognized");
                                return;
                            }
                        }
                        trackError("Error Handling - Not Eligible");
                        showDialog(1004, statusresponse);
                        return;
                    }
                    trackError("Error Handling - Not Eligible");
                    showDialog(1005, statusresponse);
                    return;
                }
                trackError("General Server Error");
                showDialog(1006, statusresponse);
                return;
            }
            trackError("General Server Error");
            showDialog(1003);
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (StatusResponse)obj1);
        }

        public SaverCallback(Handler handler)
        {
            super(handler);
        }
    }


    public static final int DIALOG_ALREADY_SUBMITTED = 1005;
    public static final String DIALOG_ARG_MESSAGE = "DIALOG_ARG_MESSAGE";
    public static final int DIALOG_PROGRESS = 1001;
    public static final int DIALOG_SAVER_NOT_ELIGIBLE = 1004;
    public static final int DIALOG_TC_NOT_VALID = 1002;
    public static final int DIALOG_UNKNOWN_ERROR = 1003;
    public static final int DIALOG_WEEKLY_LIMIT = 1006;

    public SaverSubmitReceipt(Handler handler)
    {
        super(handler);
    }

    public static Dialog createDialog(Activity activity, Bundle bundle, int i, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        Object obj = null;
        String s = obj;
        if (bundle != null)
        {
            s = obj;
            if (bundle.containsKey("DIALOG_ARG_MESSAGE"))
            {
                s = bundle.getString("DIALOG_ARG_MESSAGE");
            }
        }
        switch (i)
        {
        default:
            return null;

        case 1001: 
            bundle = CustomProgressDialog.create(activity);
            bundle.setMessage(activity.getString(0x7f0904a4));
            return bundle;

        case 1002: 
        case 1003: 
            bundle = s;
            if (TextUtils.isEmpty(s))
            {
                bundle = activity.getString(0x7f0904a8);
            }
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(bundle).setNeutralButton(0x7f090292, onclicklistener).create();

        case 1006: 
            bundle = s;
            if (TextUtils.isEmpty(s))
            {
                bundle = activity.getString(0x7f090533);
            }
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(bundle).setNeutralButton(0x7f090292, onclicklistener).create();

        case 1004: 
            bundle = s;
            if (TextUtils.isEmpty(s))
            {
                bundle = activity.getString(0x7f09052f);
            }
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(bundle).setNeutralButton(0x7f090292, onclicklistener).create();

        case 1005: 
            bundle = s;
            break;
        }
        if (TextUtils.isEmpty(s))
        {
            bundle = activity.getString(0x7f09052e);
        }
        return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(bundle).setNeutralButton(0x7f090292, onclicklistener).create();
    }

    protected abstract void dismissDialog(int i);

    protected abstract boolean isTop();

    protected abstract void showDialog(int i);

    protected abstract void showDialog(int i, Bundle bundle);

    protected void trackError(String s)
    {
        s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", com.walmart.android.util.TextUtils.truncate(s, 60));
        MessageBus.getBus().post(s);
    }
}
