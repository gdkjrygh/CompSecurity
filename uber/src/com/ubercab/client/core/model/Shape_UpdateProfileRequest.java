// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            UpdateProfileRequest, UserUuidAndProfile

public final class Shape_UpdateProfileRequest extends UpdateProfileRequest
{

    private UserUuidAndProfile request;

    Shape_UpdateProfileRequest()
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
            obj = (UpdateProfileRequest)obj;
            if (((UpdateProfileRequest) (obj)).getRequest() == null ? getRequest() != null : !((UpdateProfileRequest) (obj)).getRequest().equals(getRequest()))
            {
                return false;
            }
        }
        return true;
    }

    public final UserUuidAndProfile getRequest()
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

    final UpdateProfileRequest setRequest(UserUuidAndProfile useruuidandprofile)
    {
        request = useruuidandprofile;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpdateProfileRequest{request=")).append(request).append("}").toString();
    }
}
