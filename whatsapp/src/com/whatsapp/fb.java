// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            NewGroup, App, GroupMembersSelector

class fb
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final NewGroup a;

    fb(NewGroup newgroup)
    {
        a = newgroup;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (NewGroup.d(a).getText().toString().trim().length() == 0)
            {
                App.b(a.getBaseContext(), a.getString(0x7f0e02a0), 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view = new Intent(a, com/whatsapp/GroupMembersSelector);
            String s = a.getIntent().getStringExtra(z[1]);
            if (!TextUtils.isEmpty(s))
            {
                view.putExtra(z[0], s);
            }
            a.startActivityForResult(view, 1);
        }
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "\005,D)".toCharArray();
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
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 101;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 111;
          goto _L9
_L5:
        byte0 = 69;
          goto _L9
_L6:
        byte0 = 32;
          goto _L9
        byte0 = 90;
          goto _L9
    }
}
