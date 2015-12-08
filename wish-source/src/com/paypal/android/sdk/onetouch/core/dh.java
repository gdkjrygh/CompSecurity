// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            dg

public class dh extends SecureRandomSpi
{

    private static final File a = new File("/dev/urandom");
    private static final Object b = new Object();
    private static DataInputStream c;
    private static OutputStream d;
    private boolean e;

    public dh()
    {
    }

    private static DataInputStream a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        DataInputStream datainputstream = c;
        if (datainputstream != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c = new DataInputStream(new FileInputStream(a));
        datainputstream = c;
        obj;
        JVM INSTR monitorexit ;
        return datainputstream;
        Object obj1;
        obj1;
        throw new SecurityException((new StringBuilder("Failed to open ")).append(a).append(" for reading").toString(), ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private static OutputStream b()
    {
        OutputStream outputstream;
        synchronized (b)
        {
            if (d == null)
            {
                d = new FileOutputStream(a);
            }
            outputstream = d;
        }
        return outputstream;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected byte[] engineGenerateSeed(int i)
    {
        byte abyte0[] = new byte[i];
        engineNextBytes(abyte0);
        return abyte0;
    }

    protected void engineNextBytes(byte abyte0[])
    {
        if (!e)
        {
            engineSetSeed(dg.b());
        }
        DataInputStream datainputstream;
        synchronized (b)
        {
            datainputstream = a();
        }
        datainputstream;
        JVM INSTR monitorenter ;
        datainputstream.readFully(abyte0);
        datainputstream;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SecurityException((new StringBuilder("Failed to read from ")).append(a).toString(), abyte0);
        }
        abyte0;
        datainputstream;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    protected void engineSetSeed(byte abyte0[])
    {
        OutputStream outputstream;
        synchronized (b)
        {
            outputstream = b();
        }
        outputstream.write(abyte0);
        outputstream.flush();
        e = true;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        finally
        {
            e = true;
        }
        Log.w(com/paypal/android/sdk/onetouch/core/dg.getSimpleName(), (new StringBuilder("Failed to mix seed into ")).append(a).toString());
        e = true;
        return;
    }

}
