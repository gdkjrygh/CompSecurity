// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v7.a.b;
import android.support.v7.a.d;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.af;
import android.support.v7.internal.widget.ah;
import android.support.v7.internal.widget.bl;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            v, ac, ai, ag, 
//            ak, ad, ae, ah, 
//            a, t, af

class AppCompatDelegateImplV7 extends v
    implements LayoutInflaterFactory, j
{

    private PanelFeatureState A;
    private boolean B;
    private int C;
    private final Runnable D = new ac(this);
    private boolean E;
    private Rect F;
    private Rect G;
    private android.support.v7.internal.a.a H;
    a k;
    ActionBarContextView l;
    PopupWindow m;
    Runnable n;
    private af o;
    private ag p;
    private ak q;
    private boolean r;
    private ViewGroup s;
    private ViewGroup t;
    private TextView u;
    private View v;
    private boolean w;
    private boolean x;
    private boolean y;
    private PanelFeatureState z[];

    AppCompatDelegateImplV7(Context context, Window window, t t1)
    {
        super(context, window, t1);
    }

    static int a(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        return appcompatdelegateimplv7.C;
    }

    private PanelFeatureState a(int i1, boolean flag)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = z;
            if (apanelfeaturestate1 != null)
            {
                apanelfeaturestate = apanelfeaturestate1;
                if (apanelfeaturestate1.length > i1)
                {
                    break label0;
                }
            }
            apanelfeaturestate = new PanelFeatureState[i1 + 1];
            if (apanelfeaturestate1 != null)
            {
                System.arraycopy(apanelfeaturestate1, 0, apanelfeaturestate, 0, apanelfeaturestate1.length);
            }
            z = apanelfeaturestate;
        }
        PanelFeatureState panelfeaturestate = apanelfeaturestate[i1];
        if (panelfeaturestate == null)
        {
            panelfeaturestate = new PanelFeatureState(i1);
            apanelfeaturestate[i1] = panelfeaturestate;
            return panelfeaturestate;
        } else
        {
            return panelfeaturestate;
        }
    }

    static PanelFeatureState a(AppCompatDelegateImplV7 appcompatdelegateimplv7, Menu menu)
    {
        return appcompatdelegateimplv7.a(menu);
    }

    private PanelFeatureState a(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = z;
        int i1;
        int j1;
        if (apanelfeaturestate != null)
        {
            i1 = apanelfeaturestate.length;
        } else
        {
            i1 = 0;
        }
        for (j1 = 0; j1 < i1; j1++)
        {
            PanelFeatureState panelfeaturestate = apanelfeaturestate[j1];
            if (panelfeaturestate != null && panelfeaturestate.j == menu)
            {
                return panelfeaturestate;
            }
        }

        return null;
    }

    private void a(int i1, PanelFeatureState panelfeaturestate, Menu menu)
    {
        PanelFeatureState panelfeaturestate2 = panelfeaturestate;
        Object obj = menu;
        if (menu == null)
        {
            PanelFeatureState panelfeaturestate1 = panelfeaturestate;
            if (panelfeaturestate == null)
            {
                panelfeaturestate1 = panelfeaturestate;
                if (i1 >= 0)
                {
                    panelfeaturestate1 = panelfeaturestate;
                    if (i1 < z.length)
                    {
                        panelfeaturestate1 = z[i1];
                    }
                }
            }
            panelfeaturestate2 = panelfeaturestate1;
            obj = menu;
            if (panelfeaturestate1 != null)
            {
                obj = panelfeaturestate1.j;
                panelfeaturestate2 = panelfeaturestate1;
            }
        }
        if (panelfeaturestate2 == null || panelfeaturestate2.o)
        {
            if ((panelfeaturestate = m()) != null)
            {
                panelfeaturestate.onPanelClosed(i1, ((Menu) (obj)));
                return;
            }
        }
    }

    private void a(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!panelfeaturestate.o && !l()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (panelfeaturestate.a != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a;
        boolean flag;
        boolean flag1;
        if ((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L1; else goto _L3
_L3:
        WindowManager windowmanager;
        obj = m();
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(panelfeaturestate.a, panelfeaturestate.j))
        {
            a(panelfeaturestate, true);
            return;
        }
        windowmanager = (WindowManager)a.getSystemService("window");
        if (windowmanager == null || !b(panelfeaturestate, keyevent)) goto _L1; else goto _L4
_L4:
        if (panelfeaturestate.g != null && !panelfeaturestate.q) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.g != null) goto _L8; else goto _L7
_L7:
        if (!a(panelfeaturestate) || panelfeaturestate.g == null) goto _L1; else goto _L9
_L9:
        if (!c(panelfeaturestate) || !panelfeaturestate.a()) goto _L1; else goto _L10
_L10:
        int i1;
        keyevent = panelfeaturestate.h.getLayoutParams();
        if (keyevent == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        i1 = panelfeaturestate.b;
        panelfeaturestate.g.setBackgroundResource(i1);
        android.view.ViewParent viewparent = panelfeaturestate.h.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(panelfeaturestate.h);
        }
        panelfeaturestate.g.addView(panelfeaturestate.h, keyevent);
        if (!panelfeaturestate.h.hasFocus())
        {
            panelfeaturestate.h.requestFocus();
        }
        i1 = -2;
_L14:
        panelfeaturestate.n = false;
        keyevent = new android.view.WindowManager.LayoutParams(i1, -2, panelfeaturestate.d, panelfeaturestate.e, 1002, 0x820000, -3);
        keyevent.gravity = panelfeaturestate.c;
        keyevent.windowAnimations = panelfeaturestate.f;
        windowmanager.addView(panelfeaturestate.g, keyevent);
        panelfeaturestate.o = true;
        return;
_L8:
        if (panelfeaturestate.q && panelfeaturestate.g.getChildCount() > 0)
        {
            panelfeaturestate.g.removeAllViews();
        }
          goto _L9
_L6:
        if (panelfeaturestate.i == null) goto _L12; else goto _L11
_L11:
        keyevent = panelfeaturestate.i.getLayoutParams();
        if (keyevent == null) goto _L12; else goto _L13
_L13:
        i1 = byte0;
        if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L14; else goto _L12
_L12:
        i1 = -2;
          goto _L14
    }

    private void a(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.a == 0 && o != null && o.e())
        {
            b(panelfeaturestate.j);
        } else
        {
            boolean flag1 = panelfeaturestate.o;
            WindowManager windowmanager = (WindowManager)a.getSystemService("window");
            if (windowmanager != null && flag1 && panelfeaturestate.g != null)
            {
                windowmanager.removeView(panelfeaturestate.g);
            }
            panelfeaturestate.m = false;
            panelfeaturestate.n = false;
            panelfeaturestate.o = false;
            if (flag1 && flag)
            {
                a(panelfeaturestate.a, panelfeaturestate, ((Menu) (null)));
            }
            panelfeaturestate.h = null;
            panelfeaturestate.q = true;
            if (A == panelfeaturestate)
            {
                A = null;
                return;
            }
        }
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        appcompatdelegateimplv7.e(i1);
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1, PanelFeatureState panelfeaturestate, Menu menu)
    {
        appcompatdelegateimplv7.a(i1, panelfeaturestate, menu);
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, PanelFeatureState panelfeaturestate, boolean flag)
    {
        appcompatdelegateimplv7.a(panelfeaturestate, flag);
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, i i1)
    {
        appcompatdelegateimplv7.b(i1);
    }

    private void a(i i1, boolean flag)
    {
        if (o == null || !o.d() || ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(a)) && !o.f())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        i1 = m();
        if (o.e() && flag) goto _L2; else goto _L1
