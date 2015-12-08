// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.app.Dialog;
import android.os.AsyncTask;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.d.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            ImageCaptureType

public class a extends AsyncTask
{

    protected Dialog a;
    private final BaseActionBarActivity b;
    private final String c;
    private final String d;

    public a(BaseActionBarActivity baseactionbaractivity, String s, String s1)
    {
        b = baseactionbaractivity;
        c = s;
        d = s1;
    }

    protected transient Boolean a(Void avoid[])
    {
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap();
        linkedhashmap.put("frontImageId", WFApp.r());
        linkedhashmap.put("backImageId", WFApp.s());
        linkedhashmap.put("amount", c);
        linkedhashmap.put("account", d);
        if (WFApp.x() == null) goto _L2; else goto _L1
_L1:
        avoid = WFApp.x().toString();
_L5:
        linkedhashmap.put("cameraMode", avoid);
        linkedhashmap.put("WFAppId", com.wf.wellsfargomobile.a.a.i());
        avoid = (new com.wf.wellsfargomobile.d.a(c.b, (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/deposit/submitDeposit.action").toString(), linkedhashmap, null, b)).a(true).b();
        if (avoid.b() == null) goto _L4; else goto _L3
_L3:
        avoid = avoid.b().toString();
_L6:
        avoid = avoid.replace("/*--safejson--", "").replace("--safejson--*/", "");
label0:
        {
            boolean flag;
            try
            {
                flag = "Failed".equals((new JSONObject(avoid)).getString("status"));
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                flag = false;
                break label0;
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        WFApp.i();
        return Boolean.valueOf(flag);
_L2:
        avoid = ImageCaptureType.NONE.toString();
          goto _L5
_L4:
        avoid = "";
          goto _L6
        avoid;
        WFApp.i();
        throw avoid;
          goto _L5
    }

    public void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            execute(new Void[0]);
            return;
        }
    }

    protected void a(Boolean boolean1)
    {
label0:
        {
            if (a.isShowing())
            {
                a.dismiss();
            }
            WFApp.i();
            if (b instanceof BaseWebViewActivity)
            {
                if (!boolean1.booleanValue())
                {
                    break label0;
                }
                ((BaseWebViewActivity)b).loadURL((new StringBuilder()).append("/deposit/depositDetail.action?cb=").append(UUID.randomUUID().toString()).toString());
            }
            return;
        }
        ((BaseWebViewActivity)b).loadURL((new StringBuilder()).append("/deposit/depositDetail.action?cb=").append(UUID.randomUUID().toString()).toString());
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        b.updateUserLocale();
        a = new Dialog(b, 0x7f0a0112);
        a.setTitle(b.getString(0x7f080047));
        a.setContentView(0x7f040058);
        a.setCancelable(false);
        a.setCanceledOnTouchOutside(false);
        a.show();
    }
}
