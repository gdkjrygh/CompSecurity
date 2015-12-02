// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public final class LocationTagDeleteResponse
{

    private String status;

    public LocationTagDeleteResponse()
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
            obj = (LocationTagDeleteResponse)obj;
            if (status == null ? ((LocationTagDeleteResponse) (obj)).status != null : !status.equals(((LocationTagDeleteResponse) (obj)).status))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (status != null)
        {
            return status.hashCode();
        } else
        {
            return 0;
        }
    }
}
