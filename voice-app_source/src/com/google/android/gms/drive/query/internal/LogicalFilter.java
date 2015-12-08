// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzk, FilterHolder, zzf, 
//            Operator

public class LogicalFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int zzCY;
    private List zzahL;
    final Operator zzahQ;
    final List zzaif;

    LogicalFilter(int i, Operator operator, List list)
    {
        zzCY = i;
        zzahQ = operator;
        zzaif = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        zzCY = 1;
        zzahQ = operator;
        zzaif = new ArrayList(afilter.length + 1);
        zzaif.add(new FilterHolder(filter));
        zzahL = new ArrayList(afilter.length + 1);
        zzahL.add(filter);
        int j = afilter.length;
        for (int i = 0; i < j; i++)
        {
            operator = afilter[i];
            zzaif.add(new FilterHolder(operator));
            zzahL.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        zzCY = 1;
        zzahQ = operator;
        zzahL = new ArrayList();
        zzaif = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); zzaif.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            zzahL.add(iterable);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = zzaif.iterator(); iterator.hasNext(); arraylist.add(((FilterHolder)iterator.next()).getFilter().zza(zzf1))) { }
        return zzf1.zzb(zzahQ, arraylist);
    }

}
