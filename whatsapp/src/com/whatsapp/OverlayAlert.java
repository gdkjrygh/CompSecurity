// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            DeleteAccountConfirmation, App, k, og, 
//            aoz, o4, m7, RegisterPhone, 
//            sf, Conversation, iz, xn, 
//            aor

public class OverlayAlert extends Activity
{

    private static final String z[];

    public OverlayAlert()
    {
    }

    public static void a(Activity activity)
    {
        DeleteAccountConfirmation.a();
        App.aF = false;
        App.a0();
        App.aF();
        Object obj = App.az.f();
        if (obj != null)
        {
            ((og) (obj)).g();
            ((og) (obj)).a(0, 0);
        }
        obj = new File(App.au.getFilesDir(), z[2]);
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        App.Z = null;
        App.e(App.au, null);
        App.ah.m();
        o4.o();
        m7.a();
        m7.d();
        obj = new Intent(activity, com/whatsapp/RegisterPhone);
        ((Intent) (obj)).putExtra(z[1], true);
        ((Intent) (obj)).putExtra(z[0], true);
        ((Intent) (obj)).addFlags(32768);
        App.d(activity, 1);
        App.n = false;
        App.s();
        o4.N();
        App.aV();
        activity.startActivity(((Intent) (obj)));
        activity.finish();
        App.e(false);
        sf.f();
        Conversation.j();
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            requestWindowFeature(1);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                setFinishOnTouchOutside(false);
            }
            setContentView(iz.a(getLayoutInflater(), 0x7f030091, null, false));
            bundle = (Button)findViewById(0x7f0b01be);
            bundle.setText(0x7f0e0098);
            bundle.setOnClickListener(new xn(this));
            bundle = (Button)findViewById(0x7f0b01bd);
            bundle.setText(0x7f0e02be);
            bundle.setOnClickListener(new aor(this));
            int i = getIntent().getIntExtra(z[3], -1);
            if (i == -1)
            {
                finish();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((TextView)findViewById(0x7f0b025a)).setText(getString(i));
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\025\0015m\\\036\017,0J\006\036v\021N\021\007+7N\004>0,E\023@;/N\027\034\0073C\031\000=\034E\003\003:&Y";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\025\0015m\\\036\017,0J\006\036v\021N\021\007+7N\004>0,E\023@*&X\023\032+7J\002\013";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\033\013";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\005\032**E\021\007<";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 43;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 118;
          goto _L9
_L5:
        byte0 = 110;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 67;
          goto _L9
    }
}
