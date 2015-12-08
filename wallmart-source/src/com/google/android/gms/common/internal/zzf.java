// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.signin.zze;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx

public final class zzf
{
    public static final class zza
    {

        public final Set zzZp;
        public final boolean zzadg;

        public zza(Set set, boolean flag)
        {
            zzx.zzv(set);
            zzZp = Collections.unmodifiableSet(set);
            zzadg = flag;
        }
    }


    private final Account zzOY;
    private final String zzQl;
    private final Set zzYY;
    private final int zzYZ;
    private final View zzZa;
    private final String zzZb;
    private final Set zzadc;
    private final Map zzadd;
    private final zze zzade;
    private Integer zzadf;

    public zzf(Account account, Set set, Map map, int i, View view, String s, String s1, 
            zze zze)
    {
        zzOY = account;
        if (set == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(set);
        }
        zzYY = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        zzadd = account;
        zzZa = view;
        zzYZ = i;
        zzQl = s;
        zzZb = s1;
        zzade = zze;
        account = new HashSet(zzYY);
        for (set = zzadd.values().iterator(); set.hasNext(); account.addAll(((zza)set.next()).zzZp)) { }
        zzadc = Collections.unmodifiableSet(account);
    }

    public static zzf zzaj(Context context)
    {
        return (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).zzni();
    }

    public Account getAccount()
    {
        return zzOY;
    }

    public String getAccountName()
    {
        if (zzOY != null)
        {
            return zzOY.name;
        } else
        {
            return null;
        }
    }

    public void zza(Integer integer)
    {
        zzadf = integer;
    }

    public Set zzb(Api api)
    {
        api = (zza)zzadd.get(api);
        if (api == null || ((zza) (api)).zzZp.isEmpty())
        {
            return zzYY;
        } else
        {
            HashSet hashset = new HashSet(zzYY);
            hashset.addAll(((zza) (api)).zzZp);
            return hashset;
        }
    }

    public Account zzog()
    {
        if (zzOY != null)
        {
            return zzOY;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public int zzoh()
    {
        return zzYZ;
    }

    public Set zzoi()
    {
        return zzYY;
    }

    public Set zzoj()
    {
        return zzadc;
    }

    public Map zzok()
    {
        return zzadd;
    }

    public String zzol()
    {
        return zzQl;
    }

    public String zzom()
    {
        return zzZb;
    }

    public View zzon()
    {
        return zzZa;
    }

    public zze zzoo()
    {
        return zzade;
    }

    public Integer zzop()
    {
        return zzadf;
    }
}
