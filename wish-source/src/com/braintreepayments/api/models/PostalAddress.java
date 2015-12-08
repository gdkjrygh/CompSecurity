// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import java.io.Serializable;
import org.json.JSONObject;

public class PostalAddress
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PostalAddress createFromParcel(Parcel parcel)
        {
            return new PostalAddress(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PostalAddress[] newArray(int i)
        {
            return new PostalAddress[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mCountryCodeAlpha2;
    private String mExtendedAddress;
    private String mLocality;
    private String mPostalCode;
    private String mRecipientName;
    private String mRegion;
    private String mStreetAddress;

    public PostalAddress()
    {
    }

    private PostalAddress(Parcel parcel)
    {
        mRecipientName = parcel.readString();
        mStreetAddress = parcel.readString();
        mExtendedAddress = parcel.readString();
        mLocality = parcel.readString();
        mCountryCodeAlpha2 = parcel.readString();
        mPostalCode = parcel.readString();
        mRegion = parcel.readString();
    }


    public static PostalAddress fromJson(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            PostalAddress postaladdress = (PostalAddress)(new Gson()).fromJson(jsonobject.toString(), com/braintreepayments/api/models/PostalAddress);
            if (postaladdress.mStreetAddress == null)
            {
                postaladdress.mStreetAddress = jsonobject.optString("line1", null);
            }
            if (postaladdress.mExtendedAddress == null)
            {
                postaladdress.mExtendedAddress = jsonobject.optString("line2", null);
            }
            if (postaladdress.mCountryCodeAlpha2 == null)
            {
                postaladdress.mCountryCodeAlpha2 = jsonobject.optString("countryCode", null);
            }
            return postaladdress;
        } else
        {
            return new PostalAddress();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCountryCodeAlpha2()
    {
        return mCountryCodeAlpha2;
    }

    public String getExtendedAddress()
    {
        return mExtendedAddress;
    }

    public String getLocality()
    {
        return mLocality;
    }

    public String getPostalCode()
    {
        return mPostalCode;
    }

    public String getRecipientName()
    {
        return mRecipientName;
    }

    public String getRegion()
    {
        return mRegion;
    }

    public String getStreetAddress()
    {
        return mStreetAddress;
    }

    public void setCountryCodeAlpha2(String s)
    {
        mCountryCodeAlpha2 = s;
    }

    public void setExtendedAddress(String s)
    {
        mExtendedAddress = s;
    }

    public void setLocality(String s)
    {
        mLocality = s;
    }

    public void setPostalCode(String s)
    {
        mPostalCode = s;
    }

    public void setRecipientName(String s)
    {
        mRecipientName = s;
    }

    public void setRegion(String s)
    {
        mRegion = s;
    }

    public void setStreetAddress(String s)
    {
        mStreetAddress = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mRecipientName);
        parcel.writeString(mStreetAddress);
        parcel.writeString(mExtendedAddress);
        parcel.writeString(mLocality);
        parcel.writeString(mCountryCodeAlpha2);
        parcel.writeString(mPostalCode);
        parcel.writeString(mRegion);
    }

}
