// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.ContactPicker;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.og;
import com.whatsapp.util.Log;
import com.whatsapp.util.bv;
import com.whatsapp.util.c1;
import java.io.IOException;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class as extends bv
{

    private static final String z[];
    final CameraActivity b;

    as(CameraActivity cameraactivity)
    {
        b = cameraactivity;
        super();
    }

    public void a(View view)
    {
        String s1;
        int i;
        i = CameraActivity.n;
        s1 = CameraActivity.q(b).getText().toString();
        if (CameraActivity.j(b) == null) goto _L2; else goto _L1
_L1:
        c1.a(b, CameraActivity.j(b).a, CameraActivity.i(b), (byte)3, 0, false, s1);
_L4:
        c1.a(b, Uri.fromFile(CameraActivity.i(b)));
        b.finish();
        return;
        view;
        String s = view.getMessage();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        boolean flag = view.getMessage().contains(z[3]);
        if (flag)
        {
            Uri uri;
            Intent intent;
            try
            {
                App.a(b, b.getString(0x7f0e015f));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_146;
            }
        }
        App.b(b.getBaseContext(), 0x7f0e03d4, 0);
        Log.e((new StringBuilder()).append(z[4]).append(view.toString()).toString());
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        intent = new Intent(b.getBaseContext(), com/whatsapp/ContactPicker);
        intent.setType(z[0]);
        uri = Uri.fromFile(CameraActivity.i(b));
        view = uri;
        if (!TextUtils.isEmpty(s1))
        {
            view = uri.buildUpon().appendQueryParameter(z[1], s1).build();
        }
        intent.putExtra(z[5], view);
        intent.putExtra(z[2], true);
        b.startActivity(intent);
        if (true) goto _L4; else goto _L3
_L3:
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as1 = new String[6];
        obj = "ER\\t\002\034\021";
        byte0 = -1;
        i = 0;
_L2:
        String as2[];
        int j;
        int k;
        as2 = as1;
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
                as2[i] = ((String) (obj));
                obj = "PZHe\004\\U";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i] = ((String) (obj));
                obj = "@PQa2CI]g\004VL";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i] = ((String) (obj));
                obj = "}T\030b\035RX]";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i] = ((String) (obj));
                obj = "PZUt\037RZ[e\004ERLhB@OWa\033Z_]~\016RKLd\037V\033";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i] = ((String) (obj));
                i = 5;
                obj = "RU\\c\002Z_\026x\003G^VeCVCLc\f\035hlC(rv";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i] = ((String) (obj));
                z = as1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 109;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 59;
          goto _L9
_L6:
        byte1 = 56;
          goto _L9
        byte1 = 17;
          goto _L9
    }
}
