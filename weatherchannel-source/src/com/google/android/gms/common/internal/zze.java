// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.zzpt;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu

public final class zze
{
    public static final class zza
    {

        public final Set zzWJ;
        public final boolean zzZW;

        public zza(Set set, boolean flag)
        {
            zzu.zzu(set);
            zzWJ = Collections.unmodifiableSet(set);
            zzZW = flag;
        }
    }


    private final Account zzMY;
    private final String zzOd;
    private final String zzOe;
    private final Set zzWv;
    private final int zzWw;
    private final View zzWx;
    private final Set zzZS;
    private final Map zzZT;
    private final zzpt zzZU;
    private Integer zzZV;

    public zze(Account account, Collection collection, Map map, int i, View view, String s, String s1, 
            zzpt zzpt)
    {
        zzMY = account;
        if (collection == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(new HashSet(collection));
        }
        zzWv = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        zzZT = account;
        zzWx = view;
        zzWw = i;
        zzOe = s;
        zzOd = s1;
        zzZU = zzpt;
        account = new HashSet(zzWv);
        for (collection = zzZT.values().iterator(); collection.hasNext(); account.addAll(((zza)collection.next()).zzWJ)) { }
        zzZS = Collections.unmodifiableSet(account);
    }

    public Account getAccount()
    {
        return zzMY;
    }

    public String getAccountName()
    {
        if (zzMY != null)
        {
            return zzMY.name;
        } else
        {
            return null;
        }
    }

    public void zza(Integer integer)
    {
        zzZV = integer;
    }

    public Set zzb(Api api)
    {
        api = (zza)zzZT.get(api);
        if (api == null || ((zza) (api)).zzWJ.isEmpty())
        {
            return zzWv;
        } else
        {
            HashSet hashset = new HashSet(zzWv);
            hashset.addAll(((zza) (api)).zzWJ);
            return hashset;
        }
    }

    public View zznA()
    {
        return zzWx;
    }

    public zzpt zznB()
    {
        return zzZU;
    }

    public Integer zznC()
    {
        return zzZV;
    }

    public String zzns()
    {
        return zznt().name;
    }

    public Account zznt()
    {
        if (zzMY != null)
        {
            return zzMY;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public int zznu()
    {
        return zzWw;
    }

    public Set zznv()
    {
        return zzWv;
    }

    public Set zznw()
    {
        return zzZS;
    }

    public Map zznx()
    {
        return zzZT;
    }

    public String zzny()
    {
        return zzOe;
    }

    public String zznz()
    {
        return zzOd;
    }
}
