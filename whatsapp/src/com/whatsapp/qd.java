// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

class qd
    implements android.content.DialogInterface.OnClickListener
{

    final DialogToastFragmentActivity.MessageDialogFragment a;

    qd(DialogToastFragmentActivity.MessageDialogFragment messagedialogfragment)
    {
        a = messagedialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
