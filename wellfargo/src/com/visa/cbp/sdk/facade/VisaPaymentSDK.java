// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade;

import android.os.Bundle;
import com.visa.cbp.sdk.facade.data.ApduResponse;
import com.visa.cbp.sdk.facade.data.CvmMode;
import com.visa.cbp.sdk.facade.data.DeviceData;
import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.TokenData;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.provider.CheckStatusProvider;
import com.visa.cbp.sdk.facade.provider.DeleteTokenProvider;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.ResumeTokenProvider;
import com.visa.cbp.sdk.facade.provider.SuspendTokenProvider;
import com.visa.cbp.sdk.facade.provider.TokenProvider;
import com.visa.cbp.sdk.facade.request.AuthenticationParams;
import com.visa.cbp.sdk.facade.request.ProvisionTokenParams;
import com.visa.cbp.sdk.facade.request.ReplenishParams;
import java.util.List;

public interface VisaPaymentSDK
{

    public abstract void authenticate(AuthenticationParams authenticationparams, ResponseCallback responsecallback);

    public abstract void checkStatus(ResponseCallback responsecallback);

    public abstract void checkStatus(ResponseCallback responsecallback, CheckStatusProvider checkstatusprovider);

    public abstract void deleteAllTokensLocally();

    public abstract void deleteToken(LcmParams lcmparams, ResponseCallback responsecallback);

    public abstract void deleteToken(LcmParams lcmparams, ResponseCallback responsecallback, DeleteTokenProvider deletetokenprovider);

    public abstract void deleteToken(LcmParams alcmparams[], ResponseCallback responsecallback);

    public abstract void deleteToken(LcmParams alcmparams[], ResponseCallback responsecallback, DeleteTokenProvider deletetokenprovider);

    public abstract void enableThm(boolean flag);

    public abstract int getAccessTokenAdvancedWarningPercent();

    public abstract List getAllTokenData();

    public abstract long getCheckStatusPeriod();

    public abstract String getConversationId();

    public abstract CvmMode getCvmVerificationMode();

    public abstract DeviceData getDeviceData();

    public abstract int getMaxTvlRecords();

    public abstract TokenKey getSelectedCard();

    public abstract TokenData getTokenData(TokenKey tokenkey);

    public abstract TokenData getTokenData(String s);

    public abstract String getTokenStatus(TokenKey tokenkey);

    public abstract List getTvlLog(TokenKey tokenkey);

    public abstract boolean isCvmVerified();

    public abstract boolean isThmEnabled();

    public abstract ApduResponse processCommandApdu(byte abyte0[], Bundle bundle, boolean flag);

    public abstract boolean processTransactionComplete(TokenKey tokenkey);

    public abstract void provisionToken(ResponseCallback responsecallback, TokenProvider tokenprovider);

    public abstract void provisionToken(ProvisionTokenParams provisiontokenparams, ResponseCallback responsecallback);

    public abstract void provisionToken(ProvisionTokenParams provisiontokenparams, ResponseCallback responsecallback, TokenProvider tokenprovider);

    public abstract void replenishDynamicData(ReplenishParams replenishparams, ResponseCallback responsecallback);

    public abstract void replenishDynamicData(ReplenishParams replenishparams, ResponseCallback responsecallback, ReplenishmentProvider replenishmentprovider);

    public abstract void resumeToken(LcmParams lcmparams, ResponseCallback responsecallback);

    public abstract void resumeToken(LcmParams lcmparams, ResponseCallback responsecallback, ResumeTokenProvider resumetokenprovider);

    public abstract void resumeToken(LcmParams alcmparams[], ResponseCallback responsecallback);

    public abstract void resumeToken(LcmParams alcmparams[], ResponseCallback responsecallback, ResumeTokenProvider resumetokenprovider);

    public abstract void selectCard(TokenKey tokenkey);

    public abstract void setAccessTokenAdvancedWarningPercent(int i);

    public abstract void setCheckStatusPeriod(long l);

    public abstract void setCvmVerificationMode(CvmMode cvmmode);

    public abstract void setCvmVerified(boolean flag);

    public abstract void setMaxTvlRecords(int i);

    public abstract void setPasscode(String s);

    public abstract void suspendToken(LcmParams lcmparams, ResponseCallback responsecallback);

    public abstract void suspendToken(LcmParams lcmparams, ResponseCallback responsecallback, SuspendTokenProvider suspendtokenprovider);

    public abstract void suspendToken(LcmParams alcmparams[], ResponseCallback responsecallback);

    public abstract void suspendToken(LcmParams alcmparams[], ResponseCallback responsecallback, SuspendTokenProvider suspendtokenprovider);

    public abstract boolean tokensExist();

    public abstract boolean verifyPasscode(String s);
}
