// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.people.data:
//            a

public final class Audience
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    public static final int DOMAIN_RESTRICTED_NOT_SET = 0;
    public static final int DOMAIN_RESTRICTED_RESTRICTED = 1;
    public static final int DOMAIN_RESTRICTED_UNRESTRICTED = 2;
    private final int jE;
    private final List tY;
    private final int tZ;
    private final boolean ua;
    private final boolean ub;

    Audience(int i, List list, int j, boolean flag, boolean flag1)
    {
        boolean flag3 = true;
        boolean flag2 = true;
        super();
        List list1 = list;
        if (i == 1)
        {
            list1 = list;
            if (list == null)
            {
                list1 = Collections.emptyList();
            }
        }
        jE = i;
        tY = Collections.unmodifiableList(list1);
        tZ = j;
        if (i == 1)
        {
            ua = flag;
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            ub = flag;
            return;
        }
        ub = flag1;
        if (!flag1)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        ua = flag;
    }

    Audience(List list, int i, boolean flag)
    {
        jE = 2;
        tY = list;
        tZ = i;
        ub = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ua = flag;
    }

    final boolean cd()
    {
        return ua;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Audience)
        {
            if (jE == ((Audience) (obj = (Audience)obj)).jE && ge.a(tY, ((Audience) (obj)).tY) && tZ == ((Audience) (obj)).tZ && ub == ((Audience) (obj)).ub)
            {
                return true;
            }
        }
        return false;
    }

    public final List getAudienceMemberList()
    {
        return tY;
    }

    public final int getDomainRestricted()
    {
        return tZ;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(jE), tY, Integer.valueOf(tZ), Boolean.valueOf(ub)
        });
    }

    public final boolean isReadOnly()
    {
        return ub;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel);
    }

}
