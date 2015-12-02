// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ICUCompatIcs
{

    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;
    private static final String z[];

    public static String addLikelySubtags(String s)
    {
        String s1;
        if (sAddLikelySubtagsMethod == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s1 = (String)sAddLikelySubtagsMethod.invoke(null, new Object[] {
            s
        });
        return s1;
        Object obj;
        obj;
        Log.w(z[2], ((Throwable) (obj)));
_L2:
        return s;
        obj;
        Log.w(z[3], ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getScript(String s)
    {
        if (sGetScriptMethod == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s = (String)sGetScriptMethod.invoke(null, new Object[] {
            s
        });
        return s;
        s;
        Log.w(z[0], s);
_L2:
        return null;
        s;
        Log.w(z[1], s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String z(char ac[])
    {
        int i;
        int j;
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            return (new String(ac)).intern();
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 78
    //                   1 84
    //                   2 90
    //                   3 96;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_96;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 37;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 55;
          goto _L8
_L3:
        byte0 = 33;
          goto _L8
_L4:
        byte0 = 104;
          goto _L8
        byte0 = 70;
          goto _L8
    }

    private static char[] z(String s)
    {
        s = s.toCharArray();
        if (s.length < 2)
        {
            s[0] = (char)(s[0] ^ 0x25);
        }
        return s;
    }

    static 
    {
        Object obj;
        byte byte2;
        byte2 = -1;
        String as[] = new String[4];
        int i = 0;
        byte byte0 = -1;
label0:
        do
        {
            String as1[] = as;
            String s = z(z("~b=\005JZQ\t2lTR"));
            switch (byte0)
            {
            default:
                as1[i] = s;
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = s;
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = s;
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = s;
                break label0;
            }
        } while (true);
        z = as;
        obj = z(z("[H\n%JEDF/FB\017!\005p"));
        Class class1 = Class.forName(((String) (obj)));
        if (class1 == null) goto _L2; else goto _L1
_L1:
        byte byte1;
        obj = "PD\034\025FEH\0302";
        byte1 = byte2;
_L5:
        Class class2;
        class2 = class1;
        obj = z(z(((String) (obj))));
        byte1;
        JVM INSTR tableswitch 0 0: default 152
    //                   0 192;
           goto _L3 _L4
_L3:
        sGetScriptMethod = class2.getMethod(((String) (obj)), new Class[] {
            java/lang/String
        });
        obj = "VE\f\nL\\D\004?vBC\034'BD";
        byte1 = 0;
          goto _L5
        obj;
        Log.w(z(z("~b=\005JZQ\t2lTR")), ((Throwable) (obj)));
_L2:
        return;
_L4:
        sAddLikelySubtagsMethod = class2.getMethod(((String) (obj)), new Class[] {
            java/lang/String
        });
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
