// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wf.wellsfargomobile.hcewallet.a.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp, BaseWebViewActivity

class f extends BroadcastReceiver
{

    final BaseWebViewActivity a;

    f(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("WALLET_ACTIVE_SESSION_CHECK_COMPLETE_PAYLOAD");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        try
        {
            context = (new JSONObject(context)).getJSONObject("result");
            intent = context.optString("success");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!intent.equalsIgnoreCase("true"))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        context = context.optString("nonce");
        intent = com.wf.wellsfargomobile.hcewallet.a.f.a().b().a();
        if (!WFApp.e(context) || intent == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (!intent.equals(""))
        {
            WFApp.k = 1;
            return;
        }
        WFApp.k = 2;
        return;
        WFApp.k = 2;
    }
}
