// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.util.Log;

public final class ic
{

    public static String a(Account account)
    {
        if (account == null)
        {
            return "null";
        }
        if (Log.isLoggable("GCoreUlr", 2))
        {
            return account.name;
        } else
        {
            return (new StringBuilder("account#")).append(account.name.hashCode() % 20).append("#").toString();
        }
    }
}
