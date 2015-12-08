// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            o, j, l, d, 
//            m, c

public class KPNetworkImageView extends ImageView
{

    private String a;
    private int b;
    private int c;
    private d d;
    private j e;
    private boolean f;
    private boolean g;
    private boolean h;
    private o i;

    public KPNetworkImageView(Context context)
    {
        this(context, null);
    }

    public KPNetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public KPNetworkImageView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        h = true;
    }

    static int a(KPNetworkImageView kpnetworkimageview)
    {
        return kpnetworkimageview.c;
    }

    private void a()
    {
        if (b != 0)
        {
            setImageResource(b);
        }
    }

    private void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            boolean flag = false;
            if (i != null)
            {
                flag = i.a(bitmap);
            }
            if (!flag)
            {
                setImageBitmap(bitmap);
            }
        } else
        if (b != 0)
        {
            setImageResource(b);
            return;
        }
    }

    static void a(KPNetworkImageView kpnetworkimageview, Bitmap bitmap)
    {
        kpnetworkimageview.a(bitmap);
    }

    private void b(boolean flag)
    {
        int k;
        int i1;
        k = getWidth();
        i1 = getHeight();
        boolean flag1;
        if (getLayoutParams() != null && getLayoutParams().height == -2 && getLayoutParams().width == -2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (k != 0 || i1 != 0 || flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (TextUtils.isEmpty(a) || d == null || Uri.parse(a).getHost() == null)
        {
            if (e != null)
            {
                e.a();
                e = null;
            }
            a();
            return;
        }
        if (e == null || e.c() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (e.c().equals(a))
        {
            continue; /* Loop/switch isn't completed */
        }
        e.a();
        a();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        j j1;
        if (h)
        {
            j1 = d.a(a, new l(this), k, i1, f, g);
        } else
        {
            j1 = d.a(a, new m(this, flag), f, g);
        }
        e = j1;
        return;
    }

    public void a(int k)
    {
        b = k;
    }

    public void a(o o1)
    {
        i = o1;
    }

    public void a(String s)
    {
        a(s, com.jiubang.playsdk.imageload.c.a().b(), true, true);
    }

    public void a(String s, d d1, boolean flag, boolean flag1)
    {
        a = s;
        d = d1;
        f = flag;
        g = flag1;
        b(false);
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    protected void onDetachedFromWindow()
    {
        if (e != null)
        {
            e.a();
            setImageBitmap(null);
            e = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int k, int i1, int j1, int k1)
    {
        super.onLayout(flag, k, i1, j1, k1);
        b(true);
    }
}
