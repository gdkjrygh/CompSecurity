// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.zzu;

public class SupportErrorDialogFragment extends DialogFragment
{

    private Dialog mDialog;
    private android.content.DialogInterface.OnCancelListener zzVH;

    public SupportErrorDialogFragment()
    {
        mDialog = null;
        zzVH = null;
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog)
    {
        return newInstance(dialog, null);
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        SupportErrorDialogFragment supporterrordialogfragment = new SupportErrorDialogFragment();
        dialog = (Dialog)zzu.zzb(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supporterrordialogfragment.mDialog = dialog;
        if (oncancellistener != null)
        {
            supporterrordialogfragment.zzVH = oncancellistener;
        }
        return supporterrordialogfragment;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (zzVH != null)
        {
            zzVH.onCancel(dialoginterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (mDialog == null)
        {
            setShowsDialog(false);
        }
        return mDialog;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }
}
