// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            c, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int jE;
    final ComparisonFilter wb;
    final FieldOnlyFilter wc;
    final LogicalFilter wd;
    final NotFilter we;
    final InFilter wf;
    private final a wg;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter)
    {
        jE = i;
        wb = comparisonfilter;
        wc = fieldonlyfilter;
        wd = logicalfilter;
        we = notfilter;
        wf = infilter;
        if (wb != null)
        {
            wg = wb;
            return;
        }
        if (wc != null)
        {
            wg = wc;
            return;
        }
        if (wd != null)
        {
            wg = wd;
            return;
        }
        if (we != null)
        {
            wg = we;
            return;
        }
        if (wf != null)
        {
            wg = wf;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(a a)
    {
        jE = 1;
        Object obj;
        if (a instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)a;
        } else
        {
            obj = null;
        }
        wb = ((ComparisonFilter) (obj));
        if (a instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)a;
        } else
        {
            obj = null;
        }
        wc = ((FieldOnlyFilter) (obj));
        if (a instanceof LogicalFilter)
        {
            obj = (LogicalFilter)a;
        } else
        {
            obj = null;
        }
        wd = ((LogicalFilter) (obj));
        if (a instanceof NotFilter)
        {
            obj = (NotFilter)a;
        } else
        {
            obj = null;
        }
        we = ((NotFilter) (obj));
        if (a instanceof InFilter)
        {
            obj = (InFilter)a;
        } else
        {
            obj = null;
        }
        wf = ((InFilter) (obj));
        if (wb == null && wc == null && wd == null && we == null && wf == null)
        {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        } else
        {
            wg = a;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.c.a(this, parcel, i);
    }

}
