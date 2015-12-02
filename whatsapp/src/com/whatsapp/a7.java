// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.whatsapp:
//            pw, App, ok

class a7
    implements Runnable
{

    final DialogToastFragmentActivity.ProgressDialogFragment a;
    final pw b;

    a7(pw pw1, DialogToastFragmentActivity.ProgressDialogFragment progressdialogfragment)
    {
        b = pw1;
        a = progressdialogfragment;
        super();
    }

    public void run()
    {
        App.b(b.a.getActivity());
        a.getActivity().runOnUiThread(new ok(this));
    }
}
