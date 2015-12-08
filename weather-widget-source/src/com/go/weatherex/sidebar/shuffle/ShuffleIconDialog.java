// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            StarView, ShuffleButton

public class ShuffleIconDialog extends LinearLayout
{

    private ImageView A;
    private ImageView B;
    private FrameLayout C;
    private NativeContentAdView D;
    private NativeAppInstallAdView E;
    private ImageView a;
    private ImageView b;
    private TextView c;
    private StarView d;
    private TextView e;
    private ShuffleButton f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private FrameLayout j;
    private FrameLayout k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private StarView o;
    private TextView p;
    private ShuffleButton q;
    private ImageView r;
    private ImageView s;
    private FrameLayout t;
    private ImageView u;
    private ImageView v;
    private TextView w;
    private StarView x;
    private TextView y;
    private ShuffleButton z;

    public ShuffleIconDialog(Context context)
    {
        super(context);
    }

    public ShuffleIconDialog(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ImageView a()
    {
        return a;
    }

    public ImageView b()
    {
        return b;
    }

    public TextView c()
    {
        return c;
    }

    public StarView d()
    {
        return d;
    }

    public Button e()
    {
        return f;
    }

    public TextView f()
    {
        return e;
    }

    public ImageView g()
    {
        return g;
    }

    public FrameLayout h()
    {
        return k;
    }

    public FrameLayout i()
    {
        return j;
    }

    public ImageView j()
    {
        return u;
    }

    public ImageView k()
    {
        return v;
    }

    public TextView l()
    {
        return w;
    }

    public StarView m()
    {
        return x;
    }

    public Button n()
    {
        return z;
    }

    public TextView o()
    {
        return y;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (ImageView)findViewById(0x7f090515);
        b = (ImageView)findViewById(0x7f09051a);
        c = (TextView)findViewById(0x7f090202);
        d = (StarView)findViewById(0x7f09051b);
        e = (TextView)findViewById(0x7f09051d);
        f = (ShuffleButton)findViewById(0x7f09051e);
        g = (ImageView)findViewById(0x7f09051c);
        h = (ImageView)findViewById(0x7f090518);
        i = (ImageView)findViewById(0x7f090519);
        j = (FrameLayout)findViewById(0x7f090517);
        k = (FrameLayout)findViewById(0x7f090514);
        D = (NativeContentAdView)findViewById(0x7f09051f);
        u = (ImageView)findViewById(0x7f090520);
        v = (ImageView)findViewById(0x7f090524);
        w = (TextView)findViewById(0x7f090525);
        x = (StarView)findViewById(0x7f090526);
        y = (TextView)findViewById(0x7f090528);
        z = (ShuffleButton)findViewById(0x7f090529);
        A = (ImageView)findViewById(0x7f090527);
        B = (ImageView)findViewById(0x7f090523);
        C = (FrameLayout)findViewById(0x7f090522);
        E = (NativeAppInstallAdView)findViewById(0x7f09052a);
        l = (ImageView)findViewById(0x7f09052b);
        m = (ImageView)findViewById(0x7f09052f);
        n = (TextView)findViewById(0x7f090530);
        o = (StarView)findViewById(0x7f090531);
        p = (TextView)findViewById(0x7f090533);
        q = (ShuffleButton)findViewById(0x7f090534);
        r = (ImageView)findViewById(0x7f090532);
        s = (ImageView)findViewById(0x7f09052e);
        t = (FrameLayout)findViewById(0x7f09052d);
    }

    public FrameLayout p()
    {
        return C;
    }

    public NativeContentAdView q()
    {
        return D;
    }

    public ImageView r()
    {
        return l;
    }

    public ImageView s()
    {
        return m;
    }

    public TextView t()
    {
        return n;
    }

    public StarView u()
    {
        return o;
    }

    public Button v()
    {
        return q;
    }

    public TextView w()
    {
        return p;
    }

    public FrameLayout x()
    {
        return t;
    }

    public NativeAppInstallAdView y()
    {
        return E;
    }
}
