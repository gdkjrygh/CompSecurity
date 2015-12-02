// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.ubercab.client.core.vendor.google.GoogleApiActivity;

public final class dwl extends DialogFragment
{

    public dwl()
    {
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        return rz.a(getArguments().getInt("dialog_error"), getActivity());
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        ((GoogleApiActivity)getActivity()).f();
    }
}
