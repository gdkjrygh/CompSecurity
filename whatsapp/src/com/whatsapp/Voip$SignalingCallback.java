// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public interface 
{

    public abstract void sendAccept(String s, String s1, String s2, int i, byte abyte0[][], int ai[], byte abyte1[], 
            byte abyte2[], byte abyte3[], int j);

    public abstract void sendOffer(String s, String s1, boolean flag, byte abyte0[][], int ai[], byte abyte1[], byte abyte2[]);

    public abstract void sendReject(String s, String s1, String s2);

    public abstract void sendRelayElection(String s, String s1, byte abyte0[], int i);

    public abstract void sendRelayLatencies(String s, String s1, byte abyte0[][], int ai[]);

    public abstract void sendTerminate(String s, String s1, String s2);

    public abstract void sendTransport(String s, String s1, byte abyte0[][], int ai[]);
}
