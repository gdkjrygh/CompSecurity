// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.cart;


public class ListInfo
{

    public final String id;
    public final String itemId;
    public final String registryId;
    public final String type;

    public ListInfo(String s, String s1, String s2)
    {
        this(null, s, s1, s2);
    }

    public ListInfo(String s, String s1, String s2, String s3)
    {
        registryId = s;
        id = s1;
        itemId = s2;
        type = s3;
    }
}
