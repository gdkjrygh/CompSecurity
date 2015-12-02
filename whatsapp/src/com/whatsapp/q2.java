// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            ew, WebImagePicker

class q2
    implements android.content.DialogInterface.OnCancelListener
{

    final ew a;

    q2(ew ew1)
    {
        a = ew1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (ew.a(a) != null)
        {
            ew.a(a).dismiss();
        }
        ew.a(a, null);
        a.cancel(true);
        if (WebImagePicker.b(a.a) == a)
        {
            WebImagePicker.a(a.a, null);
        }
    }
}
