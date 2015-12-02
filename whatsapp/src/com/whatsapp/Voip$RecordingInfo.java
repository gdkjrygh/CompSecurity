// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.whatsapp:
//            App, py, Voip, s0

public class a
{

    private static final String z[];
    private OutputStream a;
    private File b;

    public OutputStream a()
    {
        return a;
    }

    public File b()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "%fM3|4bYil(dR#l\"";
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
                obj = "3iV)f1i\035#l$rZg}'w\0353p6b\007g";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "%fM3|4bYi{'p";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "4b^\"`0bY";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "hp\\1'!}";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "%fM3|4bYiy4h^\"z5bY";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 9;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 70;
          goto _L9
_L5:
        byte1 = 7;
          goto _L9
_L6:
        byte1 = 61;
          goto _L9
        byte1 = 71;
          goto _L9
    }

    public ( )
    {
        int i;
        i = App.am;
        super();
        py.a[.rdinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 81
    //                   2 91
    //                   3 101
    //                   4 111;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        try
        {
            throw new IllegalStateException((new StringBuilder()).append(z[1]).append().toString());
        }
        // Misplaced declaration of an exception variable
        catch ( )
        {
            throw ;
        }
_L2:
        String s;
        s = z[5];
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        s = z[0];
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        s = z[3];
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        s = z[2];
        if (i != 0) goto _L1; else goto _L6
_L6:
         = Voip.f().format(new Date(System.currentTimeMillis()));
        b = new File(s0.a(), (new StringBuilder()).append().append(".").append(s).append(z[4]).toString());
        try
        {
            a = new GZIPOutputStream(new FileOutputStream(b, true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch ( )
        {
            Log.a();
        }
        a = null;
        return;
    }
}
