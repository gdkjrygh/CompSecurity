// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzbl
{

    private static MessageDigest zzrK = null;
    protected Object zzqt;

    public zzbl()
    {
        zzqt = new Object();
    }

    protected MessageDigest zzcu()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (zzrK == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = zzrK;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                zzrK = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = zzrK;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] zzy(String s);

}
