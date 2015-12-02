// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            AlipaySignature

public final class Shape_AlipaySignature extends AlipaySignature
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final AlipaySignature createFromParcel(Parcel parcel)
        {
            return new Shape_AlipaySignature(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AlipaySignature[] newArray(int i)
        {
            return new AlipaySignature[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_AlipaySignature.getClassLoader();
    private String signature;

    Shape_AlipaySignature()
    {
    }

    private Shape_AlipaySignature(Parcel parcel)
    {
        signature = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (AlipaySignature)obj;
            if (((AlipaySignature) (obj)).getSignature() == null ? getSignature() != null : !((AlipaySignature) (obj)).getSignature().equals(getSignature()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getSignature()
    {
        return signature;
    }

    public final int hashCode()
    {
        int i;
        if (signature == null)
        {
            i = 0;
        } else
        {
            i = signature.hashCode();
        }
        return i ^ 0xf4243;
    }

    final AlipaySignature setSignature(String s)
    {
        signature = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AlipaySignature{signature=")).append(signature).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(signature);
    }

}
