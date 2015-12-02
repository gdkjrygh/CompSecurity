// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class ResourcesCompat
{

    public static int a;
    private static final String z[];

    public static boolean getResources_getBoolean(Context context, int i)
    {
label0:
        {
            boolean flag;
            try
            {
                if (android.os.Build.VERSION.SDK_INT < 13)
                {
                    break label0;
                }
                flag = context.getResources().getBoolean(i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return flag;
        }
        context = context.getResources().getDisplayMetrics();
        float f1 = (float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density;
        float f2 = (float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density;
        float f = f2;
        if (f1 < f2)
        {
            f = f1;
        }
        int j;
        try
        {
            j = com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i == j)
        {
            return f1 >= 480F;
        }
        try
        {
            j = com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i == j)
        {
            return f1 < 480F;
        }
        try
        {
            j = com.actionbarsherlock.R.bool.abs__action_bar_expanded_action_views_exclusive;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i == j)
        {
            return f < 600F;
        }
        try
        {
            j = com.actionbarsherlock.R.bool.abs__config_allowActionMenuItemTextWithIcon;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i == j)
        {
            return f1 >= 480F;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(i).toString());
        }
    }

    public static int getResources_getInteger(Context context, int i)
    {
label0:
        {
            try
            {
                if (android.os.Build.VERSION.SDK_INT < 13)
                {
                    break label0;
                }
                i = context.getResources().getInteger(i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return i;
        }
        context = context.getResources().getDisplayMetrics();
        float f = (float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density;
        int j;
        try
        {
            j = com.actionbarsherlock.R.integer.abs__max_action_buttons;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i == j)
        {
            if (f >= 600F)
            {
                return 5;
            }
            if (f >= 500F)
            {
                return 4;
            }
            return f < 360F ? 2 : 3;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(i).toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "XFU|\027zF\036{\026yMYw\n-Z[a\027xZ]wXDl\036";
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
                i = 1;
                obj = "XFU|\027zF\036p\027bD[s\026-Z[a\027xZ]wXDl\036";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 120;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 40;
          goto _L9
_L6:
        byte0 = 62;
          goto _L9
        byte0 = 18;
          goto _L9
    }
}
