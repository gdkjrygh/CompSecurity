// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.entity;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpMessage;

public interface ContentLengthStrategy
{

    public static final int CHUNKED = -2;
    public static final int IDENTITY = -1;

    public abstract long determineLength(HttpMessage httpmessage)
        throws HttpException;
}
