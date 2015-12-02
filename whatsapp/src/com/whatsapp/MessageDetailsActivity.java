// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import com.whatsapp.util.y;
import com.whatsapp.wallpaper.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, ao9, adw, ase, 
//            t8, App, ub, aoz, 
//            nv, p8, mk, og, 
//            u3, a10, Conversation, ConversationRow, 
//            jg, a1n, a3p, xo, 
//            gs, adk, wd

public class MessageDetailsActivity extends DialogToastActivity
{

    public static String k;
    public static String r;
    private static final String z[];
    private BaseAdapter j;
    private final ao9 l = new ao9();
    private ListView m;
    private long n;
    private final adk o = new adw(this);
    private final Runnable p = new t8(this);
    private ConversationRow q;
    private c4 s;
    private final wd t = new ase(this);
    private ArrayList u;

    public MessageDetailsActivity()
    {
        u = new ArrayList();
    }

    static ConversationRow a(MessageDetailsActivity messagedetailsactivity)
    {
        return messagedetailsactivity.q;
    }

    private CharSequence a(long l1)
    {
        return com.whatsapp.util.q.e(getBaseContext(), App.c(l1));
    }

    static CharSequence a(MessageDetailsActivity messagedetailsactivity, long l1)
    {
        return messagedetailsactivity.a(l1);
    }

    private void a()
    {
label0:
        {
            App.au.ab().removeCallbacks(p);
            if (n == 0x7fffffffffffffffL)
            {
                break label0;
            }
            long l1 = System.currentTimeMillis();
            long l2 = l1 - n;
            if (l2 < 0x36ee80L)
            {
                long l3 = n;
                long l5 = l2 / 60000L;
                App.au.ab().postDelayed(p, ((l3 + l5 * 60000L + 60000L) - l1) + 1000L);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (l2 < 0x5265c00L)
            {
                long l4 = n;
                l2 /= 0x36ee80L;
                App.au.ab().postDelayed(p, ((l2 * 0x36ee80L + l4 + 0x36ee80L) - l1) + 1000L);
            }
        }
    }

    static boolean a(MessageDetailsActivity messagedetailsactivity, String s1)
    {
        return messagedetailsactivity.a(s1);
    }

    private boolean a(String s1)
    {
        int i = App.am;
        Iterator iterator = u.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (s1.equals(((ub)iterator.next()).a))
            {
                return true;
            }
        } while (i == 0);
        return false;
    }

    static ArrayList b(MessageDetailsActivity messagedetailsactivity)
    {
        return messagedetailsactivity.u;
    }

    private void b()
    {
        int k1 = App.am;
        u.clear();
        n = 0x7fffffffffffffffL;
        Iterator iterator = App.ah.c(s.y).a.entrySet().iterator();
        int j1 = 0;
        int i = 0;
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            p8 p8_1 = (p8)entry.getValue();
            u.add(new ub((String)entry.getKey(), p8_1));
            long l1 = p8_1.a(5);
            long l2 = p8_1.a(13);
            long l3 = p8_1.a(8);
            if (l1 != 0L)
            {
                n = Math.min(n, l1);
                i1++;
            }
            if (l2 != 0L)
            {
                n = Math.min(n, l2);
                j1++;
            }
            if (l3 != 0L)
            {
                n = Math.min(n, l3);
                i++;
            }
        } while (k1 == 0);
        if (mk.h(s.y.a) || og.e(s.y.a))
        {
            if (i < s.m && s.w == 2 && s.n == 1)
            {
                u.add(new u3(s.m - i, 8));
            }
            if (j1 < s.m)
            {
                u.add(new u3(s.m - j1, 13));
            }
            if (i1 < s.m)
            {
                u.add(new u3(s.m - i1, 5));
            }
        }
        Collections.sort(u, new a10(this));
        if (j != null)
        {
            j.notifyDataSetChanged();
        }
        a();
    }

    static void c(MessageDetailsActivity messagedetailsactivity)
    {
        messagedetailsactivity.b();
    }

    static BaseAdapter d(MessageDetailsActivity messagedetailsactivity)
    {
        return messagedetailsactivity.j;
    }

    static ListView e(MessageDetailsActivity messagedetailsactivity)
    {
        return messagedetailsactivity.m;
    }

    static void f(MessageDetailsActivity messagedetailsactivity)
    {
        messagedetailsactivity.a();
    }

    static ao9 g(MessageDetailsActivity messagedetailsactivity)
    {
        return messagedetailsactivity.l;
    }

    static c4 h(MessageDetailsActivity messagedetailsactivity)
    {
        return messagedetailsactivity.s;
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            boolean flag = true;
            int i = App.am;
            Log.i(z[0]);
            requestWindowFeature(9L);
            super.onCreate(bundle);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setContentView(0x7f030083);
            Object obj = getSupportActionBar();
            bundle = getResources().getDrawable(0x7f020072).mutate();
            ((ActionBar) (obj)).setBackgroundDrawable(bundle);
            ((ActionBar) (obj)).setDisplayShowHomeEnabled(false);
            obj = getIntent();
            if (obj == null)
            {
                finish();
                return;
            }
            s = App.ah.a(new a(((Intent) (obj)).getStringExtra(k), true, ((Intent) (obj)).getStringExtra(r)));
            if (s == null)
            {
                finish();
                return;
            }
            b();
            m = (ListView)findViewById(0x102000a);
            q = com.whatsapp.Conversation.a(this, s);
            q.setOnLongClickListener(null);
            obj = (ViewGroup)getLayoutInflater().inflate(0x7f030084, null, false);
            ViewGroup viewgroup = (ViewGroup)((ViewGroup) (obj)).findViewById(0x7f0b00cc);
            viewgroup.addView(q, -2, -2);
            viewgroup.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWindowManager().getDefaultDisplay().getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0));
            int i1 = getWindowManager().getDefaultDisplay().getHeight() / 2;
            Object obj1;
            if (viewgroup.getMeasuredHeight() <= i1)
            {
                flag = false;
            }
            if (flag)
            {
                m.getViewTreeObserver().addOnGlobalLayoutListener(new jg(this));
            }
            m.addHeaderView(((View) (obj)), null, false);
            obj1 = new ImageView(this);
            ((ImageView) (obj1)).setImageResource(0x7f020350);
            ((ImageView) (obj1)).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            m.addHeaderView(((View) (obj1)), null, false);
            obj1 = new View(this);
            ((View) (obj1)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(0x7f0a0016)));
            m.addFooterView(((View) (obj1)), null, false);
            if (mk.h(s.y.a) || og.e(s.y.a))
            {
                j = new a1n(this);
                if (i == 0)
                {
                    break label0;
                }
            }
            j = new a3p(this, null);
        }
