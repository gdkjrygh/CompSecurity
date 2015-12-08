// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.service;

import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.util.Log;
import com.visa.cbp.sdk.facade.VisaPaymentSDK;
import com.visa.cbp.sdk.facade.data.ApduResponse;
import com.visa.cbp.sdk.facade.data.CvmMode;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import com.visa.cbp.sdk.facade.data.VerifyingEntity;
import com.visa.cbp.sdk.facade.data.VerifyingType;
import com.visa.cbp.sdk.facade.exception.PaywaveException;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.d.i;

public class HCEWalletHostApduService extends HostApduService
{

    private final String a = "APDUService";
    private VisaPaymentSDK b;
    private boolean c;
    private TokenKey d;
    private TokenStatus e;
    private boolean f;

    public HCEWalletHostApduService()
    {
        c = false;
        f = true;
    }

    private boolean a()
    {
        c = b.tokensExist();
        d = b.getSelectedCard();
        if (d != null)
        {
            TokenStatus tokenstatus1 = TokenStatus.getTokenStatus(b.getTokenStatus(d));
            TokenStatus tokenstatus = tokenstatus1;
            if (tokenstatus1 == null)
            {
                tokenstatus = TokenStatus.NOT_FOUND;
            }
            e = tokenstatus;
        }
        return c && d != null && a(e);
    }

    private boolean a(TokenStatus tokenstatus)
    {
        boolean flag;
        if (tokenstatus != null && tokenstatus == TokenStatus.ACTIVE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag);
        return flag;
    }

    public void onDeactivated(int j)
    {
        if (b == null)
        {
            b = WFApp.a();
        }
        if (f)
        {
            boolean flag = b.processTransactionComplete(d);
            Log.d("APDUService", (new StringBuilder()).append("Payment Complete >> ").append(flag).toString());
            Log.d("APDUService", (new StringBuilder()).append("isTokenExists and valid >> ").append(a()).toString());
            if (a() && flag)
            {
                Intent intent = new Intent();
                intent.setAction("com.wf.PaymentInitiated");
                sendBroadcast(intent);
            }
        }
    }

    public byte[] processCommandApdu(byte abyte0[], Bundle bundle)
    {
        Object obj;
        Object obj1;
        android.content.Context context;
        obj = null;
        obj1 = null;
        System.currentTimeMillis();
        Log.d("APDU", "Service called");
        f = true;
        context = getApplicationContext();
        if (b == null)
        {
            b = WFApp.a();
        }
        if (i.validateTapAndPayEvent(context)) goto _L2; else goto _L1
_L1:
        f = false;
        abyte0 = obj1;
_L4:
        return abyte0;
_L2:
        b.setCvmVerified(false);
        b.setCvmVerificationMode(new CvmMode(VerifyingEntity.VERIFIED_MOBILE_DEVICE, VerifyingType.ONLINE_PIN));
        if (!a())
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = b.processCommandApdu(abyte0, bundle, b.isCvmVerified());
        abyte0 = obj;
_L5:
        System.currentTimeMillis();
        if (bundle != null)
        {
            return bundle.getApduData();
        }
        if (true) goto _L4; else goto _L3
        abyte0;
        bundle = null;
        abyte0 = obj;
          goto _L5
_L3:
        if (c);
        if (d != null);
        abyte0 = new byte[2];
        bundle = null;
          goto _L5
    }
}
