// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            p

public class CorpusId
    implements SafeParcelable
{

    public static final p CREATOR = new p();
    public final String corpusName;
    final int jE;
    public final String packageName;

    CorpusId(int i, String s, String s1)
    {
        jE = i;
        packageName = s;
        corpusName = s1;
    }

    public CorpusId(String s, String s1)
    {
        this(1, s, s1);
    }

    public int describeContents()
    {
        p p1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof CorpusId)
        {
            obj = (CorpusId)obj;
            flag = flag1;
            if (ge.a(packageName, ((CorpusId) (obj)).packageName))
            {
                flag = flag1;
                if (ge.a(corpusName, ((CorpusId) (obj)).corpusName))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            packageName, corpusName
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p p1 = CREATOR;
        p.a(this, parcel);
    }

}
