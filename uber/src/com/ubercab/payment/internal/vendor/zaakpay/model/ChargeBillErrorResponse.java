// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay.model;

import android.os.Parcelable;
import java.util.Map;

// Referenced classes of package com.ubercab.payment.internal.vendor.zaakpay.model:
//            Shape_ChargeBillErrorResponse

public abstract class ChargeBillErrorResponse
    implements Parcelable
{

    public static final String ERROR_CVV_ENTRY_REQUIRED = "cvv_entry_required";
    public static final String ERROR_WEB_AUTH_REQUIRED = "web_auth_required";

    public ChargeBillErrorResponse()
    {
    }

    public static ChargeBillErrorResponse create()
    {
        return new Shape_ChargeBillErrorResponse();
    }

    public abstract Map getData();

    public abstract String getFailurePattern();

    public abstract String getHttpMethod();

    public abstract String getSuccessPattern();

    public abstract String getUrl();

    public abstract ChargeBillErrorResponse setData(Map map);

    public abstract ChargeBillErrorResponse setFailurePattern(String s);

    public abstract ChargeBillErrorResponse setHttpMethod(String s);

    public abstract ChargeBillErrorResponse setSuccessPattern(String s);

    public abstract ChargeBillErrorResponse setUrl(String s);
}
