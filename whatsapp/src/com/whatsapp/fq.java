// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import org.whispersystems.bH;

// Referenced classes of package com.whatsapp:
//            tt

public final class fq
    implements bH
{

    private static final String z[];

    public fq()
    {
    }

    public void a(int i, String s, String s1)
    {
        int j;
        j = tt.e;
        s = (new StringBuilder()).append(z[0]).append(s).append(z[1]).append(s1).toString();
        i;
        JVM INSTR tableswitch 2 7: default 80
    //                   2 159
    //                   3 154
    //                   4 145
    //                   5 136
    //                   6 127
    //                   7 118;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[2]).append(i).append(')').toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
_L7:
        Log.a(s);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        Log.e(s);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        Log.w(s);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        Log.i(s);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        if (j != 0) goto _L1; else goto _L8
_L8:
        return;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "P\017(8ze\033\013;rv\0225t=";
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
                obj = "8Mg";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "d\03151v~\020)=ot\023g$gx\0305=ahWo";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 21;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 17;
          goto _L9
_L5:
        byte0 = 119;
          goto _L9
_L6:
        byte0 = 71;
          goto _L9
        byte0 = 84;
          goto _L9
    }
}
