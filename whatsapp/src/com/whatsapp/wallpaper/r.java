// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.wallpaper:
//            WallpaperPicker

class r
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final WallpaperPicker a;

    r(WallpaperPicker wallpaperpicker)
    {
        a = wallpaperpicker;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Uri uri = null;
        if (App.u != 2) goto _L2; else goto _L1
_L1:
        dialoginterface = Uri.parse(z[3]);
_L4:
        dialoginterface = new Intent(z[0], dialoginterface);
        a.startActivity(dialoginterface);
        a.removeDialog(1);
        a.finish();
        return;
_L2:
        if (App.u == 0)
        {
            dialoginterface = Uri.parse(z[4]);
            continue; /* Loop/switch isn't completed */
        }
        dialoginterface = uri;
        i = android.provider.Settings.Secure.getInt(App.d, z[1]);
        dialoginterface = uri;
        uri = Uri.parse(z[2]);
        dialoginterface = uri;
        if (i == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        dialoginterface = uri;
        a.removeDialog(1);
        dialoginterface = uri;
        try
        {
            a.showDialog(2);
            return;
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception) { }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "s\037C\004>{\025\t\037?f\024I\002\177s\022S\037>|_q?\024E";
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
                obj = "{\037T\0020~\035x\030>|.J\027#y\024S)0b\001T";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "z\005S\006\"(^\b\001&e_P\0360f\002F\006!<\022H\033~s\037C\004>{\025\b!9s\005T7!b&F\032=b\020W\023#<\020W\035";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "s\034]\030k=^F\006!a^F\0305`\036N\022nbLD\031<<\006O\027%a\020W\006\177e\020K\032!s\001B\004";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\177\020U\0354fK\bY5w\005F\037=aNN\022lq\036JX&z\020S\0050b\001\t\0010~\035W\027!w\003";
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
        byte byte1 = 81;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 18;
          goto _L9
_L5:
        byte1 = 113;
          goto _L9
_L6:
        byte1 = 39;
          goto _L9
        byte1 = 118;
          goto _L9
    }
}
