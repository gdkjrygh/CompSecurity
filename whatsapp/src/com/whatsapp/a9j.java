// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, GoogleMapView2

class a9j
    implements android.view.View.OnClickListener
{

    final LocationPicker2 a;

    a9j(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onClick(View view)
    {
        LocationPicker2.b(a).a();
    }
}
