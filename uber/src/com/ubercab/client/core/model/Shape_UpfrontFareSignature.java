// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareSignature

public final class Shape_UpfrontFareSignature extends UpfrontFareSignature
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final UpfrontFareSignature createFromParcel(Parcel parcel)
        {
            return new Shape_UpfrontFareSignature(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UpfrontFareSignature[] newArray(int i)
        {
            return new UpfrontFareSignature[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_UpfrontFareSignature.getClassLoader();
    private long expiresAt;
    private long issuedAt;
    private String signature;
    private String version;

    Shape_UpfrontFareSignature()
    {
    }

    private Shape_UpfrontFareSignature(Parcel parcel)
    {
        expiresAt = ((Long)parcel.readValue(PARCELABLE_CL)).longValue();
        issuedAt = ((Long)parcel.readValue(PARCELABLE_CL)).longValue();
        signature = (String)parcel.readValue(PARCELABLE_CL);
        version = (String)parcel.readValue(PARCELABLE_CL);
    }


    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UpfrontFareSignature)obj;
            if (((UpfrontFareSignature) (obj)).getExpiresAt() != getExpiresAt())
            {
                return false;
            }
            if (((UpfrontFareSignature) (obj)).getIssuedAt() != getIssuedAt())
            {
                return false;
            }
            if (((UpfrontFareSignature) (obj)).getSignature() == null ? getSignature() != null : !((UpfrontFareSignature) (obj)).getSignature().equals(getSignature()))
            {
                return false;
            }
            if (((UpfrontFareSignature) (obj)).getVersion() == null ? getVersion() != null : !((UpfrontFareSignature) (obj)).getVersion().equals(getVersion()))
            {
                return false;
            }
        }
        return true;
    }

    public final long getExpiresAt()
    {
        return expiresAt;
    }

    public final long getIssuedAt()
    {
        return issuedAt;
    }

    public final String getSignature()
    {
        return signature;
    }

    public final String getVersion()
    {
        return version;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = (int)((long)((int)(0xf4243L ^ (expiresAt >>> 32 ^ expiresAt)) * 0xf4243) ^ (issuedAt >>> 32 ^ issuedAt));
        int i;
        if (signature == null)
        {
            i = 0;
        } else
        {
            i = signature.hashCode();
        }
        if (version != null)
        {
            j = version.hashCode();
        }
        return (i ^ k * 0xf4243) * 0xf4243 ^ j;
    }

    final UpfrontFareSignature setExpiresAt(long l)
    {
        expiresAt = l;
        return this;
    }

    final UpfrontFareSignature setIssuedAt(long l)
    {
        issuedAt = l;
        return this;
    }

    final UpfrontFareSignature setSignature(String s)
    {
        signature = s;
        return this;
    }

    final UpfrontFareSignature setVersion(String s)
    {
        version = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareSignature{expiresAt=")).append(expiresAt).append(", issuedAt=").append(issuedAt).append(", signature=").append(signature).append(", version=").append(version).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(Long.valueOf(expiresAt));
        parcel.writeValue(Long.valueOf(issuedAt));
        parcel.writeValue(signature);
        parcel.writeValue(version);
    }

}
