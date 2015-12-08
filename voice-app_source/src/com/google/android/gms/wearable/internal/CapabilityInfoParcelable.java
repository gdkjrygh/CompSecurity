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
//            zzh

public class CapabilityInfoParcelable
    implements SafeParcelable, CapabilityInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final String mName;
    final int zzCY;
    private Set zzaTE;
    private final List zzaTH;
    private final Object zzqt = new Object();

    CapabilityInfoParcelable(int i, String s, List list)
    {
        zzCY = i;
        mName = s;
        zzaTH = list;
        zzaTE = null;
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
            if (zzCY != ((CapabilityInfoParcelable) (obj)).zzCY)
            {
                return false;
            }
            if (mName == null ? ((CapabilityInfoParcelable) (obj)).mName != null : !mName.equals(((CapabilityInfoParcelable) (obj)).mName))
            {
                return false;
            }
            if (zzaTH == null ? ((CapabilityInfoParcelable) (obj)).zzaTH != null : !zzaTH.equals(((CapabilityInfoParcelable) (obj)).zzaTH))
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
        synchronized (zzqt)
        {
            if (zzaTE == null)
            {
                zzaTE = new HashSet(zzaTH);
            }
            set = zzaTE;
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
        int k = zzCY;
        int i;
        if (mName != null)
        {
            i = mName.hashCode();
        } else
        {
            i = 0;
        }
        if (zzaTH != null)
        {
            j = zzaTH.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CapabilityInfo{").append(mName).append(", ").append(zzaTH).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public List zzBa()
    {
        return zzaTH;
    }

}
