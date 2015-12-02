// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.client.core.model:
//            UpdateProfileResponse

public final class Shape_UpdateProfileResponse extends UpdateProfileResponse
{

    private Profile profile;

    Shape_UpdateProfileResponse()
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
            obj = (UpdateProfileResponse)obj;
            if (((UpdateProfileResponse) (obj)).getProfile() == null ? getProfile() != null : !((UpdateProfileResponse) (obj)).getProfile().equals(getProfile()))
            {
                return false;
            }
        }
        return true;
    }

    public final Profile getProfile()
    {
        return profile;
    }

    public final int hashCode()
    {
        int i;
        if (profile == null)
        {
            i = 0;
        } else
        {
            i = profile.hashCode();
        }
        return i ^ 0xf4243;
    }

    final UpdateProfileResponse setProfile(Profile profile1)
    {
        profile = profile1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpdateProfileResponse{profile=")).append(profile).append("}").toString();
    }
}
