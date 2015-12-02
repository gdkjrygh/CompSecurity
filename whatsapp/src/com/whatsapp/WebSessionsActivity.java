// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.qrcode.QrCodeActivity;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, w4, a3e, qb, 
//            iz, a1g, atx, cz, 
//            my, sa, App, cr

public class WebSessionsActivity extends DialogToastFragmentActivity
{

    private static final String z[];
    private cz f;
    private ListView g;
    private cr h;
    private HashMap i;
    private final Runnable j = new a3e(this);
    private View k;
    private View l;

    public WebSessionsActivity()
    {
        h = new w4(this);
    }

    static View a(WebSessionsActivity websessionsactivity)
    {
        return websessionsactivity.k;
    }

    static void a(WebSessionsActivity websessionsactivity, String s)
    {
        websessionsactivity.a(s);
    }

    static void a(WebSessionsActivity websessionsactivity, String s, long l1)
    {
        websessionsactivity.a(s, l1);
    }

    private void a(String s)
    {
        CountDownTimer countdowntimer = (CountDownTimer)i.get(s);
        if (countdowntimer != null)
        {
            countdowntimer.cancel();
            i.remove(s);
        }
    }

    private void a(String s, long l1)
    {
        if ((CountDownTimer)i.get(s) == null)
        {
            long l2 = System.currentTimeMillis();
            i.put(s, (new qb(this, l1 - l2, 60000L, s)).start());
        }
    }

    static HashMap b(WebSessionsActivity websessionsactivity)
    {
        return websessionsactivity.i;
    }

    static Runnable c(WebSessionsActivity websessionsactivity)
    {
        return websessionsactivity.j;
    }

    static cz d(WebSessionsActivity websessionsactivity)
    {
        return websessionsactivity.f;
    }

    static View e(WebSessionsActivity websessionsactivity)
    {
        return websessionsactivity.l;
    }

    protected void onCreate(Bundle bundle)
    {
        Log.i(z[2]);
        super.onCreate(bundle);
        i = new HashMap();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f0300b5);
        g = (ListView)findViewById(0x102000a);
        bundle = iz.a(getLayoutInflater(), 0x7f0300b7, null, false);
        k = bundle.findViewById(0x7f0b00b9);
        a1g.a((TextView)bundle.findViewById(0x7f0b02e6));
        g.addHeaderView(bundle, null, false);
        bundle = iz.a(getLayoutInflater(), 0x7f0300b6, null, false);
        l = bundle.findViewById(0x7f0b0148);
        bundle.findViewById(0x7f0b02e5).setOnClickListener(new atx(this));
        ((TextView)bundle.findViewById(0x7f0b027c)).setText(getString(0x7f0e02fe, new Object[] {
            z[1]
        }));
        g.addFooterView(bundle, null, false);
        f = new cz(this, null);
        f.a(my.g());
        bundle = g;
        int i1;
        if (f.getCount() > 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        g.setAdapter(f);
        g.setOnItemClickListener(new sa(this));
        App.au.ab().postDelayed(j, 30000L);
        my.a(h);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0x7f0b0018, 0, 0x7f0e0248).setIcon(0x7f0204fb).setShowAsAction(2);
        return true;
    }

    public void onDestroy()
    {
        int i1 = App.am;
        Log.i(z[0]);
        super.onDestroy();
        my.b(h);
        App.au.ab().removeCallbacks(j);
        Iterator iterator = i.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((CountDownTimer)iterator.next()).cancel();
        } while (i1 == 0);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 36
    //                   16908332: 40
    //                   2131427352: 46;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L5:
        return flag;
_L2:
        finish();
        return true;
_L3:
        if (!App.i())
        {
            break; /* Loop/switch isn't completed */
        }
        startActivity(new Intent(this, com/whatsapp/qrcode/QrCodeActivity));
        if (App.am == 0) goto _L5; else goto _L4
_L4:
        App.b(getBaseContext(), 0x7f0e0289, 0);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[3];
        obj = "N\025~\034-J\003u\000&J_x\n;M\002s\026";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "N\025~A?Q\021h\034)I\0002\f'T";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "N\025~\034-J\003u\000&J_\177\035-X\004y";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 72;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 57;
          goto _L9
_L5:
        byte0 = 112;
          goto _L9
_L6:
        byte0 = 28;
          goto _L9
        byte0 = 111;
          goto _L9
    }
}
