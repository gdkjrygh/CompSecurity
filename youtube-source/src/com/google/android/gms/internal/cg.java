// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            co

public final class cg
    implements SafeParcelable
{

    public static final co CREATOR = new co();
    public final int errorCode;
    public final List fO;
    public final List fP;
    public final long fS;
    public final String gO;
    public final long hA;
    public final boolean hB;
    public final long hC;
    public final List hD;
    public final String hE;
    public final String hz;
    public final int orientation;
    public final int versionCode;

    public cg(int i)
    {
        this(2, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null);
    }

    cg(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2)
    {
        versionCode = i;
        gO = s;
        hz = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        fO = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        fP = s;
        hA = l;
        hB = flag;
        hC = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        hD = s;
        fS = l2;
        orientation = k;
        hE = s2;
    }

    public cg(String s, String s1, List list, List list1, long l, boolean flag, 
            long l1, List list2, long l2, int i, String s2)
    {
        this(2, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        co.a(this, parcel);
    }

}
