// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import com.android.a.ab;
import com.android.a.b;
import com.android.a.c;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.a.a:
//            f, e

public class d
    implements b
{

    private final File a;

    public d(File file, int i)
    {
        a = file;
    }

    static int a(InputStream inputstream)
    {
        return 0 | e(inputstream) << 0 | e(inputstream) << 8 | e(inputstream) << 16 | e(inputstream) << 24;
    }

    static void a(OutputStream outputstream, int i)
    {
        outputstream.write(i >> 0 & 0xff);
        outputstream.write(i >> 8 & 0xff);
        outputstream.write(i >> 16 & 0xff);
        outputstream.write(i >> 24 & 0xff);
    }

    static void a(OutputStream outputstream, long l)
    {
        outputstream.write((byte)(int)(l >>> 0));
        outputstream.write((byte)(int)(l >>> 8));
        outputstream.write((byte)(int)(l >>> 16));
        outputstream.write((byte)(int)(l >>> 24));
        outputstream.write((byte)(int)(l >>> 32));
        outputstream.write((byte)(int)(l >>> 40));
        outputstream.write((byte)(int)(l >>> 48));
        outputstream.write((byte)(int)(l >>> 56));
    }

    static void a(OutputStream outputstream, String s)
    {
        s = s.getBytes("UTF-8");
        a(outputstream, s.length);
        outputstream.write(s, 0, s.length);
    }

    static void a(Map map, OutputStream outputstream)
    {
        if (map != null)
        {
            a(outputstream, map.size());
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    return;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                a(outputstream, (String)entry.getKey());
                a(outputstream, (String)entry.getValue());
            } while (true);
        } else
        {
            a(outputstream, 0);
            return;
        }
    }

    private static byte[] a(InputStream inputstream, int i)
    {
        byte abyte0[] = new byte[i];
        int j = 0;
        do
        {
label0:
            {
                int k;
                if (j < i)
                {
                    k = inputstream.read(abyte0, j, i - j);
                    if (k != -1)
                    {
                        break label0;
                    }
                }
                if (j != i)
                {
                    throw new IOException((new StringBuilder("Expected ")).append(i).append(" bytes, read ").append(j).append(" bytes").toString());
                } else
                {
                    return abyte0;
                }
            }
            j += k;
        } while (true);
    }

    static long b(InputStream inputstream)
    {
        return 0L | ((long)e(inputstream) & 255L) << 0 | ((long)e(inputstream) & 255L) << 8 | ((long)e(inputstream) & 255L) << 16 | ((long)e(inputstream) & 255L) << 24 | ((long)e(inputstream) & 255L) << 32 | ((long)e(inputstream) & 255L) << 40 | ((long)e(inputstream) & 255L) << 48 | ((long)e(inputstream) & 255L) << 56;
    }

    static String c(InputStream inputstream)
    {
        return new String(a(inputstream, (int)b(inputstream)), "UTF-8");
    }

    private String d(String s)
    {
        int i = s.length() / 2;
        return (new StringBuilder(String.valueOf(String.valueOf(s.substring(0, i).hashCode())))).append(String.valueOf(s.substring(i).hashCode())).toString();
    }

    static Map d(InputStream inputstream)
    {
        int j = a(inputstream);
        Object obj;
        int i;
        if (j == 0)
        {
            obj = Collections.emptyMap();
        } else
        {
            obj = new HashMap(j);
        }
        i = 0;
        do
        {
            if (i >= j)
            {
                return ((Map) (obj));
            }
            ((Map) (obj)).put(c(inputstream).intern(), c(inputstream).intern());
            i++;
        } while (true);
    }

    private static int e(InputStream inputstream)
    {
        int i = inputstream.read();
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            return i;
        }
    }

    public c a(String s)
    {
        Object obj2 = null;
        this;
        JVM INSTR monitorenter ;
        File file = c(s);
        Object obj = obj2;
        if (file == null) goto _L2; else goto _L1
_L1:
        boolean flag = file.exists();
        if (flag) goto _L4; else goto _L3
_L3:
        obj = obj2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((c) (obj));
_L4:
        f f1 = new f(new FileInputStream(file), null);
        obj = f1;
        Object obj1 = com.android.a.a.e.a(f1);
        obj = f1;
        int i = (int)file.length();
        obj = f1;
        int j = f.a(f1);
        if (i - j >= 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = obj2;
        if (f1 == null) goto _L2; else goto _L5
_L5:
        f1.close();
        obj = obj2;
          goto _L2
        s;
        obj = obj2;
          goto _L2
        obj = f1;
        obj1 = ((e) (obj1)).a(a(((InputStream) (f1)), (int)file.length() - f.a(f1)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        f1.close();
        obj = obj1;
          goto _L2
        IOException ioexception;
        ioexception;
        f1 = null;
_L10:
        obj = f1;
        ab.b("%s: %s", new Object[] {
            file.getAbsolutePath(), ioexception.toString()
        });
        obj = f1;
        b(s);
        obj = obj2;
        if (f1 == null) goto _L2; else goto _L6
_L6:
        f1.close();
        obj = obj2;
          goto _L2
        s;
        obj = obj2;
          goto _L2
        s;
        f1 = null;
_L9:
        obj = obj2;
        if (f1 == null) goto _L2; else goto _L7
_L7:
        f1.close();
        obj = obj2;
          goto _L2
        s;
        obj = obj2;
          goto _L2
        s;
        obj = null;
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        ((f) (obj)).close();
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj = obj2;
          goto _L2
        s;
        obj = obj2;
          goto _L2
        s;
          goto _L8
        s;
          goto _L9
        ioexception;
          goto _L10
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.exists() && !a.mkdirs())
        {
            ab.c("Unable to create cache dir %s", new Object[] {
                a.getAbsolutePath()
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s, c c1)
    {
        this;
        JVM INSTR monitorenter ;
        File file = c(s);
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        (new e(s, c1)).a(fileoutputstream);
        fileoutputstream.write(c1.a);
        fileoutputstream.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        if (!file.delete())
        {
            ab.b("Could not clean up file %s", new Object[] {
                file.getAbsolutePath()
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c(s).delete())
        {
            ab.b("Could not delete cache entry for key=%s, filename=%s", new Object[] {
                s, d(s)
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public File c(String s)
    {
        return new File(a, d(s));
    }
}
