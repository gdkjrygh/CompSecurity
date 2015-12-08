// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a
{

    private int A;
    private String B;
    private int C;
    private Context a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private CharSequence i;
    private CharSequence j;
    private PendingIntent k;
    private PendingIntent l;
    private CharSequence m;
    private Bitmap n;
    private Uri o;
    private int p;
    private long q[];
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private Intent z;

    a(Context context)
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        n = null;
        v = false;
        w = false;
        x = false;
        y = false;
        z = null;
        A = -1;
        B = null;
        a = context;
        y = false;
        a(io.wecloud.message.h.a.d(context));
    }

    public a(Context context, int i1, int j1, int k1, int l1, int i2)
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        n = null;
        v = false;
        w = false;
        x = false;
        y = false;
        z = null;
        A = -1;
        B = null;
        a = context;
        b = i1;
        c = j1;
        d = k1;
        e = l1;
        f = i2;
        p = -1;
        y = true;
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        l1 = options.outHeight;
        i2 = options.outWidth;
        k1 = 1;
_L3:
        if (i2 / k1 > i1) goto _L2; else goto _L1
_L1:
        if (l1 / k1 <= j1)
        {
            return k1;
        }
        break MISSING_BLOCK_LABEL_39;
_L2:
        k1++;
          goto _L3
        k1++;
          goto _L1
    }

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            u = u | i1;
            return;
        } else
        {
            u = u & ~i1;
            return;
        }
    }

    private RemoteViews b(int i1)
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), i1);
        SimpleDateFormat simpledateformat;
        if (g != 0)
        {
            remoteviews.setImageViewResource(c, g);
        } else
        {
            remoteviews.setViewVisibility(c, 8);
        }
        if (i != null)
        {
            remoteviews.setTextViewText(d, i);
        }
        if (j != null)
        {
            remoteviews.setTextViewText(e, j);
        }
        simpledateformat = new SimpleDateFormat("HH:mm");
        remoteviews.setTextViewText(f, simpledateformat.format(new Date()));
        if (n != null)
        {
            remoteviews.setImageViewBitmap(c, n);
        }
        return remoteviews;
    }

    Notification a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (y)
            {
                return d();
            } else
            {
                return c();
            }
        } else
        {
            return c();
        }
    }

    public a a(int i1)
    {
        g = i1;
        return this;
    }

    a a(PendingIntent pendingintent)
    {
        k = pendingintent;
        return this;
    }

    public a a(CharSequence charsequence)
    {
        i = charsequence;
        return this;
    }

    public a a(boolean flag)
    {
        a(16, flag);
        return this;
    }

    public void a(int i1, String s1)
    {
        C = i1;
        B = s1;
    }

    public a b(PendingIntent pendingintent)
    {
        l = pendingintent;
        return this;
    }

    public a b(CharSequence charsequence)
    {
        j = charsequence;
        return this;
    }

    public void b(boolean flag)
    {
        x = flag;
    }

    public boolean b()
    {
        return g > 0;
    }

    public Notification c()
    {
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        Object obj;
        Notification notification;
        notification = new Notification();
        obj = new android.app.Notification.Builder(a);
        ((android.app.Notification.Builder) (obj)).setContentTitle(i);
        ((android.app.Notification.Builder) (obj)).setContentText(j);
        ((android.app.Notification.Builder) (obj)).setWhen(System.currentTimeMillis());
        ((android.app.Notification.Builder) (obj)).setAutoCancel(true);
        notification.flags = 16;
        ((android.app.Notification.Builder) (obj)).setOngoing(false);
        ((android.app.Notification.Builder) (obj)).setContentIntent(k);
        ((android.app.Notification.Builder) (obj)).setDeleteIntent(l);
        if (g() == -101)
        {
            ((android.app.Notification.Builder) (obj)).setSmallIcon(g);
            if (Environment.getExternalStorageState().equals("mounted") && !TextUtils.isEmpty(B) && (new File(B)).exists())
            {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(B, options);
                new DisplayMetrics();
                int i1 = a.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
                options.inSampleSize = a(options, (i1 * 64) / 160, (i1 * 64) / 160);
                options.inJustDecodeBounds = false;
                ((android.app.Notification.Builder) (obj)).setLargeIcon(BitmapFactory.decodeFile(B, options));
            }
        } else
        if (g() > 0)
        {
            ((android.app.Notification.Builder) (obj)).setSmallIcon(g());
            ((android.app.Notification.Builder) (obj)).setLargeIcon(BitmapFactory.decodeResource(a.getResources(), g()));
        } else
        {
            ((android.app.Notification.Builder) (obj)).setSmallIcon(g);
        }
        ((android.app.Notification.Builder) (obj)).setTicker(m);
        if (v)
        {
            notification.audioStreamType = -1;
            notification.defaults = notification.defaults | 1;
        } else
        {
            notification.sound = null;
        }
        if (w)
        {
            notification.defaults = notification.defaults | 2;
        } else
        {
            notification.vibrate = null;
        }
        if (x)
        {
            notification.ledARGB = 0xff0000ff;
            notification.ledOnMS = 300;
            notification.ledOffMS = 300;
            notification.flags = notification.flags | 1;
            notification.defaults = notification.defaults | 4;
        }
        ((android.app.Notification.Builder) (obj)).setDefaults(notification.defaults);
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
        obj = ((android.app.Notification.Builder) (obj)).build();
        obj.flags = notification.flags;
_L6:
        return ((Notification) (obj));
_L4:
        obj = ((android.app.Notification.Builder) (obj)).getNotification();
        obj.flags = notification.flags;
        return ((Notification) (obj));
_L2:
        Notification notification1 = new Notification();
        notification1.when = System.currentTimeMillis();
        notification1.flags = 16;
        notification1.contentIntent = k;
        notification1.deleteIntent = l;
        if (g() == -101)
        {
            notification1.icon = g;
        } else
        if (g() > 0)
        {
            notification1.icon = g();
        } else
        {
            notification1.icon = g;
        }
        notification1.tickerText = m;
        if (v)
        {
            notification1.audioStreamType = -1;
            notification1.defaults = notification1.defaults | 1;
        } else
        {
            notification1.sound = null;
        }
        if (w)
        {
            notification1.defaults = notification1.defaults | 2;
        } else
        {
            notification1.vibrate = null;
        }
        obj = notification1;
        if (x)
        {
            notification1.ledARGB = 0xff0000ff;
            notification1.ledOnMS = 300;
            notification1.ledOffMS = 300;
            notification1.flags = notification1.flags | 1;
            notification1.defaults = notification1.defaults | 4;
            return notification1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public a c(CharSequence charsequence)
    {
        m = charsequence;
        return this;
    }

    public void c(boolean flag)
    {
        v = flag;
    }

    public Notification d()
    {
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        if (g() == -101)
        {
            notification.icon = g;
            if (Environment.getExternalStorageState().equals("mounted") && !TextUtils.isEmpty(B) && (new File(B)).exists())
            {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (BitmapFactory.decodeFile(B, options) != null)
                {
                    new DisplayMetrics();
                    int i1 = a.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
                    options.inSampleSize = a(options, (i1 * 64) / 160, (i1 * 64) / 160);
                    options.inJustDecodeBounds = false;
                    notification.largeIcon = BitmapFactory.decodeFile(B, options);
                }
            }
        } else
        if (g() > 0)
        {
            notification.icon = g();
            if (n != null)
            {
                notification.largeIcon = n;
            }
        } else
        {
            notification.icon = g;
            if (n != null)
            {
                notification.largeIcon = n;
            }
        }
        notification.contentView = b(b);
        notification.number = h;
        notification.contentIntent = k;
        notification.deleteIntent = l;
        notification.tickerText = m;
        notification.sound = o;
        notification.audioStreamType = p;
        notification.vibrate = q;
        notification.defaults = t;
        notification.flags = u;
        if (r != 0 && s != 0)
        {
            notification.flags = notification.flags | 1;
        }
        if ((t & 4) != 0)
        {
            notification.flags = notification.flags | 1;
        }
        if (w)
        {
            notification.defaults = notification.defaults | 2;
        } else
        {
            notification.vibrate = null;
        }
        if (v)
        {
            notification.audioStreamType = -1;
            notification.defaults = notification.defaults | 1;
        } else
        {
            notification.sound = null;
        }
        if (x)
        {
            notification.ledARGB = 0xff0000ff;
            notification.ledOnMS = 300;
            notification.ledOffMS = 300;
            notification.flags = notification.flags | 1;
            notification.defaults = notification.defaults | 4;
        }
        return notification;
    }

    public void d(boolean flag)
    {
        w = flag;
    }

    Intent e()
    {
        return z;
    }

    int f()
    {
        return A;
    }

    public int g()
    {
        return C;
    }
}
