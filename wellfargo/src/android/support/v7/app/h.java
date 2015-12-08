// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.support.v7.internal.widget.bf;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            i, p, al

class h
{

    private TextView A;
    private TextView B;
    private View C;
    private ListAdapter D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private Handler M;
    private final android.view.View.OnClickListener N = new i(this);
    private final Context a;
    private final al b;
    private final Window c;
    private CharSequence d;
    private CharSequence e;
    private ListView f;
    private View g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private Button n;
    private CharSequence o;
    private Message p;
    private Button q;
    private CharSequence r;
    private Message s;
    private Button t;
    private CharSequence u;
    private Message v;
    private ScrollView w;
    private int x;
    private Drawable y;
    private ImageView z;

    public h(Context context, al al1, Window window)
    {
        m = false;
        x = 0;
        E = -1;
        L = 0;
        a = context;
        b = al1;
        c = window;
        M = new p(al1);
        context = context.obtainStyledAttributes(null, l.AlertDialog, b.alertDialogStyle, 0);
        F = context.getResourceId(l.AlertDialog_android_layout, 0);
        G = context.getResourceId(l.AlertDialog_buttonPanelSideLayout, 0);
        H = context.getResourceId(l.AlertDialog_listLayout, 0);
        I = context.getResourceId(l.AlertDialog_multiChoiceItemLayout, 0);
        J = context.getResourceId(l.AlertDialog_singleChoiceItemLayout, 0);
        K = context.getResourceId(l.AlertDialog_listItemLayout, 0);
        context.recycle();
    }

    static int a(h h1, int i1)
    {
        h1.E = i1;
        return i1;
    }

    static Button a(h h1)
    {
        return h1.n;
    }

    static ListAdapter a(h h1, ListAdapter listadapter)
    {
        h1.D = listadapter;
        return listadapter;
    }

    static ListView a(h h1, ListView listview)
    {
        h1.f = listview;
        return listview;
    }

    private void a(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
    }

