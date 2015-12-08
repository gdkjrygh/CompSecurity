// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            zzc

public class LaunchOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private LaunchOptions zzRB;

        public LaunchOptions build()
        {
            return zzRB;
        }

        public Builder setLocale(Locale locale)
        {
            zzRB.setLanguage(zzf.zzb(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean flag)
        {
            zzRB.setRelaunchIfRunning(flag);
            return this;
        }

        public Builder()
        {
            zzRB = new LaunchOptions();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final int zzCY;
    private String zzRA;
    private boolean zzRz;

    public LaunchOptions()
    {
        this(1, false, zzf.zzb(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        zzCY = i;
        zzRz = flag;
        zzRA = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof LaunchOptions))
            {
                return false;
            }
            obj = (LaunchOptions)obj;
            if (zzRz != ((LaunchOptions) (obj)).zzRz || !zzf.zza(zzRA, ((LaunchOptions) (obj)).zzRA))
            {
                return false;
            }
        }
        return true;
    }

    public String getLanguage()
    {
        return zzRA;
    }

    public boolean getRelaunchIfRunning()
    {
        return zzRz;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Boolean.valueOf(zzRz), zzRA
        });
    }

    public void setLanguage(String s)
    {
        zzRA = s;
    }

    public void setRelaunchIfRunning(boolean flag)
    {
        zzRz = flag;
    }

    public String toString()
    {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
            Boolean.valueOf(zzRz), zzRA
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
