// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelChargeBillRequest;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelCreateAccountRequest;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelDepositRequest;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelLinkAccountRequest;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelSendCodeRequest;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelValidateCodeRequest;
import retrofit.Callback;

public interface AirtelApi
{

    public abstract void chargeBill(String s, AirtelChargeBillRequest airtelchargebillrequest, Callback callback);

    public abstract void checkBonusStatus(String s, Callback callback);

    public abstract void createAccount(AirtelCreateAccountRequest airtelcreateaccountrequest, Callback callback);

    public abstract void deposit(String s, AirtelDepositRequest airteldepositrequest, Callback callback);

    public abstract void linkAccount(AirtelLinkAccountRequest airtellinkaccountrequest, Callback callback);

    public abstract void sendCode(AirtelSendCodeRequest airtelsendcoderequest, Callback callback);

    public abstract void validateCode(AirtelValidateCodeRequest airtelvalidatecoderequest, Callback callback);
}
