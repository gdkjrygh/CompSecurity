// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.a.a.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            a, k, an

public final class aa
    implements SafeParcelable
{

    public static final com.google.android.gms.internal.a CREATOR = new com.google.android.gms.internal.a();
    public final long eB;
    public final int eC;
    public final List eD;
    public final boolean eE;
    public final boolean eF;
    public final String eG;
    public final an eH;
    public final Location eI;
    public final Bundle extras;
    public final int tagForChildDirectedTreatment;
    public final int versionCode;

    aa(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int i1, boolean flag1, String s, an an1, Location location)
    {
        versionCode = i;
        eB = l;
        extras = bundle;
        eC = j;
        eD = list;
        eE = flag;
        tagForChildDirectedTreatment = i1;
        eF = flag1;
        eG = s;
        eH = an1;
        eI = location;
    }

    public aa(Context context, k k1)
    {
        Object obj1 = null;
        super();
        versionCode = 2;
        Object obj = k1.a();
        long l;
        if (obj != null)
        {
            l = ((Date) (obj)).getTime();
        } else
        {
            l = -1L;
        }
        eB = l;
        eC = k1.b();
        obj = k1.c();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        eD = ((List) (obj));
        eE = k1.a(context);
        tagForChildDirectedTreatment = k1.h();
        eI = k1.d();
        context = (a)k1.a(com/google/android/gms/ads/a/a/a);
        if (context != null)
        {
            context = context.a();
        } else
        {
            context = null;
        }
        extras = context;
        eF = k1.e();
        eG = k1.f();
        k1 = k1.g();
        context = obj1;
        if (k1 != null)
        {
            context = new an(k1);
        }
        eH = context;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.a.a(this, parcel, i);
    }

}
