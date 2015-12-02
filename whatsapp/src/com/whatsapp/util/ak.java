// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.whatsapp.util:
//            Log, bo, x

public class ak
{

    private static final String z[];
    private boolean a;
    private final File b;
    private final Lock c = new ReentrantLock();
    private File d;

    public ak(File file)
    {
        d = null;
        a = false;
        b = file;
    }

    public static boolean a(File file)
    {
        boolean flag = Log.f;
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int j;
        boolean flag1;
        try
        {
            afile = file.listFiles();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            Log.e((new StringBuilder()).append(z[0]).append(file.getAbsolutePath()).toString());
            return false;
        }
        if (afile == null) goto _L2; else goto _L3
_L3:
        j = afile.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = a(afile[i]);
        if (!flag1)
        {
            return false;
        }
        i++;
        if (!flag) goto _L4; else goto _L2
_L2:
        return file.delete();
    }

    private void c()
    {
        if (!b.exists())
        {
            b.mkdirs();
            if (!b.exists())
            {
                b.mkdir();
            }
        }
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = Log.f;
        c();
        if (d != null && d.exists()) goto _L2; else goto _L1
_L1:
        int i = 0;
        d = new File(b, UUID.randomUUID().toString());
_L9:
        int j = i + 1;
        if (i >= 10) goto _L4; else goto _L3
_L3:
        if (d.mkdir()) goto _L4; else goto _L5
_L5:
        d = new File(b, UUID.randomUUID().toString());
        if (!flag) goto _L6; else goto _L4
_L4:
        if (j <= 10) goto _L2; else goto _L7
_L7:
        throw new IOException(z[3]);
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i = j;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a()
    {
        boolean flag = Log.f;
        if (!b.exists()) goto _L2; else goto _L1
_L1:
        c.lock();
        a = true;
        File afile[] = b.listFiles();
_L7:
        if (afile == null) goto _L4; else goto _L3
_L3:
        int j = afile.length;
        int i = 0;
_L5:
        File file;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file = afile[i];
        boolean flag1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        flag1 = file.getName().equals(d.getName());
        if (flag1 && !flag)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        c.unlock();
        a(file);
        c.lock();
        i++;
        if (!flag) goto _L5; else goto _L4
_L4:
        a = false;
        c.unlock();
_L2:
        return;
        Object obj;
        obj;
        Log.e((new StringBuilder()).append(z[1]).append(b.getAbsolutePath()).toString());
        obj = new File[0];
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        a = false;
        c.unlock();
        throw obj;
        obj;
        c.lock();
        throw obj;
    }

    public File b()
    {
        boolean flag = Log.f;
        d();
        int i = 0;
        File file = new File(d, UUID.randomUUID().toString());
        do
        {
            int j;
label0:
            {
                j = i + 1;
                File file1 = file;
                if (i < 10)
                {
                    file1 = file;
                    if (!file.createNewFile())
                    {
                        file = new File(d, UUID.randomUUID().toString());
                        if (!flag)
                        {
                            break label0;
                        }
                        file1 = file;
                    }
                }
                if (j > 10)
                {
                    throw new IOException(z[2]);
                } else
                {
                    return file1;
                }
            }
            i = j;
        } while (true);
    }

    public void e()
    {
label0:
        {
            c.lock();
            if (!a)
            {
                c.unlock();
                x.a(new bo(this));
                if (!Log.f)
                {
                    break label0;
                }
            }
            c.unlock();
        }
    }

    public File f()
    {
        c();
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "y{\023\013\t\"m\027\024\004yl_\n\004n|\000\013\b{l]\027\024y$\035\036L`l\037\027\023t)";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "y{\023\013\t\"l\037\b\025t$\006\n\000~a]\027\024y$\035\036L`l\037\027\023t)";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "`h\nX\023h}\000\021\004~)\000\035\000na\027\034Aza\033\024\004-j\000\035\000y`\034\037Ayl\037\bAk`\036\035";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "`h\nX\023h}\000\021\004~)\000\035\000na\027\034Aza\033\024\004-j\000\035\000y`\034\037Ayl\037\bAi`\0";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 97;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 9;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 120;
          goto _L9
    }
}
