// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.c;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPayNowActivity;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.c:
//            i, j

public class h extends DialogFragment
{

    Handler a;
    private j b;
    private Runnable c;

    public h()
    {
        c = new i(this);
    }

    static j a(h h1)
    {
        return h1.b;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b = (WalletPayNowActivity)activity;
        a = new Handler();
        a.postDelayed(c, 1000L);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x103000f);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().getWindow().setGravity(17);
        return layoutinflater.inflate(0x7f04002f, viewgroup, false);
    }

    public void onDetach()
    {
        super.onDetach();
        b.a(true);
        a.removeCallbacks(c);
    }
}
