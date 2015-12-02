// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_GetProfilesResponse

public abstract class GetProfilesResponse
{

    public GetProfilesResponse()
    {
    }

    public static GetProfilesResponse create(List list)
    {
        return (new Shape_GetProfilesResponse()).setProfiles(list);
    }

    public abstract List getProfiles();

    abstract GetProfilesResponse setProfiles(List list);
}
