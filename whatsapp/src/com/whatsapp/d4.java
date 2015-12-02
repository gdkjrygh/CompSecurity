// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            LocationPicker, as7

class d4
    implements android.view.View.OnClickListener
{

    final LocationPicker a;

    d4(LocationPicker locationpicker)
    {
        a = locationpicker;
        super();
    }

    public void onClick(View view)
    {
        LocationPicker.h(a).runOnFirstFix(new as7(this));
    }
}
