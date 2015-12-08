// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;

final class aa
    implements TextWatcher
{

    final ScreenManagementActivity.RenameScreenDialogFragment a;

    private aa(ScreenManagementActivity.RenameScreenDialogFragment renamescreendialogfragment)
    {
        a = renamescreendialogfragment;
        super();
    }

    aa(ScreenManagementActivity.RenameScreenDialogFragment renamescreendialogfragment, byte byte0)
    {
        this(renamescreendialogfragment);
    }

    public final void afterTextChanged(Editable editable)
    {
        Button button = ((AlertDialog)a.b()).getButton(-1);
        boolean flag;
        if (editable != null && !TextUtils.isEmpty(editable.toString().trim()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
