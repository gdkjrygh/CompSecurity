// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


public class DecoderInitializationException extends Exception
{

    public final String decoderName;

    public DecoderInitializationException(String s, Exception exception)
    {
        super(exception);
        decoderName = s;
    }

    public String toString()
    {
        return (new StringBuilder("Decoder init failed: ")).append(decoderName).toString();
    }
}
