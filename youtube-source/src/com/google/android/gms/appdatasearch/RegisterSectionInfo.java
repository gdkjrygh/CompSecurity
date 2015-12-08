// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            al, j, Feature

public class RegisterSectionInfo
    implements SafeParcelable
{

    public static final al CREATOR = new al();
    public final Feature features[];
    public final String format;
    public final boolean indexPrefixes;
    final int jE;
    public final String name;
    public final boolean noIndex;
    public final String subsectionSeparator;
    public final int weight;

    RegisterSectionInfo(int i, String s, String s1, boolean flag, int k, boolean flag1, String s2, 
            Feature afeature[])
    {
        jE = i;
        name = s;
        format = s1;
        noIndex = flag;
        weight = k;
        indexPrefixes = flag1;
        subsectionSeparator = s2;
        features = afeature;
    }

    public RegisterSectionInfo(String s, String s1, boolean flag, int i, boolean flag1, String s2, Feature afeature[])
    {
        this(2, s, s1, flag, i, flag1, s2, afeature);
    }

    public static j builder(String s)
    {
        return new j(s);
    }

    public int describeContents()
    {
        al al1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RegisterSectionInfo)
        {
            obj = (RegisterSectionInfo)obj;
            flag = flag1;
            if (name.equals(((RegisterSectionInfo) (obj)).name))
            {
                flag = flag1;
                if (format.equals(((RegisterSectionInfo) (obj)).format))
                {
                    flag = flag1;
                    if (noIndex == ((RegisterSectionInfo) (obj)).noIndex)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public Feature getFeature(int i)
    {
        return Feature.a(i, features);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        al al1 = CREATOR;
        al.a(this, parcel, i);
    }

}
