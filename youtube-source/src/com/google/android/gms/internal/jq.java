// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            iw

public class jq
    implements SafeParcelable
{

    public static final iw CREATOR = new iw();
    public final long Lb;
    public final byte Lc[];
    public final Bundle Ld;
    public final String tag;
    public final int versionCode;

    jq(int i, long l, String s, byte abyte0[], Bundle bundle)
    {
        versionCode = i;
        Lb = l;
        tag = s;
        Lc = abyte0;
        Ld = bundle;
    }

    public transient jq(long l, String s, byte abyte0[], String as[])
    {
        versionCode = 1;
        Lb = l;
        tag = s;
        Lc = abyte0;
        Ld = d(as);
    }

    private static transient Bundle d(String as[])
    {
        Bundle bundle = null;
        if (as != null) goto _L2; else goto _L1
_L1:
        return bundle;
_L2:
        if (as.length % 2 != 0)
        {
            throw new IllegalArgumentException("extras must have an even number of elements");
        }
        int j = as.length / 2;
        if (j == 0)
        {
            continue;
        }
        Bundle bundle1 = new Bundle(j);
        int i = 0;
        do
        {
            bundle = bundle1;
            if (i >= j)
            {
                continue;
            }
            bundle1.putString(as[i * 2], as[i * 2 + 1]);
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("tag=").append(tag).append(",");
        stringbuilder.append("eventTime=").append(Lb).append(",");
        if (Ld != null && !Ld.isEmpty())
        {
            stringbuilder.append("keyValues=");
            for (Iterator iterator = Ld.keySet().iterator(); iterator.hasNext(); stringbuilder.append(" "))
            {
                String s = (String)iterator.next();
                stringbuilder.append("(").append(s).append(",");
                stringbuilder.append(Ld.getString(s)).append(")");
            }

        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        iw.a(this, parcel);
    }

}
