// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

class qc
    implements android.content.DialogInterface.OnClickListener
{

    final ConversationsFragment.ViewContactsNotSupportedDialogFragment a;

    qc(ConversationsFragment.ViewContactsNotSupportedDialogFragment viewcontactsnotsupporteddialogfragment)
    {
        a = viewcontactsnotsupporteddialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
