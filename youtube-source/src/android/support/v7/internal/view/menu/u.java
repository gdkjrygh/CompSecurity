// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.support.v4.view.n;
import android.util.Log;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            k, v, x, y

public class u extends k
    implements b
{

    private final boolean b;
    private boolean c;
    private Method d;

    u(MenuItem menuitem)
    {
        this(menuitem, true);
    }

    u(MenuItem menuitem, boolean flag)
    {
        super(menuitem);
        c = menuitem.isVisible();
        b = flag;
    }

    static boolean a(u u1)
    {
        return u1.b;
    }

    public final b a(n n)
    {
        MenuItem menuitem = (MenuItem)a;
        if (n != null)
        {
            n = b(n);
        } else
        {
            n = null;
        }
        menuitem.setActionProvider(n);
        return this;
    }

    public final void a(boolean flag)
    {
        try
        {
            if (d == null)
            {
                d = ((MenuItem)a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            d.invoke(a, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
        catch (Exception exception)
        {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
        }
    }

    v b(n n)
    {
        return new v(this, n);
    }

    final boolean b()
    {
        if (c)
        {
            Object obj = (v)((MenuItem)a).getActionProvider();
            if (obj != null)
            {
                obj = ((v) (obj)).a;
            }
        }
        return false;
    }

    public boolean collapseActionView()
    {
        return ((MenuItem)a).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((MenuItem)a).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        return ((MenuItem)a).getActionProvider();
    }

    public View getActionView()
    {
        View view1 = ((MenuItem)a).getActionView();
        View view = view1;
        if (view1 instanceof x)
        {
            view = ((x)view1).a();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((MenuItem)a).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((MenuItem)a).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((MenuItem)a).getIcon();
    }

    public Intent getIntent()
    {
        return ((MenuItem)a).getIntent();
    }

    public int getItemId()
    {
        return ((MenuItem)a).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((MenuItem)a).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((MenuItem)a).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((MenuItem)a).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((MenuItem)a).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((MenuItem)a).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((MenuItem)a).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((MenuItem)a).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((MenuItem)a).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((MenuItem)a).isCheckable();
    }

    public boolean isChecked()
    {
        return ((MenuItem)a).isChecked();
    }

    public boolean isEnabled()
    {
        return ((MenuItem)a).isEnabled();
    }

    public boolean isVisible()
    {
        return ((MenuItem)a).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        ((MenuItem)a).setActionProvider(actionprovider);
        if (actionprovider != null && b)
        {
            b();
        }
        return this;
    }

    public MenuItem setActionView(int i)
    {
        ((MenuItem)a).setActionView(i);
        View view = ((MenuItem)a).getActionView();
        if (view instanceof android.support.v7.c.b)
        {
            ((MenuItem)a).setActionView(new x(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof android.support.v7.c.b)
        {
            obj = new x(view);
        }
        ((MenuItem)a).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        ((MenuItem)a).setAlphabeticShortcut(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((MenuItem)a).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((MenuItem)a).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((MenuItem)a).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        ((MenuItem)a).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((MenuItem)a).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((MenuItem)a).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        ((MenuItem)a).setNumericShortcut(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        ((MenuItem)a).setOnActionExpandListener(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        MenuItem menuitem = (MenuItem)a;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new y(this, onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        menuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        ((MenuItem)a).setShortcut(c1, c2);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((MenuItem)a).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((MenuItem)a).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((MenuItem)a).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((MenuItem)a).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((MenuItem)a).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        if (b)
        {
            c = flag;
            if (b())
            {
                return this;
            }
        }
        return ((MenuItem)a).setVisible(flag);
    }
}
