// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


class py
{

    static final int a[];

    static 
    {
        a = new int[Voip.DebugTapType.values().length];
        try
        {
            a[Voip.DebugTapType.CAPTURED_AND_POST_PROCESSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[Voip.DebugTapType.OUTGOING_ENCODED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[Voip.DebugTapType.RECEIVED_AND_DECODED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Voip.DebugTapType.RAW_CAPTURED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
