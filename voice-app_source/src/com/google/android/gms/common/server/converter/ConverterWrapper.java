// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            zza, StringToIntConverter

public class ConverterWrapper
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final int zzCY;
    private final StringToIntConverter zzabA;

    ConverterWrapper(int i, StringToIntConverter stringtointconverter)
    {
        zzCY = i;
        zzabA = stringtointconverter;
    }

    private ConverterWrapper(StringToIntConverter stringtointconverter)
    {
        zzCY = 1;
        zzabA = stringtointconverter;
    }

    public static ConverterWrapper zza(com.google.android.gms.common.server.response.FastJsonResponse.zza zza1)
    {
        if (zza1 instanceof StringToIntConverter)
        {
            return new ConverterWrapper((StringToIntConverter)zza1);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        com.google.android.gms.common.server.converter.zza.zza(this, parcel, i);
    }

    StringToIntConverter zzoh()
    {
        return zzabA;
    }

    public com.google.android.gms.common.server.response.FastJsonResponse.zza zzoi()
    {
        if (zzabA != null)
        {
            return zzabA;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

}
