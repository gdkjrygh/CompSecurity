// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.slider.FareDetailsPopupWindow;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Map;

public final class gdl
    implements ide
{

    final FareDetailsPopupWindow a;

    private gdl(FareDetailsPopupWindow faredetailspopupwindow)
    {
        a = faredetailspopupwindow;
        super();
    }

    public gdl(FareDetailsPopupWindow faredetailspopupwindow, byte byte0)
    {
        this(faredetailspopupwindow);
    }

    private void a(gdm gdm1)
    {
        boolean flag1 = true;
        Object obj = (City)gdm1.a.d();
        Eyeball eyeball = (Eyeball)gdm1.b.d();
        if (obj != null)
        {
            gdm1 = ((City) (obj)).findVehicleViewById(FareDetailsPopupWindow.a(a));
        } else
        {
            gdm1 = null;
        }
        if (gdm1 == null)
        {
            a.dismiss();
            return;
        }
        boolean flag;
        if (gdm1.getFare() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (eyeball != null)
        {
            obj = eyeball.getNearbyVehicles();
        } else
        {
            obj = null;
        }
        if (obj == null || ((Map) (obj)).get(FareDetailsPopupWindow.a(a)) == null)
        {
            flag1 = false;
        }
        if (eyeball != null)
        {
            obj = eyeball.getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = (DynamicFare)((Map) (obj)).get(FareDetailsPopupWindow.a(a));
        } else
        {
            obj = null;
        }
        FareDetailsPopupWindow.a(a, flag1, flag, gdm1, ((DynamicFare) (obj)));
    }

    public final void call(Object obj)
    {
        a((gdm)obj);
    }
}
