// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class AirtelDepositPayload
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String JSON_KEY_AIRTEL_BUSINESS_INPUT = "businessInput";
    private static final String JSON_KEY_AIRTEL_CARD_DETAILS = "cardDetails";
    private static final String JSON_KEY_AIRTEL_CARD_NO = "cardNo";
    private static final String JSON_KEY_AIRTEL_CVV = "cvv";
    private static final String JSON_KEY_AIRTEL_EXPIRY_MONTH = "expiryMonth";
    private static final String JSON_KEY_AIRTEL_EXPIRY_YEAR = "expiryYear";
    private static final String JSON_KEY_AIRTEL_PAYMENT_MODE = "paymentMode";
    private static final String JSON_KEY_AIRTEL_PAYMENT_SERVICE = "paymentService";
    private static final String JSON_KEY_AIRTEL_SAVED_CARD_DETAILS = "savedCardDetails";
    private JSONObject mPayload;

    AirtelDepositPayload(Parcel parcel)
    {
        parcel = parcel.readString();
        try
        {
            mPayload = new JSONObject(parcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
    }

    public AirtelDepositPayload(String s)
    {
        mPayload = new JSONObject(s);
    }

    private JSONObject getBusinessInput()
    {
        return (JSONObject)((JSONObject)mPayload.get("paymentService")).get("businessInput");
    }

    private JSONObject getCardDetails()
    {
        return (JSONObject)((JSONObject)((JSONObject)mPayload.get("paymentService")).get("businessInput")).get("cardDetails");
    }

    private JSONObject getSavedCardDetails()
    {
        return (JSONObject)((JSONObject)((JSONObject)mPayload.get("paymentService")).get("businessInput")).get("savedCardDetails");
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCardDetailsCardCode()
    {
        String s;
        try
        {
            s = (String)getCardDetails().get("cvv");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public String getCardDetailsCardNumber()
    {
        String s;
        try
        {
            s = (String)getCardDetails().get("cardNo");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public String getCardDetailsExpirationMonth()
    {
        String s;
        try
        {
            s = (String)getCardDetails().get("expiryMonth");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public String getCardDetailsExpirationYear()
    {
        String s;
        try
        {
            s = (String)getCardDetails().get("expiryYear");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public String getCardDetailsPaymentMode()
    {
        String s;
        try
        {
            s = (String)getBusinessInput().get("paymentMode");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public String getSavedCardDetailsCardCode()
    {
        String s;
        try
        {
            s = (String)getSavedCardDetails().get("cvv");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public void putCreditCardData(String s, String s1, String s2, String s3, String s4)
    {
        getBusinessInput().put("paymentMode", s4);
        s4 = getCardDetails();
        s4.put("cardNo", s1);
        s4.put("expiryMonth", s2);
        s4.put("expiryYear", s3);
        s4.put("cvv", s);
    }

    public void putCvv(String s)
    {
        getSavedCardDetails().put("cvv", s);
    }

    public String toString()
    {
        return mPayload.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mPayload.toString());
    }


    /* member class not found */
    class _cls1 {}

}
