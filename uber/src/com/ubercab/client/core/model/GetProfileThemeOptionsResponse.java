// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_GetProfileThemeOptionsResponse

public abstract class GetProfileThemeOptionsResponse
{

    public GetProfileThemeOptionsResponse()
    {
    }

    public static GetProfileThemeOptionsResponse create(List list)
    {
        return (new Shape_GetProfileThemeOptionsResponse()).setProfileThemeOptions(list);
    }

    public abstract List getProfileThemeOptions();

    abstract GetProfileThemeOptionsResponse setProfileThemeOptions(List list);
}
