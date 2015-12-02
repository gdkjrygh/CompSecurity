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
import com.whatsapp.asw;
import com.whatsapp.util.bv;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity, h

class a1 extends bv
{

    private static final String z[];
    final Uri b;
    final CameraActivity c;

    a1(CameraActivity cameraactivity, Uri uri)
    {
        c = cameraactivity;
        b = uri;
        super();
    }

    public void a(View view)
    {
label0:
        {
            int i = CameraActivity.n;
            c.findViewById(0x7f0b00f1).setVisibility(8);
            c.findViewById(0x7f0b00f2).setVisibility(8);
            Object obj = com.whatsapp.util.c.a(CameraActivity.q(c).getText().toString());
            if (CameraActivity.e(c) == null)
            {
                view = b;
            } else
            {
                view = Uri.fromFile(App.m(z[3]));
            }
            view = view.buildUpon();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                view.appendQueryParameter(z[0], ((String) (obj)));
                CameraActivity.q(c).setEnabled(false);
                if (i == 0)
                {
                    break label0;
                }
            }
            c.findViewById(0x7f0b00ef).setVisibility(8);
        }
label1:
        {
            if (CameraActivity.t(c) != 0)
            {
                view.appendQueryParameter(z[6], Integer.toString(CameraActivity.t(c)));
            }
            if (b.getQueryParameter(z[4]) != null)
            {
                view.appendQueryParameter(z[1], "1");
            }
            view = view.build();
            if (CameraActivity.j(c) != null)
            {
                c.findViewById(0x7f0b00f9).setVisibility(0);
                asw.a(new h(this, view), new Void[0]);
                if (i == 0)
                {
                    break label1;
                }
            }
            obj = new Intent(c.getBaseContext(), com/whatsapp/ContactPicker);
            ((Intent) (obj)).setType(z[7]);
            ((Intent) (obj)).putExtra(z[2], view);
            ((Intent) (obj)).putExtra(z[5], true);
            c.startActivity(((Intent) (obj)));
            c.finish();
        }
        c1.a(c, b);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "j\006/+\027f\t";
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
                obj = "o\0136/Sa";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "h\t;-\021`\003q6\020}\0021+Pl\037+-\037'4\013\r;H*";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "j\0062:\fh";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "o\0136/Sa";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "z\f6/!y\025:)\027l\020";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "{\b+>\n`\b1";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "`\n>8\033&M";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 126;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 103;
          goto _L9
_L6:
        byte1 = 95;
          goto _L9
        byte1 = 95;
          goto _L9
    }
}
