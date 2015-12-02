// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;
import com.whatsapp.util.Log;
import java.net.URL;
import java.util.LinkedHashMap;

// Referenced classes of package com.whatsapp:
//            p5, qa, App, aoz

public class pm extends p5
{

    private static final String z[];
    private String s;
    private c4 t;

    public pm(c4 c4_1, c4 c4_2, String s1)
    {
        super(c4_2, 0L, true);
        s = s1;
        t = c4_1;
    }

    public void a(qa qa1)
    {
        cf cf1;
        Log.i((new StringBuilder()).append(z[6]).append(k.y).append(z[3]).append(n.size()).append(z[7]).append(b.size()).append(z[4]).append(qa1).toString());
        super.a(qa1);
        cf1 = new cf();
        if (qa1 != qa.SUCCESS) goto _L2; else goto _L1
_L1:
        boolean flag = a;
        if (!flag) goto _L2; else goto _L3
_L3:
        qa1 = new URL(f.e);
        if (qa1.getHost() == null) goto _L5; else goto _L4
_L4:
        int i = qa1.getHost().length();
        if (i != 0) goto _L6; else goto _L5
_L5:
        Log.e(z[5]);
        cf1.m = 502;
        App.a(s, cf1, 5);
_L7:
        return;
        qa1;
        throw qa1;
        qa1;
        try
        {
            throw qa1;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            Log.w((new StringBuilder()).append(z[0]).append(qa1.toString()).toString());
        }
_L6:
        try
        {
            if (f.e == null)
            {
                Log.e(z[1]);
                cf1.m = 502;
                App.a(s, cf1, 5);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        Log.i((new StringBuilder()).append(z[2]).append(k.y).append(" ").append(f.e).toString());
        cf1.m = 200;
        cf1.p = f.e;
        App.a(s, cf1, 5);
        t.l = f.e;
        App.ah.a(t, true, -1);
        if (App.am == 0) goto _L7; else goto _L2
_L2:
        cf1.m = 502;
        App.a(s, cf1, 5);
        return;
        qa1;
        throw qa1;
    }

    public void onPostExecute(Object obj)
    {
        a((qa)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = ".+x'\\='{8\\,>v%X=ao8Uv+h8V+n";
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
                obj = ".+x'\\='{8\\,>v%X=ah/J,\"n9\0264'i9P7):!\\ =:#Wy;j&V8*:8\\*;v>";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ".+x'\\='{8\\,>v%X=ai?Z:+i9\031";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ":;h8\\7: ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "y<\1779L5: ";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ".+x'\\='{8\\,>v%X=ao8Uv ugQ6=n";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ".+x'\\='{8\\,>v%X=a\177$]y";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "y>\177$]0 }p";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 57;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 89;
          goto _L9
_L5:
        byte1 = 78;
          goto _L9
_L6:
        byte1 = 26;
          goto _L9
        byte1 = 74;
          goto _L9
    }
}
