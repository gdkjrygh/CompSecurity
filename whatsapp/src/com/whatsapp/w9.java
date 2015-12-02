// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            pc

class w9
    implements android.content.DialogInterface.OnClickListener
{

    final CallsFragment.ClearCallLogDialogFragment a;

    w9(CallsFragment.ClearCallLogDialogFragment clearcalllogdialogfragment)
    {
        a = clearcalllogdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new DialogToastFragmentActivity.ProgressDialogFragment();
        dialoginterface.show(a.getFragmentManager(), null);
        x.a(new pc(this, dialoginterface));
    }
}
