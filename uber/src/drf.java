// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Image;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.List;

public final class drf
{

    public static Uri a(Context context, VehicleView vehicleview)
    {
        vehicleview = vehicleview.getMonoImages();
        if (vehicleview.isEmpty())
        {
            return Uri.EMPTY;
        }
        if (TextUtils.isEmpty(((Image)vehicleview.get(0)).getUrl()))
        {
            return Uri.EMPTY;
        } else
        {
            context = context.getPackageName();
            vehicleview = a((Image)vehicleview.get(0));
            return (new android.net.Uri.Builder()).scheme("android.resource").authority(context).appendPath("drawable").appendPath(vehicleview).build();
        }
    }

    public static Uri a(VehicleView vehicleview)
    {
        vehicleview = vehicleview.getMonoImages();
        if (vehicleview.isEmpty())
        {
            return Uri.EMPTY;
        }
        vehicleview = ((Image)vehicleview.get(0)).getUrl();
        if (TextUtils.isDigitsOnly(vehicleview))
        {
            return Uri.EMPTY;
        } else
        {
            return Uri.parse(vehicleview.trim());
        }
    }

    public static VehicleView a(City city, Trip trip)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj = obj2;
        if (city != null)
        {
            if (trip == null)
            {
                obj = obj2;
            } else
            {
                trip = trip.getVehicle();
                if (trip == null)
                {
                    trip = obj1;
                } else
                {
                    trip = trip.getVehicleViewId();
                }
                trip = city.findVehicleViewById(trip);
                obj = trip;
                if (trip == null)
                {
                    return city.findVehicleViewById(city.getDefaultVehicleViewId());
                }
            }
        }
        return ((VehicleView) (obj));
    }

    private static String a(Image image)
    {
        image = image.getUrl();
        int i = image.lastIndexOf("/");
        if (i != -1)
        {
            image = image.substring(i + 1, image.length());
        }
        i = image.lastIndexOf(".");
        if (i != -1)
        {
            image = image.substring(0, i);
        }
        return image.replace("-", "_");
    }

    public static Uri b(Context context, VehicleView vehicleview)
    {
        vehicleview = vehicleview.getMapImages();
        if (vehicleview.isEmpty())
        {
            return Uri.EMPTY;
        }
        if (TextUtils.isEmpty(((Image)vehicleview.get(0)).getUrl()))
        {
            return Uri.EMPTY;
        } else
        {
            context = context.getPackageName();
            vehicleview = a((Image)vehicleview.get(0));
            return (new android.net.Uri.Builder()).scheme("android.resource").authority(context).appendPath("drawable").appendPath(vehicleview).build();
        }
    }

    public static Uri b(VehicleView vehicleview)
    {
        vehicleview = vehicleview.getMapImages();
        if (vehicleview.isEmpty())
        {
            return Uri.EMPTY;
        }
        vehicleview = ((Image)vehicleview.get(0)).getUrl();
        if (TextUtils.isDigitsOnly(vehicleview))
        {
            return Uri.EMPTY;
        } else
        {
            return Uri.parse(vehicleview.trim());
        }
    }
}
