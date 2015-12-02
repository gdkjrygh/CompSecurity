// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.preference:
//            WaPreference

public class WaDialogPreference extends DialogPreference
{

    private android.content.DialogInterface.OnClickListener a;

    public WaDialogPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
    }

    public void a(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a = onclicklistener;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (a != null)
        {
            a.onClick(dialoginterface, i);
        }
        super.onClick(dialoginterface, i);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return WaPreference.a(super.onCreateView(viewgroup));
    }
}
