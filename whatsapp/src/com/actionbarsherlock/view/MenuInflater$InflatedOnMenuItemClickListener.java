// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.view.InflateException;
import java.lang.reflect.Method;

// Referenced classes of package com.actionbarsherlock.view:
//            MenuItem

class z
    implements z
{

    private static final Class PARAM_TYPES[];
    private static final String z[];
    private Method mMethod;
    private Object mRealOwner;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        try
        {
            if (mMethod.getReturnType() == Boolean.TYPE)
            {
                return ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
                    menuitem
                })).booleanValue();
            }
            mMethod.invoke(mRealOwner, new Object[] {
                menuitem
            });
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw new RuntimeException(menuitem);
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "s'6\013\036^o7G\bU;,\013\fUh.\002\024Eh*\023\037]h,\t9\\! \fZX)-\003\026U:c";
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
                obj = "\020!-G\031\\)0\024Z";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                PARAM_TYPES = (new Class[] {
                    com/actionbarsherlock/view/MenuItem
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 148
    //                   0 169
    //                   1 175
    //                   2 181
    //                   3 187;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_187;
_L3:
        byte byte0 = 122;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 48;
          goto _L9
_L5:
        byte0 = 72;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 103;
          goto _L9
    }

    public (Object obj, String s)
    {
        mRealOwner = obj;
        Class class1 = obj.getClass();
        try
        {
            mMethod = class1.getMethod(s, PARAM_TYPES);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = new InflateException((new StringBuilder()).append(z[0]).append(s).append(z[1]).append(class1.getName()).toString());
        }
        s.initCause(((Throwable) (obj)));
        throw s;
    }
}
