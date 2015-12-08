// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.util.Pair;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;

public final class am extends BasicCookieStore
{

    private final Map a = new HashMap();

    public am()
    {
    }

    public final void a(String s, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        this;
        JVM INSTR monitorenter ;
        a.put(new Pair(s, s1), Boolean.valueOf(false));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void addCookie(Cookie cookie)
    {
        if (cookie == null)
        {
            return;
        }
        Pair pair = new Pair(cookie.getDomain(), cookie.getName());
        this;
        JVM INSTR monitorenter ;
        if (a.containsKey(pair))
        {
            super.addCookie(cookie);
            a.put(pair, Boolean.valueOf(true));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        cookie;
        this;
        JVM INSTR monitorexit ;
        throw cookie;
    }

    public final void b(String s, String s1)
    {
        Pair pair;
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        pair = new Pair(s, s1);
        Date date = new Date(0L);
        s1 = new BasicClientCookie(s1, "");
        s1.setDomain(s);
        s1.setExpiryDate(date);
        this;
        JVM INSTR monitorenter ;
        addCookie(s1);
        a.remove(pair);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String c(String s, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        for (Iterator iterator = getCookies().iterator(); iterator.hasNext();)
        {
            Cookie cookie = (Cookie)iterator.next();
            if (s.equals(cookie.getDomain()) && s1.equals(cookie.getName()))
            {
                return cookie.getValue();
            }
        }

        return null;
    }

    public final boolean d(String s, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        this;
        JVM INSTR monitorenter ;
        Boolean boolean1 = (Boolean)a.get(new Pair(s, s1));
        this;
        JVM INSTR monitorexit ;
        return boolean1 != null && boolean1.booleanValue() && c(s, s1) == null;
        s;
        throw s;
    }
}
