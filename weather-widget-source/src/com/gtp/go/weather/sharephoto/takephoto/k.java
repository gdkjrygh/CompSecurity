// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.gau.go.launcherex.gowidget.weather.globalview.f;
import com.gtp.a.a.b.c;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ab, l

public class k extends f
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private int b;
    private LinearLayout c;
    private int d;
    private LinearLayout e;
    private int f;
    private final PackageManager g;
    private final File h;

    public k(Activity activity)
    {
        super(activity);
        d = -100;
        f = -100;
        setCanceledOnTouchOutside(true);
        setContentView(0x7f0300fb);
        activity = a.getResources().getDisplayMetrics();
        b = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        g = a.getPackageManager();
        h = ab.a(a);
        if (h.exists())
        {
            h.delete();
        }
        c = (LinearLayout)findViewById(0x7f0904e8);
        e = (LinearLayout)findViewById(0x7f0904e9);
        e.getViewTreeObserver().addOnGlobalLayoutListener(this);
        b();
        c();
    }

    static Activity a(k k1)
    {
        return k1.a;
    }

    static PackageManager b(k k1)
    {
        return k1.g;
    }

    private void b()
    {
        Object obj = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        l l1;
        for (obj = g.queryIntentActivities(((Intent) (obj)), 1).iterator(); ((Iterator) (obj)).hasNext(); c.addView(l1.b()))
        {
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            com.gtp.a.a.b.c.a("PhotoAppsDialog", (new StringBuilder()).append("initGalleryList: ").append(resolveinfo.activityInfo.packageName).toString());
            l1 = new l(this, a);
            l1.d = 2;
            l1.a(resolveinfo);
        }

    }

    static Activity c(k k1)
    {
        return k1.a;
    }

    private void c()
    {
        Object obj = new Intent("android.media.action.IMAGE_CAPTURE");
        ((Intent) (obj)).putExtra("output", Uri.fromFile(h));
        l l1;
        for (obj = g.queryIntentActivities(((Intent) (obj)), 1).iterator(); ((Iterator) (obj)).hasNext(); e.addView(l1.b()))
        {
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            com.gtp.a.a.b.c.a("PhotoAppsDialog", (new StringBuilder()).append("initCameraList: ").append(resolveinfo.activityInfo.packageName).toString());
            l1 = new l(this, a);
            l1.d = 1;
            l1.a(resolveinfo);
        }

    }

    static Activity d(k k1)
    {
        return k1.a;
    }

    public void a()
    {
        a(17, 0, 0, b, -2);
    }

    public void dismiss()
    {
        super.dismiss();
        c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    public void onGlobalLayout()
    {
        if (c.getWidth() > 0 && d != c.getWidth() && c.getWidth() < b)
        {
            d = c.getWidth();
            ((android.widget.FrameLayout.LayoutParams)c.getLayoutParams()).gravity = 1;
            c.requestLayout();
        }
        if (e.getWidth() > 0 && f != e.getWidth() && e.getWidth() < b)
        {
            f = e.getWidth();
            ((android.widget.FrameLayout.LayoutParams)e.getLayoutParams()).gravity = 1;
            e.requestLayout();
        }
    }
}
