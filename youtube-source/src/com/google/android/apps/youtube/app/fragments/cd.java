// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.DialogInterface;

final class cd
    implements android.content.DialogInterface.OnClickListener
{

    final WatchHistoryFragment.ClearHistoryDialogFragment a;

    cd(WatchHistoryFragment.ClearHistoryDialogFragment clearhistorydialogfragment)
    {
        a = clearhistorydialogfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            WatchHistoryFragment.ClearHistoryDialogFragment.a(a);
        }
    }
}
