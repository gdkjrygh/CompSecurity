// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;


public interface HttpContext
{

    public static final String RESERVED_PREFIX = "http.";

    public abstract Object getAttribute(String s);

    public abstract Object removeAttribute(String s);

    public abstract void setAttribute(String s, Object obj);
}
