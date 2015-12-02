// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            la, App, asy, a1p, 
//            adj, iz, e_, tq, 
//            e8

public class CountryPicker extends SherlockListActivity
{

    public static final String c;
    public static final String e;
    private static final String z[];
    private tq b;
    private TextWatcher d;
    private ImageButton f;
    private EditText g;

    public CountryPicker()
    {
        d = new la(this);
    }

    static EditText a(CountryPicker countrypicker)
    {
        return countrypicker.g;
    }

    static ImageButton b(CountryPicker countrypicker)
    {
        return countrypicker.f;
    }

    static tq c(CountryPicker countrypicker)
    {
        return countrypicker.b;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.dispatchTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }

    public void onBackPressed()
    {
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(g.getText());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        g.setText("");
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        super.onBackPressed();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        int i;
        i = App.am;
        Log.i(z[0]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030059);
        bundle = new ArrayList();
        Object obj = asy.b().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            a1p a1p1 = (a1p)((Iterator) (obj)).next();
            bundle.add(new adj(a1p1.a, String.valueOf(a1p1.g), a1p1.e, a1p1.c));
        } while (i == 0);
_L2:
        View view;
        obj = getListView();
        view = getLayoutInflater().inflate(0x7f03008b, ((android.view.ViewGroup) (obj)), false);
        int j;
        ((ListView) (obj)).addHeaderView(view);
        g = (EditText)view.findViewById(0x7f0b024c);
        g.addTextChangedListener(d);
        iz.a(g);
        f = (ImageButton)view.findViewById(0x7f0b024d);
        f.setOnClickListener(new e_(this));
        b = new tq(this, 0x7f03005a, bundle, getIntent().getStringExtra(e), getIntent().getStringExtra(c));
        setListAdapter(b);
        ((ListView) (obj)).setOnItemClickListener(new e8(this));
        ((ListView) (obj)).setFastScrollEnabled(true);
        ((ListView) (obj)).setScrollbarFadingEnabled(true);
        j = android.os.Build.VERSION.SDK_INT;
        if (j >= 11)
        {
            IOException ioexception;
            try
            {
                ((ListView) (obj)).setFastScrollAlwaysVisible(true);
                ((ListView) (obj)).setScrollBarStyle(0x2000000);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_284;
            }
        }
        ((ListView) (obj)).setSelector(0x7f02063d);
        return;
        ioexception;
        Log.e(z[1]);
        bundle.clear();
        if (true) goto _L2; else goto _L1
_L1:
        bundle;
        throw bundle;
    }

    protected void onDestroy()
    {
        Log.i(z[2]);
        g.removeTextChangedListener(d);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
label0:
        {
            try
            {
                if (menuitem.getItemId() != 0x102002c)
                {
                    break label0;
                }
                finish();
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            return true;
        }
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        char c1;
        c1 = '\uFFFF';
        as = new String[3];
        i = 0;
        obj = "b\021W\030Hs\007R\037_j\033PY_s\033C\002Y";
        byte1 = -1;
_L6:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L17:
        if (k > j) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte1;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 93
    //                   1 110;
           goto _L3 _L4 _L5
_L3:
        as1[i] = ((String) (obj));
        obj = "b\021W\030Hs\007R\037_j\033PYSo\035P\023]u\033\002\004Yb\033K\000Ye^k9yy\035G\006Hh\021LVZs\021OV\177n\013L\002Nx.J\031Rd7L\020S";
        i = 1;
        byte1 = 0;
          goto _L6
_L4:
        as1[i] = ((String) (obj));
        i = 2;
        obj = "b\021W\030Hs\007R\037_j\033PYXd\rV\004Sx";
        byte1 = 1;
          goto _L6
_L5:
        Object obj1;
        as1[i] = ((String) (obj));
        z = as;
        obj = (new StringBuilder()).append(com/whatsapp/CountryPicker.getName());
        obj1 = "/;z\"n@!a9iO*p/cH-m";
        byte1 = c1;
_L11:
        obj1 = ((String) (obj1)).toCharArray();
        j = obj1.length;
        i = 0;
_L24:
        if (j > i) goto _L8; else goto _L7
_L7:
        obj1 = (new String(((char []) (obj1)))).intern();
        byte1;
        JVM INSTR tableswitch 0 0: default 192
    //                   0 396;
           goto _L9 _L10
_L9:
        e = ((StringBuilder) (obj)).append(((String) (obj1))).toString();
        obj = (new StringBuilder()).append(com/whatsapp/CountryPicker.getName());
        obj1 = "/;z\"n@!a9iO*p/cE7q&p@'}8}L;";
        byte1 = 0;
          goto _L11
_L2:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 268
    //                   0 289
    //                   1 294
    //                   2 300
    //                   3 306;
           goto _L12 _L13 _L14 _L15 _L16
_L12:
        byte byte0 = 60;
_L18:
        obj[j] = (char)(byte0 ^ c2);
        j++;
          goto _L17
_L13:
        byte0 = 1;
          goto _L18
_L14:
        byte0 = 126;
          goto _L18
_L15:
        byte0 = 34;
          goto _L18
_L16:
        byte0 = 118;
          goto _L18
_L8:
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 352
    //                   0 373
    //                   1 378
    //                   2 384
    //                   3 390;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        byte0 = 60;
_L25:
        obj1[i] = (char)(byte0 ^ c1);
        i++;
          goto _L24
_L20:
        byte0 = 1;
          goto _L25
_L21:
        byte0 = 126;
          goto _L25
_L22:
        byte0 = 34;
          goto _L25
_L23:
        byte0 = 118;
          goto _L25
_L10:
        c = ((StringBuilder) (obj)).append(((String) (obj1))).toString();
        if (true) goto _L6; else goto _L26
_L26:
    }
}
