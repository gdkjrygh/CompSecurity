// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            GetProfilesResponse

public final class Shape_GetProfilesResponse extends GetProfilesResponse
{

    private List profiles;

    Shape_GetProfilesResponse()
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
            obj = (GetProfilesResponse)obj;
            if (((GetProfilesResponse) (obj)).getProfiles() == null ? getProfiles() != null : !((GetProfilesResponse) (obj)).getProfiles().equals(getProfiles()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getProfiles()
    {
        return profiles;
    }

    public final int hashCode()
    {
        int i;
        if (profiles == null)
        {
            i = 0;
        } else
        {
            i = profiles.hashCode();
        }
        return i ^ 0xf4243;
    }

    final GetProfilesResponse setProfiles(List list)
    {
        profiles = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GetProfilesResponse{profiles=")).append(profiles).append("}").toString();
    }
}
