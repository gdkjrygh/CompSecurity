// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

public final class CombinedLocationHistoryResponse
{

    private List results;

    public CombinedLocationHistoryResponse()
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
            obj = (CombinedLocationHistoryResponse)obj;
            if (results == null ? ((CombinedLocationHistoryResponse) (obj)).results != null : !results.equals(((CombinedLocationHistoryResponse) (obj)).results))
            {
                return false;
            }
        }
        return true;
    }

    public final List getResults()
    {
        return results;
    }

    public final int hashCode()
    {
        if (results != null)
        {
            return results.hashCode();
        } else
        {
            return 0;
        }
    }
}
