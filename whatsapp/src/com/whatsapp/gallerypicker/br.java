// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.c1;
import java.io.File;

// Referenced classes of package com.whatsapp.gallerypicker:
//            t, ai

public class br
    implements t
{

    private static final String z;
    private long a;
    private final ContentResolver b;
    private final ai c;
    private final Uri d;

    br(ai ai, ContentResolver contentresolver, String s, long l)
    {
        c = ai;
        b = contentresolver;
        d = Uri.fromFile(new File(s));
        a = l;
    }

    public Bitmap a(int i)
    {
        return a(i, i * i * 2);
    }

    public Bitmap a(int i, int j)
    {
        return c1.b(c());
    }

    public Uri a()
    {
        return d;
    }

    public String b()
    {
        return z;
    }

    public String c()
    {
        return d.getPath();
    }

    public long d()
    {
        return a;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "ny2^s7:".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c2;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c2 = ac[i];
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
        byte byte0 = 28;
_L8:
        ac[i] = (char)(byte0 ^ c2);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 24;
          goto _L8
_L3:
        byte0 = 16;
          goto _L8
_L4:
        byte0 = 86;
          goto _L8
        byte0 = 59;
          goto _L8
    }
}
