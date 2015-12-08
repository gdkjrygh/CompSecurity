// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            b

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int jE;
    String mName;
    String nS;
    List nT;
    List nU;
    String nV;
    Uri nW;

    private ApplicationMetadata()
    {
        jE = 1;
        nT = new ArrayList();
        nU = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        jE = i;
        nS = s;
        mName = s1;
        nT = list;
        nU = list1;
        nV = s2;
        nW = uri;
    }

    public final Uri aS()
    {
        return nW;
    }

    public final boolean areNamespacesSupported(List list)
    {
        return nU != null && nU.containsAll(list);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getApplicationId()
    {
        return nS;
    }

    public final List getImages()
    {
        return nT;
    }

    public final String getName()
    {
        return mName;
    }

    public final String getSenderAppIdentifier()
    {
        return nV;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final boolean isNamespaceSupported(String s)
    {
        return nU != null && nU.contains(s);
    }

    public final String toString()
    {
        return mName;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
