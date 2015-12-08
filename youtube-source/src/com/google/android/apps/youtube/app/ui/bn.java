// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;

final class bn
    implements android.content.DialogInterface.OnClickListener
{

    bn()
    {
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
