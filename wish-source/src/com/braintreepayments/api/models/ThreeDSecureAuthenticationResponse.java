// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, ThreeDSecureInfo

public class ThreeDSecureAuthenticationResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ThreeDSecureAuthenticationResponse createFromParcel(Parcel parcel)
        {
            return new ThreeDSecureAuthenticationResponse(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ThreeDSecureAuthenticationResponse[] newArray(int i)
        {
            return new ThreeDSecureAuthenticationResponse[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private Card mCard;
    private com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors mErrors;
    private String mException;
    private boolean mSuccess;

    public ThreeDSecureAuthenticationResponse()
    {
    }

    private ThreeDSecureAuthenticationResponse(Parcel parcel)
    {
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mSuccess = flag;
        mCard = (Card)parcel.readParcelable(com/braintreepayments/api/models/Card.getClassLoader());
        mErrors = (com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors)parcel.readParcelable(com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeError.getClassLoader());
        mException = parcel.readString();
    }


    public static ThreeDSecureAuthenticationResponse fromException(String s)
    {
        ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse = new ThreeDSecureAuthenticationResponse();
        threedsecureauthenticationresponse.mSuccess = false;
        threedsecureauthenticationresponse.mException = s;
        return threedsecureauthenticationresponse;
    }

    public static ThreeDSecureAuthenticationResponse fromJson(String s)
    {
        ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse = new ThreeDSecureAuthenticationResponse();
        Gson gson = new Gson();
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            Card card = (Card)gson.fromJson(jsonobject.getJSONObject("paymentMethod").toString(), com/braintreepayments/api/models/Card);
            card.setThreeDSecureInfo((ThreeDSecureInfo)gson.fromJson(jsonobject.getJSONObject("threeDSecureInfo").toString(), com/braintreepayments/api/models/ThreeDSecureInfo));
            threedsecureauthenticationresponse.mCard = card;
            threedsecureauthenticationresponse.mSuccess = jsonobject.getBoolean("success");
        }
        catch (JSONException jsonexception)
        {
            threedsecureauthenticationresponse.mSuccess = false;
        }
        threedsecureauthenticationresponse.mErrors = (com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors)gson.fromJson(s, com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeErrors);
        return threedsecureauthenticationresponse;
    }

    public static boolean isThreeDSecureAuthenticationResponse(Intent intent)
    {
        return intent.hasExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT");
    }

    public int describeContents()
    {
        return 0;
    }

    public Card getCard()
    {
        return mCard;
    }

    public com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors getErrors()
    {
        return mErrors;
    }

    public String getException()
    {
        return mException;
    }

    public boolean isSuccess()
    {
        return mSuccess;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte byte0;
        if (mSuccess)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeParcelable(mCard, i);
        parcel.writeParcelable(mErrors, i);
        parcel.writeString(mException);
    }

}
