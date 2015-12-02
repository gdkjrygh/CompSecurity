// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.whatsapp:
//            zd

public class  extends DialogFragment
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.(getActivity());
        String as[] = getResources().getStringArray(0x7f070009);
        bundle.getResources(as, new zd(this, as));
        bundle = bundle.();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }

    public ()
    {
    }
}
