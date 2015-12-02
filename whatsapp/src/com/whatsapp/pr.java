// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.bc;
import com.whatsapp.util.c1;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Referenced classes of package com.whatsapp:
//            p5, qa, App, MediaData, 
//            aoz, wi, ir

public class pr extends p5
{

    private static final String z[];
    private bc s;
    private boolean t;
    private int u;

    public pr(c4 c4_1, int i)
    {
        super(c4_1);
        u = 2048;
        if (i > 0)
        {
            u = i / 8;
        }
    }

    static bc a(pr pr1, bc bc)
    {
        pr1.s = bc;
        return bc;
    }

    static boolean a(pr pr1)
    {
        return pr1.t;
    }

    static bc b(pr pr1)
    {
        return pr1.s;
    }

    public void a(qa qa1)
    {
        if (qa1 == qa.SUCCESS)
        {
            File file = c1.a(App.au, i().file, (byte)2, 1, true);
            MediaData mediadata = i();
            mediadata.file.renameTo(file);
            mediadata.file = file;
        }
        super.a(qa1);
    }

    protected long b()
    {
        return 0x10000L;
    }

    public void b(boolean flag)
    {
        MediaData mediadata;
        Log.i((new StringBuilder()).append(z[1]).append(flag).toString());
        t = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        mediadata = i();
        e().t = mediadata.file.length();
        App.ah.a(e(), 1);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        f();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        throw runtimeexception;
    }

    protected ir g()
    {
        return new wi(this);
    }

    protected int h()
    {
        return u;
    }

    protected String j()
    {
        String s1;
        try
        {
            byte abyte0[] = new byte[32];
            SecureRandom.getInstance(z[0]).nextBytes(abyte0);
            s1 = Base64.encodeToString(abyte0, 2);
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException(nosuchalgorithmexception);
        }
        return s1;
    }

    public void onPostExecute(Object obj)
    {
        a((qa)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "6p'\\\0167v!";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\023W\017\016;\013W\022\bq\b]\002\004?\020H\n\002?\001\027\t\003,\000[\t\037:\fV\001\036*\nH\026\b:E";
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
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 94;
_L9:
        obj[k] = (char)(byte0 ^ c);
        k++;
          goto _L8
_L4:
        byte0 = 101;
          goto _L9
_L5:
        byte0 = 56;
          goto _L9
_L6:
        byte0 = 102;
          goto _L9
        byte0 = 109;
          goto _L9
    }
}
