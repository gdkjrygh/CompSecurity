// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.f;

public final class aa extends android.app.AlertDialog.Builder
{

    private View a;

    public aa(Context context)
    {
        super(context);
    }

    public final AlertDialog create()
    {
        AlertDialog alertdialog = super.create();
        if (a != null && a.getBackground() == null)
        {
            a.setBackgroundColor(a.getResources().getColor(f.c));
        }
        alertdialog.setView(a, 0, 0, 0, 0);
        return alertdialog;
    }

    public final android.app.AlertDialog.Builder setView(View view)
    {
        a = view;
        return super.setView(view);
    }
}
