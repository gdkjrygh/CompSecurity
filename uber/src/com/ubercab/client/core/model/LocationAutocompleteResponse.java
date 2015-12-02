// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

public class LocationAutocompleteResponse
{

    List predictions;

    public LocationAutocompleteResponse()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LocationAutocompleteResponse)obj;
            if (predictions == null ? ((LocationAutocompleteResponse) (obj)).predictions != null : !predictions.equals(((LocationAutocompleteResponse) (obj)).predictions))
            {
                return false;
            }
        }
        return true;
    }

    public List getPredictions()
    {
        return predictions;
    }

    public int hashCode()
    {
        if (predictions != null)
        {
            return predictions.hashCode();
        } else
        {
            return 0;
        }
    }
}
