// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class weight
{

    private static final String z[];
    public final ComponentName activity;
    public final long time;
    public final float weight;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (weight)obj;
            if (activity == null)
            {
                if (((activity) (obj)).activity != null)
                {
                    return false;
                }
            } else
            if (!activity.equals(((activity) (obj)).activity))
            {
                return false;
            }
            if (time != ((time) (obj)).time)
            {
                return false;
            }
            if (Float.floatToIntBits(weight) != Float.floatToIntBits(((weight) (obj)).weight))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i;
        if (activity == null)
        {
            i = 0;
        } else
        {
            i = activity.hashCode();
        }
        return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append(z[1]).append(activity);
        stringbuilder.append(z[0]).append(time);
        stringbuilder.append(z[2]).append(new BigDecimal(weight));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "!H\005,J\177R";
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
                obj = "!H\020&Ss\036\0301^ ";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "!H\006 N}\000\005\177";
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
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 26;
          goto _L9
_L5:
        byte0 = 104;
          goto _L9
_L6:
        byte0 = 113;
          goto _L9
        byte0 = 69;
          goto _L9
    }

    public (ComponentName componentname, long l, float f)
    {
        activity = componentname;
        time = l;
        weight = f;
    }
}
