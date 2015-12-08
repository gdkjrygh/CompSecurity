// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.app.SearchManager;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.SearchView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.youtube.j;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            ActionBarMenuHelper, b, c, f

class a extends ActionBarMenuHelper
    implements android.view.View.OnFocusChangeListener
{

    protected q a;
    protected SearchView b;
    protected ActionBarMenuHelper.SearchMode c;
    protected boolean d;
    protected final List e = new LinkedList();

    protected a(YouTubeActivity youtubeactivity, am am1, String s, o o)
    {
        super(youtubeactivity, am1, s, o);
        c = ActionBarMenuHelper.SearchMode.ICONIFIED;
    }

    static boolean a(a a1, String s)
    {
        a1.f.N().c(s);
        return true;
    }

    public final int a()
    {
        TypedArray typedarray = f.getTheme().obtainStyledAttributes(new int[] {
            0x10102eb
        });
        int i = (int)typedarray.getDimension(0, 0.0F);
        typedarray.recycle();
        return i;
    }

    public final void a(ActionBarMenuHelper.SearchMode searchmode)
    {
        if (c != searchmode)
        {
            c = searchmode;
            f.invalidateOptionsMenu();
        }
    }

    public final void a(f f)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f);
        e.add(f);
    }

    public final void a(String s, boolean flag)
    {
        if (b != null)
        {
            b.setQuery(s, false);
        }
    }

    public void a(boolean flag)
    {
        if (a != null && b != null)
        {
            g.a("Search", f.getClass().getSimpleName());
            SearchView searchview = b;
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            searchview.setSubmitButtonEnabled(flag1);
            b.setIconified(false);
            if (!flag)
            {
                b.clearFocus();
                return;
            }
        }
    }

    public boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.a(j1);
        if (c == ActionBarMenuHelper.SearchMode.DISABLED)
        {
            j1.f(j.cy);
            return true;
        }
        a = j1.c(j.cy);
        b = (SearchView)a.d();
        j1 = (SearchManager)f.getSystemService("search");
        b.setSearchableInfo(j1.getSearchableInfo(f.getComponentName()));
        b.setQueryRefinementEnabled(true);
        b.setOnQueryTextListener(new b(this));
        b.setOnSuggestionListener(new com.google.android.apps.youtube.app.honeycomb.ui.c(this));
        if (c == ActionBarMenuHelper.SearchMode.CUSTOM)
        {
            a.c();
            b.clearFocus();
            b.setFocusable(false);
            return true;
        }
        j1 = b;
        byte byte0;
        boolean flag;
        if (c == ActionBarMenuHelper.SearchMode.ICONIFIED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1.setIconifiedByDefault(flag);
        j1 = a;
        if (c == ActionBarMenuHelper.SearchMode.ICONIFIED)
        {
            byte0 = 10;
        } else
        {
            byte0 = 2;
        }
        j1.b(byte0);
        d = b.hasFocus();
        b.setOnQueryTextFocusChangeListener(this);
        return true;
    }

    public final void b()
    {
        if (b != null)
        {
            b.setQuery("", false);
            b.clearFocus();
        }
    }

    public final void b(f f)
    {
        e.remove(f);
    }

    public final boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b != null)
        {
            flag = flag1;
            if (!b.isIconified())
            {
                flag = true;
            }
        }
        return flag;
    }

    public void d()
    {
        if (a == null || b == null)
        {
            return;
        } else
        {
            b.setIconified(true);
            return;
        }
    }

    public final void e()
    {
        if (c == ActionBarMenuHelper.SearchMode.ICONIFIED && !d && b != null && TextUtils.isEmpty(b.getQuery()))
        {
            d();
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (c != ActionBarMenuHelper.SearchMode.DISABLED && view == b && flag)
        {
            CharSequence charsequence = b.getQuery();
            if (charsequence != null && charsequence.toString().trim().isEmpty())
            {
                a(charsequence.toString(), false);
            }
        }
        if (view == b)
        {
            d = flag;
        }
    }
}
