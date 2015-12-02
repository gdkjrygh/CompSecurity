// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp.util:
//            ak, l

public class az extends OutputStream
{

    private static final String z;
    boolean a;
    final FileOutputStream b;
    final File c;
    final File d;

    public az(ak ak1, File file)
    {
        this(ak1, file, false);
    }

    public az(ak ak1, File file, boolean flag)
    {
        Object obj;
        a = false;
        d = ak1.b();
        c = file;
        b = new FileOutputStream(d);
        if (!flag || !c.exists())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        file = null;
        obj = null;
        ak1 = new FileInputStream(c);
        l.a(ak1.getChannel(), b.getChannel());
        if (ak1 != null)
        {
            ak1.close();
        }
_L2:
        return;
        ak1;
        ak1 = null;
_L7:
        if (ak1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            ak1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ak ak1)
        {
            throw ak1;
        }
        file;
        ak1 = ((ak) (obj));
        obj = file;
_L6:
        file = ak1;
        b.close();
        file = ak1;
        throw obj;
        Exception exception;
        exception;
        ak1 = file;
        file = exception;
_L4:
        if (ak1 != null)
        {
            try
            {
                ak1.close();
            }
            // Misplaced declaration of an exception variable
            catch (ak ak1)
            {
                throw ak1;
            }
        }
        throw file;
        file;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        file;
          goto _L7
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            a = true;
            b.close();
            c.delete();
            if (!d.renameTo(c))
            {
                throw new IOException(z);
            }
        }
        break MISSING_BLOCK_LABEL_59;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void flush()
    {
        b.flush();
    }

    public void write(int i)
    {
        b.write(i);
    }

    public void write(byte abyte0[])
    {
        b.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        b.write(abyte0, i, j);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\"\016\001?T\026\002\003;\027\0013\002z\034\005\016\001?\036".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 122;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 100;
          goto _L8
_L3:
        byte0 = 103;
          goto _L8
_L4:
        byte0 = 109;
          goto _L8
        byte0 = 90;
          goto _L8
    }
}
