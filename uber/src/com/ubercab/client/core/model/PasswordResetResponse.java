// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_PasswordResetResponse, PasswordResetTripVerifyStateData

public abstract class PasswordResetResponse
{

    public PasswordResetResponse()
    {
    }

    public static PasswordResetResponse create()
    {
        return new Shape_PasswordResetResponse();
    }

    public abstract String getErrorCode();

    public abstract String getErrorMessage();

    public abstract String getServerState();

    public abstract PasswordResetTripVerifyStateData getTripVerifyStateData();

    public abstract String getUserMessage();

    public abstract PasswordResetResponse setErrorCode(String s);

    public abstract PasswordResetResponse setErrorMessage(String s);

    public abstract PasswordResetResponse setServerState(String s);

    public abstract PasswordResetResponse setTripVerifyStateData(PasswordResetTripVerifyStateData passwordresettripverifystatedata);

    public abstract PasswordResetResponse setUserMessage(String s);
}
