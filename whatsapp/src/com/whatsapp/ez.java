// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, c9

class ez
    implements android.content.DialogInterface.OnClickListener
{

    final DialogToastActivity a;

    ez(DialogToastActivity dialogtoastactivity)
    {
        a = dialogtoastactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(500);
        if (DialogToastActivity.a(a) != null)
        {
            DialogToastActivity.a(a).a();
        }
    }
}
