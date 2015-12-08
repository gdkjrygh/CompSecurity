// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            f, FilterHolder, Operator

public class LogicalFilter
    implements SafeParcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final int jE;
    private List vX;
    final Operator vY;
    final List wi;

    LogicalFilter(int i, Operator operator, List list)
    {
        jE = i;
        vY = operator;
        wi = list;
    }

    public transient LogicalFilter(Operator operator, a a1, a aa[])
    {
        jE = 1;
        vY = operator;
        wi = new ArrayList(aa.length + 1);
        wi.add(new FilterHolder(a1));
        vX = new ArrayList(aa.length + 1);
        vX.add(a1);
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            operator = aa[i];
            wi.add(new FilterHolder(operator));
            vX.add(operator);
        }

    }

    public LogicalFilter(Operator operator, List list)
    {
        jE = 1;
        vY = operator;
        vX = list;
        wi = new ArrayList(list.size());
        for (operator = list.iterator(); operator.hasNext(); wi.add(new FilterHolder(list)))
        {
            list = (a)operator.next();
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.f.a(this, parcel, i);
    }

}
