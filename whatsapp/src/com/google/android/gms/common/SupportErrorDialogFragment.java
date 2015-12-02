// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil

public class SupportErrorDialogFragment extends DialogFragment
{

    private android.content.DialogInterface.OnCancelListener Iw;
    private Dialog mDialog;

    public SupportErrorDialogFragment()
    {
        mDialog = null;
        Iw = null;
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        int i = GooglePlayServicesUtil.a;
        SupportErrorDialogFragment supporterrordialogfragment = new SupportErrorDialogFragment();
        dialog = (Dialog)jx.b(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supporterrordialogfragment.mDialog = dialog;
        if (oncancellistener != null)
        {
            supporterrordialogfragment.Iw = oncancellistener;
        }
        if (jx.a != 0)
        {
            GooglePlayServicesUtil.a = i + 1;
        }
        return supporterrordialogfragment;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (Iw != null)
        {
            Iw.onCancel(dialoginterface);
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
