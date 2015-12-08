// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            l, al, as, b, 
//            h, f, ag, ac, 
//            ae, ab, z, ai, 
//            ad, af, aj, ah

public final class aa
{

    private final l a;
    private final al b;
    private final as c;
    private final b d;
    private final h e;
    private final Executor f;
    private final Executor g;
    private final a h;
    private final SharedPreferences i;
    private final Set j = new HashSet();
    private String k;

    public aa(l l1, al al1, as as1, b b1, h h1, Executor executor, Executor executor1, 
            a a1, SharedPreferences sharedpreferences)
    {
        a = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        b = (al)com.google.android.apps.youtube.common.fromguava.c.a(al1);
        c = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        e = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        f = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        g = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor1);
        h = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        i = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
    }

    static Set a(aa aa1)
    {
        return aa1.j;
    }

    private void a(Activity activity)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", true);
        ArrayList arraylist = new ArrayList();
        Collections.addAll(arraylist, c.b());
        String s = c.a();
        String s1 = c.c;
        activity.startActivityForResult(AccountManager.newChooseAccountIntent(null, arraylist, new String[] {
            s
        }, true, null, s1, null, bundle), 903);
    }

    private void a(Activity activity, String s)
    {
        s = new f(s, null);
        g.execute(new ag(this, activity, s));
    }

    static void a(aa aa1, Activity activity, f f1, Intent intent)
    {
        aa1.k = f1.b();
        activity.startActivityForResult(intent, 905);
    }

    static void a(aa aa1, f f1)
    {
        aa1.e.b(f1, new ac(aa1, f1));
    }

    static void a(aa aa1, String s, String s1)
    {
        aa1.i.edit().putString("username", s).putString("user_channel_id", s1).apply();
    }

    private void a(boolean flag)
    {
        i.edit().putBoolean("user_signed_out", flag).apply();
    }

    static b b(aa aa1)
    {
        return aa1.d;
    }

    private void b()
    {
        if (!a.b())
        {
            c();
            a(true);
            a.h();
        }
        f.execute(new ae(this));
    }

    private void c()
    {
        i.edit().remove("user_account").remove("username").remove("user_channel_id").remove("user_identity").remove("delegate_cache").apply();
        i.edit().remove("profile_display_email").remove("profile_display_name").remove("profile_thumbnail_uri").apply();
    }

    public final void a(Activity activity, ah ah)
    {
        j.add(ah);
        if (j.size() == 1)
        {
            a(activity);
        }
    }

    final void a(Activity activity, f f1)
    {
        b.a(activity, f1, new ab(this));
    }

    final void a(f f1, z z1)
    {
        if (a.b())
        {
            a("Signed in as new account");
        }
        a(false);
        i.edit().putString("user_account", f1.b()).putString("user_identity", f1.a()).apply();
        z1.a(i);
        a.a(f1, z1);
        h.c(new ai());
        f.execute(new ad(this));
    }

    final void a(Exception exception)
    {
        if (!a.b())
        {
            c();
            a.h();
        }
        f.execute(new af(this, exception));
    }

    public final void a(String s)
    {
        L.e((new StringBuilder("Signing out because: ")).append(s).toString());
        c();
        a(true);
        a.h();
        h.c(new aj());
    }

    public final boolean a()
    {
        return i.getBoolean("user_signed_out", false);
    }

    public final boolean a(Activity activity, int i1, int j1, Intent intent)
    {
        switch (i1)
        {
        case 904: 
        default:
            return false;

        case 903: 
            if (j1 != -1)
            {
                b();
            } else
            if (intent == null)
            {
                a(((Exception) (new IllegalStateException("Could not get account choice result."))));
            } else
            {
                Exception exception = (Exception)intent.getSerializableExtra("exception");
                if (exception != null)
                {
                    a(exception);
                } else
                {
                    intent = intent.getStringExtra("authAccount");
                    if (TextUtils.isEmpty(intent))
                    {
                        a(((Exception) (new IllegalStateException("Error fetching account name."))));
                    } else
                    {
                        a(activity, ((String) (intent)));
                    }
                }
            }
            return true;

        case 905: 
            intent = k;
            k = null;
            break;
        }
        if (j1 != -1)
        {
            b();
        } else
        if (TextUtils.isEmpty(intent))
        {
            a(((Exception) (new IllegalStateException("Auth recovery without a saved account name."))));
        } else
        {
            a(activity, ((String) (intent)));
        }
        return true;
    }

    public final void b(Activity activity, ah ah)
    {
label0:
        {
            j.add(ah);
            if (j.size() == 1)
            {
                ah = c.b();
                if (ah.length != 1)
                {
                    break label0;
                }
                a(activity, ((Account) (ah[0])).name);
            }
            return;
        }
        a(activity);
    }
}
