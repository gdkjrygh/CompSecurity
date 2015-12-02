// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import de.greenrobot.event.g;

// Referenced classes of package de.greenrobot.event.util:
//            a, k, e

public class h
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    protected static final String f;
    public static a g;
    protected static final String h;
    private static final String z[];

    public h()
    {
    }

    public static void a(Activity activity, Object obj, boolean flag, Bundle bundle)
    {
        try
        {
            if (g == null)
            {
                throw new RuntimeException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        boolean flag1;
        try
        {
            flag1 = a(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        ErrorDialogManager.SupportManagerFragment.a(activity, obj, flag, bundle);
        if (a.b == 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        ErrorDialogManager.HoneycombManagerFragment.a(activity, obj, flag, bundle);
        return;
    }

    public static void a(Activity activity, boolean flag)
    {
        a(activity, flag, null);
    }

    public static void a(Activity activity, boolean flag, Bundle bundle)
    {
        a(activity, activity.getClass(), flag, bundle);
    }

    protected static void a(e e1)
    {
        if (g.a.h)
        {
            String s1 = g.a.d;
            String s = s1;
            if (s1 == null)
            {
                s = g.m;
            }
            Log.i(s, z[0], e1.b);
        }
    }

    private static boolean a(Activity activity)
    {
        Class class1;
        int i;
        boolean flag1;
        i = a.b;
        class1 = activity.getClass().getSuperclass();
        flag1 = false;
_L2:
        String s;
        boolean flag;
        if (class1 == null)
        {
            throw new RuntimeException((new StringBuilder()).append(z[10]).append(activity.getClass()).toString());
        }
        s = class1.getName();
        flag = flag1;
        if (s.equals(z[8]))
        {
            flag = true;
            flag1 = true;
            if (i == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
        }
        try
        {
            flag1 = s.startsWith(z[9]);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity) { }
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity) { }
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        flag1 = s.endsWith(z[3]);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        flag1 = s.endsWith(z[5]);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!s.endsWith(z[6]))
        {
            break MISSING_BLOCK_LABEL_193;
        }
        throw new RuntimeException((new StringBuilder()).append(z[2]).append(s).toString());
        flag1 = s.equals(z[7]);
        if (flag1)
        {
            try
            {
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    throw new RuntimeException(z[4]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_237;
        activity;
        throw activity;
        class1 = class1.getSuperclass();
        flag1 = flag;
        if (i == 0) goto _L2; else goto _L1
_L1:
        return flag;
    }

    static boolean a(Object obj, e e1)
    {
        return b(obj, e1);
    }

    public static void b(Activity activity)
    {
        a(activity, false, null);
    }

    private static boolean b(Object obj, e e1)
    {
        if (e1 != null)
        {
            e1 = ((e) (e1.a()));
            if (e1 != null)
            {
                boolean flag;
                try
                {
                    flag = e1.equals(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (!flag)
                {
                    return false;
                }
            }
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4_zRV)\\=GS2Wv";
        byte0 = 10;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "jU3\033~FI2\033`VNfO{V\0325OrGS%\033uRY2TaJ\032 Rv_^fO|\023Y)UuZ]3Iv\023_4I|A\032\"Rr_U!H3UU4\033j\\O4\033rCJh";
                i = 1;
                byte0 = 0;
                break;

            case 10: // '\n'
                a = ((String) (obj));
                obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4_zRV)\\=US(R`[e']gVH\031_zRV)\\";
                byte0 = 11;
                break;

            case 11: // '\013'
                d = ((String) (obj));
                obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4_zRV)\\=^_5HrT_";
                byte0 = 12;
                break;

            case 12: // '\f'
                e = ((String) (obj));
                obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4_zRV)\\=VL#UglN?KvlU(dp_U5^";
                byte0 = 13;
                break;

            case 13: // '\r'
                c = ((String) (obj));
                obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4_zRV)\\=ZY)ULZ^";
                byte0 = 14;
                break;

            case 14: // '\016'
                b = ((String) (obj));
                obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4dwZ[*TtlW'UrT_4";
                byte0 = 15;
                break;

            case 15: // '\017'
                f = ((String) (obj));
                obj = "W_h\\aV_(I|QU2\025vE_(OqFIh^aAU4dwZ[*Tt";
                byte0 = 16;
                break;

            case 16: // '\020'
                h = ((String) (obj));
                obj = "vH4Ta\023^/Z\177\\]fVr][!^a\023H#XvZL#_3VB%^cGS)U";
                byte0 = -1;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "cV#Z`V\0323Hv\023i.^a_U%PUA[!Vv]N\007XgZL/Oj\035\032\017W\177V]'W3RY2ReZN?\0013";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\035i.^a_U%PRPN/MzGC";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "zV*^tRVfZpGS0RgJ\0321Rg[U3O3UH'\\~VT2\033`FJ6TaG\024f~zGR#I3FI#\033R]^4TzW\032u\025#\030\032)I3RT\"I|Z^hHfCJ)Ig\035Lr\025rCJh}aR]+^}G{%OzES2B=";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\035i.^a_U%P_ZI2zpGS0RgJ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\035i.^a_U%PCA_ ^aVT%^RPN/MzGC";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "RT\"I|Z^hZcC\024\007XgZL/Oj";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "RT\"I|Z^hHfCJ)Ig\035Lr\025rCJh}aR]+^}G{%OzES2B";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "PU+\025rPN/T}Q[4H{VH*TpX\024'Kc";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "zV*^tRVfZpGS0RgJ\0322BcV\000f";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 440
    //                   0 463
    //                   1 470
    //                   2 477
    //                   3 484;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_484;
_L3:
        byte byte1 = 19;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 70;
          goto _L9
        byte1 = 59;
          goto _L9
    }
}
