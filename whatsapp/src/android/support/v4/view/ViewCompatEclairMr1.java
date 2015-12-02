// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewCompatEclairMr1
{

    private static Method sChildrenDrawingOrderMethod;
    private static final String z[];

    public static boolean isOpaque(View view)
    {
        return view.isOpaque();
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        Method method;
        try
        {
            method = sChildrenDrawingOrderMethod;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            throw viewgroup;
        }
        if (method != null) goto _L2; else goto _L1
_L1:
        sChildrenDrawingOrderMethod = android/view/ViewGroup.getDeclaredMethod(z[7], new Class[] {
            Boolean.TYPE
        });
_L4:
        sChildrenDrawingOrderMethod.setAccessible(true);
_L2:
        NoSuchMethodException nosuchmethodexception;
        try
        {
            sChildrenDrawingOrderMethod.invoke(viewgroup, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e(z[4], z[5], viewgroup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e(z[6], z[0], viewgroup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e(z[3], z[8], viewgroup);
        }
        break MISSING_BLOCK_LABEL_133;
        nosuchmethodexception;
        Log.e(z[2], z[1], nosuchmethodexception);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "/z\177!\022\0374j,^\023zh,\025\0374}+\027\026pl&\020>f\1774\027\024sQ1\032\037f[-\037\030x{'";
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
                obj = "/z\177!\022\0374j,^\034}p'^\031|w/\032\bqp\007\f\033cw-\0315fz&\f?z\177!\022\037p";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",}{4=\025yn\"\n";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",}{4=\025yn\"\n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = ",}{4=\025yn\"\n";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "/z\177!\022\0374j,^\023zh,\025\0374}+\027\026pl&\020>f\1774\027\024sQ1\032\037f[-\037\030x{'";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ",}{4=\025yn\"\n";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\tqj\000\026\023xz1\033\024Pl\"\t\023zy\f\f\036ql\006\020\033vr&\032";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "/z\177!\022\0374j,^\023zh,\025\0374}+\027\026pl&\020>f\1774\027\024sQ1\032\037f[-\037\030x{'";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 126;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 122;
          goto _L9
_L5:
        byte1 = 20;
          goto _L9
_L6:
        byte1 = 30;
          goto _L9
        byte1 = 67;
          goto _L9
    }
}
