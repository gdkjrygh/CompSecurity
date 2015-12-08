// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class NonUriAssociativeCookieStore
    implements CookieStore
{

    private final CookieStore mBackingCookieStore = (new CookieManager()).getCookieStore();

    public NonUriAssociativeCookieStore()
    {
    }

    public void add(URI uri, HttpCookie httpcookie)
    {
        mBackingCookieStore.add(null, httpcookie);
    }

    public List get(URI uri)
    {
        return getCookies();
    }

    public List getCookies()
    {
        return mBackingCookieStore.getCookies();
    }

    public List getURIs()
    {
        return mBackingCookieStore.getURIs();
    }

    public boolean remove(URI uri, HttpCookie httpcookie)
    {
        return mBackingCookieStore.remove(uri, httpcookie);
    }

    public boolean removeAll()
    {
        return mBackingCookieStore.removeAll();
    }
}
