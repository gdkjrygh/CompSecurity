// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            ProfilesRequest, UserUuid

public final class Shape_ProfilesRequest extends ProfilesRequest
{

    private UserUuid request;

    Shape_ProfilesRequest()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ProfilesRequest)obj;
            if (((ProfilesRequest) (obj)).getRequest() == null ? getRequest() != null : !((ProfilesRequest) (obj)).getRequest().equals(getRequest()))
            {
                return false;
            }
        }
        return true;
    }

    public final UserUuid getRequest()
    {
        return request;
    }

    public final int hashCode()
    {
        int i;
        if (request == null)
        {
            i = 0;
        } else
        {
            i = request.hashCode();
        }
        return i ^ 0xf4243;
    }

    final ProfilesRequest setRequest(UserUuid useruuid)
    {
        request = useruuid;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ProfilesRequest{request=")).append(request).append("}").toString();
    }
}