_L1:
        if (i1 != null && !l())
        {
            if (B && (C & 1) != 0)
            {
                s.removeCallbacks(D);
                D.run();
            }
            PanelFeatureState panelfeaturestate = a(0, true);
            if (panelfeaturestate.j != null && !panelfeaturestate.r && i1.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
            {
                i1.onMenuOpened(8, panelfeaturestate.j);
                o.g();
            }
        }
_L4:
        return;
_L2:
        o.h();
        if (l()) goto _L4; else goto _L3
_L3:
        i1.onPanelClosed(8, a(0, true).j);
        return;
        i1 = a(0, true);
        i1.q = true;
        a(((PanelFeatureState) (i1)), false);
        a(((PanelFeatureState) (i1)), ((KeyEvent) (null)));
        return;
    }

    private void a(ContentFrameLayout contentframelayout)
    {
        contentframelayout.a(s.getPaddingLeft(), s.getPaddingTop(), s.getPaddingRight(), s.getPaddingBottom());
        TypedArray typedarray = a.obtainStyledAttributes(l.Theme);
        typedarray.getValue(l.Theme_windowMinWidthMajor, contentframelayout.getMinWidthMajor());
        typedarray.getValue(l.Theme_windowMinWidthMinor, contentframelayout.getMinWidthMinor());
        if (typedarray.hasValue(l.Theme_windowFixedWidthMajor))
        {
            typedarray.getValue(l.Theme_windowFixedWidthMajor, contentframelayout.getFixedWidthMajor());
        }
        if (typedarray.hasValue(l.Theme_windowFixedWidthMinor))
        {
            typedarray.getValue(l.Theme_windowFixedWidthMinor, contentframelayout.getFixedWidthMinor());
        }
        if (typedarray.hasValue(l.Theme_windowFixedHeightMajor))
        {
            typedarray.getValue(l.Theme_windowFixedHeightMajor, contentframelayout.getFixedHeightMajor());
        }
        if (typedarray.hasValue(l.Theme_windowFixedHeightMinor))
        {
            typedarray.getValue(l.Theme_windowFixedHeightMinor, contentframelayout.getFixedHeightMinor());
        }
        typedarray.recycle();
        contentframelayout.requestLayout();
    }

    private boolean a(PanelFeatureState panelfeaturestate)
    {
        panelfeaturestate.a(k());
        panelfeaturestate.g = new ai(this, panelfeaturestate.l);
        panelfeaturestate.c = 81;
        return true;
    }

    private boolean a(PanelFeatureState panelfeaturestate, int i1, KeyEvent keyevent, int j1)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        if (!keyevent.isSystem()) goto _L2; else goto _L1
