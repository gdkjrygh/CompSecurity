// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, ft, fy, hb

public class ChangeNumberOverview extends DialogToastActivity
{

    private static final String z[];

    public ChangeNumberOverview()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        Log.i(z[1]);
        super.onCreate(bundle);
        ft.a(o.CHANGE_NUMBER);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(0x7f03002c);
        hb.a(this, getSupportActionBar(), getString(0x7f0e02a2).toUpperCase(), new fy(this));
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\n4\tvI\f2\035uL\f.\007nK\033*\001}YF8\rkZ\0333\021";
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
                obj = "\n4\tvI\f2\035uL\f.\007nK\033*\001}YF?\032}O\0359";
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
        byte byte0 = 46;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 92;
          goto _L9
_L6:
        byte0 = 104;
          goto _L9
        byte0 = 24;
          goto _L9
    }
}