label1:
        {
            m.setAdapter(j);
            obj1 = com.whatsapp.wallpaper.d.f(this);
            if (obj1 != null)
            {
                ((ViewGroup) (obj)).setBackgroundDrawable(new xo(this, ((Drawable) (obj1)), ((ViewGroup) (obj))));
                if (i == 0)
                {
                    break label1;
                }
            }
            ((ViewGroup) (obj)).setBackgroundResource(0x7f09001a);
        }
        m.setOnScrollListener(new gs(this, bundle, flag, viewgroup, i1));
        App.ah.a(o);
        App.b(t);
        y.a(s.y.a);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        Log.i(z[1]);
        super.onDestroy();
        l.a();
        App.au.ab().removeCallbacks(p);
        App.ah.b(o);
        com.whatsapp.App.a(t);
        y.c(s.y.a);
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
        char c1;
        c1 = '\uFFFF';
        as = new String[2];
        i = 0;
        obj = "b\016M\023\007h\016Z\005\022n\002R\023Il\031[\001\022j";
        byte1 = -1;
_L5:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L16:
        if (j1 > i1) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte1;
        JVM INSTR tableswitch 0 0: default 72
    //                   0 89;
           goto _L3 _L4
_L3:
        as1[i] = ((String) (obj));
        i = 1;
        obj = "b\016M\023\007h\016Z\005\022n\002R\023Ik\016M\024\024`\022";
        byte1 = 0;
          goto _L5
_L4:
        as1[i] = ((String) (obj));
        z = as;
        obj = "d\016G?\017k";
        byte1 = c1;
_L10:
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        i = 0;
_L23:
        if (i1 > i) goto _L7; else goto _L6
_L6:
        obj = (new String(((char []) (obj)))).intern();
        byte1;
        JVM INSTR tableswitch 0 0: default 156
    //                   0 337;
           goto _L8 _L9
_L8:
        r = ((String) (obj));
        obj = "d\016G?\024j\006Q\024\003P\001W\004";
        byte1 = 0;
          goto _L10
_L2:
        char c2 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 208
    //                   0 229
    //                   1 235
    //                   2 241
    //                   3 247;
           goto _L11 _L12 _L13 _L14 _L15
_L11:
        byte byte0 = 102;
_L17:
        obj[i1] = (char)(byte0 ^ c2);
        i1++;
          goto _L16
_L12:
        byte0 = 15;
          goto _L17
_L13:
        byte0 = 107;
          goto _L17
_L14:
        byte0 = 62;
          goto _L17
_L15:
        byte0 = 96;
          goto _L17
_L7:
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 292
    //                   0 313
    //                   1 319
    //                   2 325
    //                   3 331;
           goto _L18 _L19 _L20 _L21 _L22
_L18:
        byte0 = 102;
_L24:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L23
_L19:
        byte0 = 15;
          goto _L24
_L20:
        byte0 = 107;
          goto _L24
_L21:
        byte0 = 62;
          goto _L24
_L22:
        byte0 = 96;
          goto _L24
_L9:
        k = ((String) (obj));
        if (true) goto _L5; else goto _L25
_L25:
    }
}
