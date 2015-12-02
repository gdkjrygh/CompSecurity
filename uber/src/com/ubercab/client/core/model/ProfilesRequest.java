// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ProfilesRequest, UserUuid

public abstract class ProfilesRequest
{

    public ProfilesRequest()
    {
    }

    public static ProfilesRequest create(String s)
    {
        return (new Shape_ProfilesRequest()).setRequest(UserUuid.create(s));
    }

    public abstract UserUuid getRequest();

    abstract ProfilesRequest setRequest(UserUuid useruuid);
}
