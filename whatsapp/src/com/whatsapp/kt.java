// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.database.AbstractCursor;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            u5, App, k, og

public class kt extends AbstractCursor
{

    private static final String b[];
    private final Context a;

    public kt(Context context)
    {
        a = context;
    }

    public String[] getColumnNames()
    {
        return b;
    }

    public int getCount()
    {
        return u5.a();
    }

    public double getDouble(int i)
    {
        return 0.0D;
    }

    public float getFloat(int i)
    {
        return 0.0F;
    }

    public int getInt(int i)
    {
        return 0;
    }

    public long getLong(int i)
    {
        return 0L;
    }

    public short getShort(int i)
    {
        return 0;
    }

    public String getString(int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 27
    //                   1 53;
           goto _L1 _L2 _L3
_L1:
        return "";
_L2:
        ArrayList arraylist = u5.d();
        i = getPosition();
        if (arraylist.size() > i)
        {
            return (String)arraylist.get(i);
        }
_L3:
        ArrayList arraylist1 = u5.d();
        i = getPosition();
        if (arraylist1.size() > i)
        {
            return App.az.e((String)arraylist1.get(i)).a(a);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean isNull(int i)
    {
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "~%\"";
        byte1 = -1;
        i = 0;
_L10:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L7:
        if (l <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte0;
            char c;
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "z-+s";
                byte1 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 124
    //                   0 145
    //                   1 151
    //                   2 157
    //                   3 163;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_163;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = 117;
_L8:
        obj[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 20;
          goto _L8
_L3:
        byte0 = 76;
          goto _L8
_L4:
        byte0 = 70;
          goto _L8
        byte0 = 22;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        b = as;
    }
}
