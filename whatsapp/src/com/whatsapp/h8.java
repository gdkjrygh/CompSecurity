// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.widget.ListView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

// Referenced classes of package com.whatsapp:
//            App, f, LocationPicker, t3, 
//            PlaceInfo, afc

class h8 extends ItemizedOverlay
{

    final LocationPicker a;

    public h8(LocationPicker locationpicker)
    {
        a = locationpicker;
        super(boundCenter(App.au.getResources().getDrawable(0x7f02063e)));
        setOnFocusChangeListener(new f(this, locationpicker));
    }

    public void a()
    {
        setLastFocusedIndex(-1);
        populate();
    }

    protected OverlayItem createItem(int i)
    {
        Object obj = (PlaceInfo)LocationPicker.n(a).get(i);
        obj = new OverlayItem(new GeoPoint((int)(((PlaceInfo) (obj)).lat * 1000000D), (int)(((PlaceInfo) (obj)).lon * 1000000D)), "", "");
        ((OverlayItem) (obj)).setMarker(boundCenter(App.au.getResources().getDrawable(0x7f02063e)));
        return ((OverlayItem) (obj));
    }

    public void draw(Canvas canvas, MapView mapview, boolean flag)
    {
        if (flag)
        {
            return;
        } else
        {
            super.draw(canvas, mapview, flag);
            return;
        }
    }

    protected boolean onTap(int i)
    {
label0:
        {
            LocationPicker.a(a, (PlaceInfo)LocationPicker.n(a).get(i));
            LocationPicker.g(a).notifyDataSetChanged();
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                LocationPicker.i(a).smoothScrollToPosition(i);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            LocationPicker.i(a).setSelection(i);
        }
        return true;
    }

    public int size()
    {
        if (LocationPicker.n(a) == null)
        {
            return 0;
        } else
        {
            return LocationPicker.n(a).size();
        }
    }
}
