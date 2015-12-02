// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp.preference:
//            WaFontListPreference

class b
    implements android.content.DialogInterface.OnClickListener
{

    final WaFontListPreference a;

    b(WaFontListPreference wafontlistpreference)
    {
        a = wafontlistpreference;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        WaFontListPreference.a(a, i);
        a.onClick(dialoginterface, -1);
        dialoginterface.dismiss();
    }
}
