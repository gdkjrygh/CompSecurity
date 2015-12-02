// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.whatsapp:
//            sy

public class  extends DialogFragment
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.app.(getActivity())).getActivity(0x7f0e022f).getActivity(false).getActivity(0x7f0e02be, new sy(this)).();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        dialoginterface = getActivity();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }

    public ()
    {
    }
}
