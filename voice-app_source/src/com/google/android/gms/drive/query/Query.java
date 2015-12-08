// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.query:
//            zza, SortOrder, Filter

public class Query
    implements SafeParcelable
{
    public static class Builder
    {

        private Set zzadS;
        private String zzahH;
        private SortOrder zzahI;
        private List zzahJ;
        private boolean zzahK;
        private final List zzahL;

        public Builder addFilter(Filter filter)
        {
            if (!(filter instanceof MatchAllFilter))
            {
                zzahL.add(filter);
            }
            return this;
        }

        public Query build()
        {
            return new Query(new LogicalFilter(Operator.zzaim, zzahL), zzahH, zzahI, zzahJ, zzahK, zzadS);
        }

        public Builder setPageToken(String s)
        {
            zzahH = s;
            return this;
        }

        public Builder setSortOrder(SortOrder sortorder)
        {
            zzahI = sortorder;
            return this;
        }

        public Builder()
        {
            zzahL = new ArrayList();
        }

        public Builder(Query query)
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


    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    final List zzadR;
    private final Set zzadS;
    final LogicalFilter zzahG;
    final String zzahH;
    final SortOrder zzahI;
    final List zzahJ;
    final boolean zzahK;

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, List list1)
    {
        Object obj;
        if (list1 == null)
        {
            obj = null;
        } else
        {
            obj = new HashSet(list1);
        }
        this(i, logicalfilter, s, sortorder, list, flag, list1, ((Set) (obj)));
    }

    private Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, List list1, 
            Set set)
    {
        zzCY = i;
        zzahG = logicalfilter;
        zzahH = s;
        zzahI = sortorder;
        zzahJ = list;
        zzahK = flag;
        zzadR = list1;
        zzadS = set;
    }

    private Query(LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, Set set)
    {
        Object obj;
        if (set == null)
        {
            obj = null;
        } else
        {
            obj = new ArrayList(set);
        }
        this(1, logicalfilter, s, sortorder, list, flag, ((List) (obj)), set);
    }


    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return zzahG;
    }

    public String getPageToken()
    {
        return zzahH;
    }

    public SortOrder getSortOrder()
    {
        return zzahI;
    }

    public String toString()
    {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[] {
            zzahG, zzahI, zzahH, zzadR
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public List zzpZ()
    {
        return zzahJ;
    }

    public boolean zzqa()
    {
        return zzahK;
    }

    public Set zzqb()
    {
        return zzadS;
    }

}
