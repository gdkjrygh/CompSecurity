// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivityCreator

public class DetectedActivity
    implements SafeParcelable
{

    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final Comparator zzaBx = new Comparator() {

        public int compare(Object obj, Object obj1)
        {
            return zza((DetectedActivity)obj, (DetectedActivity)obj1);
        }

        public int zza(DetectedActivity detectedactivity, DetectedActivity detectedactivity1)
        {
            int j = Integer.valueOf(detectedactivity1.getConfidence()).compareTo(Integer.valueOf(detectedactivity.getConfidence()));
            int i = j;
            if (j == 0)
            {
                i = Integer.valueOf(detectedactivity.getType()).compareTo(Integer.valueOf(detectedactivity1.getType()));
            }
            return i;
        }

    };
    private final int mVersionCode;
    int zzaBy;
    int zzaBz;

    public DetectedActivity(int i, int j)
    {
        mVersionCode = 1;
        zzaBy = i;
        zzaBz = j;
    }

    public DetectedActivity(int i, int j, int k)
    {
        mVersionCode = i;
        zzaBy = j;
        zzaBz = k;
    }

    private int zzgB(int i)
    {
        int j = i;
        if (i > 15)
        {
            j = 4;
        }
        return j;
    }

    public static String zzgC(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            return Integer.toString(i);

        case 0: // '\0'
            return "IN_VEHICLE";

        case 1: // '\001'
            return "ON_BICYCLE";

        case 2: // '\002'
            return "ON_FOOT";

        case 3: // '\003'
            return "STILL";

        case 4: // '\004'
            return "UNKNOWN";

        case 5: // '\005'
            return "TILTING";

        case 7: // '\007'
            return "WALKING";

        case 8: // '\b'
            return "RUNNING";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DetectedActivity)obj;
            if (zzaBy != ((DetectedActivity) (obj)).zzaBy || zzaBz != ((DetectedActivity) (obj)).zzaBz)
            {
                return false;
            }
        }
        return true;
    }

    public int getConfidence()
    {
        return zzaBz;
    }

    public int getType()
    {
        return zzgB(zzaBy);
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzaBy), Integer.valueOf(zzaBz)
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("DetectedActivity [type=").append(zzgC(getType())).append(", confidence=").append(zzaBz).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DetectedActivityCreator.zza(this, parcel, i);
    }

}
