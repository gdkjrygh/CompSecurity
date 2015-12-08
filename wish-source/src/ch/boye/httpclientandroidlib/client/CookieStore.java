// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;

import ch.boye.httpclientandroidlib.cookie.Cookie;
import java.util.Date;
import java.util.List;

public interface CookieStore
{

    public abstract void addCookie(Cookie cookie);

    public abstract void clear();

    public abstract boolean clearExpired(Date date);

    public abstract List getCookies();
}
