// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.api;

import com.visa.cbp.external.aam.CheckStatusRequest;
import com.visa.cbp.external.aam.ReplenishAckRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.external.enp.EnrollAndProvisionRequest;
import com.visa.cbp.external.lcm.LcmTokenRequest;
import com.visa.cbp.external.ppv.UploadTxnsRequest;
import com.visa.cbp.sdk.facade.provider.InnerCallback;
import retrofit.Callback;

public interface CommonRestAdapter
{

    public static final String BASE_ENDPOINT_NON_AUTH = "/tokens";
    public static final String CHECK_STATUS_ENDPOINT = "/tokens/check";
    public static final String DELETE_TOKEN_ENDPOINT = "/tokens/delete";
    public static final String ENROLL_PROVISION_ENDPOINT = "/tokens/provision";
    public static final String REPLENISH_ACKNOWLEDGE_ENDPOINT = "/tokens/ack";
    public static final String REPLENISH_ENDPOINT = "/tokens/replenish";
    public static final String RESUME_TOKEN_ENDPOINT = "/tokens/resume";
    public static final String SUSPEND_TOKEN_ENDPOINT = "/tokens/suspend";
    public static final String UPLOAD_TRANSACTIONS_ENDPOINT = "/tokens/uploadtxns";

    public abstract void acknowledge(ReplenishAckRequest replenishackrequest, Callback callback);

    public abstract void checkStatus(CheckStatusRequest checkstatusrequest, Callback callback);

    public abstract void delete(LcmTokenRequest lcmtokenrequest, InnerCallback innercallback);

    public abstract void enrollProvision(EnrollAndProvisionRequest enrollandprovisionrequest, Callback callback);

    public abstract void replenish(ReplenishRequest replenishrequest, Callback callback);

    public abstract void resume(LcmTokenRequest lcmtokenrequest, InnerCallback innercallback);

    public abstract void suspend(LcmTokenRequest lcmtokenrequest, InnerCallback innercallback);

    public abstract void uploadTransactions(UploadTxnsRequest uploadtxnsrequest, Callback callback);
}
