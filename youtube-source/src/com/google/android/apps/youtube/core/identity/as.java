// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            l

public final class as
{

    protected final AccountManager a;
    protected final String b;
    public final String c;

    protected as()
    {
        a = null;
        c = Util.a(new String[] {
            "http://gdata.youtube.com"
        });
        b = "";
    }

    public as(Context context, String s)
    {
        a = AccountManager.get(context);
        c = com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = "com.google";
    }

    public final Account a(l l1)
    {
        return a(l1.f());
    }

    public final Account a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            Account aaccount[] = b();
            int j = aaccount.length;
            int i = 0;
            while (i < j) 
            {
                Account account = aaccount[i];
                if (TextUtils.equals(account.name, s))
                {
                    return account;
                }
                i++;
            }
        }
        return null;
    }

    public final String a()
    {
        return b;
    }

    public final Account[] b()
    {
        return a.getAccountsByType(b);
    }
}
