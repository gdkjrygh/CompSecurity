// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.globalview.f;
import com.gau.go.launcherex.gowidget.weather.model.ThemeDataBean;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.gtp.go.weather.sharephoto.b.a;
import com.gtp.go.weather.sharephoto.b.b;
import com.gtp.go.weather.sharephoto.b.d;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            f, g, i, d, 
//            h, e, k, o

public class c extends f
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.view.ViewTreeObserver.OnPreDrawListener
{

    private TextView b;
    private TextView c;
    private TextView d;
    private ListView e;
    private ProgressBar f;
    private ad g;
    private final ArrayList h = new ArrayList();
    private i i;
    private h j;
    private d k;
    private k l;
    private final HashMap m = new HashMap();
    private final List n = new ArrayList();
    private int o;
    private HashMap p;
    private final o q = new com.gtp.go.weather.sharephoto.award.f(this);
    private final o r = new g(this);

    public c(Activity activity)
    {
        super(activity);
        p = new HashMap();
        setCanceledOnTouchOutside(false);
        setContentView(0x7f0300fa);
        b = (TextView)findViewById(0x7f090061);
        d = (TextView)findViewById(0x7f0904e6);
        f = (ProgressBar)findViewById(0x7f090423);
        c = (TextView)findViewById(0x7f0904e7);
        c.setText(b(0x7f0804b0));
        c.setOnClickListener(this);
        c.setEnabled(false);
        e = (ListView)findViewById(0x7f090271);
        i = new i(this, null);
        e.setAdapter(i);
        activity = a.getResources().getDisplayMetrics();
        o = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        setOnDismissListener(this);
        a(0x7f0804af);
    }

    static Bitmap a(c c1, String s)
    {
        return c1.a(s);
    }

    private Bitmap a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = (SoftReference)m.get(s);
        Object obj1;
        OutOfMemoryError outofmemoryerror;
        if (obj != null)
        {
            obj = (Bitmap)((SoftReference) (obj)).get();
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((Bitmap) (obj));
_L2:
        try
        {
            obj1 = BitmapFactory.decodeFile(s);
        }
        // Misplaced declaration of an exception variable
        catch (OutOfMemoryError outofmemoryerror)
        {
            obj1 = obj;
            if (com.gtp.a.a.b.c.a())
            {
                outofmemoryerror.printStackTrace();
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 != null)
        {
            obj = new SoftReference(obj1);
            m.put(s, obj);
            return ((Bitmap) (obj1));
        }
        if (true) goto _L1; else goto _L3
_L3:
        return null;
    }

    static h a(c c1, h h1)
    {
        c1.j = h1;
        return h1;
    }

    static String a(c c1, int i1)
    {
        return c1.b(i1);
    }

    static ArrayList a(c c1)
    {
        return c1.h;
    }

    private void a()
    {
label0:
        {
            if (!a.isFinishing())
            {
                if (g == null)
                {
                    break label0;
                }
                if (!g.isShowing())
                {
                    g.show();
                }
            }
            return;
        }
        g = ad.a(a);
        g.setCanceledOnTouchOutside(false);
        g.setOnKeyListener(new com.gtp.go.weather.sharephoto.award.d(this));
        g.a(b(0x7f0804b3));
        g.show();
    }

    private void a(long l1)
    {
        a a1;
        ThemeDataBean themedatabean;
        while (j.b.a() != l1 || j.b.c() != 1) 
        {
            return;
        }
        a1 = j.b.d();
        themedatabean = new ThemeDataBean();
        themedatabean.a(a1.d());
        themedatabean.e(a1.c());
        themedatabean.a((int)j.b.a());
        a1.f();
        JVM INSTR tableswitch 1 3: default 116
    //                   1 126
    //                   2 138
    //                   3 150;
           goto _L1 _L2 _L3 _L4
_L1:
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, themedatabean);
        return;
_L2:
        themedatabean.j(a1.e());
        continue; /* Loop/switch isn't completed */
_L3:
        themedatabean.k(a1.e());
        continue; /* Loop/switch isn't completed */
_L4:
        themedatabean.n(a1.e());
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void a(c c1, long l1)
    {
        c1.a(l1);
    }

    static void a(c c1, b b1)
    {
        c1.a(b1);
    }

    static void a(c c1, List list)
    {
        c1.a(list);
    }

    static void a(c c1, boolean flag)
    {
        c1.a(flag);
    }

    private void a(b b1)
    {
        a a1;
label0:
        {
            if (b1.c() == 1)
            {
                a1 = b1.d();
                if (!TextUtils.isEmpty(a1.a()))
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = n.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).equals(a1.a()))
            {
                return;
            }
        }

        n.add(a1.a());
        com.gtp.a.a.b.c.a("AwardListDialog", (new StringBuilder()).append("re download ApkImage...").append(b1.a()).toString());
        (new e(this, b1)).execute(new b[] {
            b1
        });
    }

    private void a(List list)
    {
        c.setEnabled(false);
        c.setBackgroundResource(0x7f020644);
        h.clear();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            if (b1.c() == 1 && b1.d() != null && !TextUtils.isEmpty(b1.d().b()))
            {
                h h1 = new h(this, null);
                h1.a = false;
                h1.b = b1;
                h.add(h1);
            }
        } while (true);
        i.notifyDataSetChanged();
        if (h.size() == 0)
        {
            dismiss();
        }
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            f.setVisibility(0);
            e.setVisibility(8);
            return;
        } else
        {
            f.setVisibility(8);
            e.setVisibility(0);
            return;
        }
    }

    static Activity b(c c1)
    {
        return c1.a;
    }

    private String b(int i1)
    {
        return a.getString(i1);
    }

    private void b()
    {
        if (!a.isFinishing() && g != null && g.isShowing())
        {
            g.dismiss();
            g = null;
        }
    }

    static TextView c(c c1)
    {
        return c1.c;
    }

    private void c()
    {
        if (isShowing())
        {
            return;
        } else
        {
            e.getViewTreeObserver().addOnPreDrawListener(this);
            a(17, 0, 0, o, -2);
            return;
        }
    }

    static i d(c c1)
    {
        return c1.i;
    }

    private void d()
    {
        e.getViewTreeObserver().removeOnPreDrawListener(this);
        if (l != null)
        {
            l.b(q);
            l.b(r);
            l.a();
            l = null;
        }
    }

    static d e(c c1)
    {
        return c1.k;
    }

    private void e()
    {
        a();
        b b1 = j.b;
        com.gtp.go.weather.sharephoto.award.k.a(a, b1.b(), b1.a());
    }

    static Activity f(c c1)
    {
        return c1.a;
    }

    static List g(c c1)
    {
        return c1.n;
    }

    static HashMap h(c c1)
    {
        return c1.p;
    }

    static void i(c c1)
    {
        c1.c();
    }

    static h j(c c1)
    {
        return c1.j;
    }

    static void k(c c1)
    {
        c1.b();
    }

    static Activity l(c c1)
    {
        return c1.a;
    }

    static Activity m(c c1)
    {
        return c1.a;
    }

    public void a(int i1)
    {
        a(((CharSequence) (b(i1))));
    }

    public void a(d d1)
    {
        k = d1;
        if (k == null)
        {
            return;
        }
        l = new k(getContext());
        l.a(q);
        l.a(r);
        d1 = (List)p.get(Long.valueOf(k.a()));
        if (d1 == null)
        {
            a(true);
            l.a(true, k);
        } else
        {
            a(((List) (d1)));
        }
        d.setText(k.c());
        c();
    }

    public void a(d d1, List list)
    {
        k = d1;
        if (k == null || list == null)
        {
            return;
        } else
        {
            a(false);
            a(list);
            d.setText(k.c());
            l = new k(getContext());
            l.a(r);
            c();
            return;
        }
    }

    public void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            e();
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        d();
    }

    public boolean onPreDraw()
    {
        int i1 = a.getResources().getDisplayMetrics().heightPixels / 2;
        if (e.getHeight() > i1)
        {
            e.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i1));
            return false;
        } else
        {
            return true;
        }
    }
}
