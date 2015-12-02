// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.whatsapp:
//            App, my

class tj
    implements android.content.DialogInterface.OnClickListener
{

    final WebSessionsActivity.LogoutAllConfirmationDialogFragment a;

    tj(WebSessionsActivity.LogoutAllConfirmationDialogFragment logoutallconfirmationdialogfragment)
    {
        a = logoutallconfirmationdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        App.c(true);
        my.n();
        a.getActivity().finish();
    }
}
