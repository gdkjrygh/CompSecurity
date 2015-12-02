// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetTokenVerifyData

public final class Shape_PasswordResetTokenVerifyData extends PasswordResetTokenVerifyData
{

    private String mobileToken;
    private Boolean sendToken;

    Shape_PasswordResetTokenVerifyData()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PasswordResetTokenVerifyData)obj;
            if (((PasswordResetTokenVerifyData) (obj)).getMobileToken() == null ? getMobileToken() != null : !((PasswordResetTokenVerifyData) (obj)).getMobileToken().equals(getMobileToken()))
            {
                return false;
            }
            if (((PasswordResetTokenVerifyData) (obj)).getSendToken() == null ? getSendToken() != null : !((PasswordResetTokenVerifyData) (obj)).getSendToken().equals(getSendToken()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getMobileToken()
    {
        return mobileToken;
    }

    public final Boolean getSendToken()
    {
        return sendToken;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (mobileToken == null)
        {
            i = 0;
        } else
        {
            i = mobileToken.hashCode();
        }
        if (sendToken != null)
        {
            j = sendToken.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final PasswordResetTokenVerifyData setMobileToken(String s)
    {
        mobileToken = s;
        return this;
    }

    final PasswordResetTokenVerifyData setSendToken(Boolean boolean1)
    {
        sendToken = boolean1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetTokenVerifyData{mobileToken=")).append(mobileToken).append(", sendToken=").append(sendToken).append("}").toString();
    }
}
