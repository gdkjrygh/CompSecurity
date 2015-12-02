// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google;

import android.content.Intent;
import android.os.Bundle;
import baf;
import com.google.android.gms.common.ConnectionResult;
import com.ubercab.client.core.app.RiderActivity;
import dwl;
import sq;
import sr;
import ss;
import st;

public abstract class GoogleApiActivity extends RiderActivity
    implements ss, st
{

    public sq h;
    private boolean i;
    private boolean j;

    public GoogleApiActivity()
    {
        i = false;
    }

    private void c(int k)
    {
        dwl dwl1 = new dwl();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_error", k);
        dwl1.setArguments(bundle);
        dwl1.show(getSupportFragmentManager(), "errordialog");
    }

    public final void a(int k)
    {
    }

    public final void a(ConnectionResult connectionresult)
    {
        if (!i)
        {
            if (connectionresult.a())
            {
                try
                {
                    i = true;
                    connectionresult.a(this, 1001);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ConnectionResult connectionresult)
                {
                    h.b();
                }
                return;
            }
            if (j)
            {
                c(connectionresult.c());
                i = true;
                return;
            }
        }
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        sr sr1 = (new sr(this)).a(this).a(this).a(baf.c).a(baf.d).a(baf.e);
        if (getIntent().hasExtra("com.ubercab.ACCOUNT_NAME"))
        {
            sr1.a(getIntent().getStringExtra("com.ubercab.ACCOUNT_NAME"));
        }
        h = sr1.b();
        if (bundle != null)
        {
            i = bundle.getBoolean("resolving_error", false);
        }
    }

    public final void f()
    {
        i = false;
        setResult(0);
        finish();
    }

    protected void onActivityResult(int k, int l, Intent intent)
    {
label0:
        {
            super.onActivityResult(k, l, intent);
            if (k == 1001)
            {
                i = false;
                if (l != -1)
                {
                    break label0;
                }
                if (!h.e() && !h.d())
                {
                    h.b();
                }
            }
            return;
        }
        setResult(l);
        finish();
    }

    public void onPause()
    {
        super.onPause();
        j = false;
    }

    public void onResume()
    {
        super.onResume();
        j = true;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", i);
    }

    protected void onStart()
    {
        super.onStart();
        if (!i)
        {
            h.b();
        }
    }

    protected void onStop()
    {
        if (h != null && h.d())
        {
            h.c();
        }
        super.onStop();
    }
}
