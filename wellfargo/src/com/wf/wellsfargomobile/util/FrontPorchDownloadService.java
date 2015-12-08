// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.d.e;

public class FrontPorchDownloadService extends IntentService
{

    public FrontPorchDownloadService()
    {
        super("FrontPorchDownloadSvc");
    }

    public void onHandleIntent(Intent intent)
    {
        String s;
        String s1;
        while (intent == null || intent.getExtras() == null) 
        {
            return;
        }
        s1 = intent.getStringExtra("url_path");
        s = intent.getStringExtra("url_type");
        int i;
        intent = (new a(c.a, s1, null, null, getApplicationContext(), false)).b();
        i = intent.a();
        if (intent.b() == null) goto _L2; else goto _L1
_L1:
        intent = intent.b().toString();
_L3:
        if (200 != i)
        {
            intent = null;
        }
_L4:
        Intent intent1 = new Intent("com.wf.wellsfargomobile.frontPorchDownload.receiver");
        intent1.putExtra("url_type", s);
        intent1.putExtra("response", intent);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent1);
        return;
_L2:
        intent = null;
          goto _L3
        intent;
        intent = null;
          goto _L4
    }
}
