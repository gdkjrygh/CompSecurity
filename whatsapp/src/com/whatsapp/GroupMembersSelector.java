// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, au2, App

public class GroupMembersSelector extends MultipleContactsSelector
{

    private static final String z[];

    public GroupMembersSelector()
    {
    }

    protected String b()
    {
        return getString(0x7f0e002b).toUpperCase();
    }

    protected String c()
    {
        return getString(0x7f0e029f);
    }

    protected int d()
    {
        return 1;
    }

    protected int e()
    {
        return 0x7f0e01f7;
    }

    protected int f()
    {
        return 0x7f0e0107;
    }

    protected int h()
    {
        return au2.g;
    }

    protected void j()
    {
        String s = g();
        if (TextUtils.isEmpty(s))
        {
            App.b(this, getString(0x7f0e02b4), 0);
            return;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra(z[1], s);
            setResult(-1, intent);
            finish();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z[2]);
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        Log.i(z[0]);
        super.onDestroy();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "B;0rwH,2ebW:,bk@*+hu\n-:tsW&&";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "O ;t";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "B;0rwH,2ebW:,bk@*+hu\n*-bfQ,";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 7;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 37;
          goto _L9
_L5:
        byte0 = 73;
          goto _L9
_L6:
        byte0 = 95;
          goto _L9
        byte0 = 7;
          goto _L9
    }
}
