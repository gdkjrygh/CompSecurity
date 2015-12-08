// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface:
//            e, d, a

class c extends DialogFragment
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(0x7f0800f6).setMessage(0x7f0800f7).setPositiveButton(0x1040013, new e(this)).setNegativeButton(0x1040009, new d(this));
        return bundle.create();
    }
}
