// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.hcewallet.b.a;
import com.wf.wellsfargomobile.hcewallet.b.b;
import com.wf.wellsfargomobile.hcewallet.b.c;
import com.wf.wellsfargomobile.hcewallet.b.d;
import com.wf.wellsfargomobile.hcewallet.b.e;
import com.wf.wellsfargomobile.hcewallet.b.g;
import com.wf.wellsfargomobile.hcewallet.b.h;
import com.wf.wellsfargomobile.hcewallet.b.i;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.photobillpay.TakeBillPictureHandler;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            C4cMakeCallHandler, C4cGetANIHandler, GoSignOnHandler, GetPropertyHandler, 
//            SetPropertyHandler, GetDeviceInfo, DisableFastLookHandler, BalanceInfoFastLookHandler, 
//            GetFastLookTokensHandler, WriteReviewHandler, NoOpHandler, BridgeExecuteHandler

public class BridgeExecuteHandlerFactory
{

    private static final String BALANCE_INFO_CALL_FAST_LOOK = "balanceInfoCall";
    public static final String C4C_DIALER_HANDLER_KEY = "c4cMakeCall";
    public static final String C4C_GET_ANI = "c4cGetAni";
    private static final String DISABLE_FAST_LOOK = "disableFastLook";
    public static final String GET_DEVICE_DATA = "getDeviceData";
    private static final String GET_FAST_LOOK_TOKENS = "getFastLookTokens";
    public static final String GET_PROPERTY = "getProperty";
    public static final String GO_SIGNON = "goSignon";
    private static final String PHOTO_BILLPAY_TAKE_BILL_PICTURE = "takeBillPicture";
    public static final String SET_PROPERTY = "setProperty";
    private static final String TAG = "BridgeExeHandlerFactory";
    private static final String UPDATE_HCE_WALLET_CONNECTION_DATA = "wfWalletConnectData";
    private static final String WRITE_A_REVIEW = "writeReview";

    public BridgeExecuteHandlerFactory()
    {
    }

    public static BridgeExecuteHandler getInstance(String s, Activity activity)
    {
        if ("c4cMakeCall".equalsIgnoreCase(s))
        {
            return new C4cMakeCallHandler(activity);
        }
        if ("c4cGetAni".equalsIgnoreCase(s))
        {
            return new C4cGetANIHandler(activity);
        }
        if ("goSignon".equalsIgnoreCase(s))
        {
            return new GoSignOnHandler(activity);
        }
        if ("getProperty".equalsIgnoreCase(s))
        {
            return new GetPropertyHandler(activity);
        }
        if ("setProperty".equalsIgnoreCase(s))
        {
            return new SetPropertyHandler(activity);
        }
        if ("getDeviceData".equalsIgnoreCase(s))
        {
            return new GetDeviceInfo(activity);
        }
        if ("disableFastLook".equalsIgnoreCase(s))
        {
            return new DisableFastLookHandler(activity);
        }
        if ("balanceInfoCall".equalsIgnoreCase(s))
        {
            return new BalanceInfoFastLookHandler(activity);
        }
        if ("getFastLookTokens".equalsIgnoreCase(s))
        {
            return new GetFastLookTokensHandler(activity);
        }
        if ("takeBillPicture".equalsIgnoreCase(s))
        {
            return new TakeBillPictureHandler(activity);
        }
        if ("writeReview".equalsIgnoreCase(s))
        {
            return new WriteReviewHandler(activity);
        }
        if ("updateTokens".equalsIgnoreCase(s))
        {
            return new h(activity);
        }
        if ("wfWalletConnectData".equalsIgnoreCase(s))
        {
            return new g(activity);
        }
        if ("retrieveWalletData".equalsIgnoreCase(s))
        {
            return new d(activity);
        }
        if ("checkConnectivity".equalsIgnoreCase(s))
        {
            return new a(activity);
        }
        if ("defaultWalletWithHce".equalsIgnoreCase(s))
        {
            return new b(activity);
        }
        if ("showView".equalsIgnoreCase(s))
        {
            return new e(activity);
        }
        if ("retrieveLocation".equalsIgnoreCase(s))
        {
            return new c(activity);
        }
        if ("updatePaymentData".equalsIgnoreCase(s))
        {
            return new i(activity);
        } else
        {
            return new NoOpHandler(activity);
        }
    }
}
