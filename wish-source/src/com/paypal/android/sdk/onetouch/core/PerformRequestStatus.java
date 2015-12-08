// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            RequestTarget

public class PerformRequestStatus
{

    private boolean a;
    private RequestTarget b;
    private String c;

    protected PerformRequestStatus(boolean flag, RequestTarget requesttarget, String s)
    {
        a = flag;
        b = requesttarget;
        c = s;
    }

    public String getClientMetadataId()
    {
        return c;
    }

    public RequestTarget getTarget()
    {
        return b;
    }

    public boolean isSuccess()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append(com/paypal/android/sdk/onetouch/core/PerformRequestStatus.getSimpleName()).append("[success=").append(a).append(", target=").append(b).append(", clientMetadataId=").append(c).append("]").toString();
    }
}
