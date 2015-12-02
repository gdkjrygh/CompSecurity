// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

public class ClipboardShareActivity extends Activity
{

    public ClipboardShareActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getData();
        if (bundle != null && "copy".equals(bundle.getHost()))
        {
            bundle = getIntent().getData().getQueryParameter("text");
            if (!TextUtils.isEmpty(bundle))
            {
                ((ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(getString(0x7f0703ef), bundle));
                Toast.makeText(this, getString(0x7f0703f0), 0).show();
            }
        }
        finish();
    }
}
