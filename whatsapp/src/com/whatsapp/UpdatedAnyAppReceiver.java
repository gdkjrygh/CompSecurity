// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.c2dm.a;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

public class UpdatedAnyAppReceiver extends BroadcastReceiver
{

    private static final String z[];

    public UpdatedAnyAppReceiver()
    {
    }

    public static void a()
    {
label0:
        {
            a a1 = new a(App.au);
            a1.h();
            a1.j();
            if (App.Z != null)
            {
                Log.i(z[0]);
                C2DMRegistrar.a(App.au);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[1]);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            Log.i(z[4]);
            if (intent.getData().getSchemeSpecificPart().equals(context.getPackageName()))
            {
                Log.i(z[3]);
                a();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[2]);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "FH2=5V\\7,1A]59(E]$s3VI#92G\025$9'A]%4";
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
                obj = "FH2=5VY&,3V[357VJy/*ZH{.$UJ3/)";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "FH2=5V\\7,1A]59(E]$s CHy2.G\0259)3@";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "FH2=5V\\7,1A]59(E]$s CHy:.FV2";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "FH2=5V\\7,1A]59(E]$s3V[357V";
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
        byte byte1 = 65;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 56;
          goto _L9
_L6:
        byte1 = 86;
          goto _L9
        byte1 = 92;
          goto _L9
    }
}
