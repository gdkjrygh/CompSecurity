// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class Contact
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Contact createFromParcel(Parcel parcel)
        {
            return new Contact(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Contact[] newArray(int i)
        {
            return new Contact[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mEmail;
    private String mFirstName;
    private String mId;
    private String mLastName;
    private String mPhone;

    public Contact()
    {
    }

    public Contact(Parcel parcel)
    {
        mId = parcel.readString();
        mFirstName = parcel.readString();
        mLastName = parcel.readString();
        mEmail = parcel.readString();
        mPhone = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCompleteContact()
    {
        return (new StringBuilder()).append(mId).append("\n").append(mFirstName).append(" ").append(mLastName).append("\n").append(mEmail).append("\n").append(mPhone).toString();
    }

    public String getCompleteContactNoID()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(mFirstName).append(" ").append(mLastName).append("\n").append(mEmail).append("\n");
        String s;
        if (mPhone != null)
        {
            s = mPhone;
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }

    public String getEmail()
    {
        return mEmail;
    }

    public String getFirstName()
    {
        return mFirstName;
    }

    public String getId()
    {
        return mId;
    }

    public String getLastName()
    {
        return mLastName;
    }

    public String getPhone()
    {
        return mPhone;
    }

    public boolean hasNameAddressEmail()
    {
        return !TextUtils.isEmpty(mId) && !TextUtils.isEmpty(mFirstName) && !TextUtils.isEmpty(mLastName) && !TextUtils.isEmpty(mEmail);
    }

    public boolean hasPhone()
    {
        return !TextUtils.isEmpty(mPhone);
    }

    public boolean isComplete()
    {
        return !TextUtils.isEmpty(mId) && !TextUtils.isEmpty(mFirstName) && !TextUtils.isEmpty(mLastName) && !TextUtils.isEmpty(mEmail) && !TextUtils.isEmpty(mPhone);
    }

    public void setEmail(String s)
    {
        mEmail = s;
    }

    public void setFirstName(String s)
    {
        mFirstName = s;
    }

    public void setId(String s)
    {
        mId = s;
    }

    public void setLastName(String s)
    {
        mLastName = s;
    }

    public void setPhone(String s)
    {
        mPhone = s;
    }

    public String toString()
    {
        return getCompleteContact();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mFirstName);
        parcel.writeString(mLastName);
        parcel.writeString(mEmail);
        parcel.writeString(mPhone);
    }

}
