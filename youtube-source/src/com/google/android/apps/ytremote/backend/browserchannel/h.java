// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;


final class h
{

    static final int a[];

    static 
    {
        a = new int[HttpClientConnection.ResponseState.values().length];
        try
        {
            a[HttpClientConnection.ResponseState.HEADER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[HttpClientConnection.ResponseState.BODY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[HttpClientConnection.ResponseState.DONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[HttpClientConnection.ResponseState.TRAILER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[HttpClientConnection.ResponseState.CHUNK_SIZE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[HttpClientConnection.ResponseState.CHUNK_DATA.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[HttpClientConnection.ResponseState.CHUNK_END.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
