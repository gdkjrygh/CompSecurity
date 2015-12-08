// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal.models;


public class BinaryImageData
{

    public final long baseAddress;
    public final String id;
    public final String path;
    public final long size;

    public BinaryImageData(long l, long l1, String s, String s1)
    {
        baseAddress = l;
        size = l1;
        path = s;
        id = s1;
    }
}
