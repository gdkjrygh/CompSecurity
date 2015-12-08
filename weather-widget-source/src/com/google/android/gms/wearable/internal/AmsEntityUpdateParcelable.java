// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zze

public class AmsEntityUpdateParcelable
    implements SafeParcelable, zzb
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final String mValue;
    final int mVersionCode;
    private byte zzaZu;
    private final byte zzaZv;

    AmsEntityUpdateParcelable(int i, byte byte0, byte byte1, String s)
    {
        zzaZu = byte0;
        mVersionCode = i;
        zzaZv = byte1;
        mValue = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AmsEntityUpdateParcelable)obj;
            if (zzaZu != ((AmsEntityUpdateParcelable) (obj)).zzaZu)
            {
                return false;
            }
            if (mVersionCode != ((AmsEntityUpdateParcelable) (obj)).mVersionCode)
            {
                return false;
            }
            if (zzaZv != ((AmsEntityUpdateParcelable) (obj)).zzaZv)
            {
                return false;
            }
            if (!mValue.equals(((AmsEntityUpdateParcelable) (obj)).mValue))
            {
                return false;
            }
        }
        return true;
    }

    public String getValue()
    {
        return mValue;
    }

    public int hashCode()
    {
        return ((mVersionCode * 31 + zzaZu) * 31 + zzaZv) * 31 + mValue.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("AmsEntityUpdateParcelable{mVersionCode=").append(mVersionCode).append(", mEntityId=").append(zzaZu).append(", mAttributeId=").append(zzaZv).append(", mValue='").append(mValue).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public byte zzCu()
    {
        return zzaZu;
    }

    public byte zzCv()
    {
        return zzaZv;
    }

}
