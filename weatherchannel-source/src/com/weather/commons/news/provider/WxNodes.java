// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


public class WxNodes
{

    public final String assetid;
    public final String id;
    public final String slideshow;
    public final String title;
    public final String type;

    public WxNodes()
    {
        this(null, null, null, null, null);
    }

    public WxNodes(String s, String s1, String s2, String s3, String s4)
    {
        id = s;
        type = s1;
        title = s2;
        slideshow = s3;
        assetid = s4;
    }
}
