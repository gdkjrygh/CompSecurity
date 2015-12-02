// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, a8_, ao9, b2, 
//            eu, App, k, tr, 
//            og, cm, alc, iz, 
//            a9e, hb

public abstract class MultipleContactsSelector extends DialogToastActivity
{

    private static final String z[];
    protected ArrayList j;
    private a8_ k;
    final TextWatcher l = new eu(this);
    private ArrayList m;
    private ao9 n;
    private ImageButton o;
    protected TextView p;
    protected AutoCompleteTextView q;
    android.widget.AdapterView.OnItemClickListener r;

    public MultipleContactsSelector()
    {
        m = new ArrayList();
        j = new ArrayList();
        k = new a8_(this, null);
        n = new ao9();
        r = new b2(this);
    }

    static ao9 a(MultipleContactsSelector multiplecontactsselector)
    {
        return multiplecontactsselector.n;
    }

    private ArrayList a()
    {
        ArrayList arraylist = new ArrayList();
        App.az.b(arraylist);
        Collections.sort(arraylist, new tr(getApplicationContext()));
        return arraylist;
    }

    static boolean a(MultipleContactsSelector multiplecontactsselector, String s)
    {
        return multiplecontactsselector.a(s);
    }

    private boolean a(String s)
    {
        int i1 = App.am;
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (s.equals(((og)iterator.next()).a))
            {
                return true;
            }
        } while (i1 == 0);
        return false;
    }

    static ArrayList b(MultipleContactsSelector multiplecontactsselector)
    {
        return multiplecontactsselector.m;
    }

    static a8_ c(MultipleContactsSelector multiplecontactsselector)
    {
        return multiplecontactsselector.k;
    }

    protected void a(ListView listview)
    {
    }

    protected abstract String b();

    protected void b(String s)
    {
        int j1 = App.am;
        j.clear();
        s = s.split(",");
        int k1 = s.length;
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            Object obj = s[i1];
            obj = App.az.e(((String) (obj)));
            j.add(obj);
            i1++;
        } while (j1 == 0);
        q.setText("");
        k.notifyDataSetChanged();
        i();
    }

    protected abstract String c();

    protected abstract int d();

    protected abstract int e();

    protected abstract int f();

    protected String g()
    {
        int i1 = App.am;
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            og og1 = (og)iterator.next();
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(og1.a);
        } while (i1 == 0);
        return stringbuilder.toString();
    }

    protected abstract int h();

    protected void i()
    {
label0:
        {
            int i1 = App.am;
            if (j.size() == 0)
            {
                p.setText("");
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (h() > 0)
            {
                p.setText((new StringBuilder()).append(Integer.toString(j.size())).append("/").append(h()).toString());
                if (i1 == 0)
                {
                    break label0;
                }
            }
            p.setText(Integer.toString(j.size()));
        }
    }

    protected abstract void j();

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i1, j1, intent);
_L4:
        return;
_L2:
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        String s = intent.getStringExtra(z[0]);
        if (!TextUtils.isEmpty(s))
        {
            b(s);
        }
        if (App.am == 0) goto _L4; else goto _L1
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z[3]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setTitle(c());
        setContentView(0x7f03008c);
        ((TextView)findViewById(0x7f0b024e)).setText(b());
        p = (TextView)findViewById(0x7f0b024f);
        o = (ImageButton)findViewById(0x7f0b0252);
        o.setOnClickListener(new cm(this));
        m = a();
        bundle = new alc(this);
        q = (AutoCompleteTextView)findViewById(0x7f0b0250);
        q.setAdapter(bundle);
        q.setOnItemClickListener(r);
        q.setThreshold(1);
        iz.a(q);
        bundle = (ListView)findViewById(0x102000a);
        a(bundle);
        bundle.setAdapter(k);
        hb.a(this, getSupportActionBar(), getString(f()).toUpperCase(), new a9e(this));
        i();
        q.addTextChangedListener(l);
        bundle = getIntent().getStringExtra(z[2]);
        if (!TextUtils.isEmpty(bundle))
        {
            b(bundle);
        }
    }

    public void onDestroy()
    {
        Log.i(z[1]);
        super.onDestroy();
        n.a();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return true;

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
        int i1;
        as = new String[4];
        obj = "gNK\025";
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
                obj = "`RC\022P}KJ\005VcSN\005M~TJ\n\\nS@\024\026iB\\\022Kb^";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "gNK\025";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "`RC\022P}KJ\005VcSN\005M~TJ\n\\nS@\024\026nUJ\007Mh";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
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
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 39;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 102;
          goto _L9
    }
}
