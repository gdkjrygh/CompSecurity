// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet.contactpicker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.safetynet.contactpicker:
//            ContactPickerFragment

final class a
    implements android.widget.ntactPickerFragment..ViewInjector._cls1
{

    final ContactPickerFragment a;
    final a b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onItemClick(i);
    }

    ( , ContactPickerFragment contactpickerfragment)
    {
        b = ;
        a = contactpickerfragment;
        super();
    }
}
