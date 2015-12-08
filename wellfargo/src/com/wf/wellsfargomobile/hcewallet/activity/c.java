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

class c extends BroadcastReceiver
{

    final WalletPayNowActivity a;

    c(WalletPayNowActivity walletpaynowactivity)
    {
        a = walletpaynowactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s1;
        s1 = intent.getStringExtra("WALLET_ACTIVE_SESSION_CHECK_COMPLETE_PAYLOAD");
        context = intent.getStringExtra("HCE_WALLET_VIEW_ID");
        if (a.b().isShowing())
        {
            a.b().dismiss();
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        intent = new JSONObject(s1);
        if (!intent.has("result"))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        intent = intent.getJSONObject("result").getString("success");
        if (intent != null)
        {
            try
            {
                if (intent.equalsIgnoreCase("true"))
                {
                    WalletPayNowActivity.a(a, context);
                    a.finish();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        WalletPayNowActivity.b(a, context);
        a.finish();
        return;
        if (!intent.has("status"))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        context = intent.optString("status");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (context.equals("error"))
        {
            context = a.getString(0x7f0800b1);
            WalletPayNowActivity.a(a, a.getString(0x7f0800b2), context, 0x7f0200fb);
        }
    }
}
