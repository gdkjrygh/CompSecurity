// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.ak;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, App

class uo
    implements android.view.View.OnClickListener
{

    final LocationPicker2 a;

    uo(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onClick(View view)
    {
        App.a(a, LocationPicker2.p(a), LocationPicker2.w(a));
        LocationPicker2.a(a, ak.CUSTOM_LOCATION);
        a.finish();
    }
}
