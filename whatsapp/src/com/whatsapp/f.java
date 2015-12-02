// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

// Referenced classes of package com.whatsapp:
//            h8, LocationPicker, afc

class f
    implements com.google.android.maps.ItemizedOverlay.OnFocusChangeListener
{

    final h8 a;
    final LocationPicker b;

    f(h8 h8_1, LocationPicker locationpicker)
    {
        a = h8_1;
        b = locationpicker;
        super();
    }

    public void onFocusChanged(ItemizedOverlay itemizedoverlay, OverlayItem overlayitem)
    {
        if (overlayitem == null)
        {
            LocationPicker.a(a.a, null);
            LocationPicker.g(a.a).notifyDataSetChanged();
        }
    }
}
