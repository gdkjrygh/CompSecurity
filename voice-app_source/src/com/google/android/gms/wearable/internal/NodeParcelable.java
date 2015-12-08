// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzay

public class NodeParcelable
    implements SafeParcelable, Node
{

    public static final android.os.Parcelable.Creator CREATOR = new zzay();
    final int zzCY;
    private final String zzKI;
    private final int zzaUL;
    private final boolean zzaUM;
    private final String zzadI;

    NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        zzCY = i;
        zzKI = s;
        zzadI = s1;
        zzaUL = j;
        zzaUM = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof NodeParcelable))
        {
            return false;
        } else
        {
            return ((NodeParcelable)obj).zzKI.equals(zzKI);
        }
    }

    public String getDisplayName()
    {
        return zzadI;
    }

    public int getHopCount()
    {
        return zzaUL;
    }

    public String getId()
    {
        return zzKI;
    }

    public int hashCode()
    {
        return zzKI.hashCode();
    }

    public boolean isNearby()
    {
        return zzaUM;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Node{").append(zzadI).append(", id=").append(zzKI).append(", hops=").append(zzaUL).append(", isNearby=").append(zzaUM).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzay.zza(this, parcel, i);
    }

}
