// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.a;
import android.support.v4.app.ac;
import android.support.v4.app.au;
import android.support.v4.app.av;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            a, d, j, h, 
//            g, e, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements av, android.support.v7.app.a
{

    d n;

    public ActionBarActivity()
    {
    }

    private boolean d()
    {
        Object obj = ac.a(this);
        if (obj != null)
        {
            if (ac.a(this, ((Intent) (obj))))
            {
                obj = au.a(this);
                ((au) (obj)).a(this);
                ((au) (obj)).a();
                try
                {
                    android.support.v4.app.a.a(this);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    finish();
                }
            } else
            {
                ac.b(this, ((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final Intent a()
    {
        return ac.a(this);
    }

    final void a(int i)
    {
        super.setContentView(i);
    }

    final void a(View view)
    {
        super.setContentView(view);
    }

    final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
    }

    final boolean a(int i, Menu menu)
    {
        return super.onCreatePanelMenu(i, menu);
    }

    final boolean a(int i, MenuItem menuitem)
    {
        return super.onMenuItemSelected(i, menuitem);
    }

    final boolean a(int i, View view, Menu menu)
    {
        return super.onPreparePanel(i, view, menu);
    }

    protected final boolean a(View view, Menu menu)
    {
        d d1 = n;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return d1.a.onPrepareOptionsMenu(menu);
        } else
        {
            return d1.a.FragmentActivity.a(view, menu);
        }
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n.b(view, layoutparams);
    }

    public final void b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.b();
        }
        n.f();
    }

    final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
    }

    public MenuInflater getMenuInflater()
    {
        return n.c();
    }

    public void onBackPressed()
    {
        if (!n.g())
        {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        n.a(configuration);
    }

    public final void onContentChanged()
    {
        n.h();
    }

    protected void onCreate(Bundle bundle)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        Object obj;
        if (i >= 16)
        {
            obj = new j(this);
        } else
        if (i >= 14)
        {
            obj = new h(this);
        } else
        if (i >= 11)
        {
            obj = new g(this);
        } else
        {
            obj = new e(this);
        }
        n = ((d) (obj));
        super.onCreate(bundle);
        n.a(bundle);
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return n.a(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        if (i == 0)
        {
            return n.b(i);
        } else
        {
            return super.onCreatePanelView(i);
        }
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (n.a(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = n.b();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.a() & 4) != 0)
        {
            return d();
        } else
        {
            return false;
        }
    }

    protected void onPostResume()
    {
        super.onPostResume();
        n.e();
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return n.a(i, view, menu);
    }

    protected void onStop()
    {
        super.onStop();
        n.d();
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        n.a(charsequence);
    }

    public void setContentView(int i)
    {
        n.a(i);
    }

    public void setContentView(View view)
    {
        n.a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n.a(view, layoutparams);
    }
}
