// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            LocationSearchResult

public final class LocationTagAddResponse
{

    private LocationSearchResult result;

    public LocationTagAddResponse()
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
            obj = (LocationTagAddResponse)obj;
            if (result == null ? ((LocationTagAddResponse) (obj)).result != null : !result.equals(((LocationTagAddResponse) (obj)).result))
            {
                return false;
            }
        }
        return true;
    }

    public final LocationSearchResult getResult()
    {
        return result;
    }

    public final int hashCode()
    {
        if (result != null)
        {
            return result.hashCode();
        } else
        {
            return 0;
        }
    }
}
