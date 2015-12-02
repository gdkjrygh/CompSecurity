// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            App, a_f

public class cu
{

    public static final Handler a;
    public static final String b;

    static 
    {
        Object obj;
        byte byte0;
        byte byte1;
        int i;
        int j;
        char c;
        if (App.a4())
        {
            obj = "yb@hT|xYh\026}yio\021nyZy\t\177#Jw\024";
            byte1 = -1;
        } else
        {
            obj = "ncMj\026fi\004k\f\177}Fj\rOzAy\r|lYhWlbD";
            byte1 = 0;
        }
        obj = ((String) (obj)).toCharArray();
        j = obj.length;
        i = 0;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            case 0: // '\0'
            default:
                b = ((String) (obj));
                break;
            }
            a = new Handler(new a_f());
            return;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 120
    //                   0 138
    //                   1 144
    //                   2 150
    //                   3 156;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_156;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = 121;
_L9:
        obj[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L7:
        break MISSING_BLOCK_LABEL_22;
_L6:
        byte0 = 15;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 13;
        continue; /* Loop/switch isn't completed */
_L4:
        byte0 = 41;
        continue; /* Loop/switch isn't completed */
        byte0 = 24;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
