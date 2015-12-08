// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ei;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            c, a

public class CastDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int jE;
    private String ok;
    String ol;
    private Inet4Address om;
    private String on;
    private String oo;
    private String op;
    private int oq;
    private List or;

    private CastDevice()
    {
        this(1, null, null, null, null, null, -1, ((List) (new ArrayList())));
    }

    CastDevice(int i, String s, String s1, String s2, String s3, String s4, int j, 
            List list)
    {
        jE = i;
        ok = s;
        ol = s1;
        if (ol != null)
        {
            try
            {
                s = InetAddress.getByName(ol);
                if (s instanceof Inet4Address)
                {
                    om = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                om = null;
            }
        }
        on = s2;
        oo = s3;
        op = s4;
        oq = j;
        or = list;
    }

    static int a(CastDevice castdevice, int i)
    {
        castdevice.oq = i;
        return i;
    }

    static String a(CastDevice castdevice, String s)
    {
        castdevice.ok = s;
        return s;
    }

    static Inet4Address a(CastDevice castdevice)
    {
        return castdevice.om;
    }

    static Inet4Address a(CastDevice castdevice, Inet4Address inet4address)
    {
        castdevice.om = inet4address;
        return inet4address;
    }

    static List a(CastDevice castdevice, List list)
    {
        castdevice.or = list;
        return list;
    }

    static String b(CastDevice castdevice, String s)
    {
        castdevice.on = s;
        return s;
    }

    static String c(CastDevice castdevice, String s)
    {
        castdevice.oo = s;
        return s;
    }

    static String d(CastDevice castdevice, String s)
    {
        castdevice.op = s;
        return s;
    }

    public static CastDevice getFromBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            bundle.setClassLoader(com/google/android/gms/cast/CastDevice.getClassLoader());
            return (CastDevice)bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
        }
    }

    public static a newBuilder(String s, Inet4Address inet4address)
    {
        CastDevice castdevice = new CastDevice();
        castdevice.getClass();
        return new a(castdevice, s, inet4address);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof CastDevice))
        {
            return false;
        }
        obj = (CastDevice)obj;
        if (getDeviceId() != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CastDevice) (obj)).getDeviceId() == null) goto _L1; else goto _L3
_L3:
        return false;
        if (ei.a(ok, ((CastDevice) (obj)).ok) && ei.a(om, ((CastDevice) (obj)).om) && ei.a(oo, ((CastDevice) (obj)).oo) && ei.a(on, ((CastDevice) (obj)).on) && ei.a(op, ((CastDevice) (obj)).op) && oq == ((CastDevice) (obj)).oq && ei.a(or, ((CastDevice) (obj)).or)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getDeviceId()
    {
        return ok;
    }

    public String getDeviceVersion()
    {
        return op;
    }

    public String getFriendlyName()
    {
        return on;
    }

    public WebImage getIcon(int i, int j)
    {
        WebImage webimage;
        WebImage webimage1;
        Iterator iterator;
        webimage = null;
        if (or.isEmpty())
        {
            return null;
        }
        if (i <= 0 || j <= 0)
        {
            return (WebImage)or.get(0);
        }
        iterator = or.iterator();
        webimage1 = null;
_L2:
        WebImage webimage2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        WebImage webimage3 = (WebImage)iterator.next();
        int k = webimage3.getWidth();
        int l = webimage3.getHeight();
        if (k >= i && l >= j)
        {
            if (webimage1 != null && (webimage1.getWidth() <= k || webimage1.getHeight() <= l))
            {
                break MISSING_BLOCK_LABEL_216;
            }
            webimage1 = webimage3;
            continue; /* Loop/switch isn't completed */
        }
        if (k >= i || l >= j)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        webimage2 = webimage3;
        if (webimage != null)
        {
            if (webimage.getWidth() >= k || webimage.getHeight() >= l)
            {
                break MISSING_BLOCK_LABEL_216;
            }
            webimage2 = webimage3;
        }
_L3:
        webimage = webimage2;
        if (true) goto _L2; else goto _L1
_L1:
        if (webimage1 == null)
        {
            if (webimage != null)
            {
                webimage1 = webimage;
            } else
            {
                webimage1 = (WebImage)or.get(0);
            }
        }
        return webimage1;
        webimage2 = webimage;
          goto _L3
    }

    public List getIcons()
    {
        return Collections.unmodifiableList(or);
    }

    public Inet4Address getIpAddress()
    {
        return om;
    }

    public String getModelName()
    {
        return oo;
    }

    public int getServicePort()
    {
        return oq;
    }

    int getVersionCode()
    {
        return jE;
    }

    public boolean hasIcons()
    {
        return !or.isEmpty();
    }

    public int hashCode()
    {
        if (ok == null)
        {
            return 0;
        } else
        {
            return ok.hashCode();
        }
    }

    public boolean isSameDevice(CastDevice castdevice)
    {
        if (castdevice != null)
        {
            if (getDeviceId() == null)
            {
                if (castdevice.getDeviceId() == null)
                {
                    return true;
                }
            } else
            {
                return ei.a(getDeviceId(), castdevice.getDeviceId());
            }
        }
        return false;
    }

    public void putInBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
            return;
        }
    }

    public String toString()
    {
        return String.format("\"%s\" (%s)", new Object[] {
            on, ok
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.cast.c.a(this, parcel);
    }

}
