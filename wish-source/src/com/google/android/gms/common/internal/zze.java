// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.zzme;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zze
{
    public static final class zza
    {

        public final Set zzPP;
        public final boolean zzTa;
    }


    private final Account zzJc;
    private final int zzPA;
    private final View zzPB;
    private final String zzPC;
    private final String zzPD;
    private final Set zzPz;
    private final Set zzSW;
    private final Map zzSX;
    private final zzme zzSY;
    private Integer zzSZ;

    public zze(Account account, Collection collection, Map map, int i, View view, String s, String s1, 
            zzme zzme)
    {
        zzJc = account;
        if (collection == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(new HashSet(collection));
        }
        zzPz = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        zzSX = account;
        zzPB = view;
        zzPA = i;
        zzPC = s;
        zzPD = s1;
        zzSY = zzme;
        account = new HashSet(zzPz);
        for (collection = zzSX.values().iterator(); collection.hasNext(); account.addAll(((zza)collection.next()).zzPP)) { }
        zzSW = Collections.unmodifiableSet(account);
    }

    public Account getAccount()
    {
        return zzJc;
    }

    public String getAccountName()
    {
        if (zzJc != null)
        {
            return zzJc.name;
        } else
        {
            return null;
        }
    }

    public void zza(Integer integer)
    {
        zzSZ = integer;
    }

    public Set zzb(Api api)
    {
        api = (zza)zzSX.get(api);
        if (api == null || ((zza) (api)).zzPP.isEmpty())
        {
            return zzPz;
        } else
        {
            HashSet hashset = new HashSet(zzPz);
            hashset.addAll(((zza) (api)).zzPP);
            return hashset;
        }
    }

    public String zzlC()
    {
        return zzlD().name;
    }

    public Account zzlD()
    {
        if (zzJc != null)
        {
            return zzJc;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public Set zzlF()
    {
        return zzPz;
    }

    public Set zzlG()
    {
        return zzSW;
    }

    public Map zzlH()
    {
        return zzSX;
    }

    public String zzlI()
    {
        return zzPC;
    }

    public String zzlJ()
    {
        return zzPD;
    }

    public zzme zzlL()
    {
        return zzSY;
    }

    public Integer zzlM()
    {
        return zzSZ;
    }
}
