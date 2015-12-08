// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.hcewallet.d.i;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            a

public class WalletErrorCVActivity extends BaseActionBarActivity
{

    private final String b = "WalletErrorCV";
    private String c;

    public WalletErrorCVActivity()
    {
        c = "";
    }

    protected void a()
    {
        super.a();
        View view = getLayoutInflater().inflate(0x7f04002b, null);
        TextView textview = (TextView)view.findViewById(0x7f0f0086);
        LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0f0087);
        textview.setVisibility(8);
        linearlayout.setOnClickListener(new com.wf.wellsfargomobile.hcewallet.activity.a(this));
        a.a(view);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04002d);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            c = bundle.getString("WALLET_INTENT_CV_ERROR");
        }
        ((TextView)findViewById(0x7f0f0088)).setText(i.handleErrorMessage(c));
    }
}
