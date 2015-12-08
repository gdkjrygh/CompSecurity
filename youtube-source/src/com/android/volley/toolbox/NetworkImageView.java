// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.android.volley.toolbox:
//            m, r, g

public class NetworkImageView extends ImageView
{

    private String a;
    private int b;
    private int c;
    private g d;
    private m e;

    public NetworkImageView(Context context)
    {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static int a(NetworkImageView networkimageview)
    {
        return networkimageview.c;
    }

    private void a(boolean flag)
    {
        int i = getWidth();
        int j = getHeight();
        boolean flag1;
        if (getLayoutParams() != null && getLayoutParams().height == -2 && getLayoutParams().width == -2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0 || j != 0 || flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (TextUtils.isEmpty(a))
        {
            if (e != null)
            {
                e.a();
                e = null;
            }
            setImageBitmap(null);
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
        setImageBitmap(null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        e = d.a(a, new r(this, flag));
        return;
    }

    static int b(NetworkImageView networkimageview)
    {
        return networkimageview.b;
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

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        a(true);
    }

    public void setDefaultImageResId(int i)
    {
        b = i;
    }

    public void setErrorImageResId(int i)
    {
        c = i;
    }

    public void setImageUrl(String s, g g1)
    {
        a = s;
        d = g1;
        a(false);
    }
}
