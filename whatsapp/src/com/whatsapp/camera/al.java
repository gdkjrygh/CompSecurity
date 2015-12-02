// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.au2;
import com.whatsapp.util.bv;
import com.whatsapp.wallpaper.CropImage;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class al extends bv
{

    private static final String z[];
    final CameraActivity b;
    final Uri c;

    al(CameraActivity cameraactivity, Uri uri)
    {
        b = cameraactivity;
        c = uri;
        super();
    }

    public void a(View view)
    {
        view = new Intent(b, com/whatsapp/wallpaper/CropImage);
        view.putExtra(z[1], false);
        view.putExtra(z[5], false);
        view.putExtra(z[9], false);
        view.putExtra(z[3], au2.d);
        view.putExtra(z[10], Uri.fromFile(App.m(z[7])));
        view.putExtra(z[4], android.graphics.Bitmap.CompressFormat.JPEG.toString());
        view.setData(c);
        if (CameraActivity.e(b) != null)
        {
            view.putExtra(z[0], CameraActivity.e(b));
        }
        if (CameraActivity.t(b) != 0)
        {
            view.putExtra(z[8], CameraActivity.t(b));
        }
        if (c.getQueryParameter(z[6]) != null)
        {
            view.putExtra(z[2], true);
        }
        b.startActivityForResult(view, 1);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "]]\002,7U_9==@";
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
                obj = "GP\n4;aC\">\020QV\017=:";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "R_\002(\026";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "YR\023\033,[C";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "[F\037(+@u\004*3UG";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "WA\004(\034M|\036,.AG81$Q";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "R_\002(s\\";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "WR\006=,U";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "F\\\0379*]\\\005";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "R_\n,*Q]97*UG\00270";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "[F\037(+@";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 94;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 52;
          goto _L9
_L5:
        byte1 = 51;
          goto _L9
_L6:
        byte1 = 107;
          goto _L9
        byte1 = 88;
          goto _L9
    }
}
