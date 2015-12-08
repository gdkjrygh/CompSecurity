// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbb

public class NodeParcelable
    implements SafeParcelable, Node
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbb();
    final int mVersionCode;
    private final String zzahh;
    private final int zzbaO;
    private final boolean zzbaP;
    private final String zzwj;

    NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        mVersionCode = i;
        zzwj = s;
        zzahh = s1;
        zzbaO = j;
        zzbaP = flag;
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
            return ((NodeParcelable)obj).zzwj.equals(zzwj);
        }
    }

    public String getDisplayName()
    {
        return zzahh;
    }

    public int getHopCount()
    {
        return zzbaO;
    }

    public String getId()
    {
        return zzwj;
    }

    public int hashCode()
    {
        return zzwj.hashCode();
    }

    public boolean isNearby()
    {
        return zzbaP;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Node{").append(zzahh).append(", id=").append(zzwj).append(", hops=").append(zzbaO).append(", isNearby=").append(zzbaP).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbb.zza(this, parcel, i);
    }

}
