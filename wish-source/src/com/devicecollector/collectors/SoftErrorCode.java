// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;


public final class SoftErrorCode extends Enum
{

    private static final SoftErrorCode $VALUES[];
    public static final SoftErrorCode MERCHANT_CANCELLED;
    public static final SoftErrorCode MERCHANT_SKIPPED;
    public static final SoftErrorCode PERMISSION_DENIED;
    public static final SoftErrorCode SERVICE_UNAVAILABLE;
    public static final SoftErrorCode TIMEOUT;
    public static final SoftErrorCode UNEXPECTED;
    private String postValue;

    private SoftErrorCode(String s, int i, String s1)
    {
        super(s, i);
        postValue = s1;
    }

    public static SoftErrorCode valueOf(String s)
    {
        return (SoftErrorCode)Enum.valueOf(com/devicecollector/collectors/SoftErrorCode, s);
    }

    public static SoftErrorCode[] values()
    {
        return (SoftErrorCode[])$VALUES.clone();
    }

    public String postValue()
    {
        return postValue;
    }

    static 
    {
        MERCHANT_CANCELLED = new SoftErrorCode("MERCHANT_CANCELLED", 0, "merchant_cancelled");
        MERCHANT_SKIPPED = new SoftErrorCode("MERCHANT_SKIPPED", 1, "skipped");
        PERMISSION_DENIED = new SoftErrorCode("PERMISSION_DENIED", 2, "permission_denied");
        SERVICE_UNAVAILABLE = new SoftErrorCode("SERVICE_UNAVAILABLE", 3, "not_available");
        TIMEOUT = new SoftErrorCode("TIMEOUT", 4, "timeout");
        UNEXPECTED = new SoftErrorCode("UNEXPECTED", 5, "unexpected");
        $VALUES = (new SoftErrorCode[] {
            MERCHANT_CANCELLED, MERCHANT_SKIPPED, PERMISSION_DENIED, SERVICE_UNAVAILABLE, TIMEOUT, UNEXPECTED
        });
    }
}
