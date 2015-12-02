// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu.model;


// Referenced classes of package com.ubercab.payment.internal.vendor.baidu.model:
//            Shape_AuthorizationDetails

public abstract class AuthorizationDetails
{

    public AuthorizationDetails()
    {
    }

    public static AuthorizationDetails create(String s)
    {
        return (new Shape_AuthorizationDetails()).setAuthorizationHref(s);
    }

    public abstract String getAuthorizationHref();

    public abstract AuthorizationDetails setAuthorizationHref(String s);
}
