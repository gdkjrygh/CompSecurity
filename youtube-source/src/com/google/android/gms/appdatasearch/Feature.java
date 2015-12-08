// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            y

public class Feature
    implements SafeParcelable
{

    public static final y CREATOR = new y();
    public final int id;
    final int jE;
    final Bundle jR;

    Feature(int i)
    {
        this(1, i, new Bundle());
    }

    Feature(int i, int j, Bundle bundle)
    {
        jE = i;
        id = j;
        jR = bundle;
    }

    static Feature a(int i, Feature afeature[])
    {
        if (afeature == null)
        {
            return null;
        }
        for (int j = 0; j < afeature.length; j++)
        {
            if (afeature[j].id == i)
            {
                return afeature[j];
            }
        }

        return null;
    }

    static void a(List list, Feature feature)
    {
        if (feature != null)
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (((Feature)list.get(i)).id == feature.id)
                {
                    throw new IllegalStateException((new StringBuilder("Feature ")).append(feature.id).append(" already exists").toString());
                }
            }

            list.add(feature);
        }
    }

    Feature b(String s, String s1)
    {
        jR.putString(s, s1);
        return this;
    }

    public int describeContents()
    {
        y y1 = CREATOR;
        return 0;
    }

    public String getParameter(String s)
    {
        return jR.getString(s);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        y y1 = CREATOR;
        y.a(this, parcel);
    }

}
