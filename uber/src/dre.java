// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.List;

public final class dre
{

    public static int a(City city, Trip trip)
    {
        city = drf.a(city, trip);
        if (city == null)
        {
            return 0;
        } else
        {
            return city.getMaxFareSplits();
        }
    }

    public static FareSplit a(ClientStatus clientstatus, Eyeball eyeball, Trip trip)
    {
        boolean flag1 = true;
        boolean flag;
        if (clientstatus != null && "Looking".equals(clientstatus.getStatus()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (trip == null || trip.getFareSplit() == null)
        {
            flag1 = false;
        }
        if (!flag && flag1)
        {
            return trip.getFareSplit();
        }
        if (eyeball != null)
        {
            return eyeball.getFareSplit();
        } else
        {
            return null;
        }
    }

    public static boolean a(FareSplit faresplit)
    {
        if (faresplit != null && !faresplit.getClients().isEmpty())
        {
            if ((faresplit = faresplit.getClientSelf()) == null || !faresplit.getIsInitiator())
            {
                return false;
            }
        }
        return true;
    }
}
