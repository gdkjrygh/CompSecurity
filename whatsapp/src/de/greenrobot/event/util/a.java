// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.content.res.Resources;
import android.os.Bundle;

// Referenced classes of package de.greenrobot.event.util:
//            e, k

public abstract class a
{

    public static int b;
    private static final String z[];
    protected final k a;

    protected a(k k1)
    {
        a = k1;
    }

    protected abstract Object a(e e1, Bundle bundle);

    protected Object a(e e1, boolean flag, Bundle bundle)
    {
label0:
        {
            if (e1.a())
            {
                return null;
            }
            if (bundle != null)
            {
                bundle = (Bundle)bundle.clone();
                if (b == 0)
                {
                    break label0;
                }
            }
            bundle = new Bundle();
        }
        if (!bundle.containsKey(z[8]))
        {
            String s = b(e1, bundle);
            bundle.putString(z[3], s);
        }
        if (!bundle.containsKey(z[7]))
        {
            String s1 = c(e1, bundle);
            bundle.putString(z[9], s1);
        }
        if (!bundle.containsKey(z[2]))
        {
            bundle.putBoolean(z[0], flag);
        }
        if (!bundle.containsKey(z[5]) && a.g != null)
        {
            bundle.putSerializable(z[6], a.g);
        }
        if (!bundle.containsKey(z[1]) && a.b != 0)
        {
            bundle.putInt(z[4], a.b);
        }
        return a(e1, bundle);
    }

    protected String b(e e1, Bundle bundle)
    {
        return a.a.getString(a.c);
    }

    protected String c(e e1, Bundle bundle)
    {
        int i = a.a(e1.b);
        return a.a.getString(i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@B\\\036`N\037R(oA\030_\005QC\005[\033a@";
        byte0 = -1;
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
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@BS\024aI3S\023";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@B\\\036`N\037R(oA\030_\005QC\005[\033a@";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@BN\036zK\t";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@BS\024aI3S\023";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@B_\001kI\030e\003wW\te\030`x\017V\030}B";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@B_\001kI\030e\003wW\te\030`x\017V\030}B";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@BW\022}T\r]\022";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@BN\036zK\t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "^\022 @\036_\022`U\003X\030z\t\tL\022`S\016O\004 B\036H\030|C\005[\033a@BW\022}T\r]\022";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 108;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 58;
          goto _L9
_L5:
        byte1 = 119;
          goto _L9
_L6:
        byte1 = 14;
          goto _L9
        byte1 = 39;
          goto _L9
    }
}
