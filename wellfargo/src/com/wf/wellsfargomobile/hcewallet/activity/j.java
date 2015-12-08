// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.util.s;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPinActivity

class j extends BroadcastReceiver
{

    final WalletPinActivity a;

    j(WalletPinActivity walletpinactivity)
    {
        a = walletpinactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        String s2;
        s2 = intent.getStringExtra("WAC_SIGN_ON_COMPLETE_PAYLOAD");
        obj = intent.getStringExtra("WAC_VIEW_ID");
        if (a.b().isShowing())
        {
            a.b().dismiss();
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        JSONObject jsonobject;
        String s3;
        intent = new JSONObject(s2);
        if (!intent.has("result"))
        {
            break MISSING_BLOCK_LABEL_258;
        }
        jsonobject = intent.getJSONObject("result");
        s3 = jsonobject.optString("success");
        if (!jsonobject.has("error"))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        intent = jsonobject.getJSONObject("error");
_L1:
        s2 = intent.optString("ec");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        if (!s3.equalsIgnoreCase("true") || !s2.equals(""))
        {
            break MISSING_BLOCK_LABEL_182;
        }
        intent = jsonobject.getJSONObject("custDet");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (!intent.toString().equals(""))
        {
            i.parsePaymentDataJSON(intent.toString(), context);
        }
        a.a(((String) (obj)));
        return;
        try
        {
            intent = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
          goto _L1
        if (!jsonobject.has("custDet"))
        {
            break MISSING_BLOCK_LABEL_224;
        }
        obj = jsonobject.getJSONObject("custDet");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (!((JSONObject) (obj)).toString().equals(""))
        {
            i.parsePaymentDataJSON(((JSONObject) (obj)).toString(), context);
        }
        context = intent.optString("ecd");
        String s1 = intent.optString("ect");
        intent = intent.optString("vid");
        a.a(s2, context, s1, intent);
        return;
        if (!intent.has("status"))
        {
            break MISSING_BLOCK_LABEL_310;
        }
        context = intent.optString("status");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        if (context.equals("error"))
        {
            WalletPinActivity.a(a).setVisibility(0);
            WalletPinActivity.a(a).setText(0x7f080122);
        }
    }
}
