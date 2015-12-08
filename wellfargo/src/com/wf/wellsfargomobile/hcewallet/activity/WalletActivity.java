// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import com.wf.wellsfargomobile.BaseActionBarActivity;

public abstract class WalletActivity extends BaseActionBarActivity
{

    private final String b = "WalletActivity";
    private ProgressDialog c;
    private String d;

    public WalletActivity()
    {
    }

    protected void a()
    {
        super.a();
        int i = 0x7f040019;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04001a;
        }
        android.view.View view = getLayoutInflater().inflate(i, null);
        a.a(view);
    }

    protected WalletActivity b()
    {
        return this;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j == 4)
        {
            setResult(4, null);
            finish();
        } else
        {
            if (j == 29 || j == 3)
            {
                setResult(j, null);
                finish();
                return;
            }
            if (j == 26 || j == 27)
            {
                setResult(j);
                b().finish();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = new ProgressDialog(this);
        c.setCancelable(false);
        c.setCanceledOnTouchOutside(false);
    }

    protected void onDestroy()
    {
        if (c != null && c.isShowing())
        {
            c.dismiss();
            c = null;
        }
        super.onDestroy();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("PROGRESS_DIALOG_SHOW"))
        {
            d = bundle.getString("PROGRESS_DIALOG_MESSAGE");
            c.setMessage(d);
            c.show();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (c.isShowing())
        {
            bundle.putBoolean("PROGRESS_DIALOG_SHOW", true);
            bundle.putString("PROGRESS_DIALOG_MESSAGE", d);
        }
        super.onSaveInstanceState(bundle);
    }
}
