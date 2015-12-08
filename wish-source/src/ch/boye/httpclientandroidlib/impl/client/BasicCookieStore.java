// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.client.CookieStore;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieIdentityComparator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BasicCookieStore
    implements CookieStore, Serializable
{

    private static final long serialVersionUID = 0x96ca8bce24c77aa7L;
    private final TreeSet cookies = new TreeSet(new CookieIdentityComparator());

    public BasicCookieStore()
    {
    }

    public void addCookie(Cookie cookie)
    {
        this;
        JVM INSTR monitorenter ;
        if (cookie == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        cookies.remove(cookie);
        if (!cookie.isExpired(new Date()))
        {
            cookies.add(cookie);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        cookie;
        throw cookie;
    }

    public void addCookies(Cookie acookie[])
    {
        this;
        JVM INSTR monitorenter ;
        if (acookie == null) goto _L2; else goto _L1
_L1:
        int j = acookie.length;
        int i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        addCookie(acookie[i]);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        acookie;
        throw acookie;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        cookies.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean clearExpired(Date date)
    {
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        boolean flag = false;
        Iterator iterator = cookies.iterator();
_L6:
        flag1 = flag;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Cookie)iterator.next()).isExpired(date)) goto _L6; else goto _L5
_L5:
        iterator.remove();
        flag = true;
          goto _L6
        date;
        throw date;
    }

    public List getCookies()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(cookies);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = cookies.toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
