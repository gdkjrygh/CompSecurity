// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzg

public final class WakeLockEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    final int mVersionCode;
    private final String zzafS;
    private final int zzafT;
    private final List zzafU;
    private final String zzafV;
    private int zzafW;
    private final String zzafX;
    private final String zzafY;
    private final float zzafZ;
    private final long zzafj;
    private int zzafk;
    private final long zzafr;
    private long zzaft;

    WakeLockEvent(int i, long l, int j, String s, int k, List list, 
            String s1, long l1, int i1, String s2, String s3, float f)
    {
        mVersionCode = i;
        zzafj = l;
        zzafk = j;
        zzafS = s;
        zzafX = s2;
        zzafT = k;
        zzaft = -1L;
        zzafU = list;
        zzafV = s1;
        zzafr = l1;
        zzafW = i1;
        zzafY = s3;
        zzafZ = f;
    }

    public WakeLockEvent(long l, int i, String s, int j, List list, String s1, 
            long l1, int k, String s2, String s3, float f)
    {
        this(1, l, i, s, j, list, s1, l1, k, s2, s3, f);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEventType()
    {
        return zzafk;
    }

    public long getTimeMillis()
    {
        return zzafj;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public String zzpA()
    {
        return zzafV;
    }

    public long zzpC()
    {
        return zzafr;
    }

    public String zzpE()
    {
        return zzafS;
    }

    public String zzpF()
    {
        return zzafX;
    }

    public int zzpG()
    {
        return zzafT;
    }

    public List zzpH()
    {
        return zzafU;
    }

    public int zzpI()
    {
        return zzafW;
    }

    public String zzpJ()
    {
        return zzafY;
    }

    public float zzpK()
    {
        return zzafZ;
    }

}
