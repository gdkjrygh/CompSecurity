// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.whatsapp:
//            og, App

public class oh extends og
{

    private static final String R[];

    public oh()
    {
        super((new StringBuilder()).append(App.k()).append(R[4]).toString());
        SharedPreferences sharedpreferences = App.au.getSharedPreferences(R[3], 0);
        q = sharedpreferences.getInt(R[1], 0);
        u = sharedpreferences.getInt(R[2], 0);
    }

    public void a(int i, int j)
    {
        u = i;
        q = j;
        android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(R[8], 0).edit();
        editor.putInt(R[5], j);
        editor.putInt(R[6], i);
        if (!editor.commit())
        {
            Log.e(R[7]);
        }
    }

    protected InputStream b(boolean flag)
    {
        return null;
    }

    public File c()
    {
        return new File(App.au.getFilesDir(), R[0]);
    }

    public boolean c(boolean flag)
    {
        return false;
    }

    public File h()
    {
        return f(R[9]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "d\017\nEBn";
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
                obj = "y\030KI[e\017{_Zf\036KpFa\037IMm`\016";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "y\030KI[e\017{_Zf\036KpT|\006Hp[m";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "j\005I\001Ea\013P\\Sy\032{_@l\fA]Wg\tA\\";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "I\031\nXZh\036WNByDJJF";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "y\030KI[e\017{_Zf\036KpFa\037IMm`\016";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "y\030KI[e\017{_Zf\036KpT|\006Hp[m";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "j\005J[Sj\036IN\\h\rA]\035z\017P_@f\fMCWy\002K[]`\016\013IS`\006AK";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "j\005I\001Ea\013P\\Sy\032{_@l\fA]Wg\tA\\";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "d\017";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                R = as;
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
        byte byte1 = 50;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 106;
          goto _L9
_L6:
        byte1 = 36;
          goto _L9
        byte1 = 47;
          goto _L9
    }
}
