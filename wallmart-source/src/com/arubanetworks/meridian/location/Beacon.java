// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.bluetooth.BluetoothDevice;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class Beacon
    implements Serializable
{

    public static final int PROXIMITY_FAR = 3;
    public static final int PROXIMITY_IMMEDIATE = 1;
    public static final int PROXIMITY_NEAR = 2;
    public static final int PROXIMITY_UNKNOWN = 4;
    private static final MeridianLogger c;
    private static final char p[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    int a;
    int b;
    private String d;
    private String e;
    private String f;
    private EditorKey g;
    private int h;
    private int i;
    private int j;
    private float k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;

    private Beacon()
    {
        k = -56F;
        l = 0L;
        m = 0L;
        n = false;
        o = false;
    }

    private static int a(byte abyte0[], int i1)
    {
        return abyte0[i1];
    }

    private static int a(byte abyte0[], int i1, int j1)
    {
        int j2 = 0;
        int l2 = 0;
        int i2 = 0;
        int k1 = i1;
        int l1 = i1;
        int k2 = i1;
        switch (j1)
        {
        default:
            return 0;

        case 4: // '\004'
            i2 = 0 | (abyte0[i1] & 0xff) << 24;
            k1 = i1 + 1;
            // fall through

        case 3: // '\003'
            j2 = i2 | (abyte0[k1] & 0xff) << 16;
            l1 = k1 + 1;
            // fall through

        case 2: // '\002'
            l2 = j2 | (abyte0[l1] & 0xff) << 8;
            k2 = l1 + 1;
            // fall through

        case 1: // '\001'
            return l2 | abyte0[k2] & 0xff;
        }
    }

    private static String a(int i1, int j1)
    {
        return (new StringBuilder()).append(i1).append("/").append(j1).toString();
    }

    private static boolean a(byte abyte0[])
    {
        return (abyte0[0] & 0xff) == 2 && (abyte0[1] & 0xff) == 1 && (abyte0[3] & 0xff) == 26 && (abyte0[4] & 0xff) == 255 && (abyte0[5] & 0xff) == 76;
    }

    private long b()
    {
        return System.currentTimeMillis() - l;
    }

    private static String b(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            int j1 = abyte0[i1] & 0xff;
            ac[i1 * 2] = p[j1 >>> 4];
            ac[i1 * 2 + 1] = p[j1 & 0xf];
        }

        return new String(ac);
    }

    private static String c(byte abyte0[])
    {
        abyte0 = b(abyte0);
        return (new StringBuilder()).append(abyte0.substring(0, 8)).append("-").append(abyte0.substring(8, 12)).append("-").append(abyte0.substring(12, 16)).append("-").append(abyte0.substring(16, 20)).append("-").append(abyte0.substring(20, 32)).toString();
    }

    private boolean c()
    {
        return o && System.currentTimeMillis() - m > 4000L || b() > 6000L && l != 0L;
    }

    private boolean d()
    {
        return n && System.currentTimeMillis() - m > 4000L;
    }

    public static Beacon fromJSON(String s, String s1, JSONObject jsonobject)
        throws JSONException
    {
        Beacon beacon = new Beacon();
        beacon.d = null;
        beacon.j = 0;
        beacon.e = s;
        beacon.h = jsonobject.getInt("major");
        beacon.i = jsonobject.getInt("minor");
        beacon.f = a(beacon.h, beacon.i);
        beacon.g = EditorKey.forMap(jsonobject.getString("map_id"), s1);
        return beacon;
    }

    public static Beacon fromScanData(BluetoothDevice bluetoothdevice, byte abyte0[], int i1)
    {
        if (!a(abyte0))
        {
            return null;
        }
        Beacon beacon = new Beacon();
        beacon.d = bluetoothdevice.getAddress();
        bluetoothdevice = new byte[16];
        System.arraycopy(abyte0, 9, bluetoothdevice, 0, 16);
        beacon.e = c(bluetoothdevice);
        beacon.h = a(abyte0, 25, 2);
        beacon.i = a(abyte0, 27, 2);
        beacon.f = a(beacon.h, beacon.i);
        beacon.k = a(abyte0, 29);
        if (beacon.k > 0.0F || beacon.k < -100F)
        {
            beacon.k = -56F;
        }
        beacon.j = i1;
        return beacon;
    }

    public static Beacon fromScanJSON(String s, JSONObject jsonobject)
        throws JSONException
    {
        Beacon beacon = new Beacon();
        beacon.d = null;
        beacon.j = 0;
        beacon.e = s;
        beacon.h = jsonobject.getInt("major");
        beacon.i = jsonobject.getInt("minor");
        beacon.f = a(beacon.h, beacon.i);
        return beacon;
    }

    void a()
    {
        setRssi(a / b);
    }

    public float arubaBeaconDistance()
    {
        if (getRssi() >= 0)
        {
            return 100F;
        } else
        {
            float f1 = k;
            return (float)Math.pow(10D, -((float)j - f1) / (2.0F * 10F));
        }
    }

    public String getAddress()
    {
        return d;
    }

    public int getMajor()
    {
        return h;
    }

    public String getMajorMinorString()
    {
        return f;
    }

    public EditorKey getMapKey()
    {
        return g;
    }

    public int getMinor()
    {
        return i;
    }

    public int getProximityState()
    {
        float f1 = arubaBeaconDistance();
        if (f1 > 4F)
        {
            return 3;
        }
        if ((double)f1 > 0.5D)
        {
            return 2;
        }
        return f1 <= 0.0F ? 4 : 1;
    }

    public String getProximityUuid()
    {
        return e;
    }

    public int getRssi()
    {
        return j;
    }

    public void setMapKey(EditorKey editorkey)
    {
        g = editorkey;
    }

    public void setRssi(int i1)
    {
        if (i1 > 0)
        {
            j = 0;
            a = 0;
            b = 0;
            o = false;
            n = false;
        } else
        {
            int j1 = getProximityState();
            if (b == 5)
            {
                a = (a + i1) - a / b;
                j = a / b;
            } else
            {
                a = a + i1;
                b = b + 1;
                j = a / b;
            }
            i1 = getProximityState();
            if (b <= 1)
            {
                o = false;
                n = true;
                c.d("Just Entered! (%s)", new Object[] {
                    getMajorMinorString()
                });
                return;
            }
            if (j1 != i1)
            {
                if (i1 > 3)
                {
                    o = true;
                    n = false;
                    c.d("Just Left! (%s)", new Object[] {
                        getMajorMinorString()
                    });
                    return;
                }
                if (i1 <= 3)
                {
                    o = false;
                    n = true;
                    c.d("Just Entered! (%s)", new Object[] {
                        getMajorMinorString()
                    });
                    return;
                }
            }
        }
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("major", h);
        jsonobject.put("minor", i);
        jsonobject.put("rssi", j);
        jsonobject.put("address", d);
        jsonobject.put("proximity_uuid", e);
        jsonobject.put("identifier", f);
        jsonobject.put("oneMeterMeasuredRSSI", k);
        jsonobject.put("combinedRssi", a);
        jsonobject.put("combinedRssiCount", b);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Beacon <dist=").append(arubaBeaconDistance()).append(" major=").append(h).append(" minor=").append(i).append(" rssi=").append(getRssi()).append(">").toString();
    }

    public TriggerState triggerCampaign()
    {
    /* block-local class not found */
    class TriggerState {}

        if (d())
        {
            m = System.currentTimeMillis();
            o = false;
            n = false;
            return TriggerState.ENTER_TRIGGERED;
        }
        if (c())
        {
            m = System.currentTimeMillis();
            o = false;
            n = false;
            l = 0L;
            return TriggerState.EXIT_TRIGGERED;
        } else
        {
            return TriggerState.NO_CHANGE;
        }
    }

    public void updateTimeStamp()
    {
        l = System.currentTimeMillis();
    }

    static 
    {
        c = MeridianLogger.forTag("Beacon").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.LOCATION);
    }
}
