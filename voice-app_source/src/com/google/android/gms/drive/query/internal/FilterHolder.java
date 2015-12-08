// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            zzd, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter, 
//            FullTextSearchFilter, OwnedByMeFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    final int zzCY;
    private final Filter zzadx;
    final ComparisonFilter zzahU;
    final FieldOnlyFilter zzahV;
    final LogicalFilter zzahW;
    final NotFilter zzahX;
    final InFilter zzahY;
    final MatchAllFilter zzahZ;
    final HasFilter zzaia;
    final FullTextSearchFilter zzaib;
    final OwnedByMeFilter zzaic;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter, FullTextSearchFilter fulltextsearchfilter, OwnedByMeFilter ownedbymefilter)
    {
        zzCY = i;
        zzahU = comparisonfilter;
        zzahV = fieldonlyfilter;
        zzahW = logicalfilter;
        zzahX = notfilter;
        zzahY = infilter;
        zzahZ = matchallfilter;
        zzaia = hasfilter;
        zzaib = fulltextsearchfilter;
        zzaic = ownedbymefilter;
        if (zzahU != null)
        {
            zzadx = zzahU;
            return;
        }
        if (zzahV != null)
        {
            zzadx = zzahV;
            return;
        }
        if (zzahW != null)
        {
            zzadx = zzahW;
            return;
        }
        if (zzahX != null)
        {
            zzadx = zzahX;
            return;
        }
        if (zzahY != null)
        {
            zzadx = zzahY;
            return;
        }
        if (zzahZ != null)
        {
            zzadx = zzahZ;
            return;
        }
        if (zzaia != null)
        {
            zzadx = zzaia;
            return;
        }
        if (zzaib != null)
        {
            zzadx = zzaib;
            return;
        }
        if (zzaic != null)
        {
            zzadx = zzaic;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        zzu.zzb(filter, "Null filter.");
        zzCY = 2;
        Object obj;
        if (filter instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)filter;
        } else
        {
            obj = null;
        }
        zzahU = ((ComparisonFilter) (obj));
        if (filter instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)filter;
        } else
        {
            obj = null;
        }
        zzahV = ((FieldOnlyFilter) (obj));
        if (filter instanceof LogicalFilter)
        {
            obj = (LogicalFilter)filter;
        } else
        {
            obj = null;
        }
        zzahW = ((LogicalFilter) (obj));
        if (filter instanceof NotFilter)
        {
            obj = (NotFilter)filter;
        } else
        {
            obj = null;
        }
        zzahX = ((NotFilter) (obj));
        if (filter instanceof InFilter)
        {
            obj = (InFilter)filter;
        } else
        {
            obj = null;
        }
        zzahY = ((InFilter) (obj));
        if (filter instanceof MatchAllFilter)
        {
            obj = (MatchAllFilter)filter;
        } else
        {
            obj = null;
        }
        zzahZ = ((MatchAllFilter) (obj));
        if (filter instanceof HasFilter)
        {
            obj = (HasFilter)filter;
        } else
        {
            obj = null;
        }
        zzaia = ((HasFilter) (obj));
        if (filter instanceof FullTextSearchFilter)
        {
            obj = (FullTextSearchFilter)filter;
        } else
        {
            obj = null;
        }
        zzaib = ((FullTextSearchFilter) (obj));
        if (filter instanceof OwnedByMeFilter)
        {
            obj = (OwnedByMeFilter)filter;
        } else
        {
            obj = null;
        }
        zzaic = ((OwnedByMeFilter) (obj));
        if (zzahU == null && zzahV == null && zzahW == null && zzahX == null && zzahY == null && zzahZ == null && zzaia == null && zzaib == null && zzaic == null)
        {
            throw new IllegalArgumentException("Invalid filter type.");
        } else
        {
            zzadx = filter;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return zzadx;
    }

    public String toString()
    {
        return String.format("FilterHolder[%s]", new Object[] {
            zzadx
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

}
