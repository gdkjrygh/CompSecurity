// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;


// Referenced classes of package com.uservoice.uservoicesdk.model:
//            AccessToken

public class AccessTokenResult
{

    private AccessToken accessToken;
    private Object model;

    public AccessTokenResult(Object obj, AccessToken accesstoken)
    {
        model = obj;
        accessToken = accesstoken;
    }

    public AccessToken getAccessToken()
    {
        return accessToken;
    }

    public Object getModel()
    {
        return model;
    }
}
