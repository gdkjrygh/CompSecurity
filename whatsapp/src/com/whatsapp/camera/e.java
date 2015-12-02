// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.hardware.Camera;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.camera:
//            CameraView, s

class e
    implements android.hardware.Camera.PictureCallback
{

    private static final String z[];
    final s a;
    final CameraView b;

    e(CameraView cameraview, s s1)
    {
        b = cameraview;
        a = s1;
        super();
    }

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        Log.i((new StringBuilder()).append(z[1]).append(CameraView.k(b)).toString());
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            try
            {
                CameraView.g(b).stopPreview();
            }
            // Misplaced declaration of an exception variable
            catch (Camera camera)
            {
                Log.c(z[0], camera);
            }
        }
        CameraView.a(b, false);
        a.a(abyte0, CameraView.k(b));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "z\035Bk\025x\nFk\0206\bNe\002i\025Lz\022k\031\017k\025k\023].\024m\023_~\016w\033\017m\006t\031]oGi\016Jx\016|\013";
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
                obj = "z\035Bk\025x\nFk\0206\bNe\002i\025Lz\022k\031\017z\006r\031A.";
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
        byte byte0 = 103;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 25;
          goto _L9
_L5:
        byte0 = 124;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 14;
          goto _L9
    }
}
