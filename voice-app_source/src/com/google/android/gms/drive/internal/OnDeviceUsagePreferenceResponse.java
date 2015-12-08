// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzav, FileUploadPreferencesImpl

public class OnDeviceUsagePreferenceResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzav();
    final int zzCY;
    final FileUploadPreferencesImpl zzagf;

    OnDeviceUsagePreferenceResponse(int i, FileUploadPreferencesImpl fileuploadpreferencesimpl)
    {
        zzCY = i;
        zzagf = fileuploadpreferencesimpl;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzav.zza(this, parcel, i);
    }

    public FileUploadPreferencesImpl zzpL()
    {
        return zzagf;
    }

}
