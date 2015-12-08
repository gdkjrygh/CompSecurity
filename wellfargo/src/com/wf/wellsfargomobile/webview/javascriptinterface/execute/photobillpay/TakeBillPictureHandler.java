// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute.photobillpay;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.photobillpay.PhotoBillPayPhotoTipsActivity;
import com.wf.wellsfargomobile.photobillpay.PhotoBillPayScanActivity;
import com.wf.wellsfargomobile.photobillpay.u;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;

public class TakeBillPictureHandler extends BridgeExecuteHandler
{

    private static final String TAG = "TakeBillPictureHandler";
    private BaseWebViewActivity baseWebViewActivity;
    private ScanData scanData;

    public TakeBillPictureHandler(Activity activity)
    {
        super(activity);
        baseWebViewActivity = (BaseWebViewActivity)activity;
    }

    protected String calculateReturn()
    {
        return null;
    }

    protected void executeInternal()
    {
        AppContextProvider.setContext(baseWebViewActivity.getApplicationContext());
        Object obj = Licensing.setMobileSDKLicense("ttP,,thT0#4FZ&8#8l,@tvtjLfD$xr^TB@[089nl5n[6qb04[(NPIUEAWGUNKl;dfvkhzdf7rglcvjck=,mIOF&^BUL?!!!!!!Z2");
        if (obj == ErrorInfo.KMC_EV_LICENSE_EXPIRED || obj == ErrorInfo.KMC_EV_LICENSING)
        {
            Log.e("TakeBillPictureHandler", (new StringBuilder()).append("InValid License Key !!! Number of days left ").append(Licensing.getDaysRemaining()).toString());
            return;
        }
        obj = new Intent();
        ((Intent) (obj)).putExtra("activitySource", scanData.activitySource);
        ((Intent) (obj)).putExtra("timoutSeconds", scanData.timeoutSeconds);
        ((Intent) (obj)).putExtra("responseWaitTimoutSeconds", scanData.responseWaitTimeoutSeconds);
        ((Intent) (obj)).putExtra("actionMethod", scanData.actionMethod);
        ((Intent) (obj)).putExtra("callBackFunctionName", payload.getResultCallback().getFunctionName());
        if (!u.b())
        {
            ((Intent) (obj)).setClass(baseWebViewActivity, com/wf/wellsfargomobile/photobillpay/PhotoBillPayPhotoTipsActivity);
            baseWebViewActivity.startActivityForResult(((Intent) (obj)), 130);
            return;
        } else
        {
            ((Intent) (obj)).setClass(baseWebViewActivity, com/wf/wellsfargomobile/photobillpay/PhotoBillPayScanActivity);
            baseWebViewActivity.startActivityForResult(((Intent) (obj)), 120);
            return;
        }
    }

    protected com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler.Payload marshal(String s)
    {
        s = super.marshal(s);
        Gson gson = (new GsonBuilder()).create();
        scanData = (ScanData)gson.fromJson(gson.toJson(s.getData()), com/wf/wellsfargomobile/webview/javascriptinterface/execute/photobillpay/TakeBillPictureHandler$ScanData);
        return s;
    }

    private class ScanData
    {

        private String actionMethod;
        private String activitySource;
        private long responseWaitTimeoutSeconds;
        private long timeoutSeconds;

        public String getActionMethod()
        {
            return actionMethod;
        }

        public String getActivitySource()
        {
            return activitySource;
        }

        public long getResponseWaitTimeoutSeconds()
        {
            return responseWaitTimeoutSeconds;
        }

        public long getTimeoutSeconds()
        {
            return timeoutSeconds;
        }

        public void setActionMethod(String s)
        {
            actionMethod = s;
        }

        public void setActivitySource(String s)
        {
            activitySource = s;
        }

        public void setResponseWaitTimeoutSeconds(int i)
        {
            responseWaitTimeoutSeconds = i;
        }

        public void setTimeoutSeconds(int i)
        {
            timeoutSeconds = i;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ScanData{activitySource='").append(activitySource).append('\'').append(", actionMethod='").append(actionMethod).append('\'').append(", timeoutSeconds=").append(timeoutSeconds).append(", responseWaitTimeoutSeconds=").append(responseWaitTimeoutSeconds).append('}').toString();
        }





        public ScanData()
        {
            timeoutSeconds = 0L;
            responseWaitTimeoutSeconds = 0L;
        }
    }

}
