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
import android.os.Bundle;
import android.support.v4.b.a.a;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.a.c;
import android.util.SparseArray;
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
//            m, x, ad, j

public class i
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
    private j i;
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
    private m x;
    private boolean y;

    public i(Context context)
    {
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
        e(true);
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((m)arraylist.get(j1)).c() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private m a(int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        return new m(this, i1, j1, k1, l1, charsequence, i2);
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = d(k1);
        charsequence = a(i1, j1, k1, l1, charsequence, p);
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
        Resources resources = d();
        if (view == null) goto _L2; else goto _L1
_L1:
        c = view;
        a = null;
        b = null;
_L4:
        b(false);
        return;
_L2:
        if (i1 > 0)
        {
            a = resources.getText(i1);
        } else
        if (charsequence != null)
        {
            a = charsequence;
        }
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        b = ContextCompat.getDrawable(e(), j1);
_L6:
        c = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (drawable == null) goto _L6; else goto _L5
_L5:
        b = drawable;
          goto _L6
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

    private boolean a(ad ad1, x x1)
    {
        boolean flag = false;
        if (w.isEmpty())
        {
            return false;
        }
        if (x1 != null)
        {
            flag = x1.a(ad1);
        }
        x1 = w.iterator();
        do
        {
            if (!x1.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)x1.next();
            x x2 = (x)weakreference.get();
            if (x2 == null)
            {
                w.remove(weakreference);
            } else
            if (!flag)
            {
                flag = x2.a(ad1);
            }
        } while (true);
        return flag;
    }

    private static int d(int i1)
    {
        int j1 = (0xffff0000 & i1) >> 16;
        if (j1 < 0 || j1 >= d.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            return d[j1] << 16 | 0xffff & i1;
        }
    }

    private void d(boolean flag)
    {
        if (w.isEmpty())
        {
            return;
        }
        g();
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            x x1 = (x)weakreference.get();
            if (x1 == null)
            {
                w.remove(weakreference);
            } else
            {
                x1.a(flag);
            }
        }

        h();
    }

    private void e(boolean flag)
    {
        boolean flag1 = true;
        if (flag && f.getConfiguration().keyboard != 1 && f.getBoolean(c.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    public int a(int i1, int j1)
    {
        int l1 = size();
        int k1 = j1;
        if (j1 < 0)
        {
            k1 = 0;
        }
        for (; k1 < l1; k1++)
        {
            if (((m)j.get(k1)).getGroupId() == i1)
            {
                return k1;
            }
        }

        return -1;
    }

    public i a(int i1)
    {
        p = i1;
        return this;
    }

    protected i a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected i a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    protected i a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    m a(int i1, KeyEvent keyevent)
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
            return (m)arraylist.get(0);
        }
        flag = b();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        m m1 = (m)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = m1.getAlphabeticShortcut();
        } else
        {
            c1 = m1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = m1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = m1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = m1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    protected String a()
    {
        return "android:menu:actionviewstates";
    }

    public void a(Bundle bundle)
    {
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
            View view = MenuItemCompat.getActionView(menuitem);
            sparsearray2 = sparsearray;
            if (view != null)
            {
                sparsearray2 = sparsearray;
                if (view.getId() != -1)
                {
                    SparseArray sparsearray1 = sparsearray;
                    if (sparsearray == null)
                    {
                        sparsearray1 = new SparseArray();
                    }
                    view.saveHierarchyState(sparsearray1);
                    sparsearray2 = sparsearray1;
                    if (MenuItemCompat.isActionViewExpanded(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((ad)menuitem.getSubMenu()).a(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(a(), sparsearray);
        }
    }

    public void a(j j1)
    {
        i = j1;
    }

    void a(m m1)
    {
        l = true;
        b(true);
    }

    public void a(x x1)
    {
        a(x1, e);
    }

    public void a(x x1, Context context)
    {
        w.add(new WeakReference(x1));
        x1.a(context, this);
        o = true;
    }

    void a(MenuItem menuitem)
    {
        int j1 = menuitem.getGroupId();
        int k1 = j.size();
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            m m1 = (m)j.get(i1);
            if (m1.getGroupId() == j1 && m1.g() && m1.isCheckable())
            {
                boolean flag;
                if (m1 == menuitem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                m1.b(flag);
            }
            i1++;
        } while (true);
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = b();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = j.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                m m1 = (m)j.get(j1);
                if (m1.hasSubMenu())
                {
                    ((i)m1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = m1.getAlphabeticShortcut();
                } else
                {
                    c1 = m1.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && m1.isEnabled())
                {
                    list.add(m1);
                }
                j1++;
            }
        }
    }

    public final void a(boolean flag)
    {
        if (u)
        {
            return;
        }
        u = true;
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            x x1 = (x)weakreference.get();
            if (x1 == null)
            {
                w.remove(weakreference);
            } else
            {
                x1.a(this, flag);
            }
        }

        u = false;
    }

    boolean a(i i1, MenuItem menuitem)
    {
        return i != null && i.a(i1, menuitem);
    }

    public boolean a(MenuItem menuitem, int i1)
    {
        return a(menuitem, ((x) (null)), i1);
    }

    public boolean a(MenuItem menuitem, x x1, int i1)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        obj = (m)menuitem;
        flag1 = flag2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((m) (obj)).isEnabled()) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L2:
        return flag1;
_L4:
        boolean flag;
        flag1 = ((m) (obj)).b();
        menuitem = ((m) (obj)).a();
        boolean flag3;
        if (menuitem != null && menuitem.hasSubMenu())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!((m) (obj)).n())
        {
            break; /* Loop/switch isn't completed */
        }
        flag3 = ((m) (obj)).expandActionView() | flag1;
        flag1 = flag3;
        if (flag3)
        {
            a(true);
            return flag3;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((m) (obj)).hasSubMenu() || flag)
        {
            a(false);
            if (!((m) (obj)).hasSubMenu())
            {
                ((m) (obj)).a(new ad(e(), this, ((m) (obj))));
            }
            obj = (ad)((m) (obj)).getSubMenu();
            if (flag)
            {
                menuitem.onPrepareSubMenu(((SubMenu) (obj)));
            }
            boolean flag4 = a(((ad) (obj)), x1) | flag1;
            flag1 = flag4;
            if (!flag4)
            {
                a(true);
                return flag4;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                a(true);
            }
            return flag1;
        }
        if (true) goto _L2; else goto _L6
_L6:
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
        charsequence = (m)a(i1, j1, k1, charsequence);
        ad ad1 = new ad(e, this, charsequence);
        charsequence.a(ad1);
        return ad1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public int b(int i1)
    {
        int k1 = size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((m)j.get(j1)).getItemId() == i1)
            {
                return j1;
            }
        }

        return -1;
    }

    public void b(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(a());
            int k1 = size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                MenuItem menuitem = getItem(i1);
                View view = MenuItemCompat.getActionView(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((ad)menuitem.getSubMenu()).b(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    MenuItemCompat.expandActionView(bundle);
                    return;
                }
            }
        }
    }

    void b(m m1)
    {
        o = true;
        b(true);
    }

    public void b(x x1)
    {
        Iterator iterator = w.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            x x2 = (x)weakreference.get();
            if (x2 == null || x2 == x1)
            {
                w.remove(weakreference);
            }
        } while (true);
    }

    public void b(boolean flag)
    {
        if (!r)
        {
            if (flag)
            {
                l = true;
                o = true;
            }
            d(flag);
            return;
        } else
        {
            s = true;
            return;
        }
    }

    boolean b()
    {
        return g;
    }

    public int c(int i1)
    {
        return a(i1, 0);
    }

    public void c(boolean flag)
    {
        y = flag;
    }

    public boolean c()
    {
        return h;
    }

    public boolean c(m m1)
    {
        boolean flag1 = false;
        if (!w.isEmpty())
        {
            g();
            Iterator iterator = w.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                x x1 = (x)weakreference.get();
                if (x1 == null)
                {
                    w.remove(weakreference);
                    continue;
                }
                flag1 = x1.a(this, m1);
                flag = flag1;
                if (!flag1)
                {
                    continue;
                }
                flag = flag1;
                break;
            } while (true);
            h();
            flag1 = flag;
            if (flag)
            {
                x = m1;
                return flag;
            }
        }
        return flag1;
    }

    public void clear()
    {
        if (x != null)
        {
            d(x);
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

    Resources d()
    {
        return f;
    }

    public boolean d(m m1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!w.isEmpty())
        {
            if (x != m1)
            {
                flag2 = flag;
            } else
            {
                g();
                Iterator iterator = w.iterator();
                boolean flag1 = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    x x1 = (x)weakreference.get();
                    if (x1 == null)
                    {
                        w.remove(weakreference);
                        continue;
                    }
                    flag2 = x1.b(this, m1);
                    flag1 = flag2;
                    if (!flag2)
                    {
                        continue;
                    }
                    flag1 = flag2;
                    break;
                } while (true);
                h();
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

    public Context e()
    {
        return e;
    }

    public void f()
    {
        if (i != null)
        {
            i.a(this);
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
        Object obj = (m)j.get(j1);
        if (((m) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((m) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((m) (obj)).getSubMenu().findItem(i1);
        obj = menuitem;
        if (menuitem != null) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return null;
    }

    public void g()
    {
        if (!r)
        {
            r = true;
            s = false;
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)j.get(i1);
    }

    public void h()
    {
        r = false;
        if (s)
        {
            s = false;
            b(true);
        }
    }

    public boolean hasVisibleItems()
    {
        if (y)
        {
            return true;
        }
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((m)j.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    public ArrayList i()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int j1 = j.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            m m1 = (m)j.get(i1);
            if (m1.isVisible())
            {
                k.add(m1);
            }
        }

        l = false;
        o = true;
        return k;
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    public void j()
    {
        ArrayList arraylist = i();
        if (!o)
        {
            return;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            x x1 = (x)weakreference.get();
            if (x1 == null)
            {
                w.remove(weakreference);
            } else
            {
                flag = x1.b() | flag;
            }
        }
        if (flag)
        {
            m.clear();
            n.clear();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                m m1 = (m)arraylist.get(i1);
                if (m1.j())
                {
                    m.add(m1);
                } else
                {
                    n.add(m1);
                }
                i1++;
            }
        } else
        {
            m.clear();
            n.clear();
            n.addAll(i());
        }
        o = false;
    }

    public ArrayList k()
    {
        j();
        return m;
    }

    public ArrayList l()
    {
        j();
        return n;
    }

    public CharSequence m()
    {
        return a;
    }

    public Drawable n()
    {
        return b;
    }

    public View o()
    {
        return c;
    }

    public i p()
    {
        return this;
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

    boolean q()
    {
        return t;
    }

    public m r()
    {
        return x;
    }

    public void removeGroup(int i1)
    {
        int k1 = c(i1);
        if (k1 >= 0)
        {
            int l1 = j.size();
            for (int j1 = 0; j1 < l1 - k1 && ((m)j.get(k1)).getGroupId() == i1; j1++)
            {
                a(k1, false);
            }

            b(true);
        }
    }

    public void removeItem(int i1)
    {
        a(b(i1), true);
    }

    public void setGroupCheckable(int i1, boolean flag, boolean flag1)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            m m1 = (m)j.get(j1);
            if (m1.getGroupId() == i1)
            {
                m1.a(flag1);
                m1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            m m1 = (m)j.get(j1);
            if (m1.getGroupId() == i1)
            {
                m1.setEnabled(flag);
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
            m m1 = (m)j.get(j1);
            if (m1.getGroupId() == i1 && m1.c(flag))
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
