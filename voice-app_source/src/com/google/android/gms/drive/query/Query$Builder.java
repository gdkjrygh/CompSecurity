// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder, Filter

public static class zzadS
{

    private Set zzadS;
    private String zzahH;
    private SortOrder zzahI;
    private List zzahJ;
    private boolean zzahK;
    private final List zzahL;

    public zzadS addFilter(Filter filter)
    {
        if (!(filter instanceof MatchAllFilter))
        {
            zzahL.add(filter);
        }
        return this;
    }

    public Query build()
    {
        return new Query(new LogicalFilter(Operator.zzaim, zzahL), zzahH, zzahI, zzahJ, zzahK, zzadS, null);
    }

    public alFilter setPageToken(String s)
    {
        zzahH = s;
        return this;
    }

    public zzahH setSortOrder(SortOrder sortorder)
    {
        zzahI = sortorder;
        return this;
    }

    public tor()
    {
        zzahL = new ArrayList();
    }

    public zzahL(Query query)
    {
        zzahL = new ArrayList();
        zzahL.add(query.getFilter());
        zzahH = query.getPageToken();
        zzahI = query.getSortOrder();
        zzahJ = query.zzpZ();
        zzahK = query.zzqa();
        zzadS = query.zzqb();
    }
}
