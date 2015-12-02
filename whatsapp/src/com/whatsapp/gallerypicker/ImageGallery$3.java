// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, ImageGallery

class a extends BroadcastReceiver
{

    private static final String z[];
    final ImageGallery a;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            int i = ImagePreview.B;
            context = intent.getAction();
            if (context.equals(z[6]))
            {
                Log.i(z[1]);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (context.equals(z[7]))
            {
                Log.i(z[5]);
                ImageGallery.a(a, true, false);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (context.equals(z[8]))
            {
                Log.i(z[0]);
                ImageGallery.a(a, false, true);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (context.equals(z[2]))
            {
                Log.i(z[9]);
                ImageGallery.a(a, false, false);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (context.equals(z[3]))
            {
                Log.i(z[4]);
                ImageGallery.a(a, true, false);
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW?\007$jF)\026:w\\-\0261aL";
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
                obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW!\0130j\\)\0";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW?\007$jF)\026:bA\"\r6lM(";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW)\016 g\\";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW)\016 g\\";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW9\n(k]\"\020 `";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW!\0130j\\)\0";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW9\n(k]\"\020 `";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "\004Jl\036+\f@&\005*\021Af\030j\004G|\005+\013\nE)\000,eW?\007$jF)\026:w\\-\0261aL";
                byte0 = 7;
                i = 8;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\fIi\013!\002Ed\000!\027]'\036!\006Aa\032!\bAl\005%\007Vg\r \006E{\030k$g\\%\013+{E)\000,eW?\007$jF)\026:bA\"\r6lM(";
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
        char c = obj[j];
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
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 101;
          goto _L9
_L5:
        byte1 = 36;
          goto _L9
_L6:
        byte1 = 8;
          goto _L9
        byte1 = 108;
          goto _L9
    }

    (ImageGallery imagegallery)
    {
        a = imagegallery;
        super();
    }
}
