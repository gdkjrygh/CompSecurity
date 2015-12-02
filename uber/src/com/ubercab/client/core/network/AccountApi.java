// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import com.ubercab.client.core.model.MobileVerificationRequest;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.client.core.model.RiderAccountPicture;
import com.ubercab.client.core.model.RiderPassword;
import java.util.Map;
import retrofit.Callback;
import retrofit.client.Response;

public interface AccountApi
{

    public abstract void getAccount(String s, Callback callback);

    public abstract void requestMobileConfirmation(MobileVerificationRequest mobileverificationrequest, Callback callback);

    public abstract void updateAccount(String s, RiderAccount rideraccount, Callback callback);

    public abstract void uploadAccountPicture(RiderAccountPicture rideraccountpicture, Callback callback);

    public abstract Response verifyMobile(String s, Map map);

    public abstract void verifyMobile(String s, Map map, Callback callback);

    public abstract void verifyPassword(RiderPassword riderpassword, Callback callback);
}