    private static boolean a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(b.alertDialogCenterButtons, typedvalue, true);
        return typedvalue.data != 0;
    }

    static boolean a(View view)
    {
        if (view.onCheckIsTextEditor())
        {
            return true;
        }
        if (!(view instanceof ViewGroup))
        {
            return false;
        }
        view = (ViewGroup)view;
        for (int i1 = view.getChildCount(); i1 > 0;)
        {
            int j1 = i1 - 1;
            i1 = j1;
            if (a(view.getChildAt(j1)))
            {
                return true;
            }
        }

        return false;
    }

    private boolean a(ViewGroup viewgroup)
    {
        if (C != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
            viewgroup.addView(C, 0, layoutparams);
            c.findViewById(g.title_template).setVisibility(8);
            return true;
        }
        z = (ImageView)c.findViewById(0x1020006);
        boolean flag;
        if (!TextUtils.isEmpty(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            A = (TextView)c.findViewById(g.alertTitle);
            A.setText(d);
            if (x != 0)
            {
                z.setImageResource(x);
                return true;
            }
            if (y != null)
            {
                z.setImageDrawable(y);
                return true;
            } else
            {
                A.setPadding(z.getPaddingLeft(), z.getPaddingTop(), z.getPaddingRight(), z.getPaddingBottom());
                z.setVisibility(8);
                return true;
            }
        } else
        {
            c.findViewById(g.title_template).setVisibility(8);
            z.setVisibility(8);
            viewgroup.setVisibility(8);
            return false;
        }
    }

    private int b()
    {
        if (G == 0)
        {
            return F;
        }
        if (L == 1)
        {
            return G;
        } else
        {
            return F;
        }
    }

    static Message b(h h1)
    {
        return h1.p;
    }

    private void b(ViewGroup viewgroup)
    {
        w = (ScrollView)c.findViewById(g.scrollView);
        w.setFocusable(false);
        B = (TextView)c.findViewById(0x102000b);
        if (B == null)
        {
            return;
        }
        if (e != null)
        {
            B.setText(e);
            return;
        }
        B.setVisibility(8);
        w.removeView(B);
        if (f != null)
        {
            viewgroup = (ViewGroup)w.getParent();
            int i1 = viewgroup.indexOfChild(w);
            viewgroup.removeViewAt(i1);
            viewgroup.addView(f, i1, new android.view.ViewGroup.LayoutParams(-1, -1));
            return;
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    static Button c(h h1)
    {
        return h1.q;
    }

    private void c()
    {
        boolean flag = false;
        b((ViewGroup)c.findViewById(g.contentPanel));
        boolean flag1 = d();
        Object obj = (ViewGroup)c.findViewById(g.topPanel);
        bf bf1 = bf.a(a, null, l.AlertDialog, b.alertDialogStyle, 0);
        a(((ViewGroup) (obj)));
        obj = c.findViewById(g.buttonPanel);
        if (!flag1)
        {
            ((View) (obj)).setVisibility(8);
            obj = c.findViewById(g.textSpacerNoButtons);
            if (obj != null)
            {
                ((View) (obj)).setVisibility(0);
            }
        }
        FrameLayout framelayout = (FrameLayout)c.findViewById(g.customPanel);
        if (g != null)
        {
            obj = g;
        } else
        if (h != 0)
        {
            obj = LayoutInflater.from(a).inflate(h, framelayout, false);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            flag = true;
        }
        if (!flag || !a(((View) (obj))))
        {
            c.setFlags(0x20000, 0x20000);
        }
        if (flag)
        {
            FrameLayout framelayout1 = (FrameLayout)c.findViewById(g.custom);
            framelayout1.addView(((View) (obj)), new android.view.ViewGroup.LayoutParams(-1, -1));
            if (m)
            {
                framelayout1.setPadding(i, j, k, l);
            }
            if (f != null)
            {
                ((android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams()).weight = 0.0F;
            }
        } else
        {
            framelayout.setVisibility(8);
        }
        obj = f;
        if (obj != null && D != null)
        {
            ((ListView) (obj)).setAdapter(D);
            int i1 = E;
            if (i1 > -1)
            {
                ((ListView) (obj)).setItemChecked(i1, true);
                ((ListView) (obj)).setSelection(i1);
            }
        }
        bf1.b();
    }

    static Message d(h h1)
    {
        return h1.s;
    }

    private boolean d()
    {
        n = (Button)c.findViewById(0x1020019);
        n.setOnClickListener(N);
        int i1;
        if (TextUtils.isEmpty(o))
        {
            n.setVisibility(8);
            i1 = 0;
        } else
        {
            n.setText(o);
            n.setVisibility(0);
            i1 = 1;
        }
        q = (Button)c.findViewById(0x102001a);
        q.setOnClickListener(N);
        if (TextUtils.isEmpty(r))
        {
            q.setVisibility(8);
        } else
        {
            q.setText(r);
            q.setVisibility(0);
            i1 |= 2;
        }
        t = (Button)c.findViewById(0x102001b);
        t.setOnClickListener(N);
        if (TextUtils.isEmpty(u))
        {
            t.setVisibility(8);
        } else
        {
            t.setText(u);
            t.setVisibility(0);
            i1 |= 4;
        }
        if (a(a))
        {
            if (i1 == 1)
            {
                a(n);
            } else
            if (i1 == 2)
            {
                a(q);
            } else
            if (i1 == 4)
            {
                a(t);
            }
        }
        return i1 != 0;
    }

    static Button e(h h1)
    {
        return h1.t;
    }

    static Message f(h h1)
    {
        return h1.v;
    }

    static al g(h h1)
    {
        return h1.b;
    }

    static Handler h(h h1)
    {
        return h1.M;
    }

    static int i(h h1)
    {
        return h1.H;
    }

    static int j(h h1)
    {
        return h1.I;
    }

    static int k(h h1)
    {
        return h1.J;
    }

    static int l(h h1)
    {
        return h1.K;
    }

    public void a()
    {
        b.a(1);
        int i1 = b();
        b.setContentView(i1);
        c();
    }

    public void a(int i1)
    {
        g = null;
        h = i1;
        m = false;
    }

    public void a(int i1, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
    {
        Message message1 = message;
        if (message == null)
        {
            message1 = message;
            if (onclicklistener != null)
            {
                message1 = M.obtainMessage(i1, onclicklistener);
            }
        }
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("Button does not exist");

        case -1: 
            o = charsequence;
            p = message1;
            return;

        case -2: 
            r = charsequence;
            s = message1;
            return;

        case -3: 
            u = charsequence;
            v = message1;
            return;
        }
    }

    public void a(Drawable drawable)
    {
label0:
        {
            y = drawable;
            x = 0;
            if (z != null)
            {
                if (drawable == null)
                {
                    break label0;
                }
                z.setImageDrawable(drawable);
            }
            return;
        }
        z.setVisibility(8);
    }

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        g = view;
        h = 0;
        m = true;
        i = i1;
        j = j1;
        k = k1;
        l = l1;
    }

    public void a(CharSequence charsequence)
    {
        d = charsequence;
        if (A != null)
        {
            A.setText(charsequence);
        }
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        return w != null && w.executeKeyEvent(keyevent);
    }

    public void b(int i1)
    {
label0:
        {
            y = null;
            x = i1;
            if (z != null)
            {
                if (i1 == 0)
                {
                    break label0;
                }
                z.setImageResource(x);
            }
            return;
        }
        z.setVisibility(8);
    }

    public void b(View view)
    {
        C = view;
    }

    public void b(CharSequence charsequence)
    {
        e = charsequence;
        if (B != null)
        {
            B.setText(charsequence);
        }
    }

    public boolean b(int i1, KeyEvent keyevent)
    {
        return w != null && w.executeKeyEvent(keyevent);
    }

    public int c(int i1)
    {
        TypedValue typedvalue = new TypedValue();
        a.getTheme().resolveAttribute(i1, typedvalue, true);
        return typedvalue.resourceId;
    }

    public void c(View view)
    {
        g = view;
        h = 0;
        m = false;
    }
}
