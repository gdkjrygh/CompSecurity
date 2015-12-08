// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v7.a.d;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            s, ad, p, aj

public class o
    implements a
{

    private static final int d[] = {
        1, 4, 5, 3, 2, 0
    };
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private p i;
    private ArrayList j;
    private ArrayList k;
    private boolean l;
    private ArrayList m;
    private ArrayList n;
    private boolean o;
    private int p;
    private android.view.ContextMenu.ContextMenuInfo q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private CopyOnWriteArrayList w;
    private s x;

    public o(Context context)
    {
        boolean flag = true;
        super();
        p = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        v = new ArrayList();
        w = new CopyOnWriteArrayList();
        e = context;
        f = context.getResources();
        j = new ArrayList();
        k = new ArrayList();
        l = true;
        m = new ArrayList();
        n = new ArrayList();
        o = true;
        if (f.getConfiguration().keyboard == 1 || !f.getBoolean(d.d))
        {
            flag = false;
        }
        h = flag;
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((s)arraylist.get(j1)).b() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private s a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = v;
        arraylist.clear();
        a(((List) (arraylist)), i1, keyevent);
        if (!arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        keyevent = null;
_L6:
        return keyevent;
_L2:
        android.view.KeyCharacterMap.KeyData keydata;
        int j1;
        int k1;
        int l1;
        boolean flag;
        k1 = keyevent.getMetaState();
        keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        l1 = arraylist.size();
        if (l1 == 1)
        {
            return (s)arraylist.get(0);
        }
        flag = a();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        s s1 = (s)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = s1.getAlphabeticShortcut();
        } else
        {
            c1 = s1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = s1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = s1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = s1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = (0xffff0000 & k1) >> 16;
        if (l1 < 0 || l1 >= d.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        l1 = d[l1] << 16 | 0xffff & k1;
        charsequence = new s(this, i1, j1, k1, l1, charsequence, p);
        if (q != null)
        {
            charsequence.a(q);
        }
        j.add(a(j, l1), charsequence);
        b(true);
        return charsequence;
    }

    private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
    {
        Resources resources = f;
        if (view != null)
        {
            c = view;
            a = null;
            b = null;
        } else
        {
            if (charsequence != null)
            {
                a = charsequence;
            }
            if (drawable != null)
            {
                b = drawable;
            }
            c = null;
        }
        b(false);
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < j.size())
        {
            j.remove(i1);
            if (flag)
            {
                b(true);
                return;
            }
        }
    }

    private void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = a();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = j.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                s s1 = (s)j.get(j1);
                if (s1.hasSubMenu())
                {
                    ((o)s1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = s1.getAlphabeticShortcut();
                } else
                {
                    c1 = s1.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && s1.isEnabled())
                {
                    list.add(s1);
                }
                j1++;
            }
        }
    }

    protected final o a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected final o a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    protected final o a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    public final void a(ad ad1)
    {
        w.add(new WeakReference(ad1));
        ad1.a(e, this);
        o = true;
    }

    public void a(p p1)
    {
        i = p1;
    }

    final void a(MenuItem menuitem)
    {
        int j1 = menuitem.getGroupId();
        int k1 = j.size();
        int i1 = 0;
        while (i1 < k1) 
        {
            s s1 = (s)j.get(i1);
            if (s1.getGroupId() == j1 && s1.f() && s1.isCheckable())
            {
                boolean flag;
                if (s1 == menuitem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s1.b(flag);
            }
            i1++;
        }
    }

    final void a(boolean flag)
    {
        if (u)
        {
            return;
        }
        u = true;
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            ad ad1 = (ad)weakreference.get();
            if (ad1 == null)
            {
                w.remove(weakreference);
            } else
            {
                ad1.a(this, flag);
            }
        }

        u = false;
    }

    boolean a()
    {
        return g;
    }

    boolean a(o o1, MenuItem menuitem)
    {
        return i != null && i.a(menuitem);
    }

    public boolean a(s s1)
    {
        boolean flag1 = false;
        if (!w.isEmpty())
        {
            f();
            Iterator iterator = w.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                ad ad1 = (ad)weakreference.get();
                if (ad1 == null)
                {
                    w.remove(weakreference);
                    continue;
                }
                flag1 = ad1.b(s1);
                flag = flag1;
                if (flag1)
                {
                    break;
                }
                flag = flag1;
            } while (true);
            g();
            flag1 = flag;
            if (flag)
            {
                x = s1;
                return flag;
            }
        }
        return flag1;
    }

    public final boolean a(MenuItem menuitem, int i1)
    {
        boolean flag;
        flag = false;
        menuitem = (s)menuitem;
        if (menuitem != null && menuitem.isEnabled()) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        boolean flag1;
        flag1 = menuitem.a();
        menuitem.m();
        if (!menuitem.n())
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = menuitem.expandActionView() | flag1;
        flag = flag1;
        if (flag1)
        {
            a(true);
            return flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (menuitem.hasSubMenu())
        {
            a(false);
            if (!menuitem.hasSubMenu())
            {
                menuitem.a(new aj(e, this, menuitem));
            }
            menuitem = (aj)menuitem.getSubMenu();
            if (!w.isEmpty())
            {
                Iterator iterator = w.iterator();
                flag = false;
                while (iterator.hasNext()) 
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    ad ad1 = (ad)weakreference.get();
                    if (ad1 == null)
                    {
                        w.remove(weakreference);
                    } else
                    if (!flag)
                    {
                        flag = ad1.a(menuitem);
                    }
                }
            }
            flag1 |= flag;
            flag = flag1;
            if (!flag1)
            {
                a(true);
                return flag1;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                a(true);
            }
            return flag1;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, f.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, f.getString(l1));
    }

    public MenuItem add(int i1, int j1, int k1, CharSequence charsequence)
    {
        return a(i1, j1, k1, charsequence);
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(0, 0, 0, charsequence);
    }

    public int addIntentOptions(int i1, int j1, int k1, ComponentName componentname, Intent aintent[], Intent intent, int l1, 
            MenuItem amenuitem[])
    {
        PackageManager packagemanager = e.getPackageManager();
        List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
        int i2;
        if (list != null)
        {
            i2 = list.size();
        } else
        {
            i2 = 0;
        }
        if ((l1 & 1) == 0)
        {
            removeGroup(i1);
        }
        l1 = 0;
        while (l1 < i2) 
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.get(l1);
            if (resolveinfo.specificIndex < 0)
            {
                componentname = intent;
            } else
            {
                componentname = aintent[resolveinfo.specificIndex];
            }
            componentname = new Intent(componentname);
            componentname.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
            componentname = add(i1, j1, k1, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(componentname);
            if (amenuitem != null && resolveinfo.specificIndex >= 0)
            {
                amenuitem[resolveinfo.specificIndex] = componentname;
            }
            l1++;
        }
        return i2;
    }

    public SubMenu addSubMenu(int i1)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (f.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (f.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (s)a(i1, j1, k1, charsequence);
        aj aj1 = new aj(e, this, charsequence);
        charsequence.a(aj1);
        return aj1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public final void b(ad ad1)
    {
        Iterator iterator = w.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            ad ad2 = (ad)weakreference.get();
            if (ad2 == null || ad2 == ad1)
            {
                w.remove(weakreference);
            }
        } while (true);
    }

    final void b(boolean flag)
    {
        if (!r)
        {
            if (flag)
            {
                l = true;
                o = true;
            }
            if (!w.isEmpty())
            {
                f();
                for (Iterator iterator = w.iterator(); iterator.hasNext();)
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    ad ad1 = (ad)weakreference.get();
                    if (ad1 == null)
                    {
                        w.remove(weakreference);
                    } else
                    {
                        ad1.c(flag);
                    }
                }

                g();
            }
            return;
        } else
        {
            s = true;
            return;
        }
    }

    public boolean b()
    {
        return h;
    }

    public boolean b(s s1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!w.isEmpty())
        {
            if (x != s1)
            {
                flag2 = flag;
            } else
            {
                f();
                Iterator iterator = w.iterator();
                boolean flag1 = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    ad ad1 = (ad)weakreference.get();
                    if (ad1 == null)
                    {
                        w.remove(weakreference);
                        continue;
                    }
                    flag2 = ad1.c(s1);
                    flag1 = flag2;
                    if (flag2)
                    {
                        break;
                    }
                    flag1 = flag2;
                } while (true);
                g();
                flag2 = flag1;
                if (flag1)
                {
                    x = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    final Resources c()
    {
        return f;
    }

    public void clear()
    {
        if (x != null)
        {
            b(x);
        }
        j.clear();
        b(true);
    }

    public void clearHeader()
    {
        b = null;
        a = null;
        c = null;
        b(false);
    }

    public void close()
    {
        a(true);
    }

    public final Context d()
    {
        return e;
    }

    public final void e()
    {
        if (i != null)
        {
            i.a(this);
        }
    }

    public final void f()
    {
        if (!r)
        {
            r = true;
            s = false;
        }
    }

    public MenuItem findItem(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L6:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        Object obj = (s)j.get(j1);
        if (((s) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((s) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((s) (obj)).getSubMenu().findItem(i1);
        obj = menuitem;
        if (menuitem != null) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return null;
    }

    public final void g()
    {
        r = false;
        if (s)
        {
            s = false;
            b(true);
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)j.get(i1);
    }

    final void h()
    {
        l = true;
        b(true);
    }

    public boolean hasVisibleItems()
    {
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((s)j.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    final void i()
    {
        o = true;
        b(true);
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    final ArrayList j()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int j1 = j.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            s s1 = (s)j.get(i1);
            if (s1.isVisible())
            {
                k.add(s1);
            }
        }

        l = false;
        o = true;
        return k;
    }

    public final void k()
    {
        if (!o)
        {
            return;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            ad ad1 = (ad)weakreference.get();
            if (ad1 == null)
            {
                w.remove(weakreference);
            } else
            {
                flag = ad1.h() | flag;
            }
        }
        if (flag)
        {
            m.clear();
            n.clear();
            ArrayList arraylist = j();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                s s1 = (s)arraylist.get(i1);
                if (s1.i())
                {
                    m.add(s1);
                } else
                {
                    n.add(s1);
                }
                i1++;
            }
        } else
        {
            m.clear();
            n.clear();
            n.addAll(j());
        }
        o = false;
    }

    final ArrayList l()
    {
        k();
        return m;
    }

    final ArrayList m()
    {
        k();
        return n;
    }

    public final CharSequence n()
    {
        return a;
    }

    public final Drawable o()
    {
        return b;
    }

    public final View p()
    {
        return c;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = a(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(keyevent, j1);
        }
        if ((j1 & 2) != 0)
        {
            a(true);
        }
        return flag;
    }

    public o q()
    {
        return this;
    }

    final boolean r()
    {
        return t;
    }

    public void removeGroup(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L7:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        if (((s)j.get(j1)).getGroupId() != i1) goto _L4; else goto _L3
_L3:
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i2 = j.size();
        for (int l1 = 0; l1 < i2 - j1 && ((s)j.get(j1)).getGroupId() == i1; l1++)
        {
            a(j1, false);
        }

        break; /* Loop/switch isn't completed */
_L4:
        j1++;
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = -1;
        if (true) goto _L3; else goto _L5
_L5:
        b(true);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void removeItem(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L3:
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (((s)j.get(j1)).getItemId() != i1) goto _L2; else goto _L1
_L1:
        a(j1, true);
        return;
_L2:
        j1++;
          goto _L3
        j1 = -1;
          goto _L1
    }

    public final s s()
    {
        return x;
    }

    public void setGroupCheckable(int i1, boolean flag, boolean flag1)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            s s1 = (s)j.get(j1);
            if (s1.getGroupId() == i1)
            {
                s1.a(flag1);
                s1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            s s1 = (s)j.get(j1);
            if (s1.getGroupId() == i1)
            {
                s1.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int k1 = j.size();
        int j1 = 0;
        boolean flag1 = false;
        for (; j1 < k1; j1++)
        {
            s s1 = (s)j.get(j1);
            if (s1.getGroupId() == i1 && s1.c(flag))
            {
                flag1 = true;
            }
        }

        if (flag1)
        {
            b(true);
        }
    }

    public void setQwertyMode(boolean flag)
    {
        g = flag;
        b(false);
    }

    public int size()
    {
        return j.size();
    }

}
