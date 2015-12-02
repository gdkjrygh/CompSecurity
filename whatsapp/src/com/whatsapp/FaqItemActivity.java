// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity

public class FaqItemActivity extends DialogToastActivity
{

    private static final String z[];
    private long j;
    private long k;
    private long l;

    public FaqItemActivity()
    {
    }

    public void onBackPressed()
    {
        j = System.currentTimeMillis();
        k = k + (j - l);
        l = System.currentTimeMillis();
        setResult(-1, (new Intent()).putExtra(z[0], k));
        super.onBackPressed();
        overridePendingTransition(0x7f040001, 0x7f040004);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030067);
        bundle = getIntent().getStringExtra(z[4]);
        getSupportActionBar().setTitle(bundle);
        bundle = getIntent().getStringExtra(z[2]);
        String s = getIntent().getStringExtra(z[5]);
        ((WebView)findViewById(0x7f0b01e0)).loadDataWithBaseURL(s, bundle, z[3], z[6], null);
        k = 0L;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        overridePendingTransition(0x7f040001, 0x7f040004);
        return true;
    }

    public void onPause()
    {
        super.onPause();
        j = System.currentTimeMillis();
        k = k + (j - l);
        l = System.currentTimeMillis();
    }

    public void onResume()
    {
        super.onResume();
        l = System.currentTimeMillis();
    }

    public void onStop()
    {
        super.onStop();
        j = System.currentTimeMillis();
        k = k + (j - l);
        l = System.currentTimeMillis();
        setResult(-1, (new Intent()).putExtra(z[1], k));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "^ny~@uudrIur}zB^";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "^ny~@uudrIur}zB^";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "InckIDu";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "^duk\003Bu`s";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "^hysI";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "_sa";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\177UK2\024";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 272
    //                   3 279;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_279;
_L3:
        byte byte1 = 44;
_L9:
        obj[i1] = (char)(byte1 ^ c);
        i1++;
          goto _L8
_L4:
        byte1 = 42;
          goto _L9
_L5:
        byte1 = 1;
          goto _L9
_L6:
        byte1 = 13;
          goto _L9
        byte1 = 31;
          goto _L9
    }
}
