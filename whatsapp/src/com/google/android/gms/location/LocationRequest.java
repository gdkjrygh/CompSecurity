// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.location:
//            d, LocationServices

public final class LocationRequest
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final int CK;
    boolean Wg;
    long age;
    long agr;
    long ags;
    int agt;
    float agu;
    long agv;
    int mPriority;

    public LocationRequest()
    {
        CK = 1;
        mPriority = 102;
        agr = 0x36ee80L;
        ags = 0x927c0L;
        Wg = false;
        age = 0x7fffffffffffffffL;
        agt = 0x7fffffff;
        agu = 0.0F;
        agv = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        CK = i;
        mPriority = j;
        agr = l;
        ags = l1;
        Wg = flag;
        age = l2;
        agt = k;
        agu = f;
        agv = l3;
    }

    private static void a(float f)
    {
        if (f < 0.0F)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid displacement: ").append(f).toString());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return;
        }
    }

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void ey(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    public static String ez(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            return "???";

        case 100: // 'd'
            return "PRIORITY_HIGH_ACCURACY";

        case 102: // 'f'
            return "PRIORITY_BALANCED_POWER_ACCURACY";

        case 104: // 'h'
            return "PRIORITY_LOW_POWER";

        case 105: // 'i'
            return "PRIORITY_NO_POWER";
        }
    }

    private static void v(long l)
    {
        if (l < 0L)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l).toString());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        boolean flag;
        try
        {
            flag = obj instanceof LocationRequest;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            return false;
        }
        obj = (LocationRequest)obj;
        int i;
        int j;
        i = mPriority;
        j = ((LocationRequest) (obj)).mPriority;
        if (i != j)
        {
            break; /* Loop/switch isn't completed */
        }
        long l;
        long l1;
        l = agr;
        l1 = ((LocationRequest) (obj)).agr;
        if (l != l1)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ags;
        l1 = ((LocationRequest) (obj)).ags;
        if (l != l1)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1;
        boolean flag2;
        flag1 = Wg;
        flag2 = ((LocationRequest) (obj)).Wg;
        if (flag1 != flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        l = age;
        l1 = ((LocationRequest) (obj)).age;
        if (l != l1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = agt;
        j = ((LocationRequest) (obj)).agt;
        if (i != j)
        {
            break; /* Loop/switch isn't completed */
        }
        float f;
        float f1;
        try
        {
            f = agu;
            f1 = ((LocationRequest) (obj)).agu;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (f == f1) goto _L1; else goto _L3
_L3:
        return false;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(agr), Long.valueOf(ags), Boolean.valueOf(Wg), Long.valueOf(age), Integer.valueOf(agt), Float.valueOf(agu)
        });
    }

    public LocationRequest setFastestInterval(long l)
    {
        v(l);
        Wg = true;
        ags = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        try
        {
            v(l);
            agr = l;
            if (!Wg)
            {
                ags = (long)((double)agr / 6D);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return this;
    }

    public LocationRequest setPriority(int i)
    {
        ey(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        agu = f;
        return this;
    }

    public String toString()
    {
        boolean flag = LocationServices.a;
        Object obj = new StringBuilder();
        int i;
        try
        {
            ((StringBuilder) (obj)).append("Request[").append(ez(mPriority));
            if (mPriority != 105)
            {
                ((StringBuilder) (obj)).append(" requested=");
                ((StringBuilder) (obj)).append((new StringBuilder()).append(agr).append("ms").toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        ((StringBuilder) (obj)).append(" fastest=");
        ((StringBuilder) (obj)).append((new StringBuilder()).append(ags).append("ms").toString());
        if (age != 0x7fffffffffffffffL)
        {
            long l = age;
            long l1 = SystemClock.elapsedRealtime();
            ((StringBuilder) (obj)).append(" expireIn=");
            ((StringBuilder) (obj)).append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        try
        {
            if (agt != 0x7fffffff)
            {
                ((StringBuilder) (obj)).append(" num=").append(agt);
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        try
        {
            ((StringBuilder) (obj)).append(']');
            obj = ((StringBuilder) (obj)).toString();
            i = LocationServices.a.a;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            try
            {
                throw illegalargumentexception2;
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
        }
        if (i != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            LocationServices.a = flag;
        }
        return ((String) (obj));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
