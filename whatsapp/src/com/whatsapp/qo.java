// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.whatsapp:
//            l1

public class qo extends FilterInputStream
{

    private static final String z[];
    final int a;

    public qo(InputStream inputstream, int i)
    {
        super(inputstream);
        a = i;
    }

    public void mark(int i)
    {
        Log.w(z[0]);
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
    {
        int i = in.read();
        l1.b(1L, a);
        return i;
    }

    public int read(byte abyte0[])
    {
        int i = in.read(abyte0);
        l1.b(i, a);
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        l1.b(i, a);
        return i;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        Log.w(z[1]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
    {
        l = in.skip(l);
        l1.b(l, a);
        return l;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\007_\023r%\t_\ru`\016\036\bw%'[\022jd\r[(wu\037J2mw\017_\f";
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
                i = 1;
                obj = "\030[\022|qJ]\000ui\017ZApkJs\004jv\013Y\004Pk\032K\025Jq\030[\000t";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 156
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 5;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 106;
          goto _L9
_L5:
        byte0 = 62;
          goto _L9
_L6:
        byte0 = 97;
          goto _L9
        byte0 = 25;
          goto _L9
    }
}
