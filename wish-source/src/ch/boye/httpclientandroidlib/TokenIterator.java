// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;

import java.util.Iterator;

public interface TokenIterator
    extends Iterator
{

    public abstract boolean hasNext();

    public abstract String nextToken();
}
