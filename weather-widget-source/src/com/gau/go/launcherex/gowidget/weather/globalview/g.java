// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            f, h

public class g extends f
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener
{

    private boolean b;
    private h c;
    private TextView d;
    private ImageView e;
    private TextView f;
    private View g;
    private View h;
    private TextView i;
    private TextView j;
    private ImageView k;
    private ImageView l;
    private int m;

    public g(Activity activity)
    {
        super(activity);
        b = false;
        setContentView(0x7f03005c);
        activity = a.getResources().getDisplayMetrics();
        m = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        activity = getWindow().getAttributes();
        activity.width = m;
        activity.height = -2;
        d = (TextView)findViewById(0x7f090061);
        e = (ImageView)findViewById(0x7f09026a);
        f = (TextView)findViewById(0x7f090265);
        g = findViewById(0x7f090269);
        i = (TextView)findViewById(0x7f09026e);
        k = (ImageView)findViewById(0x7f09026d);
        h = findViewById(0x7f090268);
        j = (TextView)findViewById(0x7f09026c);
        l = (ImageView)findViewById(0x7f09026b);
        setOnDismissListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
    }

    private String e(int i1)
    {
        return a.getString(i1);
    }

    public void a()
    {
        a(17, 0, 0, m, -2);
    }

    public void a(int i1)
    {
        d.setText(e(i1));
    }

    public void a(Bitmap bitmap)
    {
        e.setImageBitmap(bitmap);
    }

    public void a(h h1)
    {
        c = h1;
    }

    public void b(int i1)
    {
        f.setText(e(i1));
    }

    public void b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            k.setVisibility(8);
        } else
        {
            k.setImageBitmap(bitmap);
            if (k.getVisibility() != 0)
            {
                k.setVisibility(0);
                return;
            }
        }
    }

    public void c(int i1)
    {
        i.setText(e(i1));
    }

    public void c(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            l.setVisibility(8);
        } else
        {
            l.setImageBitmap(bitmap);
            if (l.getVisibility() != 0)
            {
                l.setVisibility(0);
                return;
            }
        }
    }

    public void d(int i1)
    {
        j.setText(e(i1));
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            b = true;
            dismiss();
        } else
        if (view.equals(h))
        {
            b = false;
            dismiss();
            return;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (c != null)
        {
            c.a(b);
        }
    }
}
