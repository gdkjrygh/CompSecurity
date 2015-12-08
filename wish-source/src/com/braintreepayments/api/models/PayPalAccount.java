// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, PaymentMethodOptions, PostalAddress

public class PayPalAccount extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PayPalAccount createFromParcel(Parcel parcel)
        {
            return new PayPalAccount(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PayPalAccount[] newArray(int i)
        {
            return new PayPalAccount[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    protected static final String PAYMENT_METHOD_TYPE = "PayPalAccount";
    private PostalAddress mBillingAddress;
    private String mClientMetadataId;
    private String mConsentCode;
    private String mEmail;
    private String mFirstName;
    private String mLastName;
    private String mPayerId;
    private String mPhone;
    private PostalAddress mShippingAddress;

    public PayPalAccount()
    {
    }

    private PayPalAccount(Parcel parcel)
    {
        mConsentCode = parcel.readString();
        mClientMetadataId = parcel.readString();
        mNonce = parcel.readString();
        mDescription = parcel.readString();
        mPaymentMethodOptions = (PaymentMethodOptions)parcel.readSerializable();
        mSource = parcel.readString();
        mBillingAddress = (PostalAddress)parcel.readParcelable(com/braintreepayments/api/models/PostalAddress.getClassLoader());
        mShippingAddress = (PostalAddress)parcel.readParcelable(com/braintreepayments/api/models/PostalAddress.getClassLoader());
        mFirstName = parcel.readString();
        mLastName = parcel.readString();
        mEmail = parcel.readString();
        mPhone = parcel.readString();
        mPayerId = parcel.readString();
    }


    public static PayPalAccount fromJson(String s)
    {
        PayPalAccount paypalaccount = (PayPalAccount)(new Gson()).fromJson(s, com/braintreepayments/api/models/PayPalAccount);
        try
        {
            s = (new JSONObject(s)).optJSONObject("details");
            paypalaccount.mEmail = s.optString("email", null);
            s = s.optJSONObject("payerInfo");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return paypalaccount;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        paypalaccount.mBillingAddress = PostalAddress.fromJson(s.optJSONObject("accountAddress"));
        if (paypalaccount.mBillingAddress == null)
        {
            paypalaccount.mBillingAddress = PostalAddress.fromJson(s.optJSONObject("billingAddress"));
        }
        paypalaccount.mShippingAddress = PostalAddress.fromJson(s.optJSONObject("shippingAddress"));
        paypalaccount.mFirstName = s.optString("firstName");
        paypalaccount.mLastName = s.optString("lastName");
        paypalaccount.mPhone = s.optString("phone");
        paypalaccount.mPayerId = s.optString("payer_id");
        if (paypalaccount.mEmail == null)
        {
            paypalaccount.mEmail = s.optString("email", null);
        }
        return paypalaccount;
    }

    public int describeContents()
    {
        return 0;
    }

    public PostalAddress getBillingAddress()
    {
        return mBillingAddress;
    }

    public String getClientMetadataId()
    {
        return mClientMetadataId;
    }

    public String getDescription()
    {
        if (getEmail() != null)
        {
            return getEmail();
        }
        if (super.getDescription() != null)
        {
            return super.getDescription();
        } else
        {
            return "PayPal";
        }
    }

    public String getEmail()
    {
        return mEmail;
    }

    public String getFirstName()
    {
        return mFirstName;
    }

    public String getLastName()
    {
        return mLastName;
    }

    public String getPayerId()
    {
        return mPayerId;
    }

    public String getPhone()
    {
        return mPhone;
    }

    public PostalAddress getShippingAddress()
    {
        return mShippingAddress;
    }

    public String getTypeLabel()
    {
        return "PayPal";
    }

    protected void setClientMetadataId(String s)
    {
        mClientMetadataId = s;
    }

    protected void setConsentCode(String s)
    {
        mConsentCode = s;
    }

    protected void setEmail(String s)
    {
        mEmail = s;
    }

    protected void setPayerId(String s)
    {
        mPayerId = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mConsentCode);
        parcel.writeString(mClientMetadataId);
        parcel.writeString(mNonce);
        parcel.writeString(mDescription);
        parcel.writeSerializable(mPaymentMethodOptions);
        parcel.writeString(mSource);
        parcel.writeParcelable(mBillingAddress, 0);
        parcel.writeParcelable(mShippingAddress, 0);
        parcel.writeString(mFirstName);
        parcel.writeString(mLastName);
        parcel.writeString(mEmail);
        parcel.writeString(mPhone);
        parcel.writeString(mPayerId);
    }

}
