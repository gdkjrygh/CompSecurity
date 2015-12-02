// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Canvas;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, GroupChatLiveLocationsActivity, td

class aoq extends ItemizedOverlay
{

    final GroupChatLiveLocationsActivity a;

    public aoq(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        a = groupchatlivelocationsactivity;
        super(boundCenter(App.au.getResources().getDrawable(0x7f020599)));
    }

    public void a()
    {
        populate();
    }

    protected OverlayItem createItem(int i)
    {
        OverlayItem overlayitem;
label0:
        {
            cr cr1 = (cr)GroupChatLiveLocationsActivity.f(a).e.get(i);
            overlayitem = new OverlayItem(new GeoPoint((int)(cr1.e * 1000000D), (int)(cr1.d * 1000000D)), "", "");
            if (cr1.i + 0x1b7740L > System.currentTimeMillis())
            {
                overlayitem.setMarker(boundCenter(App.au.getResources().getDrawable(0x7f020599)));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            overlayitem.setMarker(boundCenter(App.au.getResources().getDrawable(0x7f02059a)));
        }
        return overlayitem;
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

    public int size()
    {
        return GroupChatLiveLocationsActivity.f(a).e.size();
    }
}
