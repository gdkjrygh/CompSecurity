// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            _l, DialogToastActivity

public class j0
{

    private static final String z[];
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public j0(String s, String s1)
    {
        int i = _l.a;
        super();
        try
        {
            c = s;
            JSONObject jsonobject = new JSONObject(c);
            e = jsonobject.optString(z[3]);
            d = jsonobject.optString(z[6], jsonobject.optString(z[5]));
            b = jsonobject.optString(z[4]);
            a = s1;
        }
        catch (JSONException jsonexception)
        {
            Log.e((new StringBuilder()).append(z[1]).append(s).append(z[2]).append(s1).toString());
            throw new RuntimeException(jsonexception);
        }
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    public String a()
    {
        return e;
    }

    public String b()
    {
        return d;
    }

    public String c()
    {
        return a;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(c).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = ":\022%F5+\0242\030";
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
                obj = ":\022%F5+\0242\n79\b9\b82\0042U)#\b9\00579\b9\030";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "j\024>B3+\023\"W8w";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ":\0258A()\023\036A";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = ".\002!@1%\0272W\r+\036;J<.";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ":\022%F5+\0242q2!\0029";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ">\b<@3";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 93;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 74;
          goto _L9
_L5:
        byte1 = 103;
          goto _L9
_L6:
        byte1 = 87;
          goto _L9
        byte1 = 37;
          goto _L9
    }
}
