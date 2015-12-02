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
import com.whatsapp.protocol.c4;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, GroupChatRecentLocationsActivity

class a__ extends ItemizedOverlay
{

    final GroupChatRecentLocationsActivity a;

    public a__(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
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
            int j = App.am;
            c4 c4_1 = (c4)GroupChatRecentLocationsActivity.g(a).get(i);
            overlayitem = new OverlayItem(new GeoPoint((int)(c4_1.o * 1000000D), (int)(c4_1.v * 1000000D)), "", "");
            if (c4_1.I + 0x36ee80L > System.currentTimeMillis())
            {
                overlayitem.setMarker(boundCenter(App.au.getResources().getDrawable(0x7f020599)));
                if (j == 0)
                {
                    break label0;
                }
            }
            if (c4_1.I + 0x2932e00L > System.currentTimeMillis())
            {
                overlayitem.setMarker(boundCenter(App.au.getResources().getDrawable(0x7f02059a)));
                if (j == 0)
                {
                    break label0;
                }
            }
            overlayitem.setMarker(boundCenter(App.au.getResources().getDrawable(0x7f02059b)));
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
        return GroupChatRecentLocationsActivity.g(a).size();
    }
}
