// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package com.whatsapp.util:
//            bt, Log, a5

final class bx
    implements android.view.LayoutInflater.Factory
{

    private static final String z[];
    final Activity a;

    bx(Activity activity)
    {
        a = activity;
        super();
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        context = null;
        if (s.equalsIgnoreCase(z[4])) goto _L2; else goto _L1
_L1:
        boolean flag = s.endsWith(z[2]);
        if (flag) goto _L2; else goto _L3
_L3:
        flag = s.equalsIgnoreCase(z[1]);
        if (flag) goto _L2; else goto _L4
_L4:
        View aview[];
        try
        {
            flag = s.equalsIgnoreCase(z[3]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        InflateException inflateexception;
        try
        {
            context = a.getLayoutInflater();
            aview = new View[1];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        aview[0] = context.createView(s, null, attributeset);
_L6:
        (new Handler()).post(new bt(this, aview, s));
        context = aview[0];
_L5:
        return context;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
        inflateexception;
        Log.i(z[0]);
        a5.b(s, attributeset, context, aview);
          goto _L6
        s;
        return null;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "j \021\016d\177&\r\017iK&\r\ft>4\r\016cS7\n\025Sl'\n\003fj;\013\016t>;\n\006k\177&\001@bf1\001\020sw=\n";
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
                obj = "}=\tNfp6\026\017nz|\r\016s{ \n\001k0$\r\005p0?\001\016r0\023\007\024nq<)\005ik\033\020\005jH;\001\027";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "J7\034\024Qw7\023";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "}=\tNfp6\026\017nz|\r\016s{ \n\001k0%\r\004`{&J$n\177>\013\007Sw&\b\005";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "}=\tNfp6\026\017nz|\r\016s{ \n\001k0$\r\005p0?\001\016r0\033\007\017iS7\n\025Nj7\t6n{%";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 7;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 30;
          goto _L9
_L5:
        byte1 = 82;
          goto _L9
_L6:
        byte1 = 100;
          goto _L9
        byte1 = 96;
          goto _L9
    }
}
