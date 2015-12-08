// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


public final class contentType extends contentType
{

    public final String contentType;

    public (String s)
    {
        super((new StringBuilder("Invalid content type: ")).append(s).toString());
        contentType = s;
    }
}
