// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.hardware.Camera;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp.camera:
//            CameraView

class r
    implements android.hardware.Camera.ErrorCallback
{

    private static final String z[];
    final CameraView a;

    r(CameraView cameraview)
    {
        a = cameraview;
        super();
    }

    public void onError(int i, Camera camera)
    {
        Log.w((new StringBuilder()).append(z[2]).append(i).append(z[4]).append(CameraView.a(a)).append(z[3]).append(CameraView.f(a)).append(z[1]).append(CameraView.i(a)).toString());
        if (i != 100)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        CameraView.d(a);
        CameraView.h(a);
        CameraView.g(a).setPreviewDisplay(CameraView.c(a));
        CameraView.e(a);
        return;
        camera;
_L2:
        CameraView.g(a).release();
        CameraView.a(a, null);
        Log.a(z[0], camera);
        CameraView.j(a);
        return;
        camera;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "06qO\n2!uO\017|$hK\n'4}G\035!6<";
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
                obj = "s>rZ\n6!uO\017i";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "06qO\n2!uO\017|$hK\n'4}G\035!6<I\031>2nKX6%nE\ni";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "s%yI\027!3uD\037i";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "s#}A\021=0lC\033'\"nOB";
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
        byte byte1 = 120;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 83;
          goto _L9
_L5:
        byte1 = 87;
          goto _L9
_L6:
        byte1 = 28;
          goto _L9
        byte1 = 42;
          goto _L9
    }
}
