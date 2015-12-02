// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, App, ako, c0, 
//            bu, a9c, a8n, _q, 
//            io

public class SmsDefaultAppWarning extends DialogToastActivity
{

    private static final String z[];

    public SmsDefaultAppWarning()
    {
    }

    private void a()
    {
        App.a(this, getIntent().getData(), getString(0x7f0e0442, new Object[] {
            z[0]
        }));
    }

    static void a(SmsDefaultAppWarning smsdefaultappwarning)
    {
        smsdefaultappwarning.a();
    }

    private void b()
    {
        App.a(this, getIntent().getData(), null);
    }

    static void b(SmsDefaultAppWarning smsdefaultappwarning)
    {
        smsdefaultappwarning.b();
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            Log.i(z[1]);
            bundle = new Intent(z[3]);
            bundle.setData(getIntent().getData());
            bundle = getPackageManager().resolveActivity(bundle, 0);
            if (bundle != null && ((ResolveInfo) (bundle)).activityInfo != null && z[2].equals(((ResolveInfo) (bundle)).activityInfo.packageName))
            {
                showDialog(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            showDialog(1);
        }
    }

    public Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e04a1).setNeutralButton(0x7f0e03dc, new ako(this)).setNegativeButton(0x7f0e03e3, new c0(this)).setPositiveButton(0x7f0e03e4, new bu(this)).setOnCancelListener(new a9c(this)).create();

        case 1: // '\001'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e04a0).setNeutralButton(0x7f0e03dc, new a8n(this)).setPositiveButton(0x7f0e03e4, new _q(this)).setOnCancelListener(new io(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\034 \024kJN{OlQ\025 \023zI\004z\003tT[0\f4";
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
                obj = "\0079\023\177\\\0225\025wM\025$\020lX\006:\tu^[7\022~X\0001";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\027;\r5N\0345\024hX\004$";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\025:\004iV\0350NrW\0001\016o\027\0257\024rV\032z3^w0\000/";
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
        byte byte0 = 57;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 116;
          goto _L9
_L5:
        byte0 = 84;
          goto _L9
_L6:
        byte0 = 96;
          goto _L9
        byte0 = 27;
          goto _L9
    }
}
