// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            aj

public class QuerySpecification
    implements SafeParcelable
{

    public static final aj CREATOR = new aj();
    final int jE;
    public final boolean prefixMatch;
    public final boolean wantUris;
    public final List wantedSections;
    public final List wantedTags;

    QuerySpecification(int i, boolean flag, List list, List list1, boolean flag1)
    {
        jE = i;
        wantUris = flag;
        wantedTags = list;
        wantedSections = list1;
        prefixMatch = flag1;
    }

    public QuerySpecification(boolean flag, boolean flag1, List list, List list1)
    {
        this(2, flag1, list1, list, flag);
    }

    public int describeContents()
    {
        aj aj1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj aj1 = CREATOR;
        aj.a(this, parcel);
    }

}
