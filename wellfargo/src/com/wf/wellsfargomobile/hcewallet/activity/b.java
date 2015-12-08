// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wf.wellsfargomobile.util.s;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletPayNowActivity

class b extends BroadcastReceiver
{

    final WalletPayNowActivity a;

    b(WalletPayNowActivity walletpaynowactivity)
    {
        a = walletpaynowactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("WALLET_SIGN_OFF_COMPLETE_PAYLOAD");
        if (a.b().isShowing())
        {
            a.b().dismiss();
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        context = new JSONObject(context);
        if (!context.has("result"))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        context = context.getJSONObject("result");
        intent = context.getString("success");
        if (intent != null)
        {
            try
            {
                if (intent.equalsIgnoreCase("true"))
                {
                    context = context.getString("authMode");
                    a.b(context);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        a.b("WAC");
        return;
        if (!context.has("status"))
        {
            break MISSING_BLOCK_LABEL_163;
        }
        context = context.optString("status");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (context.equals("error"))
        {
            context = a.getString(0x7f0800b1);
            WalletPayNowActivity.a(a, a.getString(0x7f0800b2), context, 0x7f0200fb);
        }
    }
}
