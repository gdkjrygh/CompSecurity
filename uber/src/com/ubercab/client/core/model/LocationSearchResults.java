// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            LocationSearchResult

public class LocationSearchResults
{

    LocationSearchResult primaryResult;
    LocationSearchResult primary_result;
    List secondaryResults;
    List secondary_results;

    public LocationSearchResults()
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
            obj = (LocationSearchResults)obj;
            if (primaryResult == null ? ((LocationSearchResults) (obj)).primaryResult != null : !primaryResult.equals(((LocationSearchResults) (obj)).primaryResult))
            {
                return false;
            }
            if (primary_result == null ? ((LocationSearchResults) (obj)).primary_result != null : !primary_result.equals(((LocationSearchResults) (obj)).primary_result))
            {
                return false;
            }
            if (secondaryResults == null ? ((LocationSearchResults) (obj)).secondaryResults != null : !secondaryResults.equals(((LocationSearchResults) (obj)).secondaryResults))
            {
                return false;
            }
            if (secondary_results == null ? ((LocationSearchResults) (obj)).secondary_results != null : !secondary_results.equals(((LocationSearchResults) (obj)).secondary_results))
            {
                return false;
            }
        }
        return true;
    }

    public List getAllResults()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = getPrimaryResult();
        if (obj != null)
        {
            arraylist.add(obj);
        }
        obj = getSecondaryResults();
        if (obj != null)
        {
            arraylist.addAll(((java.util.Collection) (obj)));
        }
        return arraylist;
    }

    public LocationSearchResult getPrimaryResult()
    {
        if (primaryResult != null)
        {
            return primaryResult;
        } else
        {
            return primary_result;
        }
    }

    public List getSecondaryResults()
    {
        if (secondaryResults != null)
        {
            return secondaryResults;
        }
        if (secondary_results != null)
        {
            return secondary_results;
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (primary_result != null)
        {
            i = primary_result.hashCode();
        } else
        {
            i = 0;
        }
        if (secondary_results != null)
        {
            j = secondary_results.hashCode();
        } else
        {
            j = 0;
        }
        if (primaryResult != null)
        {
            k = primaryResult.hashCode();
        } else
        {
            k = 0;
        }
        if (secondaryResults != null)
        {
            l = secondaryResults.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
