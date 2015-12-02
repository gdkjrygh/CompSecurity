// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.whatsapp:
//            GoogleMapView2, App, LocationPicker2

class gleMapOptions extends GoogleMapView2
{

    final LocationPicker2 n;

    public void a(int i)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 49
    //                   2 65;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        LocationPicker2.A(n).setImageResource(0x7f0200c0);
        if (j == 0) goto _L1; else goto _L3
_L3:
        LocationPicker2.A(n).setImageResource(0x7f0200bd);
        if (j == 0) goto _L1; else goto _L4
_L4:
        LocationPicker2.A(n).setImageResource(0x7f0200e1);
        return;
    }

    gleMapOptions(LocationPicker2 locationpicker2, Context context, GoogleMapOptions googlemapoptions)
    {
        n = locationpicker2;
        super(context, googlemapoptions);
    }
}
