// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;

import android.content.Context;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.maps.model.LatLng;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationUtils
{
    public static class AddressSearchResult
    {

        public static final int ERROR_NO_ADDRESSES_FOUND = 3;
        public static final int ERROR_NO_NETWORK = 1;
        public static final int ERROR_SERVICE_UNAVAILABLE = 2;
        private Address mAddress;
        private int mError;

        public Address getAddress()
        {
            return mAddress;
        }

        public int getError()
        {
            return mError;
        }

        public boolean hasAddress()
        {
            return mAddress != null;
        }

        public AddressSearchResult(Context context, List list)
        {
            if (list != null)
            {
                if (list.size() == 0)
                {
                    mError = 3;
                }
            } else
            {
                context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (context == null || !context.isConnected())
                {
                    mError = 1;
                } else
                {
                    mError = 2;
                }
            }
            if (mError == 0)
            {
                context = null;
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    list = (Address)iterator.next();
                    context = list;
                    if (!"US".equals(list.getCountryCode()))
                    {
                        continue;
                    }
                    context = list;
                    break;
                } while (true);
                mAddress = context;
            }
        }
    }


    public LocationUtils()
    {
    }

    public static AddressSearchResult getAddress(Context context, String s)
    {
        Geocoder geocoder = new Geocoder(context);
        new ArrayList();
        try
        {
            s = geocoder.getFromLocationName(s, 5);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = null;
        }
        return new AddressSearchResult(context, s);
    }

    public static LatLng getLastKnownCoordinates(Context context)
    {
        return locationToCoordinates(getLastKnownLocation(context));
    }

    public static Location getLastKnownLocation(Context context)
    {
        LocationManager locationmanager = (LocationManager)context.getSystemService("location");
        String s = locationmanager.getBestProvider(new Criteria(), true);
        context = null;
        if (s != null)
        {
            context = locationmanager.getLastKnownLocation(s);
        }
        return context;
    }

    public static LatLng getRoundedCoordinates(LatLng latlng, double d, double d1)
    {
        double d2 = latlng.latitude;
        double d3 = latlng.longitude;
        return new LatLng(d2 - d2 % d, d3 - d3 % d1);
    }

    public static LatLng locationToCoordinates(Location location)
    {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }
}
