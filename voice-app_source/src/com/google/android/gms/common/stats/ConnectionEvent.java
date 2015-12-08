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
    final int zzCY;
    private final long zzabZ;
    private int zzaca;
    private final String zzacb;
    private final String zzacc;
    private final String zzacd;
    private final String zzace;
    private final String zzacf;
    private final String zzacg;
    private final long zzach;
    private final long zzaci;
    private long zzacj;

    ConnectionEvent(int i, long l, int j, String s, String s1, String s2, 
            String s3, String s4, String s5, long l1, long l2)
    {
        zzCY = i;
        zzabZ = l;
        zzaca = j;
        zzacb = s;
        zzacc = s1;
        zzacd = s2;
        zzace = s3;
        zzacj = -1L;
        zzacf = s4;
        zzacg = s5;
        zzach = l1;
        zzaci = l2;
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
        return zzaca;
    }

    public long getTimeMillis()
    {
        return zzabZ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public String zzoG()
    {
        return zzacb;
    }

    public String zzoH()
    {
        return zzacc;
    }

    public String zzoI()
    {
        return zzacd;
    }

    public String zzoJ()
    {
        return zzace;
    }

    public String zzoK()
    {
        return zzacf;
    }

    public String zzoL()
    {
        return zzacg;
    }

    public long zzoM()
    {
        return zzaci;
    }

    public long zzoN()
    {
        return zzach;
    }

}
