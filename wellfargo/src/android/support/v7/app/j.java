// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

// Referenced classes of package android.support.v7.app:
//            h, k, o, m, 
//            l, q, n

public class j
{

    public int A;
    public boolean B;
    public boolean C[];
    public boolean D;
    public boolean E;
    public int F;
    public android.content.DialogInterface.OnMultiChoiceClickListener G;
    public Cursor H;
    public String I;
    public String J;
    public android.widget.AdapterView.OnItemSelectedListener K;
    public o L;
    public boolean M;
    public final Context a;
    public final LayoutInflater b;
    public int c;
    public Drawable d;
    public int e;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public android.content.DialogInterface.OnClickListener j;
    public CharSequence k;
    public android.content.DialogInterface.OnClickListener l;
    public CharSequence m;
    public android.content.DialogInterface.OnClickListener n;
    public boolean o;
    public android.content.DialogInterface.OnCancelListener p;
    public android.content.DialogInterface.OnDismissListener q;
    public android.content.DialogInterface.OnKeyListener r;
    public CharSequence s[];
    public ListAdapter t;
    public android.content.DialogInterface.OnClickListener u;
    public int v;
    public View w;
    public int x;
    public int y;
    public int z;

    public j(Context context)
    {
        c = 0;
        e = 0;
        B = false;
        F = -1;
        M = true;
        a = context;
        o = true;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    private void b(h h1)
    {
        ListView listview = (ListView)b.inflate(android.support.v7.app.h.i(h1), null);
        Object obj;
        if (D)
        {
            if (H == null)
            {
                obj = new k(this, a, android.support.v7.app.h.j(h1), 0x1020014, s, listview);
            } else
            {
                obj = new l(this, a, H, false, listview, h1);
            }
        } else
        {
            int i1;
            if (E)
            {
                i1 = android.support.v7.app.h.k(h1);
            } else
            {
                i1 = android.support.v7.app.h.l(h1);
            }
            if (H == null)
            {
                if (t != null)
                {
                    obj = t;
                } else
                {
                    obj = new q(a, i1, 0x1020014, s);
                }
            } else
            {
                obj = new SimpleCursorAdapter(a, i1, H, new String[] {
                    I
                }, new int[] {
                    0x1020014
                });
            }
        }
        if (L != null)
        {
            L.a(listview);
        }
        android.support.v7.app.h.a(h1, ((ListAdapter) (obj)));
        android.support.v7.app.h.a(h1, F);
        if (u != null)
        {
            listview.setOnItemClickListener(new m(this, h1));
        } else
        if (G != null)
        {
            listview.setOnItemClickListener(new n(this, listview, h1));
        }
        if (K != null)
        {
            listview.setOnItemSelectedListener(K);
        }
        if (E)
        {
            listview.setChoiceMode(1);
        } else
        if (D)
        {
            listview.setChoiceMode(2);
        }
        android.support.v7.app.h.a(h1, listview);
    }

    public void a(h h1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        h1.b(g);
_L10:
        if (h != null)
        {
            h1.b(h);
        }
        if (i != null)
        {
            h1.a(-1, i, j, null);
        }
        if (k != null)
        {
            h1.a(-2, k, l, null);
        }
        if (m != null)
        {
            h1.a(-3, m, n, null);
        }
        if (s != null || H != null || t != null)
        {
            b(h1);
        }
        if (w == null) goto _L4; else goto _L3
_L3:
        if (!B) goto _L6; else goto _L5
_L5:
        h1.a(w, x, y, z, A);
_L8:
        return;
_L2:
        if (f != null)
        {
            h1.a(f);
        }
        if (d != null)
        {
            h1.a(d);
        }
        if (c != 0)
        {
            h1.b(c);
        }
        if (e != 0)
        {
            h1.b(h1.c(e));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        h1.c(w);
        return;
_L4:
        if (v == 0) goto _L8; else goto _L7
_L7:
        h1.a(v);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
