// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;


public interface GCMExponentiator
{

    public abstract void exponentiateX(long l, byte abyte0[]);

    public abstract void init(byte abyte0[]);
}
