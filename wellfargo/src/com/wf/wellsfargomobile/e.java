// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity

class e extends BroadcastReceiver
{

    final BaseWebViewActivity a;

    e(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("WALLET_SIGN_OFF_COMPLETE_PAYLOAD");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = new JSONObject(context);
        if (!context.has("result"))
        {
            break MISSING_BLOCK_LABEL_82;
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
                    a.setWalletSignOff(context);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        a.setWalletSignOff("OBC");
        return;
        if (!context.has("status"))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = context.optString("status");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (context.equals("error"))
        {
            a.setWalletSignOff("WAC");
        }
    }
}
