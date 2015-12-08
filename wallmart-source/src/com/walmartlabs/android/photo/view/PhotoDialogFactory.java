// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;

public class PhotoDialogFactory
{

    public PhotoDialogFactory()
    {
    }

    public static Dialog createProgressOnlyDialog(Context context)
    {
        Dialog dialog = new Dialog(context, com.walmartlabs.android.photo.R.style.ProgressOnlyDialog);
        dialog.setContentView(((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.walmartlabs.android.photo.R.layout.photo_progress_dialog, null));
        dialog.setCancelable(false);
        return dialog;
    }
}
