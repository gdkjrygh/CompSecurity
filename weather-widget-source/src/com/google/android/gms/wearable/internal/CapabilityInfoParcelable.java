// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzj

public class CapabilityInfoParcelable
    implements SafeParcelable, CapabilityInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final String mName;
    final int mVersionCode;
    private Set zzaZG;
    private final List zzaZJ;
    private final Object zzpc = new Object();

    CapabilityInfoParcelable(int i, String s, List list)
    {
        mVersionCode = i;
        mName = s;
        zzaZJ = list;
        zzaZG = null;
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
            obj = (CapabilityInfoParcelable)obj;
            if (mVersionCode != ((CapabilityInfoParcelable) (obj)).mVersionCode)
            {
                return false;
            }
            if (mName == null ? ((CapabilityInfoParcelable) (obj)).mName != null : !mName.equals(((CapabilityInfoParcelable) (obj)).mName))
            {
                return false;
            }
            if (zzaZJ == null ? ((CapabilityInfoParcelable) (obj)).zzaZJ != null : !zzaZJ.equals(((CapabilityInfoParcelable) (obj)).zzaZJ))
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return mName;
    }

    public Set getNodes()
    {
        Set set;
        synchronized (zzpc)
        {
            if (zzaZG == null)
            {
                zzaZG = new HashSet(zzaZJ);
            }
            set = zzaZG;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int hashCode()
    {
        int j = 0;
        int k = mVersionCode;
        int i;
        if (mName != null)
        {
            i = mName.hashCode();
        } else
        {
            i = 0;
        }
        if (zzaZJ != null)
        {
            j = zzaZJ.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CapabilityInfo{").append(mName).append(", ").append(zzaZJ).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public List zzCC()
    {
        return zzaZJ;
    }

}
