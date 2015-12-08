// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzae

public final class FileUploadPreferencesImpl
    implements SafeParcelable, FileUploadPreferences
{

    public static final android.os.Parcelable.Creator CREATOR = new zzae();
    final int zzCY;
    int zzafG;
    int zzafH;
    boolean zzafI;

    FileUploadPreferencesImpl(int i, int j, int k, boolean flag)
    {
        zzCY = i;
        zzafG = j;
        zzafH = k;
        zzafI = flag;
    }

    public static boolean zzcD(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public static boolean zzcE(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 256: 
        case 257: 
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getBatteryUsagePreference()
    {
        if (!zzcE(zzafH))
        {
            return 0;
        } else
        {
            return zzafH;
        }
    }

    public int getNetworkTypePreference()
    {
        if (!zzcD(zzafG))
        {
            return 0;
        } else
        {
            return zzafG;
        }
    }

    public boolean isRoamingAllowed()
    {
        return zzafI;
    }

    public void setBatteryUsagePreference(int i)
    {
        if (!zzcE(i))
        {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        } else
        {
            zzafH = i;
            return;
        }
    }

    public void setNetworkTypePreference(int i)
    {
        if (!zzcD(i))
        {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        } else
        {
            zzafG = i;
            return;
        }
    }

    public void setRoamingAllowed(boolean flag)
    {
        zzafI = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzae.zza(this, parcel, i);
    }

}
