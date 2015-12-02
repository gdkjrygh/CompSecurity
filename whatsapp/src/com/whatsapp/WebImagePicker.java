// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;
import com.whatsapp.util.Log;
import com.whatsapp.util.b2;
import com.whatsapp.util.c;
import com.whatsapp.util.r;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, nt, App, a1g, 
//            ew, asw, ao1, a3f, 
//            a34, aoe, fr, w8, 
//            xg, i2

public class WebImagePicker extends DialogToastListActivity
{

    private static final String z[];
    private a1g i;
    private Uri j;
    private ew k;
    private int l;
    private ao1 m;
    private ArrayList n;
    private b2 o;
    private nt p;
    private SearchView q;
    private int r;
    private final File s;
    private android.view.View.OnClickListener t;

    public WebImagePicker()
    {
        n = new ArrayList();
        p = new nt("");
        r = 4;
        s = new File(App.au.getCacheDir(), z[9]);
    }

    static ew a(WebImagePicker webimagepicker, ew ew1)
    {
        webimagepicker.k = ew1;
        return ew1;
    }

    static nt a(WebImagePicker webimagepicker, nt nt1)
    {
        webimagepicker.p = nt1;
        return nt1;
    }

    static b2 a(WebImagePicker webimagepicker, b2 b2_1)
    {
        webimagepicker.o = b2_1;
        return b2_1;
    }

    static File a(WebImagePicker webimagepicker)
    {
        return webimagepicker.s;
    }

    private void a()
    {
        l = i.H + i.p * 2 + (int)i.j;
        Display display = getWindowManager().getDefaultDisplay();
        r = display.getWidth() / l;
        l = display.getWidth() / r - (int)i.j;
        if (o != null)
        {
            o.a();
        }
        o = (new r(s)).a(l).a(0x400000L).a(getResources().getDrawable(0x7f0205fa)).b(getResources().getDrawable(0x7f020537)).a();
    }

    static void a(WebImagePicker webimagepicker, i2 i2)
    {
        webimagepicker.a(i2);
    }

    private void a(i2 i2)
    {
        if (k != null)
        {
            k.cancel(true);
        }
        k = new ew(this, i2);
        asw.a(k, new Void[0]);
    }

    static ew b(WebImagePicker webimagepicker)
    {
        return webimagepicker.k;
    }

    private void b()
    {
label0:
        {
            String s1 = q.getQuery().toString();
            if (TextUtils.isEmpty(s1))
            {
                Toast.makeText(getApplicationContext(), getString(0x7f0e02db), 0).show();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((InputMethodManager)App.au.getSystemService(z[3])).hideSoftInputFromWindow(q.getWindowToken(), 0);
            ao1.a(m, s1);
        }
    }

    static Uri c(WebImagePicker webimagepicker)
    {
        return webimagepicker.j;
    }

    static int d(WebImagePicker webimagepicker)
    {
        return webimagepicker.r;
    }

    static a1g e(WebImagePicker webimagepicker)
    {
        return webimagepicker.i;
    }

    static android.view.View.OnClickListener f(WebImagePicker webimagepicker)
    {
        return webimagepicker.t;
    }

    static void g(WebImagePicker webimagepicker)
    {
        webimagepicker.b();
    }

    static ArrayList h(WebImagePicker webimagepicker)
    {
        return webimagepicker.n;
    }

    static b2 i(WebImagePicker webimagepicker)
    {
        return webimagepicker.o;
    }

    static nt j(WebImagePicker webimagepicker)
    {
        return webimagepicker.p;
    }

    static SearchView k(WebImagePicker webimagepicker)
    {
        return webimagepicker.q;
    }

    static int l(WebImagePicker webimagepicker)
    {
        return webimagepicker.l;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        a();
        m.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Log.i(z[8]);
        super.onCreate(bundle);
        bundle = getSupportActionBar();
        bundle.setDisplayHomeAsUpEnabled(true);
        bundle.setDisplayShowTitleEnabled(false);
        bundle.setIcon(0x7f020570);
        bundle.setDisplayShowCustomEnabled(true);
        i = a1g.a();
        s.mkdirs();
        nt.b();
        setContentView(0x7f0300b3);
        bundle = getIntent().getStringExtra(z[6]);
        if (bundle != null)
        {
            bundle = com.whatsapp.util.c.a(bundle);
        }
        obj = new a3f(this);
        q = new _cls2(getSupportActionBar().getThemedContext());
        q.setQueryHint(getString(0x7f0e0369));
        q.setSubmitButtonEnabled(true);
        q.setIconified(false);
        q.setOnCloseListener(new a34(this));
        q.setQuery(bundle, false);
        q.setOnSearchClickListener(((android.view.View.OnClickListener) (obj)));
        getSupportActionBar().setCustomView(q);
        obj = getIntent().getExtras();
        if (obj != null)
        {
            j = (Uri)((Bundle) (obj)).getParcelable(z[7]);
        }
        obj = getListView();
        ((ListView) (obj)).requestFocus();
        ((ListView) (obj)).setClickable(false);
        ((ListView) (obj)).setBackgroundDrawable(null);
        ((ListView) (obj)).setDividerHeight(0);
        m = new ao1(this, this);
        setListAdapter(m);
        t = new aoe(this);
        q.findViewById(0x7f0b005b).setOnClickListener(new fr(this));
        ((TextView)q.findViewById(0x7f0b0058)).setOnEditorActionListener(new w8(this));
        a();
        obj = Environment.getExternalStorageState();
        if (((String) (obj)).equals(z[5]) || ((String) (obj)).equals(z[4])) goto _L2; else goto _L1
_L1:
        bundle = getApplicationContext();
        int i1;
        if (App.m())
        {
            i1 = 0x7f0e0287;
        } else
        {
            i1 = 0x7f0e0288;
        }
        Toast.makeText(bundle, i1, 1).show();
        finish();
_L4:
        return;
_L2:
        if (!TextUtils.isEmpty(bundle))
        {
            break; /* Loop/switch isn't completed */
        }
        (new Handler()).postDelayed(new xg(this), 200L);
        if (App.am == 0) goto _L4; else goto _L3
_L3:
        ao1.a(m, bundle);
        return;
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(z[1]);
        n.clear();
        o.a(true);
        if (k != null)
        {
            k.cancel(true);
            Log.i(z[2]);
            if (ew.a(k) != null)
            {
                Log.i(z[0]);
                ew.a(k).dismiss();
                ew.a(k, null);
            }
            k = null;
        }
        ao1.a(m);
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
        byte byte0;
        int i1;
        as = new String[10];
        obj = "2-\032F)$/\035\\!$:\033Gk&)\026L!)\027\034F%)'\037";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "2-\032F)$/\035\\!$:\033Gk!-\013[6*1";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "2-\032F)$/\035\\!$:\033Gk&)\026L!)\027\021B%\"-'K+2&\024@%!\027\fN7.";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = ",&\bZ0\032%\035[,*,";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "('\rA0 ,']+";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "('\rA0 ,";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "4=\035]=";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "*=\f_11";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "2-\032F)$/\035\\!$:\033Gk&:\035N0 ";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\021 \rB&6";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 68;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 72;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 47;
          goto _L9
    }

    private class _cls2 extends SearchView
    {

        final WebImagePicker b;

        public boolean isIconified()
        {
            return false;
        }

        _cls2(Context context)
        {
            b = WebImagePicker.this;
            super(context);
        }
    }

}
