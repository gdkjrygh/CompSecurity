// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hn, ge, gf

public final class hk
    implements SafeParcelable
{

    public static final hn CREATOR = new hn();
    private final int CO;
    final List CP;
    private final String CQ;
    private final String CR;
    private final boolean CS;
    private final Set CT;
    final int jE;

    hk(int i, int j, List list, String s, String s1, boolean flag)
    {
        jE = i;
        CO = j;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        CP = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        CQ = list;
        list = s1;
        if (s1 == null)
        {
            list = "";
        }
        CR = list;
        CS = flag;
        if (CP.isEmpty())
        {
            CT = Collections.emptySet();
            return;
        } else
        {
            CT = Collections.unmodifiableSet(new HashSet(CP));
            return;
        }
    }

    public final int dK()
    {
        return CO;
    }

    public final String dL()
    {
        return CQ;
    }

    public final String dM()
    {
        return CR;
    }

    public final boolean dN()
    {
        return CS;
    }

    public final int describeContents()
    {
        hn hn1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hk))
            {
                return false;
            }
            obj = (hk)obj;
            if (CO != ((hk) (obj)).CO || !CT.equals(((hk) (obj)).CT) || CQ != ((hk) (obj)).CQ || CR != ((hk) (obj)).CR || CS != ((hk) (obj)).CS)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(CO), CT, CQ, CR, Boolean.valueOf(CS)
        });
    }

    public final String toString()
    {
        return ge.a(this).a("maxResults", Integer.valueOf(CO)).a("types", CT).a("nameQuery", CQ).a("textQuery", CR).a("isOpenNowRequired", Boolean.valueOf(CS)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        hn hn1 = CREATOR;
        hn.a(this, parcel);
    }

}
