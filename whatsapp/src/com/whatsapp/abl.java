// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            g3

public class abl
{

    private static final String z[];
    private String a;
    private Method b;
    private g3 c;
    private Resources d;

    public abl(Resources resources)
    {
        d = resources;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return;
        }
        try
        {
            b = resources.getAssets().getClass().getDeclaredMethod(z[0], new Class[] {
                Integer.TYPE, Integer.TYPE
            });
            b.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            Log.a(resources);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            Log.a(resources);
        }
    }

    public String a(int i, int j)
    {
        Object obj2;
label0:
        {
            String s;
            try
            {
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    break label0;
                }
                s = d.getQuantityString(i, j);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s;
        }
label1:
        {
            String s1;
            try
            {
                if (b != null)
                {
                    break label1;
                }
                s1 = d.getQuantityString(i, j);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return s1;
        }
label2:
        {
            Object obj = d.getConfiguration().locale;
            try
            {
                if (!((Locale) (obj)).getLanguage().equals(a))
                {
                    a = ((Locale) (obj)).getLanguage();
                    c = g3.a(((Locale) (obj)));
                }
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            try
            {
                if (c != null)
                {
                    break label2;
                }
                obj = d.getQuantityString(i, j);
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            return ((String) (obj));
        }
        Object obj1 = null;
        IllegalArgumentException illegalargumentexception4;
        if (true)
        {
            try
            {
                obj1 = b.invoke(d.getAssets(), new Object[] {
                    Integer.valueOf(i), Integer.valueOf(g3.b(c.a(j)))
                });
            }
            catch (IllegalArgumentException illegalargumentexception5)
            {
                throw new android.content.res.Resources.NotFoundException(illegalargumentexception5.getMessage());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new android.content.res.Resources.NotFoundException(illegalaccessexception.getMessage());
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw new android.content.res.Resources.NotFoundException(invocationtargetexception.getMessage());
            }
        }
        obj2 = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj2 = b.invoke(d.getAssets(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(0x1000004)
        });
        if (obj2 == null)
        {
            try
            {
                throw new android.content.res.Resources.NotFoundException((new StringBuilder()).append(z[3]).append(Integer.toHexString(i)).append(z[1]).append(j).append(z[2]).append(g3.c(c.a(j))).toString());
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception4)
            {
                throw illegalargumentexception4;
            }
        } else
        {
            return obj2.toString();
        }
    }

    public String a(int i, int j, Object aobj[])
    {
        return String.format(d.getConfiguration().locale, a(i, j), aobj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "eW\002yoq]\003Yigp\027L^gJ\002";
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
                obj = "\"C\003Jdv[\002R7";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\"[\002Ng?";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "R^\003Ykn\022\004NymG\004Ho\"{2\013)2J";
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
    //                   1 202
    //                   2 208
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 2;
          goto _L9
_L5:
        byte0 = 50;
          goto _L9
_L6:
        byte0 = 118;
          goto _L9
        byte0 = 43;
          goto _L9
    }
}
