// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gsf:
//            i

public class LoginData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    public String mAuthtoken;
    public String mCaptchaAnswer;
    public byte mCaptchaData[];
    public String mCaptchaMimeType;
    public String mCaptchaToken;
    public String mEncryptedPassword;
    public int mFlags;
    public String mJsonString;
    public String mOAuthAccessToken;
    public String mPassword;
    public String mService;
    public String mSid;
    public Status mStatus;
    public String mUsername;

    public LoginData()
    {
        mUsername = null;
        mEncryptedPassword = null;
        mPassword = null;
        mService = null;
        mCaptchaToken = null;
        mCaptchaData = null;
        mCaptchaMimeType = null;
        mCaptchaAnswer = null;
        mFlags = 0;
        mStatus = null;
        mJsonString = null;
        mSid = null;
        mAuthtoken = null;
        mOAuthAccessToken = null;
    }

    private LoginData(Parcel parcel)
    {
        mUsername = null;
        mEncryptedPassword = null;
        mPassword = null;
        mService = null;
        mCaptchaToken = null;
        mCaptchaData = null;
        mCaptchaMimeType = null;
        mCaptchaAnswer = null;
        mFlags = 0;
        mStatus = null;
        mJsonString = null;
        mSid = null;
        mAuthtoken = null;
        mOAuthAccessToken = null;
        readFromParcel(parcel);
    }

    LoginData(Parcel parcel, i j)
    {
        this(parcel);
    }

    public LoginData(LoginData logindata)
    {
        mUsername = null;
        mEncryptedPassword = null;
        mPassword = null;
        mService = null;
        mCaptchaToken = null;
        mCaptchaData = null;
        mCaptchaMimeType = null;
        mCaptchaAnswer = null;
        mFlags = 0;
        mStatus = null;
        mJsonString = null;
        mSid = null;
        mAuthtoken = null;
        mOAuthAccessToken = null;
        mUsername = logindata.mUsername;
        mEncryptedPassword = logindata.mEncryptedPassword;
        mPassword = logindata.mPassword;
        mService = logindata.mService;
        mCaptchaToken = logindata.mCaptchaToken;
        mCaptchaData = logindata.mCaptchaData;
        mCaptchaMimeType = logindata.mCaptchaMimeType;
        mCaptchaAnswer = logindata.mCaptchaAnswer;
        mFlags = logindata.mFlags;
        mStatus = logindata.mStatus;
        mJsonString = logindata.mJsonString;
        mSid = logindata.mSid;
        mAuthtoken = logindata.mAuthtoken;
        mOAuthAccessToken = logindata.mOAuthAccessToken;
    }

    public int describeContents()
    {
        return 0;
    }

    public String dump()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("         status: ");
        stringbuilder.append(mStatus);
        stringbuilder.append("\n       username: ");
        stringbuilder.append(mUsername);
        stringbuilder.append("\n       password: ");
        stringbuilder.append(mPassword);
        stringbuilder.append("\n   enc password: ");
        stringbuilder.append(mEncryptedPassword);
        stringbuilder.append("\n        service: ");
        stringbuilder.append(mService);
        stringbuilder.append("\n      authtoken: ");
        stringbuilder.append(mAuthtoken);
        stringbuilder.append("\n      oauthAccessToken: ");
        stringbuilder.append(mOAuthAccessToken);
        stringbuilder.append("\n   captchatoken: ");
        stringbuilder.append(mCaptchaToken);
        stringbuilder.append("\n  captchaanswer: ");
        stringbuilder.append(mCaptchaAnswer);
        stringbuilder.append("\n    captchadata: ");
        String s;
        if (mCaptchaData == null)
        {
            s = "null";
        } else
        {
            s = (new StringBuilder()).append(Integer.toString(mCaptchaData.length)).append(" bytes").toString();
        }
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public void readFromParcel(Parcel parcel)
    {
        mUsername = parcel.readString();
        mEncryptedPassword = parcel.readString();
        mPassword = parcel.readString();
        mService = parcel.readString();
        mCaptchaToken = parcel.readString();
        int j = parcel.readInt();
        String s;
        if (j == -1)
        {
            mCaptchaData = null;
        } else
        {
            mCaptchaData = new byte[j];
            parcel.readByteArray(mCaptchaData);
        }
        mCaptchaMimeType = parcel.readString();
        mCaptchaAnswer = parcel.readString();
        mFlags = parcel.readInt();
        s = parcel.readString();
        if (s == null)
        {
            mStatus = null;
        } else
        {
            mStatus = Status.valueOf(s);
        }
        mJsonString = parcel.readString();
        mSid = parcel.readString();
        mAuthtoken = parcel.readString();
        mOAuthAccessToken = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(mUsername);
        parcel.writeString(mEncryptedPassword);
        parcel.writeString(mPassword);
        parcel.writeString(mService);
        parcel.writeString(mCaptchaToken);
        if (mCaptchaData == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(mCaptchaData.length);
            parcel.writeByteArray(mCaptchaData);
        }
        parcel.writeString(mCaptchaMimeType);
        parcel.writeString(mCaptchaAnswer);
        parcel.writeInt(mFlags);
        if (mStatus == null)
        {
            parcel.writeString(null);
        } else
        {
            parcel.writeString(mStatus.name());
        }
        parcel.writeString(mJsonString);
        parcel.writeString(mSid);
        parcel.writeString(mAuthtoken);
        parcel.writeString(mOAuthAccessToken);
    }


    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status ACCOUNT_DISABLED;
        public static final Status BAD_REQUEST;
        public static final Status BAD_USERNAME;
        public static final Status CANCELLED;
        public static final Status CAPTCHA;
        public static final Status DELETED_GMAIL;
        public static final Status DMAGENT;
        public static final Status LOGIN_FAIL;
        public static final Status MISSING_APPS;
        public static final Status NETWORK_ERROR;
        public static final Status NO_GMAIL;
        public static final Status OAUTH_MIGRATION_REQUIRED;
        public static final Status SERVER_ERROR;
        public static final Status SUCCESS;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/gsf/LoginData$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new Status("SUCCESS", 0);
            ACCOUNT_DISABLED = new Status("ACCOUNT_DISABLED", 1);
            BAD_USERNAME = new Status("BAD_USERNAME", 2);
            BAD_REQUEST = new Status("BAD_REQUEST", 3);
            LOGIN_FAIL = new Status("LOGIN_FAIL", 4);
            SERVER_ERROR = new Status("SERVER_ERROR", 5);
            MISSING_APPS = new Status("MISSING_APPS", 6);
            NO_GMAIL = new Status("NO_GMAIL", 7);
            NETWORK_ERROR = new Status("NETWORK_ERROR", 8);
            CAPTCHA = new Status("CAPTCHA", 9);
            CANCELLED = new Status("CANCELLED", 10);
            DELETED_GMAIL = new Status("DELETED_GMAIL", 11);
            OAUTH_MIGRATION_REQUIRED = new Status("OAUTH_MIGRATION_REQUIRED", 12);
            DMAGENT = new Status("DMAGENT", 13);
            $VALUES = (new Status[] {
                SUCCESS, ACCOUNT_DISABLED, BAD_USERNAME, BAD_REQUEST, LOGIN_FAIL, SERVER_ERROR, MISSING_APPS, NO_GMAIL, NETWORK_ERROR, CAPTCHA, 
                CANCELLED, DELETED_GMAIL, OAUTH_MIGRATION_REQUIRED, DMAGENT
            });
        }

        private Status(String s, int j)
        {
            super(s, j);
        }
    }

}
