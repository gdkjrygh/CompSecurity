// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zza

public final class Application
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final Application zzajM;
    private final int zzCY;
    private final String zzMZ;
    private final String zzTQ;
    private final String zzajN;

    Application(int i, String s, String s1, String s2)
    {
        zzCY = i;
        zzMZ = (String)zzu.zzu(s);
        zzTQ = "";
        zzajN = s2;
    }

    public Application(String s, String s1, String s2)
    {
        this(1, s, "", s2);
    }

    private boolean zza(Application application)
    {
        return zzMZ.equals(application.zzMZ) && zzt.equal(zzTQ, application.zzTQ) && zzt.equal(zzajN, application.zzajN);
    }

    public static Application zzcG(String s)
    {
        return zze(s, null, null);
    }

    public static Application zze(String s, String s1, String s2)
    {
        if ("com.google.android.gms".equals(s))
        {
            return zzajM;
        } else
        {
            return new Application(s, s1, s2);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Application) && zza((Application)obj);
    }

    public String getPackageName()
    {
        return zzMZ;
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
            zzMZ, zzTQ, zzajN
        });
    }

    public String toString()
    {
        return String.format("Application{%s:%s:%s}", new Object[] {
            zzMZ, zzTQ, zzajN
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.data.zza.zza(this, parcel, i);
    }

    public String zzqp()
    {
        return zzajN;
    }

    static 
    {
        zzajM = new Application("com.google.android.gms", String.valueOf(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE), null);
    }
}
