// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.client.core.model:
//            UserUuidAndProfile

public final class Shape_UserUuidAndProfile extends UserUuidAndProfile
{

    private Profile profile;
    private String userUuid;

    Shape_UserUuidAndProfile()
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
            obj = (UserUuidAndProfile)obj;
            if (((UserUuidAndProfile) (obj)).getUserUuid() == null ? getUserUuid() != null : !((UserUuidAndProfile) (obj)).getUserUuid().equals(getUserUuid()))
            {
                return false;
            }
            if (((UserUuidAndProfile) (obj)).getProfile() == null ? getProfile() != null : !((UserUuidAndProfile) (obj)).getProfile().equals(getProfile()))
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

    public final String getUserUuid()
    {
        return userUuid;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (userUuid == null)
        {
            i = 0;
        } else
        {
            i = userUuid.hashCode();
        }
        if (profile != null)
        {
            j = profile.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final UserUuidAndProfile setProfile(Profile profile1)
    {
        profile = profile1;
        return this;
    }

    final UserUuidAndProfile setUserUuid(String s)
    {
        userUuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UserUuidAndProfile{userUuid=")).append(userUuid).append(", profile=").append(profile).append("}").toString();
    }
}
