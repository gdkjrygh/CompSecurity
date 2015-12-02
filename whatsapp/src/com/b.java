// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com;

import android.os.Build;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

// Referenced classes of package com:
//            a

public final class b extends SecureRandomSpi
{

    private static DataInputStream b;
    private static OutputStream c;
    private static final Object d;
    private static final File e;
    private static final String z[];
    private boolean a;

    public b()
    {
    }

    private DataInputStream a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        DataInputStream datainputstream = b;
        if (datainputstream != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b = new DataInputStream(new FileInputStream(e));
        datainputstream = b;
        obj;
        JVM INSTR monitorexit ;
        return datainputstream;
        Object obj1;
        obj1;
        throw new SecurityException((new StringBuilder()).append(z[2]).append(e).append(z[1]).toString(), ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private OutputStream b()
    {
        OutputStream outputstream;
        synchronized (d)
        {
            if (c == null)
            {
                c = new FileOutputStream(e);
            }
            outputstream = c;
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
        DataInputStream datainputstream;
        boolean flag = a.a;
        try
        {
            if (!a)
            {
                engineSetSeed(com.a.e());
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        synchronized (d)
        {
            datainputstream = a();
        }
        datainputstream;
        JVM INSTR monitorenter ;
        datainputstream.readFully(abyte0);
        datainputstream;
        JVM INSTR monitorexit ;
        if (flag)
        {
            DialogToastActivity.g++;
        }
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
            throw new SecurityException((new StringBuilder()).append(z[0]).append(e).toString(), abyte0);
        }
        abyte0;
        datainputstream;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    protected void engineSetSeed(byte abyte0[])
    {
        try
        {
            if (z[4].equalsIgnoreCase(Build.MANUFACTURER))
            {
                Log.w((new StringBuilder()).append(z[5]).append(e).toString());
                a = true;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        OutputStream outputstream;
        synchronized (d)
        {
            outputstream = b();
        }
        try
        {
            outputstream.write(abyte0);
            outputstream.flush();
            a = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.c(z[3], abyte0);
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "V#\033\013Ytb\006\b\034b'\023\003\034v0\035\n\034";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "0$\035\025\034b'\023\003U~%";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "V#\033\013Ytb\006\b\034\1772\027\t\034";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "e,\023\005Pub\006\b\034c'\027\003\034@\020< ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "c#\037\024I~%";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "t'\004\016_ub\033\024\034}#\034\022Zq!\006\022Nu&R\005E0\021\023\nOe,\025\\\034e,\023\005Pub\006\b\034c'\027\003\034@\020< \034v+\036\002\034";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "?&\027\021\023e0\023\tX\177/";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                e = new File(z[6]);
                d = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 260
    //                   0 283
    //                   1 290
    //                   2 297
    //                   3 304;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_304;
_L3:
        byte byte1 = 60;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 66;
          goto _L9
_L6:
        byte1 = 114;
          goto _L9
        byte1 = 103;
          goto _L9
    }
}
