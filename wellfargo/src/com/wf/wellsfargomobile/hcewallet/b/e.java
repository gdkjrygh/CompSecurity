// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPayNowActivity;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPinActivity;
import com.wf.wellsfargomobile.hcewallet.d.f;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.b:
//            f

public class e extends BridgeExecuteHandler
{

    Context a;
    String b;
    private String c;
    private Activity d;

    public e(Activity activity)
    {
        super(activity);
        a = activity.getApplicationContext();
        d = activity;
    }

    public String calculateReturn()
    {
        return null;
    }

    public void executeInternal()
    {
        b = payload.getAction();
        if (b == null || !b.equalsIgnoreCase("showView") || c == null || c.equals("")) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        BaseWebViewActivity basewebviewactivity;
        try
        {
            obj = (new JSONObject(c)).getJSONObject("request").optString("vid");
        }
        catch (JSONException jsonexception)
        {
            return;
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (((String) (obj)).equals("")) goto _L2; else goto _L4
_L4:
        obj = f.valueOf(((String) (obj)));
        f.a[((f) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 284
    //                   1 128
    //                   2 167
    //                   3 200
    //                   4 247;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        break; /* Loop/switch isn't completed */
_L6:
        obj = new Intent(a, com/wf/wellsfargomobile/hcewallet/activity/WalletPayNowActivity);
        if (d instanceof BaseWebViewActivity)
        {
            ((BaseWebViewActivity)d).startActivityForResult(((Intent) (obj)), 10002);
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (d instanceof BaseWebViewActivity)
        {
            ((BaseWebViewActivity)d).showDialogBox(null, a.getString(0x7f0800ae), 0x7f0200fb);
            return;
        }
        break; /* Loop/switch isn't completed */
_L8:
        if (!(d instanceof BaseWebViewActivity))
        {
            break; /* Loop/switch isn't completed */
        }
        basewebviewactivity = (BaseWebViewActivity)d;
        s = WFApp.o();
        obj = s;
        if (s != null) goto _L11; else goto _L10
_L10:
        WFApp.d(UUID.randomUUID().toString());
        obj = WFApp.o();
_L11:
        basewebviewactivity.walletSignOff(((String) (obj)));
        return;
_L9:
        Intent intent = new Intent(a, com/wf/wellsfargomobile/hcewallet/activity/WalletPinActivity);
        intent.setFlags(0x10000000);
        a.startActivity(intent);
        d.finish();
        return;
_L2:
    }

    public com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler.Payload marshal(String s)
    {
        payload = super.marshal(s);
        try
        {
            s = new JSONObject(s);
            if (s.has("data"))
            {
                c = s.getJSONObject("data").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return payload;
    }

    protected boolean validateNonce(String s)
    {
        return true;
    }
}
