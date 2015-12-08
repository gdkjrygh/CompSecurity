// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.gcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;
import com.wf.wellsfargomobile.locations.LocationListActivity;

public class PNRouterActivity extends Activity
{

    public PNRouterActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        String s = bundle.getStringExtra("PNSTOKEN");
        String s1 = bundle.getStringExtra("PNSDEST");
        if (WebViewActivity.b)
        {
            bundle = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
            bundle.setFlags(0x24000000);
        } else
        {
            if ("ATML".equalsIgnoreCase(s1))
            {
                if (WFApp.d())
                {
                    bundle = new Intent(this, com/wf/wellsfargomobile/locations/LocationListActivity);
                } else
                {
                    bundle = new Intent(this, com/wf/wellsfargomobile/WebViewActivity);
                    bundle.putExtra("webatmloc_request", true);
                }
            } else
            {
                bundle = new Intent(this, com/wf/wellsfargomobile/MainActivity);
            }
            bundle.setFlags(0x14000000);
        }
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putExtra("PNSDEST", s1);
            if (!TextUtils.isEmpty(s))
            {
                bundle.putExtra("PNSTOKEN", s);
            }
        }
        startActivity(bundle);
        finish();
    }
}
