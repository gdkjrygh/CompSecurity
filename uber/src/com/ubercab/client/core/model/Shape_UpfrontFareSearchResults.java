// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareSearchResults, UpfrontFareSearchResult

public final class Shape_UpfrontFareSearchResults extends UpfrontFareSearchResults
{

    private UpfrontFareSearchResult primaryResult;
    private List secondaryResults;

    Shape_UpfrontFareSearchResults()
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
            obj = (UpfrontFareSearchResults)obj;
            if (((UpfrontFareSearchResults) (obj)).getSecondaryResults() == null ? getSecondaryResults() != null : !((UpfrontFareSearchResults) (obj)).getSecondaryResults().equals(getSecondaryResults()))
            {
                return false;
            }
            if (((UpfrontFareSearchResults) (obj)).getPrimaryResult() == null ? getPrimaryResult() != null : !((UpfrontFareSearchResults) (obj)).getPrimaryResult().equals(getPrimaryResult()))
            {
                return false;
            }
        }
        return true;
    }

    public final UpfrontFareSearchResult getPrimaryResult()
    {
        return primaryResult;
    }

    public final List getSecondaryResults()
    {
        return secondaryResults;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (secondaryResults == null)
        {
            i = 0;
        } else
        {
            i = secondaryResults.hashCode();
        }
        if (primaryResult != null)
        {
            j = primaryResult.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final UpfrontFareSearchResults setPrimaryResult(UpfrontFareSearchResult upfrontfaresearchresult)
    {
        primaryResult = upfrontfaresearchresult;
        return this;
    }

    final UpfrontFareSearchResults setSecondaryResults(List list)
    {
        secondaryResults = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareSearchResults{secondaryResults=")).append(secondaryResults).append(", primaryResult=").append(primaryResult).append("}").toString();
    }
}
