// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            GetProfileThemeOptionsResponse

public final class Shape_GetProfileThemeOptionsResponse extends GetProfileThemeOptionsResponse
{

    private List profileThemeOptions;

    Shape_GetProfileThemeOptionsResponse()
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
            obj = (GetProfileThemeOptionsResponse)obj;
            if (((GetProfileThemeOptionsResponse) (obj)).getProfileThemeOptions() == null ? getProfileThemeOptions() != null : !((GetProfileThemeOptionsResponse) (obj)).getProfileThemeOptions().equals(getProfileThemeOptions()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getProfileThemeOptions()
    {
        return profileThemeOptions;
    }

    public final int hashCode()
    {
        int i;
        if (profileThemeOptions == null)
        {
            i = 0;
        } else
        {
            i = profileThemeOptions.hashCode();
        }
        return i ^ 0xf4243;
    }

    final GetProfileThemeOptionsResponse setProfileThemeOptions(List list)
    {
        profileThemeOptions = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GetProfileThemeOptionsResponse{profileThemeOptions=")).append(profileThemeOptions).append("}").toString();
    }
}
