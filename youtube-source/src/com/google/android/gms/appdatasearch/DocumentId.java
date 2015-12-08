// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            v

public class DocumentId
    implements SafeParcelable
{

    public static final v CREATOR = new v();
    final int jE;
    final String jL;
    final String jM;
    final String jN;

    DocumentId(int i, String s, String s1, String s2)
    {
        jE = i;
        jL = s;
        jM = s1;
        jN = s2;
    }

    DocumentId(String s, String s1, String s2)
    {
        this(1, s, s1, s2);
    }

    public int describeContents()
    {
        v v1 = CREATOR;
        return 0;
    }

    public String getCorpusName()
    {
        return jM;
    }

    public String getPackageName()
    {
        return jL;
    }

    public String getUri()
    {
        return jN;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            jL, jM, jN
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        v v1 = CREATOR;
        v.a(this, parcel);
    }

}
