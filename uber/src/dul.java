// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.City;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.FareSplit;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.TripPendingRating;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.List;
import java.util.Map;

public final class dul
{

    public static boolean a(Ping ping)
    {
        return ping != null && ping.getClient() != null && !TextUtils.isEmpty(ping.getClient().getUuid());
    }

    public static boolean a(Ping ping, int i1)
    {
        return ping != null && ping.getErrorCode() != null && ping.getErrorCode().intValue() == i1;
    }

    public static boolean a(Ping ping, String s1)
    {
        return t(ping) && ping.getNearbyVehicles().get(s1) != null;
    }

    public static boolean b(Ping ping)
    {
        return ping != null && ping.getAppConfig() != null;
    }

    public static boolean b(Ping ping, String s1)
    {
        return h(ping) && ping.getCity().findVehicleViewById(s1) != null;
    }

    public static boolean c(Ping ping)
    {
        return ping != null && ping.getAppConfig() != null && ping.getAppConfig().getRiderConfig() != null;
    }

    public static boolean c(Ping ping, String s1)
    {
        return b(ping, s1) && ping.getCity().findVehicleViewById(s1).getFare() != null;
    }

    public static boolean d(Ping ping)
    {
        return ping != null && ping.getCity() != null && !TextUtils.isEmpty(ping.getCity().getCityName());
    }

    public static boolean d(Ping ping, String s1)
    {
        if (!b(ping, s1))
        {
            return false;
        }
        ping = ping.getCity().findVehicleViewById(s1);
        if (ping instanceof Shape_VehicleView)
        {
            ping = ((Shape_VehicleView)ping).getSurge();
        } else
        {
            ping = null;
        }
        return ping != null && ping.getMultiplier() > 1.0F;
    }

    public static boolean e(Ping ping)
    {
        return h(ping) && !ping.getCity().getVehicleViews().isEmpty();
    }

    public static boolean f(Ping ping)
    {
        return ping != null && ping.getTrip() != null;
    }

    public static boolean g(Ping ping)
    {
        return s(ping) && ping.getTrip().getDriver().getCapabilities() != null;
    }

    public static boolean h(Ping ping)
    {
        return d(ping) && ping.getCity().getVehicleViews() != null;
    }

    public static boolean i(Ping ping)
    {
        return a(ping) && !"Looking".equals(ping.getClient().getStatus());
    }

    public static boolean j(Ping ping)
    {
        while (!a(ping) || ping.getClient().getTripPendingRating() == null || TextUtils.isEmpty(ping.getClient().getTripPendingRating().getId())) 
        {
            return false;
        }
        return true;
    }

    public static boolean k(Ping ping)
    {
        return a(ping) && ping.getClient().getPaymentProfiles() != null;
    }

    public static boolean l(Ping ping)
    {
        return i(ping) && ping.getFareSplit() != null && ping.getFareSplit().getClients() != null && !ping.getFareSplit().getClients().isEmpty();
    }

    public static boolean m(Ping ping)
    {
        return a(ping) && ping.getClient().getLastEstimatedTrip() != null;
    }

    public static boolean n(Ping ping)
    {
        return ping != null && ping.getSession() != null;
    }

    public static boolean o(Ping ping)
    {
        return !l(ping) || ping.getFareSplit().getClientSelf() != null && ping.getFareSplit().getClientSelf().getIsInitiator();
    }

    public static boolean p(Ping ping)
    {
        return b(ping) && ping.getAppConfig().getPingUpdateIntervalMs() != null;
    }

    public static boolean q(Ping ping)
    {
        return f(ping) && ping.getTrip().getLegs() != null && ping.getTrip().getLegs().size() > 1;
    }

    public static boolean r(Ping ping)
    {
        return ping != null && ping.getApiResponse() != null && ping.getApiResponse().isSuccess();
    }

    private static boolean s(Ping ping)
    {
        return f(ping) && ping.getTrip().getDriver() != null;
    }

    private static boolean t(Ping ping)
    {
        return ping != null && ping.getNearbyVehicles() != null && ping.getNearbyVehicles().size() > 0;
    }
}
