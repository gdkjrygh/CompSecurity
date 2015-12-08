// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import com.google.common.base.Preconditions;

public class ContentContainer
{

    public static final ContentContainer DEFAULT = new ContentContainer("", "0", "0");
    private static final int HALF_SEC_MS = 500;
    private final String contentUri;
    private final int iContentLength;
    private final int iPayloadLength;

    public ContentContainer(String s, String s1, String s2)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        Preconditions.checkNotNull(s2);
        contentUri = s;
        iContentLength = Math.round(Float.parseFloat(s1));
        iPayloadLength = Math.round(Float.parseFloat(s2));
    }

    public int getContentLength()
    {
        return iContentLength;
    }

    public int getContentMidPointLength()
    {
        return getContentLength() * 500;
    }

    public String getContentUri()
    {
        return contentUri;
    }

    public int getPayloadLength()
    {
        return iPayloadLength;
    }

}
