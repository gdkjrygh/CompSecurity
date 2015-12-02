// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetResponse, PasswordResetTripVerifyStateData

public final class Shape_PasswordResetResponse extends PasswordResetResponse
{

    private String errorCode;
    private String errorMessage;
    private String serverState;
    private PasswordResetTripVerifyStateData tripVerifyStateData;
    private String userMessage;

    Shape_PasswordResetResponse()
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
            obj = (PasswordResetResponse)obj;
            if (((PasswordResetResponse) (obj)).getErrorCode() == null ? getErrorCode() != null : !((PasswordResetResponse) (obj)).getErrorCode().equals(getErrorCode()))
            {
                return false;
            }
            if (((PasswordResetResponse) (obj)).getErrorMessage() == null ? getErrorMessage() != null : !((PasswordResetResponse) (obj)).getErrorMessage().equals(getErrorMessage()))
            {
                return false;
            }
            if (((PasswordResetResponse) (obj)).getUserMessage() == null ? getUserMessage() != null : !((PasswordResetResponse) (obj)).getUserMessage().equals(getUserMessage()))
            {
                return false;
            }
            if (((PasswordResetResponse) (obj)).getServerState() == null ? getServerState() != null : !((PasswordResetResponse) (obj)).getServerState().equals(getServerState()))
            {
                return false;
            }
            if (((PasswordResetResponse) (obj)).getTripVerifyStateData() == null ? getTripVerifyStateData() != null : !((PasswordResetResponse) (obj)).getTripVerifyStateData().equals(getTripVerifyStateData()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getErrorCode()
    {
        return errorCode;
    }

    public final String getErrorMessage()
    {
        return errorMessage;
    }

    public final String getServerState()
    {
        return serverState;
    }

    public final PasswordResetTripVerifyStateData getTripVerifyStateData()
    {
        return tripVerifyStateData;
    }

    public final String getUserMessage()
    {
        return userMessage;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (errorCode == null)
        {
            i = 0;
        } else
        {
            i = errorCode.hashCode();
        }
        if (errorMessage == null)
        {
            j = 0;
        } else
        {
            j = errorMessage.hashCode();
        }
        if (userMessage == null)
        {
            k = 0;
        } else
        {
            k = userMessage.hashCode();
        }
        if (serverState == null)
        {
            l = 0;
        } else
        {
            l = serverState.hashCode();
        }
        if (tripVerifyStateData != null)
        {
            i1 = tripVerifyStateData.hashCode();
        }
        return (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i1;
    }

    public final PasswordResetResponse setErrorCode(String s)
    {
        errorCode = s;
        return this;
    }

    public final PasswordResetResponse setErrorMessage(String s)
    {
        errorMessage = s;
        return this;
    }

    public final PasswordResetResponse setServerState(String s)
    {
        serverState = s;
        return this;
    }

    public final PasswordResetResponse setTripVerifyStateData(PasswordResetTripVerifyStateData passwordresettripverifystatedata)
    {
        tripVerifyStateData = passwordresettripverifystatedata;
        return this;
    }

    public final PasswordResetResponse setUserMessage(String s)
    {
        userMessage = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetResponse{errorCode=")).append(errorCode).append(", errorMessage=").append(errorMessage).append(", userMessage=").append(userMessage).append(", serverState=").append(serverState).append(", tripVerifyStateData=").append(tripVerifyStateData).append("}").toString();
    }
}
