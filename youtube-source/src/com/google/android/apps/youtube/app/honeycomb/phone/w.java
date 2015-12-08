// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class w
    implements android.content.DialogInterface.OnClickListener
{

    final EditText a;
    final ScreenManagementActivity.RenameScreenDialogFragment b;

    w(ScreenManagementActivity.RenameScreenDialogFragment renamescreendialogfragment, EditText edittext)
    {
        b = renamescreendialogfragment;
        a = edittext;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ((InputMethodManager)b.i().getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
    }
}
