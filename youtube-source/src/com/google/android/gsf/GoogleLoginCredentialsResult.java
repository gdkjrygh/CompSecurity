// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gsf:
//            a

public class GoogleLoginCredentialsResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private String mAccount;
    private Intent mCredentialsIntent;
    private String mCredentialsString;

    public GoogleLoginCredentialsResult()
    {
        mCredentialsString = null;
        mCredentialsIntent = null;
        mAccount = null;
    }

    private GoogleLoginCredentialsResult(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    GoogleLoginCredentialsResult(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        if (mCredentialsIntent != null)
        {
            return mCredentialsIntent.describeContents();
        } else
        {
            return 0;
        }
    }

    public String getAccount()
    {
        return mAccount;
    }

    public Intent getCredentialsIntent()
    {
        return mCredentialsIntent;
    }

    public String getCredentialsString()
    {
        return mCredentialsString;
    }

    public void readFromParcel(Parcel parcel)
    {
        mAccount = parcel.readString();
        mCredentialsString = parcel.readString();
        int i = parcel.readInt();
        mCredentialsIntent = null;
        if (i == 1)
        {
            mCredentialsIntent = new Intent();
            mCredentialsIntent.readFromParcel(parcel);
            mCredentialsIntent.setExtrasClassLoader(getClass().getClassLoader());
        }
    }

    public void setAccount(String s)
    {
        mAccount = s;
    }

    public void setCredentialsIntent(Intent intent)
    {
        mCredentialsIntent = intent;
    }

    public void setCredentialsString(String s)
    {
        mCredentialsString = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mAccount);
        parcel.writeString(mCredentialsString);
        if (mCredentialsIntent != null)
        {
            parcel.writeInt(1);
            mCredentialsIntent.writeToParcel(parcel, 0);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }

}
