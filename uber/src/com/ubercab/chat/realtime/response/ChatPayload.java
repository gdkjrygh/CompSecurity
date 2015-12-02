// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.realtime.response;


public abstract class ChatPayload
{

    public ChatPayload()
    {
    }

    public abstract int getDurationMs();

    public abstract String getEncodingFormat();

    abstract ChatPayload setDurationMs(int i);

    abstract ChatPayload setEncodingFormat(String s);
}
