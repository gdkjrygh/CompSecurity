// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

// Referenced classes of package de.greenrobot.event.util:
//            l

public class  extends DialogFragment
    implements android.content.
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        l.a(dialoginterface, i, getActivity(), getArguments());
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return l.a(getActivity(), getArguments(), this);
    }

    public ()
    {
    }
}
