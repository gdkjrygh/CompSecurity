// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package de.greenrobot.event.util:
//            ErrorDialogFragments

public static class  extends DialogFragment
    implements android.content.er
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ErrorDialogFragments.handleOnClick(dialoginterface, i, getActivity(), getArguments());
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return ErrorDialogFragments.createDialog(getActivity(), getArguments(), this);
    }

    public ()
    {
    }
}
