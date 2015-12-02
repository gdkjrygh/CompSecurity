// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AlipayCredentials
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final AlipayCredentials createFromParcel(Parcel parcel)
        {
            return new AlipayCredentials(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AlipayCredentials[] newArray(int i)
        {
            return new AlipayCredentials[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mAccountId;
    private String mMobile;

    public AlipayCredentials(Parcel parcel)
    {
        mAccountId = parcel.readString();
        mMobile = parcel.readString();
    }

    public AlipayCredentials(String s, String s1)
    {
        mAccountId = s;
        mMobile = s1;
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
            obj = (AlipayCredentials)obj;
            if (mAccountId == null ? ((AlipayCredentials) (obj)).mAccountId != null : !mAccountId.equals(((AlipayCredentials) (obj)).mAccountId))
            {
                return false;
            }
            if (mMobile == null ? ((AlipayCredentials) (obj)).mMobile != null : !mMobile.equals(((AlipayCredentials) (obj)).mMobile))
            {
                return false;
            }
        }
        return true;
    }

    public String getAccountId()
    {
        return mAccountId;
    }

    public String getMobile()
    {
        return mMobile;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (mAccountId != null)
        {
            i = mAccountId.hashCode();
        } else
        {
            i = 0;
        }
        if (mMobile != null)
        {
            j = mMobile.hashCode();
        }
        return i * 31 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mAccountId);
        parcel.writeString(mMobile);
    }

}
