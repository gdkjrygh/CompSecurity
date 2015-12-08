// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzmy;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzh

public final class Device
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int zzCY;
    private final int zzSq;
    private final String zzTQ;
    private final String zzakr;
    private final String zzaks;
    private final String zzakt;
    private final int zzaku;

    Device(int i, String s, String s1, String s2, String s3, int j, int k)
    {
        zzCY = i;
        zzakr = (String)zzu.zzu(s);
        zzaks = (String)zzu.zzu(s1);
        zzTQ = "";
        zzakt = (String)zzu.zzu(s3);
        zzSq = j;
        zzaku = k;
    }

    public Device(String s, String s1, String s2, int i)
    {
        this(s, s1, "", s2, i, 0);
    }

    public Device(String s, String s1, String s2, String s3, int i, int j)
    {
        this(1, s, s1, "", s3, i, j);
    }

    public static Device getLocalDevice(Context context)
    {
        int i = zzlv.zzap(context);
        context = zzal(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, android.os.Build.VERSION.RELEASE, context, i, 2);
    }

    private boolean zza(Device device)
    {
        return zzt.equal(zzakr, device.zzakr) && zzt.equal(zzaks, device.zzaks) && zzt.equal(zzTQ, device.zzTQ) && zzt.equal(zzakt, device.zzakt) && zzSq == device.zzSq && zzaku == device.zzaku;
    }

    private static String zzal(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private boolean zzqF()
    {
        return zzqE() == 1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Device) && zza((Device)obj);
    }

    public String getManufacturer()
    {
        return zzakr;
    }

    public String getModel()
    {
        return zzaks;
    }

    String getStreamIdentifier()
    {
        return String.format("%s:%s:%s", new Object[] {
            zzakr, zzaks, zzakt
        });
    }

    public int getType()
    {
        return zzSq;
    }

    public String getUid()
    {
        return zzakt;
    }

    public String getVersion()
    {
        return zzTQ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzakr, zzaks, zzTQ, zzakt, Integer.valueOf(zzSq)
        });
    }

    public String toString()
    {
        return String.format("Device{%s:%s:%s:%s}", new Object[] {
            getStreamIdentifier(), zzTQ, Integer.valueOf(zzSq), Integer.valueOf(zzaku)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public int zzqE()
    {
        return zzaku;
    }

    public String zzqG()
    {
        if (zzqF())
        {
            return zzakt;
        } else
        {
            return zzmy.zzcL(zzakt);
        }
    }

}
