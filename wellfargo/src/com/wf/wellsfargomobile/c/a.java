// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.c;

import android.content.Context;
import android.os.AsyncTask;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.d.e;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class a extends AsyncTask
{

    private final Context a;

    public a(Context context)
    {
        a = context;
    }

    protected transient Boolean a(Void avoid[])
    {
        avoid = new LinkedHashMap();
        avoid.put("WFAppId", com.wf.wellsfargomobile.a.a.i());
        avoid.put("nonce", WFApp.o());
        avoid = (new com.wf.wellsfargomobile.d.a(c.a, (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(a.getString(0x7f08016d)).toString(), avoid, null, a)).b();
        if (avoid.b() == null) goto _L2; else goto _L1
_L1:
        avoid = avoid.b().toString();
_L3:
        WFApp.i((new JSONObject(avoid.replace("/*--safejson--", "").replace("--safejson--*/", ""))).getString("languagePreference").toLowerCase(Locale.US));
        ((WebViewActivity)a).localeChanged();
_L4:
        return Boolean.valueOf(true);
_L2:
        avoid = "";
          goto _L3
        avoid;
          goto _L4
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
    }
}
