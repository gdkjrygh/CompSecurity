// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, ThreeDSecureInfo

public class ThreeDSecureLookup
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ThreeDSecureLookup createFromParcel(Parcel parcel)
        {
            return new ThreeDSecureLookup(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ThreeDSecureLookup[] newArray(int i)
        {
            return new ThreeDSecureLookup[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mAcsUrl;
    private Card mCard;
    private String mMd;
    private String mPareq;
    private String mTermUrl;

    public ThreeDSecureLookup()
    {
    }

    private ThreeDSecureLookup(Parcel parcel)
    {
        mAcsUrl = parcel.readString();
        mMd = parcel.readString();
        mTermUrl = parcel.readString();
        mPareq = parcel.readString();
    }


    public static ThreeDSecureLookup fromJson(String s)
        throws JSONException
    {
        Object obj = new JSONObject(s);
        Gson gson = new Gson();
        s = (Card)gson.fromJson(((JSONObject) (obj)).getJSONObject("paymentMethod").toString(), com/braintreepayments/api/models/Card);
        s.setThreeDSecureInfo((ThreeDSecureInfo)gson.fromJson(((JSONObject) (obj)).getJSONObject("threeDSecureInfo").toString(), com/braintreepayments/api/models/ThreeDSecureInfo));
        obj = (ThreeDSecureLookup)gson.fromJson(((JSONObject) (obj)).getJSONObject("lookup").toString(), com/braintreepayments/api/models/ThreeDSecureLookup);
        obj.mCard = s;
        return ((ThreeDSecureLookup) (obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAcsUrl()
    {
        return mAcsUrl;
    }

    public Card getCard()
    {
        return mCard;
    }

    public String getMd()
    {
        return mMd;
    }

    public String getPareq()
    {
        return mPareq;
    }

    public String getTermUrl()
    {
        return mTermUrl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mAcsUrl);
        parcel.writeString(mMd);
        parcel.writeString(mTermUrl);
        parcel.writeString(mPareq);
    }

}