_L1:
        flag2 = flag;
_L4:
        return flag2;
_L2:
        boolean flag1;
label0:
        {
            if (!panelfeaturestate.m)
            {
                flag1 = flag2;
                if (!b(panelfeaturestate, keyevent))
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (panelfeaturestate.j != null)
            {
                flag1 = panelfeaturestate.j.performShortcut(i1, keyevent, j1);
            }
        }
        flag2 = flag1;
        if (flag1)
        {
            flag2 = flag1;
            if ((j1 & 1) == 0)
            {
                flag2 = flag1;
                if (o == null)
                {
                    a(panelfeaturestate, true);
                    return flag1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(AppCompatDelegateImplV7 appcompatdelegateimplv7, boolean flag)
    {
        appcompatdelegateimplv7.B = flag;
        return flag;
    }

    static int b(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        appcompatdelegateimplv7.C = i1;
        return i1;
    }

    private void b(i i1)
    {
        if (y)
        {
            return;
        }
        y = true;
        o.j();
        android.view.Window.Callback callback = m();
        if (callback != null && !l())
        {
            callback.onPanelClosed(8, i1);
        }
        y = false;
    }

    private boolean b(PanelFeatureState panelfeaturestate)
    {
        Context context = a;
        if (panelfeaturestate.a != 0 && panelfeaturestate.a != 8 || o == null) goto _L2; else goto _L1
_L1:
        Object obj;
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(b.actionBarTheme, typedvalue, true);
        obj = null;
        android.content.res.Resources.Theme theme;
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
        }
        theme = ((android.content.res.Resources.Theme) (obj));
        if (typedvalue.resourceId != 0)
        {
            theme = ((android.content.res.Resources.Theme) (obj));
            if (obj == null)
            {
                theme = context.getResources().newTheme();
                theme.setTo(theme1);
            }
            theme.applyStyle(typedvalue.resourceId, true);
        }
        if (theme == null) goto _L2; else goto _L3
_L3:
        obj = new ContextThemeWrapper(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L5:
        obj = new i(((Context) (obj)));
        ((i) (obj)).a(this);
        panelfeaturestate.a(((i) (obj)));
        return true;
_L2:
        obj = context;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean b(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!l()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        android.view.Window.Callback callback;
        int i1;
        if (panelfeaturestate.m)
        {
            return true;
        }
        if (A != null && A != panelfeaturestate)
        {
            a(A, false);
        }
        callback = m();
        if (callback != null)
        {
            panelfeaturestate.i = callback.onCreatePanelView(panelfeaturestate.a);
        }
        if (panelfeaturestate.a == 0 || panelfeaturestate.a == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 && o != null)
        {
            o.i();
        }
        if (panelfeaturestate.i != null || i1 && (j() instanceof android.support.v7.internal.a.b))
        {
            break MISSING_BLOCK_LABEL_412;
        }
        if (panelfeaturestate.j != null && !panelfeaturestate.r)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (panelfeaturestate.j == null && (!b(panelfeaturestate) || panelfeaturestate.j == null))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 && o != null)
        {
            if (p == null)
            {
                p = new ag(this, null);
            }
            o.a(panelfeaturestate.j, p);
        }
        panelfeaturestate.j.g();
        if (callback.onCreatePanelMenu(panelfeaturestate.a, panelfeaturestate.j))
        {
            break; /* Loop/switch isn't completed */
        }
        panelfeaturestate.a(null);
        if (i1 && o != null)
        {
            o.a(null, p);
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        panelfeaturestate.r = false;
        panelfeaturestate.j.g();
        if (panelfeaturestate.s != null)
        {
            panelfeaturestate.j.b(panelfeaturestate.s);
            panelfeaturestate.s = null;
        }
        if (!callback.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
        {
            if (i1 && o != null)
            {
                o.a(null, p);
            }
            panelfeaturestate.j.h();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            i1 = keyevent.getDeviceId();
        } else
        {
            i1 = -1;
        }
        if (KeyCharacterMap.load(i1).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        panelfeaturestate.p = flag;
        panelfeaturestate.j.setQwertyMode(panelfeaturestate.p);
        panelfeaturestate.j.h();
        panelfeaturestate.m = true;
        panelfeaturestate.n = false;
        A = panelfeaturestate;
        return true;
    }

    static int c(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        return appcompatdelegateimplv7.f(i1);
    }

    private void c(int i1)
    {
        a(a(i1, true), true);
    }

    private boolean c(PanelFeatureState panelfeaturestate)
    {
        if (panelfeaturestate.i != null)
        {
            panelfeaturestate.h = panelfeaturestate.i;
            return true;
        }
        if (panelfeaturestate.j == null)
        {
            return false;
        }
        if (q == null)
        {
            q = new ak(this, null);
        }
        panelfeaturestate.h = (View)panelfeaturestate.a(q);
        boolean flag;
        if (panelfeaturestate.h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private void d(int i1)
    {
        C = C | 1 << i1;
        if (!B && s != null)
        {
            ViewCompat.postOnAnimation(s, D);
            B = true;
        }
    }

    static void d(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        appcompatdelegateimplv7.c(i1);
    }

    private boolean d(int i1, KeyEvent keyevent)
    {
        if (keyevent.getRepeatCount() == 0)
        {
            PanelFeatureState panelfeaturestate = a(i1, true);
            if (!panelfeaturestate.o)
            {
                return b(panelfeaturestate, keyevent);
            }
        }
        return false;
    }

    private void e(int i1)
    {
        PanelFeatureState panelfeaturestate = a(i1, true);
        if (panelfeaturestate.j != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.j.a(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.s = bundle;
            }
            panelfeaturestate.j.g();
            panelfeaturestate.j.clear();
        }
        panelfeaturestate.r = true;
        panelfeaturestate.q = true;
        if ((i1 == 8 || i1 == 0) && o != null)
        {
            PanelFeatureState panelfeaturestate1 = a(0, false);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.m = false;
                b(panelfeaturestate1, ((KeyEvent) (null)));
            }
        }
    }

    private boolean e(int i1, KeyEvent keyevent)
    {
        PanelFeatureState panelfeaturestate;
        boolean flag1;
        flag1 = true;
        if (k != null)
        {
            return false;
        }
        panelfeaturestate = a(i1, true);
        if (i1 != 0 || o == null || !o.d() || ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(a))) goto _L2; else goto _L1
_L1:
        if (o.e()) goto _L4; else goto _L3
_L3:
        if (l() || !b(panelfeaturestate, keyevent)) goto _L6; else goto _L5
_L5:
        boolean flag = o.g();
_L8:
        if (flag)
        {
            keyevent = (AudioManager)a.getSystemService("audio");
            if (keyevent != null)
            {
                keyevent.playSoundEffect(0);
            } else
            {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return flag;
_L4:
        flag = o.h();
        continue; /* Loop/switch isn't completed */
_L2:
        if (panelfeaturestate.o || panelfeaturestate.n)
        {
            flag = panelfeaturestate.o;
            a(panelfeaturestate, true);
            continue; /* Loop/switch isn't completed */
        }
        if (panelfeaturestate.m)
        {
            if (panelfeaturestate.r)
            {
                panelfeaturestate.m = false;
                flag = b(panelfeaturestate, keyevent);
            } else
            {
                flag = true;
            }
            if (flag)
            {
                a(panelfeaturestate, keyevent);
                flag = flag1;
                continue; /* Loop/switch isn't completed */
            }
        }
_L6:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int f(int i1)
    {
        int k1 = 1;
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        if (l != null && (l.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            Object obj = (android.view.ViewGroup.MarginLayoutParams)l.getLayoutParams();
            if (l.isShown())
            {
                if (F == null)
                {
                    F = new Rect();
                    G = new Rect();
                }
                Rect rect = F;
                Rect rect1 = G;
                rect.set(0, i1, 0, 0);
                bl.a(t, rect, rect1);
                if (rect1.top == 0)
                {
                    j1 = i1;
                } else
                {
                    j1 = 0;
                }
                if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != j1)
                {
                    obj.topMargin = i1;
                    if (v == null)
                    {
                        v = new View(a);
                        v.setBackgroundColor(a.getResources().getColor(d.abc_input_method_navigation_guard));
                        t.addView(v, -1, new android.view.ViewGroup.LayoutParams(-1, i1));
                        j1 = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = v.getLayoutParams();
                        if (layoutparams.height != i1)
                        {
                            layoutparams.height = i1;
                            v.setLayoutParams(layoutparams);
                        }
                        j1 = 1;
                    }
                } else
                {
                    j1 = 0;
                }
                if (v == null)
                {
                    flag = false;
                }
                k1 = i1;
                if (!h)
                {
                    k1 = i1;
                    if (flag)
                    {
                        k1 = 0;
                    }
                }
                i1 = k1;
                k1 = j1;
                j1 = ((flag) ? 1 : 0);
            } else
            if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
            {
                obj.topMargin = 0;
                j1 = 0;
            } else
            {
                k1 = 0;
                j1 = 0;
            }
            if (k1 != 0)
            {
                l.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
        } else
        {
            j1 = 0;
        }
        if (v != null)
        {
            obj = v;
            if (j1 != 0)
            {
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                j1 = 8;
            }
            ((View) (obj)).setVisibility(j1);
        }
        return i1;
    }

    private void p()
    {
        Object obj;
        if (r)
        {
            break MISSING_BLOCK_LABEL_515;
        }
        obj = LayoutInflater.from(a);
        if (j) goto _L2; else goto _L1
_L1:
        if (!i) goto _L4; else goto _L3
_L3:
        t = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.a.i.abc_dialog_title_material, null);
        g = false;
        f = false;
_L6:
        if (t == null)
        {
            throw new IllegalArgumentException("AppCompat does not support the current theme features");
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (f)
        {
            obj = new TypedValue();
            a.getTheme().resolveAttribute(b.actionBarTheme, ((TypedValue) (obj)), true);
            if (((TypedValue) (obj)).resourceId != 0)
            {
                obj = new ContextThemeWrapper(a, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = a;
            }
            t = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.a.i.abc_screen_toolbar, null);
            o = (af)t.findViewById(g.decor_content_parent);
            o.setWindowCallback(m());
            if (g)
            {
                o.a(9);
            }
            if (w)
            {
                o.a(2);
            }
            if (x)
            {
                o.a(5);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (h)
        {
            t = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.a.i.abc_screen_simple_overlay_action_mode, null);
        } else
        {
            t = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.a.i.abc_screen_simple, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ViewCompat.setOnApplyWindowInsetsListener(t, new ad(this));
        } else
        {
            ((ah)t).setOnFitSystemWindowsListener(new ae(this));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (o == null)
        {
            u = (TextView)t.findViewById(g.title);
        }
        bl.b(t);
        Object obj2 = (ViewGroup)b.findViewById(0x1020002);
        Object obj1 = (ContentFrameLayout)t.findViewById(g.action_bar_activity_content);
        View view;
        for (; ((ViewGroup) (obj2)).getChildCount() > 0; ((ContentFrameLayout) (obj1)).addView(view))
        {
            view = ((ViewGroup) (obj2)).getChildAt(0);
            ((ViewGroup) (obj2)).removeViewAt(0);
        }

        b.setContentView(t);
        ((ViewGroup) (obj2)).setId(-1);
        ((ContentFrameLayout) (obj1)).setId(0x1020002);
        if (obj2 instanceof FrameLayout)
        {
            ((FrameLayout)obj2).setForeground(null);
        }
        obj2 = n();
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            b(((CharSequence) (obj2)));
        }
        a(((ContentFrameLayout) (obj1)));
        a(t);
        r = true;
        obj1 = a(0, false);
        if (!l() && (obj1 == null || ((PanelFeatureState) (obj1)).j == null))
        {
            d(8);
        }
    }

    private void q()
    {
        if (r)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            return;
        }
    }

    public a a(android.support.v7.c.b b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (k != null)
        {
            k.c();
        }
        b1 = new android.support.v7.app.ah(this, b1);
        android.support.v7.app.a a1 = a();
        if (a1 != null)
        {
            k = a1.a(b1);
            if (k != null && e != null)
            {
                e.onSupportActionModeStarted(k);
            }
        }
        if (k == null)
        {
            k = b(b1);
        }
        return k;
    }

    View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        if (c instanceof android.view.LayoutInflater.Factory)
        {
            view = ((android.view.LayoutInflater.Factory)c).onCreateView(s1, context, attributeset);
            if (view != null)
            {
                return view;
            }
        }
        return null;
    }

    public void a(int i1)
    {
        p();
        ViewGroup viewgroup = (ViewGroup)t.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(a).inflate(i1, viewgroup);
        c.onContentChanged();
    }

    public void a(Configuration configuration)
    {
        if (f && r)
        {
            android.support.v7.app.a a1 = a();
            if (a1 != null)
            {
                a1.a(configuration);
            }
        }
    }

    public void a(Bundle bundle)
    {
label0:
        {
            super.a(bundle);
            s = (ViewGroup)b.getDecorView();
            if ((c instanceof Activity) && NavUtils.getParentActivityName((Activity)c) != null)
            {
                bundle = j();
                if (bundle != null)
                {
                    break label0;
                }
                E = true;
            }
            return;
        }
        bundle.h(true);
    }

    public void a(i i1)
    {
        a(i1, true);
    }

    public void a(Toolbar toolbar)
    {
        if (!(c instanceof Activity))
        {
            return;
        }
        if (a() instanceof android.support.v7.internal.a.i)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            toolbar = new android.support.v7.internal.a.b(toolbar, ((Activity)a).getTitle(), d);
            a(((android.support.v7.app.a) (toolbar)));
            b.setCallback(toolbar.f());
            toolbar.d();
            return;
        }
    }

    public void a(View view)
    {
        p();
        ViewGroup viewgroup = (ViewGroup)t.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        c.onContentChanged();
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        p();
        ViewGroup viewgroup = (ViewGroup)t.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        c.onContentChanged();
    }

    void a(ViewGroup viewgroup)
    {
    }

    boolean a(int i1, KeyEvent keyevent)
    {
        android.support.v7.app.a a1 = a();
        if (a1 == null || !a1.a(i1, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (A == null || !a(A, keyevent.getKeyCode(), keyevent, 1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (A != null)
        {
            A.n = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (A != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = a(0, true);
        b(panelfeaturestate, keyevent);
        flag = a(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
        panelfeaturestate.m = false;
        if (flag) goto _L1; else goto _L4
_L4:
        return false;
    }

    boolean a(int i1, Menu menu)
    {
        if (i1 == 8)
        {
            menu = a();
            if (menu != null)
            {
                menu.j(false);
            }
            return true;
        }
        if (i1 == 0)
        {
            menu = a(i1, true);
            if (((PanelFeatureState) (menu)).o)
            {
                a(((PanelFeatureState) (menu)), false);
            }
        }
        return false;
    }

    public boolean a(i i1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = m();
        if (callback != null && !l())
        {
            i1 = a(((Menu) (i1.p())));
            if (i1 != null)
            {
                return callback.onMenuItemSelected(((PanelFeatureState) (i1)).a, menuitem);
            }
        }
        return false;
    }

    boolean a(KeyEvent keyevent)
    {
        int i1 = keyevent.getKeyCode();
        boolean flag;
        if (keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return c(i1, keyevent);
        } else
        {
            return b(i1, keyevent);
        }
    }

    a b(android.support.v7.c.b b1)
    {
        if (k != null)
        {
            k.c();
        }
        android.support.v7.app.ah ah1 = new android.support.v7.app.ah(this, b1);
        Object obj;
        Object obj1;
        android.content.res.Resources.Theme theme;
        int i1;
        boolean flag;
        if (e != null && !l())
        {
            try
            {
                obj = e.onWindowStartingSupportActionMode(ah1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
            }
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        k = ((a) (obj));
_L4:
        if (k != null && e != null)
        {
            e.onSupportActionModeStarted(k);
        }
        return k;
_L2:
        if (l == null)
        {
            if (i)
            {
                obj1 = new TypedValue();
                obj = a.getTheme();
                ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.actionBarTheme, ((TypedValue) (obj1)), true);
                if (((TypedValue) (obj1)).resourceId != 0)
                {
                    theme = a.getResources().newTheme();
                    theme.setTo(((android.content.res.Resources.Theme) (obj)));
                    theme.applyStyle(((TypedValue) (obj1)).resourceId, true);
                    obj = new ContextThemeWrapper(a, 0);
                    ((Context) (obj)).getTheme().setTo(theme);
                } else
                {
                    obj = a;
                }
                l = new ActionBarContextView(((Context) (obj)));
                m = new PopupWindow(((Context) (obj)), null, b.actionModePopupWindowStyle);
                m.setContentView(l);
                m.setWidth(-1);
                ((Context) (obj)).getTheme().resolveAttribute(b.actionBarSize, ((TypedValue) (obj1)), true);
                i1 = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj1)).data, ((Context) (obj)).getResources().getDisplayMetrics());
                l.setContentHeight(i1);
                m.setHeight(-2);
                n = new android.support.v7.app.af(this);
            } else
            {
                obj = (ViewStubCompat)t.findViewById(g.action_mode_bar_stub);
                if (obj != null)
                {
                    ((ViewStubCompat) (obj)).setLayoutInflater(LayoutInflater.from(k()));
                    l = (ActionBarContextView)((ViewStubCompat) (obj)).a();
                }
            }
        }
        if (l != null)
        {
            l.c();
            obj = l.getContext();
            obj1 = l;
            if (m == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new android.support.v7.internal.view.b(((Context) (obj)), ((ActionBarContextView) (obj1)), ah1, flag);
            if (b1.a(((a) (obj)), ((a) (obj)).b()))
            {
                ((a) (obj)).d();
                l.a(((a) (obj)));
                l.setVisibility(0);
                k = ((a) (obj));
                if (m != null)
                {
                    b.getDecorView().post(n);
                }
                l.sendAccessibilityEvent(32);
                if (l.getParent() != null)
                {
                    ViewCompat.requestApplyInsets((View)l.getParent());
                }
            } else
            {
                k = null;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View b(View view, String s1, Context context, AttributeSet attributeset)
    {
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (H == null)
        {
            H = new android.support.v7.internal.a.a();
        }
        if (flag && r && view != null && view.getId() != 0x1020002 && !ViewCompat.isAttachedToWindow(view))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return H.a(view, s1, context, attributeset, flag1, flag, true);
    }

    public void b(Bundle bundle)
    {
        p();
    }

    public void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        p();
        ((ViewGroup)t.findViewById(0x1020002)).addView(view, layoutparams);
        c.onContentChanged();
    }

    void b(CharSequence charsequence)
    {
        if (o != null)
        {
            o.setWindowTitle(charsequence);
        } else
        {
            if (j() != null)
            {
                j().a(charsequence);
                return;
            }
            if (u != null)
            {
                u.setText(charsequence);
                return;
            }
        }
    }

    public boolean b(int i1)
    {
        switch (i1)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return b.requestFeature(i1);

        case 8: // '\b'
            q();
            f = true;
            return true;

        case 9: // '\t'
            q();
            g = true;
            return true;

        case 10: // '\n'
            q();
            h = true;
            return true;

        case 2: // '\002'
            q();
            w = true;
            return true;

        case 5: // '\005'
            q();
            x = true;
            return true;

        case 1: // '\001'
            q();
            j = true;
            return true;
        }
    }

    boolean b(int i1, KeyEvent keyevent)
    {
        i1;
        JVM INSTR lookupswitch 2: default 28
    //                   4: 41
    //                   82: 30;
           goto _L1 _L2 _L3
_L1:
        return false;
_L3:
        if (e(0, keyevent))
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        keyevent = a(0, false);
        if (keyevent != null && ((PanelFeatureState) (keyevent)).o)
        {
            a(keyevent, true);
            return true;
        }
        if (o())
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    boolean b(int i1, Menu menu)
    {
        if (i1 == 8)
        {
            menu = a();
            if (menu != null)
            {
                menu.j(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void c()
    {
        android.support.v7.app.a a1 = a();
        if (a1 != null)
        {
            a1.i(false);
        }
    }

    boolean c(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        i1;
        JVM INSTR tableswitch 82 82: default 20
    //                   82 37;
           goto _L1 _L2
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = a(i1, keyevent);
        }
        return flag;
_L2:
        if (d(0, keyevent))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void d()
    {
        android.support.v7.app.a a1 = a();
        if (a1 != null)
        {
            a1.i(true);
        }
    }

    public void e()
    {
        android.support.v7.app.a a1 = a();
        if (a1 != null && a1.d())
        {
            return;
        } else
        {
            d(0);
            return;
        }
    }

    public void h()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a);
        if (layoutinflater.getFactory() == null)
        {
            LayoutInflaterCompat.setFactory(layoutinflater, this);
            return;
        } else
        {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
            return;
        }
    }

    public android.support.v7.app.a i()
    {
        android.support.v7.internal.a.i i1;
        p();
        i1 = null;
        if (!(c instanceof Activity)) goto _L2; else goto _L1
_L1:
        i1 = new android.support.v7.internal.a.i((Activity)c, g);
_L4:
        if (i1 != null)
        {
            i1.h(E);
        }
        return i1;
_L2:
        if (c instanceof Dialog)
        {
            i1 = new android.support.v7.internal.a.i((Dialog)c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean o()
    {
        if (k != null)
        {
            k.c();
        } else
        {
            android.support.v7.app.a a1 = a();
            if (a1 == null || !a1.e())
            {
                return false;
            }
        }
        return true;
    }

    public final View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
    {
        View view1 = a(view, s1, context, attributeset);
        if (view1 != null)
        {
            return view1;
        } else
        {
            return b(view, s1, context, attributeset);
        }
    }

    private class PanelFeatureState
    {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        i j;
        android.support.v7.internal.view.menu.g k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        Bundle s;

        z a(y y1)
        {
            if (j == null)
            {
                return null;
            }
            if (k == null)
            {
                k = new android.support.v7.internal.view.menu.g(l, android.support.v7.a.i.abc_list_menu_item_layout);
                k.a(y1);
                j.a(k);
            }
            return k.a(g);
        }

        void a(Context context)
        {
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(b.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
            theme.resolveAttribute(b.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(k.Theme_AppCompat_CompactMenu, true);
            }
            context = new ContextThemeWrapper(context, 0);
            context.getTheme().setTo(theme);
            l = context;
            context = context.obtainStyledAttributes(l.Theme);
            b = context.getResourceId(l.Theme_panelBackground, 0);
            f = context.getResourceId(l.Theme_android_windowAnimationStyle, 0);
            context.recycle();
        }

        void a(i i1)
        {
            if (i1 != j)
            {
                if (j != null)
                {
                    j.b(k);
                }
                j = i1;
                if (i1 != null && k != null)
                {
                    i1.a(k);
                    return;
                }
            }
        }

        public boolean a()
        {
            boolean flag1 = true;
            boolean flag;
            if (h == null)
            {
                flag = false;
            } else
            {
                flag = flag1;
                if (i == null)
                {
                    flag = flag1;
                    if (k.a().getCount() <= 0)
                    {
                        return false;
                    }
                }
            }
            return flag;
        }

        PanelFeatureState(int i1)
        {
            a = i1;
            q = false;
        }
    }

}
