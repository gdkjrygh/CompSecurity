// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareSearchResults, UpfrontFareSearchResult

public abstract class UpfrontFareSearchResults
{

    public UpfrontFareSearchResults()
    {
    }

    public static UpfrontFareSearchResults create()
    {
        return new Shape_UpfrontFareSearchResults();
    }

    public abstract UpfrontFareSearchResult getPrimaryResult();

    public List getResults()
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

    public abstract List getSecondaryResults();

    abstract UpfrontFareSearchResults setPrimaryResult(UpfrontFareSearchResult upfrontfaresearchresult);

    abstract UpfrontFareSearchResults setSecondaryResults(List list);
}
