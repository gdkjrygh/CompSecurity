// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.android.adm;


// Referenced classes of package com.amazon.android.adm:
//            AmazonDeviceMessaging

static class ption.ErrorCode
{

    static final int $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[];

    static 
    {
        $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode = new int[com.amazon.device.messaging..ErrorCode.values().length];
        try
        {
            $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging..ErrorCode.MainThread.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging..ErrorCode.ServiceNotAvailable.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging..ErrorCode.InvalidParameters.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging..ErrorCode.InvalidSender.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
