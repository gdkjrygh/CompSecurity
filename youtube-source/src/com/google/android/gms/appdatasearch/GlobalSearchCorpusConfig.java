// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ac, a, Feature

public class GlobalSearchCorpusConfig
    implements SafeParcelable
{

    public static final ac CREATOR = new ac();
    public final Feature features[];
    public final int globalSearchSectionMappings[];
    final int jE;

    GlobalSearchCorpusConfig(int i, int ai[], Feature afeature[])
    {
        jE = i;
        globalSearchSectionMappings = ai;
        features = afeature;
    }

    public GlobalSearchCorpusConfig(int ai[])
    {
        this(ai, null);
    }

    public GlobalSearchCorpusConfig(int ai[], Feature afeature[])
    {
        this(2, ai, afeature);
        boolean flag;
        if (ai.length == a.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag);
    }

    public int describeContents()
    {
        ac ac1 = CREATOR;
        return 0;
    }

    public Feature getFeature(int i)
    {
        return Feature.a(i, features);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac ac1 = CREATOR;
        ac.a(this, parcel, i);
    }

}
