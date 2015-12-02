// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

class w6
    implements android.content.DialogInterface.OnClickListener
{

    final ConversationsFragment.ExitGroupDialogFragment a;

    w6(ConversationsFragment.ExitGroupDialogFragment exitgroupdialogfragment)
    {
        a = exitgroupdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
