// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.apps.youtube.core.utils.DeviceOrientationHelper;
import com.google.android.apps.youtube.core.utils.j;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            a, z, x, y

public abstract class w
    implements j
{

    protected final Context a;
    protected final a b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    private final z f;
    private final DeviceOrientationHelper g;
    private final boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;

    public w(Context context, a a1, z z1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null");
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1, "activityProxy cannot be null");
        f = (z)com.google.android.apps.youtube.common.fromguava.c.a(z1, "listener cannot be null");
        l = a1.c();
        m = a1.c();
        g = new DeviceOrientationHelper(context, a1.e(), this);
        i = context.getResources().getConfiguration().orientation;
        int i1 = context.getPackageManager().getActivityInfo(a1.b(), 0).configChanges;
        boolean flag;
        boolean flag1;
        if ((i1 & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L1:
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        h = flag1;
        n = true;
        e = true;
        o = false;
        d = false;
        j = true;
        return;
        context;
        flag = false;
          goto _L1
    }

    public static w a(Context context, a a1, z z1, PlayerOverlaysLayout playeroverlayslayout)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return new x(context, a1, z1, playeroverlayslayout);
        } else
        {
            return new y(context, a1, z1);
        }
    }

    private void b(int i1)
    {
        boolean flag;
        if (i1 == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b.c() != m)
        {
            l = b.c();
        }
        if (flag)
        {
            i1 = l;
        }
        m = i1;
        b.a(m);
    }

    private boolean j()
    {
        return m != l;
    }

    public void a()
    {
        g.disable();
        j = false;
    }

    public void a(int i1)
    {
        boolean flag1 = false;
        if ((i1 & 4) != 0 && (i1 & 1) == 0)
        {
            throw new IllegalArgumentException("Can not set FULLSCREEN_FLAG_FULLSCREEN_WHEN_DEVICE_LANDSCAPE without setting FULLSCREEN_FLAG_CONTROL_ORIENTATION");
        }
        boolean flag2 = o;
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if ((i1 & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        flag = flag1;
        if ((i1 & 8) != 0)
        {
            flag = true;
        }
        d = flag;
        if (o)
        {
            g.enable();
        } else
        if (flag2 && i == 1)
        {
            g.disable();
            return;
        }
    }

    public final void a(Configuration configuration)
    {
        boolean flag = true;
        if (configuration.orientation == i) goto _L2; else goto _L1
_L1:
        i = configuration.orientation;
        if (configuration.orientation != 1)
        {
            flag = false;
        }
        if (!c || !n || !flag) goto _L4; else goto _L3
_L3:
        f.a(false);
_L6:
        p = false;
_L2:
        return;
_L4:
        if (e && p && !flag)
        {
            h();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Bundle bundle)
    {
        k = true;
        a(bundle.getInt("controlFlags"));
        l = bundle.getInt("defaultRequestedOrientation");
        if (bundle.getBoolean("isFullscreen"))
        {
            f.a(true);
        }
    }

    public final void a(boolean flag)
    {
        c = flag;
        if (flag)
        {
            boolean flag2;
            if (n)
            {
                boolean flag1;
                if (a.getResources().getConfiguration().orientation != 2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                b(6);
                flag2 = flag1;
                if (!g.a())
                {
                    g.enable();
                    flag2 = flag1;
                }
            } else
            {
                flag2 = false;
            }
            if (e)
            {
                if (flag2)
                {
                    p = true;
                } else
                {
                    p = false;
                    h();
                }
            }
            if (!d && (!flag2 || !h))
            {
                f.b(true);
            }
        } else
        {
            p = false;
            if (n)
            {
                if (!o)
                {
                    g.disable();
                }
                if (j())
                {
                    b(l);
                }
            }
            if (e)
            {
                i();
            }
            if (!d)
            {
                f.b(false);
                return;
            }
        }
    }

    public final void b()
    {
        if (c && !d)
        {
            f.b(true);
        }
    }

    public final void b(boolean flag)
    {
        if (flag && o && !c && !k)
        {
            f.a(true);
        }
    }

    public final void c(boolean flag)
    {
        k = false;
        if (j && n)
        {
            if (flag && o && !c)
            {
                f.a(true);
            } else
            if (!flag && j())
            {
                if (h)
                {
                    f.a(false);
                }
                b(l);
                return;
            }
        }
    }

    public final Bundle d()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFullscreen", c);
        bundle.putInt("defaultRequestedOrientation", l);
        bundle.putInt("controlFlags", e());
        return bundle;
    }

    public abstract void d(boolean flag);

    public final int e()
    {
        byte byte2 = 0;
        boolean flag;
        byte byte0;
        byte byte1;
        if (n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (o)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        if (d)
        {
            byte2 = 8;
        }
        return byte1 | (byte0 | flag) | byte2;
    }

    public abstract void f();

    public final void f_()
    {
        if (j && c && e)
        {
            f.a();
        }
    }

    public abstract void g();

    abstract void h();

    abstract void i();
}
