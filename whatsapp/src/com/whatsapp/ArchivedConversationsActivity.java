// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, ArchivedConversationsFragment

public class ArchivedConversationsActivity extends DialogToastFragmentActivity
{

    private static final String z[];

    public ArchivedConversationsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        Log.i(z[1]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f03001f);
        if (bundle == null)
        {
            getSupportFragmentManager().beginTransaction().add(0x7f0b00ac, new ArchivedConversationsFragment()).commit();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(z[0]);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\nE\177\000\031\035Rx\013\037\005Ay\032\003\nCu\007\036\030\030x\r\003\037Es\021";
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
                obj = "\nE\177\000\031\035Rx\013\037\005Ay\032\003\nCu\007\036\030\030\177\032\025\nCy";
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
        byte byte0 = 112;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 107;
          goto _L9
_L5:
        byte0 = 55;
          goto _L9
_L6:
        byte0 = 28;
          goto _L9
        byte0 = 104;
          goto _L9
    }
}
