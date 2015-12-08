// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.stats:
//            zza

public final class ConnectionEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int mVersionCode;
    private final long zzafj;
    private int zzafk;
    private final String zzafl;
    private final String zzafm;
    private final String zzafn;
    private final String zzafo;
    private final String zzafp;
    private final String zzafq;
    private final long zzafr;
    private final long zzafs;
    private long zzaft;

    ConnectionEvent(int i, long l, int j, String s, String s1, String s2, 
            String s3, String s4, String s5, long l1, long l2)
    {
        mVersionCode = i;
        zzafj = l;
        zzafk = j;
        zzafl = s;
        zzafm = s1;
        zzafn = s2;
        zzafo = s3;
        zzaft = -1L;
        zzafp = s4;
        zzafq = s5;
        zzafr = l1;
        zzafs = l2;
    }

    public ConnectionEvent(long l, int i, String s, String s1, String s2, String s3, 
            String s4, String s5, long l1, long l2)
    {
        this(1, l, i, s, s1, s2, s3, s4, s5, l1, l2);
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
        zza.zza(this, parcel, i);
    }

    public String zzpA()
    {
        return zzafq;
    }

    public long zzpB()
    {
        return zzafs;
    }

    public long zzpC()
    {
        return zzafr;
    }

    public String zzpv()
    {
        return zzafl;
    }

    public String zzpw()
    {
        return zzafm;
    }

    public String zzpx()
    {
        return zzafn;
    }

    public String zzpy()
    {
        return zzafo;
    }

    public String zzpz()
    {
        return zzafp;
    }

}
