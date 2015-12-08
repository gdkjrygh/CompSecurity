// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.c;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;
import com.jiubang.commerce.utils.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            c, b, f

public class a
{

    private static final String b;
    private static a c;
    public boolean a;
    private Context d;
    private View e;
    private LinearLayout f;
    private GridView g;
    private com.jiubang.commerce.ad.j.a.a h;
    private TextView i;
    private ProgressBar j;
    private View k;
    private View l;
    private View m;
    private android.view.WindowManager.LayoutParams n;
    private WindowManager o;
    private List p;
    private String q;
    private volatile boolean r;
    private Map s;
    private Handler t;
    private af u;

    private a(Context context)
    {
        u = new com.jiubang.commerce.ad.j.c(this);
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        d = context;
        t = new Handler();
    }

    static View a(a a1, View view)
    {
        a1.k = view;
        return view;
    }

    static GridView a(a a1, GridView gridview)
    {
        a1.g = gridview;
        return gridview;
    }

    static LinearLayout a(a a1, LinearLayout linearlayout)
    {
        a1.f = linearlayout;
        return linearlayout;
    }

    static ProgressBar a(a a1, ProgressBar progressbar)
    {
        a1.j = progressbar;
        return progressbar;
    }

    static TextView a(a a1, TextView textview)
    {
        a1.i = textview;
        return textview;
    }

    static com.jiubang.commerce.ad.j.a.a a(a a1, com.jiubang.commerce.ad.j.a.a a2)
    {
        a1.h = a2;
        return a2;
    }

    public static a a(Context context)
    {
        com/jiubang/commerce/ad/j/a;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new a(context);
        }
        context = c;
        com/jiubang/commerce/ad/j/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static Map a(a a1, Map map)
    {
        a1.s = map;
        return map;
    }

    private void a(b b1)
    {
        if (b1 != null)
        {
            b1 = b1.c();
        } else
        {
            b1 = null;
        }
        if (b1 == null || b1.isEmpty())
        {
            return;
        }
        if (p == null)
        {
            p = new ArrayList();
        } else
        {
            p.clear();
        }
        p.addAll(b1);
        h.a(p);
    }

    static void a(a a1, b b1)
    {
        a1.a(b1);
    }

    static void a(a a1, boolean flag)
    {
        a1.a(flag);
    }

    private void a(String s1)
    {
        if (i != null && !TextUtils.isEmpty(s1))
        {
            if (!TextUtils.isEmpty(s1 = com.jiubang.commerce.utils.b.d(d, s1)))
            {
                i.setText(Html.fromHtml((new StringBuilder()).append("<B>").append(s1).append("</B>").append(com.jiubang.commerce.ad.f.a(d).e("ad_activation_guide_dialog_installed")).toString()));
                return;
            }
        }
    }

    private void a(boolean flag)
    {
        r = flag;
        if (j == null || k == null || t == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        t.post(new com.jiubang.commerce.ad.j.b(this));
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    static boolean a(a a1)
    {
        return a1.r;
    }

    static View b(a a1, View view)
    {
        a1.l = view;
        return view;
    }

    private WindowManager b(Context context)
    {
        if (o == null)
        {
            o = (WindowManager)context.getSystemService("window");
        }
        return o;
    }

    static ProgressBar b(a a1)
    {
        return a1.j;
    }

    static View c(a a1)
    {
        return a1.k;
    }

    static View c(a a1, View view)
    {
        a1.m = view;
        return view;
    }

    private void c()
    {
        e = new com.jiubang.commerce.ad.j.f(this, d);
    }

    static Context d(a a1)
    {
        return a1.d;
    }

    static GridView e(a a1)
    {
        return a1.g;
    }

    static List f(a a1)
    {
        return a1.p;
    }

    static com.jiubang.commerce.ad.j.a.a g(a a1)
    {
        return a1.h;
    }

    static View h(a a1)
    {
        return a1.l;
    }

    static View i(a a1)
    {
        return a1.m;
    }

    static String j(a a1)
    {
        return a1.q;
    }

    static Map k(a a1)
    {
        return a1.s;
    }

    public void a()
    {
        b(d, q);
    }

    public void a(Context context, String s1)
    {
        if (context != null && !TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if (!TextUtils.isEmpty(((CharSequence) (obj = com.jiubang.commerce.utils.f.b(b)))) && System.currentTimeMillis() - com.jiubang.commerce.utils.p.a(obj, Long.valueOf(0L)).longValue() < 0x493e0L) goto _L1; else goto _L3
_L3:
        q = s1;
        obj = b(context);
        if (e == null)
        {
            c();
            if (n == null)
            {
                n = new android.view.WindowManager.LayoutParams();
                n.type = 2003;
                n.format = 1;
                n.gravity = 83;
                n.height = -2;
            }
        }
        a(s1);
        a(false);
        Object obj1;
        String s2;
        try
        {
            ((WindowManager) (obj)).addView(e, n);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                com.jiubang.commerce.utils.j.d("Ad_SDK", (new StringBuilder()).append("show ActivationGuide Window error::->").append(((Exception) (obj1)).getMessage()).toString());
                ((WindowManager) (obj)).removeView(e);
                ((WindowManager) (obj)).addView(e, n);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return;
            }
        }
        a = true;
        if (b(context, s1)) goto _L5; else goto _L4
_L4:
        if (f != null)
        {
            f.setVisibility(8);
        }
_L11:
        com.jiubang.commerce.utils.f.a(String.valueOf(System.currentTimeMillis()), b);
        s = com.jiubang.commerce.b.b.a(context, s1);
        if (s == null) goto _L7; else goto _L6
_L6:
        obj = (String)s.get(Integer.valueOf(1));
_L13:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj1 = (String)s.get(Integer.valueOf(6));
_L14:
        if (s == null) goto _L9; else goto _L8
_L8:
        s2 = (String)s.get(Integer.valueOf(8));
_L12:
        com.jiubang.commerce.b.b.a(context, "av_f000", ((String) (obj)), ((String) (obj1)), s2, s1);
        return;
_L5:
        if (f == null || f.getVisibility() == 0) goto _L11; else goto _L10
_L10:
        f.setVisibility(0);
          goto _L11
_L9:
        s2 = "";
          goto _L12
_L7:
        obj = "";
          goto _L13
        obj1 = "";
          goto _L14
    }

    public void b()
    {
        a = false;
        if (e != null)
        {
            b(d).removeView(e);
            e = null;
            n = null;
        }
        com.jiubang.commerce.utils.f.c(b);
    }

    public boolean b(Context context, String s1)
    {
        if (!com.jiubang.commerce.utils.k.a(context))
        {
            return false;
        } else
        {
            a(true);
            com.jiubang.commerce.ad.a.a((new com.jiubang.commerce.ad.h.c(context, 146, "sdk_inner_call", u)).a());
            return true;
        }
    }

    static 
    {
        b = (new StringBuilder()).append(c.a).append("show_activation_time".hashCode()).toString();
    }
}
