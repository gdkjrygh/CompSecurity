// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.support.v4.view.ae;
import android.support.v4.view.n;
import android.util.Log;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.view.menu:
//            o, t, ag, aj

public final class s
    implements b
{

    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k;
    private o l;
    private aj m;
    private Runnable n;
    private android.view.MenuItem.OnMenuItemClickListener o;
    private int p;
    private int q;
    private View r;
    private n s;
    private ae t;
    private boolean u;
    private android.view.ContextMenu.ContextMenuInfo v;

    s(o o1, int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        k = 0;
        p = 16;
        q = 0;
        u = false;
        l = o1;
        a = j1;
        b = i1;
        c = k1;
        d = l1;
        e = charsequence;
        q = i2;
    }

    private b a(View view)
    {
        r = view;
        s = null;
        if (view != null && view.getId() == -1 && a > 0)
        {
            view.setId(a);
        }
        l.i();
        return this;
    }

    public final b a(n n1)
    {
        if (s != n1)
        {
            r = null;
            if (s != null)
            {
                s.a(null);
            }
            s = n1;
            l.b(true);
            if (n1 != null)
            {
                n1.a(new t(this));
                return this;
            }
        }
        return this;
    }

    final CharSequence a(ag ag1)
    {
        if (ag1 != null && ag1.b())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    final void a(aj aj1)
    {
        m = aj1;
        aj1.setHeaderTitle(getTitle());
    }

    final void a(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        v = contextmenuinfo;
    }

    public final void a(boolean flag)
    {
        int i1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | i1 & -5;
    }

    public final boolean a()
    {
        while (o != null && o.onMenuItemClick(this) || l.a(l.q(), this)) 
        {
            return true;
        }
        if (n != null)
        {
            n.run();
            return true;
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        l.d().startActivity(g);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        n n1;
        if (s != null)
        {
            n1 = s;
        }
        return false;
    }

    public final int b()
    {
        return d;
    }

    final void b(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | j1 & -3;
        if (i1 != p)
        {
            l.b(false);
        }
    }

    final char c()
    {
        return i;
    }

    final boolean c(boolean flag)
    {
        boolean flag1 = false;
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        p = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != p)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean collapseActionView()
    {
        if ((q & 8) != 0)
        {
            if (r == null)
            {
                return true;
            }
            if (t == null || t.b())
            {
                return l.b(this);
            }
        }
        return false;
    }

    final String d()
    {
        char c1;
        StringBuilder stringbuilder;
        c1 = i;
        if (c1 == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder(w);
        c1;
        JVM INSTR lookupswitch 3: default 60
    //                   8: 82
    //                   10: 71
    //                   32: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append(c1);
_L6:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(x);
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append(y);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(z);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            p = p | 0x20;
            return;
        } else
        {
            p = p & 0xffffffdf;
            return;
        }
    }

    public final void e(boolean flag)
    {
        u = flag;
        l.b(false);
    }

    final boolean e()
    {
        return l.b() && i != 0;
    }

    public final boolean expandActionView()
    {
        while ((q & 8) == 0 || r == null || t != null && !t.a()) 
        {
            return false;
        }
        return l.a(this);
    }

    public final boolean f()
    {
        return (p & 4) != 0;
    }

    public final void g()
    {
        l.i();
    }

    public final ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("Implementation should use getSupportActionProvider!");
    }

    public final View getActionView()
    {
        if (r != null)
        {
            return r;
        }
        if (s != null)
        {
            r = s.b();
            return r;
        } else
        {
            return null;
        }
    }

    public final char getAlphabeticShortcut()
    {
        return i;
    }

    public final int getGroupId()
    {
        return b;
    }

    public final Drawable getIcon()
    {
        if (j != null)
        {
            return j;
        }
        if (k != 0)
        {
            Drawable drawable = l.c().getDrawable(k);
            k = 0;
            j = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return g;
    }

    public final int getItemId()
    {
        return a;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return v;
    }

    public final char getNumericShortcut()
    {
        return h;
    }

    public final int getOrder()
    {
        return c;
    }

    public final SubMenu getSubMenu()
    {
        return m;
    }

    public final CharSequence getTitle()
    {
        return e;
    }

    public final CharSequence getTitleCondensed()
    {
        if (f != null)
        {
            return f;
        } else
        {
            return e;
        }
    }

    public final boolean h()
    {
        return l.r();
    }

    public final boolean hasSubMenu()
    {
        return m != null;
    }

    public final boolean i()
    {
        return (p & 0x20) == 32;
    }

    public final boolean isActionViewExpanded()
    {
        return u;
    }

    public final boolean isCheckable()
    {
        return (p & 1) == 1;
    }

    public final boolean isChecked()
    {
        return (p & 2) == 2;
    }

    public final boolean isEnabled()
    {
        return (p & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        n n1;
        if (s != null)
        {
            n1 = s;
        }
        return (p & 8) == 0;
    }

    public final boolean j()
    {
        return (q & 1) == 1;
    }

    public final boolean k()
    {
        return (q & 2) == 2;
    }

    public final boolean l()
    {
        return (q & 4) == 4;
    }

    public final n m()
    {
        return s;
    }

    public final boolean n()
    {
        return (q & 8) != 0 && r != null;
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException("Implementation should use setSupportActionProvider!");
    }

    public final MenuItem setActionView(int i1)
    {
        Context context = l.d();
        a(LayoutInflater.from(context).inflate(i1, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setActionView(View view)
    {
        return a(view);
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        if (i == c1)
        {
            return this;
        } else
        {
            i = Character.toLowerCase(c1);
            l.b(false);
            return this;
        }
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p = flag1 | j1 & -2;
        if (i1 != p)
        {
            l.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        if ((p & 4) != 0)
        {
            l.a(this);
            return this;
        } else
        {
            b(flag);
            return this;
        }
    }

    public final MenuItem setEnabled(boolean flag)
    {
        if (flag)
        {
            p = p | 0x10;
        } else
        {
            p = p & 0xffffffef;
        }
        l.b(false);
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        j = null;
        k = i1;
        l.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        k = 0;
        j = drawable;
        l.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        if (h == c1)
        {
            return this;
        } else
        {
            h = c1;
            l.b(false);
            return this;
        }
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException("Implementation should use setSupportOnActionExpandListener!");
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        o = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        h = c1;
        i = Character.toLowerCase(c2);
        l.b(false);
        return this;
    }

    public final void setShowAsAction(int i1)
    {
        switch (i1 & 3)
        {
        default:
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            q = i1;
            break;
        }
        l.i();
    }

    public final MenuItem setShowAsActionFlags(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public final MenuItem setTitle(int i1)
    {
        return setTitle(((CharSequence) (l.d().getString(i1))));
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        e = charsequence;
        l.b(false);
        if (m != null)
        {
            m.setHeaderTitle(charsequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        f = charsequence;
        if (charsequence == null)
        {
            charsequence = e;
        }
        l.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        if (c(flag))
        {
            l.h();
        }
        return this;
    }

    public final String toString()
    {
        return e.toString();
    }
}
