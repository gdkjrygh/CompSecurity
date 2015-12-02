// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.TextUtils;
import com.whatsapp.protocol.cr;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ri, App, n9

public class LocationSharingService extends Service
    implements LocationListener
{

    private static Location e;
    private static final String z[];
    private n9 a;
    private Handler b;
    private android.os.PowerManager.WakeLock c;
    private Runnable d;
    private Location f;

    public LocationSharingService()
    {
        b = new Handler();
        d = new ri(this);
    }

    private void a(Location location)
    {
        e = location;
        cr cr1 = new cr();
        try
        {
            cr1.e = (double)Math.round(location.getLatitude() * 1000000D) / 1000000D;
            cr1.d = (double)Math.round(location.getLongitude() * 1000000D) / 1000000D;
            if (location.hasAccuracy())
            {
                cr1.f = (int)location.getAccuracy();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        try
        {
            if (location.hasSpeed())
            {
                cr1.c = (float)(int)(location.getSpeed() * 100F) / 100F;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        try
        {
            if (location.hasBearing())
            {
                cr1.h = (int)location.getBearing();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        try
        {
            cr1.i = location.getTime();
            if (cr1.i > System.currentTimeMillis())
            {
                cr1.i = System.currentTimeMillis();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        App.a(cr1);
    }

    private static boolean a(Location location, Location location1)
    {
        if (location1 != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        float f1;
        float f3;
        long l;
        long l1;
        boolean flag;
        try
        {
            l = location1.getTime();
            l1 = location.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        if (l + 0x1d4c0L < l1) goto _L1; else goto _L3
_L3:
        try
        {
            f1 = location1.getAccuracy();
            f3 = location.getAccuracy();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        if (f1 > f3) goto _L1; else goto _L4
_L4:
        flag = TextUtils.equals(location1.getProvider(), location.getProvider());
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        float f2;
        float f4;
        try
        {
            f2 = location1.distanceTo(location);
            f4 = Math.max(10F, location.getAccuracy());
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        if (f2 > f4) goto _L1; else goto _L5
_L5:
        return false;
        location;
        throw location;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        Log.i(z[7]);
        PowerManager powermanager = (PowerManager)getSystemService(z[8]);
        if (powermanager == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        android.os.PowerManager.WakeLock wakelock = c;
        if (wakelock != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        c = powermanager.newWakeLock(1, z[9]);
        boolean flag;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        flag = c.isHeld();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        c.acquire();
_L1:
        b.postDelayed(d, 40000L);
        a = new n9(this);
        RuntimeException runtimeexception;
        try
        {
            a.a(1000L, 0.0F, this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.w((new StringBuilder()).append(z[6]).append(illegalargumentexception.toString()).toString());
        }
        break MISSING_BLOCK_LABEL_173;
        runtimeexception;
        try
        {
            throw runtimeexception;
        }
        // Misplaced declaration of an exception variable
        catch (RuntimeException runtimeexception)
        {
            try
            {
                throw runtimeexception;
            }
            // Misplaced declaration of an exception variable
            catch (RuntimeException runtimeexception)
            {
                Log.a(z[10], runtimeexception);
            }
        }
          goto _L1
        runtimeexception;
        throw runtimeexception;
        runtimeexception;
        throw runtimeexception;
    }

    public void onDestroy()
    {
        android.os.PowerManager.WakeLock wakelock;
        Log.i(z[5]);
        b.removeCallbacks(d);
        a.a(this);
        wakelock = c;
        RuntimeException runtimeexception;
        if (wakelock != null)
        {
            try
            {
                if (c.isHeld())
                {
                    c.release();
                    c = null;
                    return;
                }
            }
            catch (RuntimeException runtimeexception1)
            {
                throw runtimeexception1;
            }
        }
        break MISSING_BLOCK_LABEL_65;
        runtimeexception;
        throw runtimeexception;
    }

    public void onLocationChanged(Location location)
    {
        boolean flag;
        Log.i((new StringBuilder()).append(z[11]).append(location).toString());
        flag = a(location, e);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        int i;
        a(location);
        f = location;
        i = App.am;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        try
        {
            if (location.getAccuracy() < 80F)
            {
                f = location;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        try
        {
            location = f;
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            try
            {
                throw location;
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (e.getTime() + 40000L < f.getTime())
        {
            a(f);
        }
        return;
        location;
        try
        {
            throw location;
        }
        // Misplaced declaration of an exception variable
        catch (Location location) { }
        throw location;
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        long l = 40000L;
        long l1;
        try
        {
            b.removeCallbacks(d);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (!intent.getAction().equals(z[1]))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Log.i(z[2]);
        stopSelf();
        i = App.am;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        Object obj;
        Location location;
label0:
        {
            if (intent != null)
            {
                l = intent.getLongExtra(z[3], 40000L);
            }
            try
            {
                b.postDelayed(d, l);
                Log.i((new StringBuilder()).append(z[4]).append(l).toString());
                if (e == null)
                {
                    break label0;
                }
                l = e.getTime();
                l1 = System.currentTimeMillis();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (l + 0x1d4c0L >= l1)
            {
                break MISSING_BLOCK_LABEL_245;
            }
        }
        obj = a.a(1);
        location = a.a(2);
        if (obj == null)
        {
            intent = location;
        } else
        if (location == null)
        {
            intent = ((Intent) (obj));
        } else
        {
            intent = location;
            if (((Location) (obj)).getTime() > location.getTime() - 20000L)
            {
                intent = ((Intent) (obj));
            }
        }
        obj = intent;
        if (intent != null)
        {
            try
            {
                l = intent.getTime();
                l1 = System.currentTimeMillis();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            obj = intent;
            if (l + 0x6ddd00L < l1)
            {
                obj = null;
            }
        }
        try
        {
            Log.i((new StringBuilder()).append(z[0]).append(obj).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        a(((Location) (obj)));
        return 1;
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DEJ@\003\037\026R@\002\037\f\036";
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
                obj = "B\036\006\030II\020\037E_Q\001EeV@\003\016zQB\020\037_QO\"\016DHH\022\016\030mu>;";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DEJN\001";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "E\004\031WJH\036\005";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DEJ@\003\037\026ZT\003\nBWN\037Q";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DR[R\005\031YG";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DQNR^\016DLN\003K";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DULD\020\037S";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "Q\036\034SL";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "r\031\nD[m\036\bWJH\036\005e[S\007\002U[";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DULD\020\037S\021Q\034";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "M\036\bWJH\036\005EV@\003\002XYR\024\031@WB\024DYPM\036\bWJH\036\005UV@\037\fSZ\001";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 62;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 33;
          goto _L9
_L5:
        byte1 = 113;
          goto _L9
_L6:
        byte1 = 107;
          goto _L9
        byte1 = 54;
          goto _L9
    }
}
