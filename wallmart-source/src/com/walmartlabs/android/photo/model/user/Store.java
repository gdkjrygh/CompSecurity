// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.json.JSONException;
import org.json.JSONObject;

public class Store
    implements Parcelable
{
    private static class StoreSerializer
    {

        private static final String KEY_CITY = "city";
        private static final String KEY_ID = "id";
        private static final String KEY_LATITUDE = "latitude";
        private static final String KEY_LONGITUDE = "longitude";
        private static final String KEY_NAME = "name";
        private static final String KEY_PHONE = "phone";
        private static final String KEY_STATE = "state";
        private static final String KEY_STREET = "street";
        private static final String KEY_ZIP = "zip";

        public static String asJson(Store store)
            throws JSONException
        {
            return asJson(store, 0);
        }

        public static String asJson(Store store, int i)
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("id", store.getId());
            jsonobject.put("name", store.getName());
            jsonobject.put("street", store.getStreet());
            jsonobject.put("city", store.getCity());
            jsonobject.put("state", store.getState());
            jsonobject.put("zip", store.getZip());
            jsonobject.put("phone", store.getPhone());
            jsonobject.put("latitude", store.getLatitude());
            jsonobject.put("longitude", store.getLongitude());
            if (i > 0)
            {
                return jsonobject.toString(i);
            } else
            {
                return jsonobject.toString();
            }
        }

        public static Store fromJson(String s)
            throws JSONException
        {
            s = new JSONObject(s);
            Store store = new Store();
            store.setId(s.getString("id"));
            store.setName(s.getString("name"));
            store.setStreet(s.getString("street"));
            store.setCity(s.getString("city"));
            store.setState(s.getString("state"));
            store.setZip(s.getInt("zip"));
            store.setPhone(s.getString("phone"));
            store.setLatitude(s.getDouble("latitude"));
            store.setLongitude(s.getDouble("longitude"));
            return store;
        }

        private StoreSerializer()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Store createFromParcel(Parcel parcel)
        {
            return new Store(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Store[] newArray(int i)
        {
            return new Store[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mCity;
    private String mId;
    private double mLatitude;
    private double mLongitude;
    private String mName;
    private String mPhone;
    private String mState;
    private String mStreet;
    private int mZip;

    public Store()
    {
    }

    public Store(Parcel parcel)
    {
        mId = parcel.readString();
        mName = parcel.readString();
        mStreet = parcel.readString();
        mCity = parcel.readString();
        mState = parcel.readString();
        mZip = parcel.readInt();
        mPhone = parcel.readString();
        mLatitude = parcel.readDouble();
        mLongitude = parcel.readDouble();
    }

    public static Store fromJson(String s)
        throws JSONException
    {
        return StoreSerializer.fromJson(s);
    }

    public String asJson()
        throws JSONException
    {
        return StoreSerializer.asJson(this);
    }

    public String asJson(int i)
        throws JSONException
    {
        return StoreSerializer.asJson(this, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Store)
        {
            obj = ((Store)obj).getId();
            String s = getId();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s) && s.equals(obj))
            {
                return true;
            }
        }
        return false;
    }

    public String getAddress()
    {
        return (new StringBuilder()).append(mStreet).append("\n").append(mCity).append(", ").append(mState).append(" ").append(mZip).toString();
    }

    public String getAddressAndPhone()
    {
        return (new StringBuilder()).append(mStreet).append("\n").append(mCity).append(", ").append(mState).append(" ").append(mZip).append("\n").append(mPhone).toString();
    }

    public String getCity()
    {
        return mCity;
    }

    public String getCompleteAddress()
    {
        String s;
        if (mName != null)
        {
            s = mName;
        } else
        {
            s = "Store";
        }
        return (new StringBuilder()).append(s).append(" #").append(mId).append("\n").append(mStreet).append("\n").append(mCity).append(", ").append(mState).append(" ").append(mZip).append("\n").append(mPhone).toString();
    }

    public String getId()
    {
        return mId;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhone()
    {
        return mPhone;
    }

    public String getState()
    {
        return mState;
    }

    public String getStreet()
    {
        return mStreet;
    }

    public int getZip()
    {
        return mZip;
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(mId).toHashCode();
    }

    public boolean isComplete()
    {
        return !TextUtils.isEmpty(mId) && !TextUtils.isEmpty(mName) && !TextUtils.isEmpty(mStreet) && !TextUtils.isEmpty(mCity) && !TextUtils.isEmpty(mState) && mZip > 0 && !TextUtils.isEmpty(mPhone);
    }

    public void setCity(String s)
    {
        mCity = s;
    }

    public void setId(String s)
    {
        mId = s;
    }

    public void setLatitude(double d)
    {
        mLatitude = d;
    }

    public void setLongitude(double d)
    {
        mLongitude = d;
    }

    public void setName(String s)
    {
        mName = s;
    }

    public void setPhone(String s)
    {
        mPhone = s;
    }

    public void setState(String s)
    {
        mState = s;
    }

    public void setStreet(String s)
    {
        mStreet = s;
    }

    public void setZip(int i)
    {
        mZip = i;
    }

    public String toString()
    {
        return getCompleteAddress();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mName);
        parcel.writeString(mStreet);
        parcel.writeString(mCity);
        parcel.writeString(mState);
        parcel.writeInt(mZip);
        parcel.writeString(mPhone);
        parcel.writeDouble(mLatitude);
        parcel.writeDouble(mLongitude);
    }

}
