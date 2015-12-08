// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            m

public class GoogleAccountData
    implements SafeParcelable
{

    public static final m CREATOR = new m();
    String accountName;
    boolean mr;
    public List services;
    final int version;

    GoogleAccountData(int i, String s, boolean flag, List list)
    {
        version = i;
        accountName = s;
        mr = flag;
        services = list;
    }

    public GoogleAccountData(String s, boolean flag, List list)
    {
        version = 1;
        accountName = s;
        mr = flag;
        if (list == null)
        {
            s = Collections.EMPTY_LIST;
        } else
        {
            s = Collections.unmodifiableList(new ArrayList(list));
        }
        services = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public List getServices()
    {
        return services;
    }

    public boolean isBrowserFlowRequired()
    {
        return mr;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel);
    }

}
