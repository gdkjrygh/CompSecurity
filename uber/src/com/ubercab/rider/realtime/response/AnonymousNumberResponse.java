// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


public abstract class AnonymousNumberResponse
{

    public AnonymousNumberResponse()
    {
    }

    public abstract String getAnonymousSmsNumber();

    public abstract String getAnonymousSmsNumberFormatted();

    public abstract String getAnonymousVoiceNumber();

    public abstract String getAnonymousVoiceNumberFormatted();

    public abstract AnonymousNumberResponse setAnonymousSmsNumber(String s);

    public abstract AnonymousNumberResponse setAnonymousSmsNumberFormatted(String s);

    public abstract AnonymousNumberResponse setAnonymousVoiceNumber(String s);

    public abstract AnonymousNumberResponse setAnonymousVoiceNumberFormatted(String s);
}
