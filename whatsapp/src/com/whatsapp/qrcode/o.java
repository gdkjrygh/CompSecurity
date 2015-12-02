// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.hardware.Camera;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeView

class o
    implements android.hardware.Camera.ErrorCallback
{

    private static final String z[];
    final QrCodeView a;

    o(QrCodeView qrcodeview)
    {
        a = qrcodeview;
        super();
    }

    public void onError(int i, Camera camera)
    {
        Log.w((new StringBuilder()).append(z[0]).append(i).toString());
        if (i != 100)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        QrCodeView.c(a);
        QrCodeView.d(a);
        QrCodeView.a(a).setPreviewDisplay(QrCodeView.b(a));
        a.f();
        return;
        camera;
_L2:
        QrCodeView.a(a).release();
        QrCodeView.a(a, null);
        Log.a(z[1], camera);
        QrCodeView.e(a);
        return;
        camera;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "+JngZ-\027kz^(L{oR?Jy.\\;U}|^z]j|P(\002";
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
                i = 1;
                obj = "+JngZ-\027kz^(L{oR?Jy.";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 63;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 90;
          goto _L9
_L5:
        byte0 = 56;
          goto _L9
_L6:
        byte0 = 24;
          goto _L9
        byte0 = 14;
          goto _L9
    }
}
