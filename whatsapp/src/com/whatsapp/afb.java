// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.whatsapp:
//            g9, App, vb

class afb
    implements Runnable
{

    final DialogToastFragmentActivity.ProgressDialogFragment a;
    final g9 b;

    afb(g9 g9_1, DialogToastFragmentActivity.ProgressDialogFragment progressdialogfragment)
    {
        b = g9_1;
        a = progressdialogfragment;
        super();
    }

    public void run()
    {
        App.a(b.a.getActivity());
        a.getActivity().runOnUiThread(new vb(this));
    }
}
