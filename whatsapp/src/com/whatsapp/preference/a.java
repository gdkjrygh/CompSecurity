// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp.preference:
//            WaMultiSelectListPreference

class a
    implements android.content.DialogInterface.OnMultiChoiceClickListener
{

    final WaMultiSelectListPreference a;

    a(WaMultiSelectListPreference wamultiselectlistpreference)
    {
        a = wamultiselectlistpreference;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i, boolean flag)
    {
        WaMultiSelectListPreference.a(a)[i] = flag;
    }
}
