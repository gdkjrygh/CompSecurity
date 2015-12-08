// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzbl
{

    private static MessageDigest zzsd = null;
    protected Object zzpc;

    public zzbl()
    {
        zzpc = new Object();
    }

    protected MessageDigest zzcy()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (zzsd == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = zzsd;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                zzsd = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = zzsd;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] zzz(String s);

}
