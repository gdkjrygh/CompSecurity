// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.whatsapp.util.Log;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            hw, s9, App

public class n9
{

    private static final String z[];
    private GoogleApiClient a;
    private hw b;
    private HashMap c;
    private LocationManager d;

    public n9(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            try
            {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
                {
                    b = new hw(this);
                    c = new HashMap();
                    a = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(LocationServices.API).addConnectionCallbacks(b).addOnConnectionFailedListener(b).build();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        d = (LocationManager)context.getSystemService(z[2]);
    }

    static GoogleApiClient a(n9 n9_1)
    {
        return n9_1.a;
    }

    static HashMap b(n9 n9_1)
    {
        return n9_1.c;
    }

    public Location a(int i)
    {
        GoogleApiClient googleapiclient = a;
        RuntimeException runtimeexception;
        if (googleapiclient != null)
        {
            try
            {
                if (a.isConnected())
                {
                    return LocationServices.FusedLocationApi.getLastLocation(a);
                }
            }
            catch (RuntimeException runtimeexception1)
            {
                throw runtimeexception1;
            }
        }
        break MISSING_BLOCK_LABEL_40;
        runtimeexception;
        throw runtimeexception;
        if (i == 1)
        {
            Location location;
            try
            {
                location = d.getLastKnownLocation(z[0]);
            }
            catch (RuntimeException runtimeexception2)
            {
                throw runtimeexception2;
            }
            return location;
        } else
        {
            return d.getLastKnownLocation(z[1]);
        }
    }

    public void a(int i, long l, float f, LocationListener locationlistener)
    {
        boolean flag;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        flag = c.isEmpty();
        s9 s9_1;
        if (flag)
        {
            try
            {
                a.connect();
            }
            // Misplaced declaration of an exception variable
            catch (LocationListener locationlistener)
            {
                throw locationlistener;
            }
        }
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s9_1 = new s9(l, f, flag, locationlistener);
        c.put(locationlistener, s9_1);
        if (a.isConnected())
        {
            LocationRequest locationrequest = LocationRequest.create();
            int j;
            try
            {
                flag = s9.c(s9_1);
            }
            // Misplaced declaration of an exception variable
            catch (LocationListener locationlistener)
            {
                throw locationlistener;
            }
            if (flag)
            {
                j = 100;
            } else
            {
                j = 102;
            }
            locationrequest.setPriority(j);
            locationrequest.setInterval(s9.a(s9_1));
            locationrequest.setFastestInterval(1000L);
            locationrequest.setSmallestDisplacement(s9.b(s9_1));
            LocationServices.FusedLocationApi.requestLocationUpdates(a, locationrequest, s9_1);
        }
        try
        {
            j = App.am;
        }
        // Misplaced declaration of an exception variable
        catch (LocationListener locationlistener)
        {
            throw locationlistener;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if ((i & 1) != 0)
        {
            try
            {
                d.requestLocationUpdates(z[4], l, f, locationlistener);
            }
            catch (RuntimeException runtimeexception)
            {
                Log.a(z[6], runtimeexception);
            }
        }
        if ((i & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        d.requestLocationUpdates(z[5], l, f, locationlistener);
        return;
        locationlistener;
        throw locationlistener;
        locationlistener;
        Log.a(z[3], locationlistener);
        return;
    }

    public void a(long l, float f, LocationListener locationlistener)
    {
        a(3, l, f, locationlistener);
    }

    public void a(LocationListener locationlistener)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s9 s9_1 = (s9)c.remove(locationlistener);
        if (s9_1 != null)
        {
            try
            {
                if (a.isConnected())
                {
                    LocationServices.FusedLocationApi.removeLocationUpdates(a, s9_1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (LocationListener locationlistener)
            {
                throw locationlistener;
            }
            try
            {
                if (c.isEmpty())
                {
                    a.disconnect();
                }
            }
            // Misplaced declaration of an exception variable
            catch (LocationListener locationlistener)
            {
                throw locationlistener;
            }
        }
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        d.removeUpdates(locationlistener);
        return;
        locationlistener;
        throw locationlistener;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "\030@U";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\021URVZ\r[";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\023_E@A\026_H";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\031EUDQ\023_E@A\026_HQG\020FOEP\r";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\030@U";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\021URVZ\r[";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\031EUDQ\023_E@A\026_HQG\020FOEP\r";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 53;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 127;
          goto _L9
_L5:
        byte1 = 48;
          goto _L9
_L6:
        byte1 = 38;
          goto _L9
        byte1 = 33;
          goto _L9
    }
}
