// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            aa, as

public final class ak
{

    private final as a;
    private final aa b;
    private final SharedPreferences c;

    public ak(aa aa1, as as1, SharedPreferences sharedpreferences)
    {
        b = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        a = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1);
        c = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
    }

    public static String e()
    {
        return Util.a(new String[] {
            "https://www.googleapis.com/auth/youtube", "https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/emeraldsea.mobileapps.doritos.cookie", "https://www.googleapis.com/auth/plus.stream.read", "https://www.googleapis.com/auth/plus.stream.write", "https://www.googleapis.com/auth/plus.pages.manage"
        });
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        String s = b();
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s1 = b();
        if (a.a(s1) == null)
        {
            b.a("Account was removed from device");
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s = c.getString("user_account", null);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final String c()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        boolean flag;
        s = c.getString("user_identity", null);
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        flag = s.equals("No +Page Delegate");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s = null;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final String d()
    {
        this;
        JVM INSTR monitorenter ;
        String s = c.getString("username", null);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
