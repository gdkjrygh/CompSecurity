// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu.model;


// Referenced classes of package com.ubercab.payment.internal.vendor.baidu.model:
//            Shape_StatusRequest

public abstract class StatusRequest
{

    public StatusRequest()
    {
    }

    public static StatusRequest create(String s)
    {
        return (new Shape_StatusRequest()).setSessionId(s);
    }

    public abstract String getSessionId();

    public abstract StatusRequest setSessionId(String s);
}
