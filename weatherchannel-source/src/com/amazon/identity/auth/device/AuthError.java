// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.identity.auth.device.utils.MAPLog;

public class AuthError extends Exception
    implements Parcelable
{

    public static final String AUTH_ERROR_EXECEPTION = "AUTH_ERROR_EXECEPTION";
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String LOG_TAG = com/amazon/identity/auth/device/AuthError.getName();
    public static final int RESULT_AUTH_ERROR = 1;
    private static final long serialVersionUID = 1L;
    private final ERROR_TYPE _type;

    public AuthError(Parcel parcel)
    {
    /* block-local class not found */
    class ERROR_TYPE {}

        this(parcel.readString(), (Throwable)parcel.readValue(java/lang/Throwable.getClassLoader()), (ERROR_TYPE)parcel.readSerializable());
    }

    public AuthError(String s, ERROR_TYPE error_type)
    {
        super(s);
        _type = error_type;
    }

    public AuthError(String s, Throwable throwable, ERROR_TYPE error_type)
    {
        super(s, throwable);
        _type = error_type;
    }

    public static AuthError extractError(Intent intent)
    {
        try
        {
            intent = (AuthError)intent.getParcelableExtra("AUTH_ERROR_EXECEPTION");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            MAPLog.e(LOG_TAG, "Error Extracting AuthError");
            return null;
        }
        return intent;
    }

    public static AuthError extractError(Bundle bundle)
    {
        try
        {
            bundle = (AuthError)bundle.getParcelable("AUTH_ERROR_EXECEPTION");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            MAPLog.e(LOG_TAG, "Error Extracting AuthError");
            return null;
        }
        return bundle;
    }

    public static AuthError getAuthError(Throwable throwable, Class class1)
    {
        return getAuthError(throwable, class1, ERROR_TYPE.ERROR_UNKNOWN);
    }

    public static AuthError getAuthError(Throwable throwable, Class class1, ERROR_TYPE error_type)
    {
        return new AuthError((new StringBuilder()).append("Unexpected error in ").append(class1.getName()).toString(), throwable, error_type);
    }

    public static Bundle getErrorBundle(Intent intent)
    {
        return getErrorBundle(extractError(intent));
    }

    public static Bundle getErrorBundle(AuthError autherror)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AUTH_ERROR_EXECEPTION", autherror);
        return bundle;
    }

    public static Bundle getErrorBundle(Throwable throwable, Class class1, ERROR_TYPE error_type)
    {
        return getErrorBundle(getAuthError(throwable, class1, error_type));
    }

    public int describeContents()
    {
        return 0;
    }

    public ERROR_CATEGORY getCategory()
    {
        return _type.getCategory();
    }

    public ERROR_TYPE getType()
    {
        return _type;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AuthError cat= ").append(_type.getCategory()).append(" type=").append(_type).append(" - ").append(super.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getMessage());
        if (getCause() != null)
        {
            parcel.writeValue(getCause());
        } else
        {
            parcel.writeValue(null);
        }
        parcel.writeSerializable(_type);
    }


    // Unreferenced inner class com/amazon/identity/auth/device/AuthError$ERROR_CATEGORY
    /* block-local class not found */
    class ERROR_CATEGORY {}


    /* member class not found */
    class _cls1 {}

}
