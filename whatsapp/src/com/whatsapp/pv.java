// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

class pv
    implements android.content.DialogInterface.OnClickListener
{

    final VoipNotAllowedActivity.VoipNotAllowedDialogFragment a;

    pv(VoipNotAllowedActivity.VoipNotAllowedDialogFragment voipnotalloweddialogfragment)
    {
        a = voipnotalloweddialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
