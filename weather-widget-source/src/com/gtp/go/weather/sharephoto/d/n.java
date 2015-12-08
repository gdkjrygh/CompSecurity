// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.b.o;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            o

public class n
{

    private static Account a(AccountManager accountmanager)
    {
        accountmanager = accountmanager.getAccountsByType("com.google");
        if (accountmanager.length == 1)
        {
            return accountmanager[0];
        } else
        {
            return null;
        }
    }

    public static ArrayList a(ArrayList arraylist)
    {
        Collections.sort(arraylist, new com.gtp.go.weather.sharephoto.d.o());
        return arraylist;
    }

    public static boolean a(Context context)
    {
        return !TextUtils.isEmpty(g.a(context).b().a());
    }

    public static String b(Context context)
    {
        context = a(AccountManager.get(context));
        if (context == null)
        {
            return null;
        } else
        {
            return ((Account) (context)).name;
        }
    }

    public static boolean c(Context context)
    {
        context = w.n(context).toLowerCase();
        return !TextUtils.isEmpty(context) && (context.equals("us") || context.equals("ca"));
    }
}
