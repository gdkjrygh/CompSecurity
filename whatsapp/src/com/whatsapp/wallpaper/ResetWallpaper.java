// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.whatsapp.wallpaper:
//            ImageViewTouchBase

public class ResetWallpaper extends Activity
{

    private static final String z[];

    public ResetWallpaper()
    {
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            bundle = new Intent();
            if (z[1].equals(getIntent().getAction()))
            {
                bundle.putExtra(z[2], true);
                if (!ImageViewTouchBase.e)
                {
                    break label0;
                }
            }
            bundle.putExtra(z[0], true);
        }
        setResult(-1, bundle);
        finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = ")CxYo&QRQ~";
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
                obj = "#_J\023}(QSNk0@\tTd4UII$!SSTe.\036uxY\005dxjK\f|w|Z\005b";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = ")CxOo3US";
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
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 48;
          goto _L9
_L6:
        byte0 = 39;
          goto _L9
        byte0 = 61;
          goto _L9
    }
}
