// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Point;
import android.location.Location;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.protocol.cr;

// Referenced classes of package com.whatsapp:
//            td, App, GroupChatLiveLocationsActivity2, GoogleMapView2, 
//            a1g

class t9 extends td
{

    final GroupChatLiveLocationsActivity2 p;

    t9(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        p = groupchatlivelocationsactivity2;
        super();
    }

    public void a(cr cr1, boolean flag)
    {
label0:
        {
            LatLng latlng;
label1:
            {
                int i;
label2:
                {
                    i = App.am;
                    GroupChatLiveLocationsActivity2.a(p, cr1);
                    GroupChatLiveLocationsActivity2.a(p, true);
                    GroupChatLiveLocationsActivity2.g(p).setLocationMode(2);
                    latlng = new LatLng(cr1.e, cr1.d);
                    if (!flag || GroupChatLiveLocationsActivity2.f(p).getCameraPosition().zoom >= 17F)
                    {
                        break label1;
                    }
                    Point point = GroupChatLiveLocationsActivity2.f(p).getProjection().toScreenLocation(latlng);
                    if (point.x <= 0 || point.y <= 0 || point.x >= GroupChatLiveLocationsActivity2.g(p).getWidth() || point.y >= GroupChatLiveLocationsActivity2.g(p).getHeight())
                    {
                        GroupChatLiveLocationsActivity2.f(p).animateCamera(CameraUpdateFactory.newLatLng(latlng));
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    float f = GroupChatLiveLocationsActivity2.a(p, cr1.c);
                    GroupChatLiveLocationsActivity2.f(p).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latlng).zoom(f).build()));
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            GroupChatLiveLocationsActivity2.f(p).animateCamera(CameraUpdateFactory.newLatLng(latlng));
        }
        GroupChatLiveLocationsActivity2.j(p);
    }

    public Location c()
    {
        return GroupChatLiveLocationsActivity2.f(p).getMyLocation();
    }

    public void e()
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
                    i = App.am;
                    GroupChatLiveLocationsActivity2.j(p);
                    if (GroupChatLiveLocationsActivity2.h(p) == null)
                    {
                        break label1;
                    }
                    LatLng latlng = new LatLng(GroupChatLiveLocationsActivity2.h(p).e, GroupChatLiveLocationsActivity2.h(p).d);
                    Point point = GroupChatLiveLocationsActivity2.f(p).getProjection().toScreenLocation(latlng);
                    int j = (int)(a1g.a().g * 48F);
                    if (point.x >= j && point.y >= j && point.x <= GroupChatLiveLocationsActivity2.g(p).getWidth() - j && point.y <= GroupChatLiveLocationsActivity2.g(p).getHeight() - j)
                    {
                        break label2;
                    }
                    float f = GroupChatLiveLocationsActivity2.a(p, GroupChatLiveLocationsActivity2.h(p).c);
                    if (f > GroupChatLiveLocationsActivity2.f(p).getCameraPosition().zoom)
                    {
                        GroupChatLiveLocationsActivity2.f(p).animateCamera(CameraUpdateFactory.newLatLng(latlng));
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    GroupChatLiveLocationsActivity2.f(p).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latlng).zoom(f).build()));
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            if (!GroupChatLiveLocationsActivity2.e(p))
            {
                GroupChatLiveLocationsActivity2.i(p);
            }
        }
    }
}
