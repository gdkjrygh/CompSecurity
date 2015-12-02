// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;

public class ProgressView extends LinearLayout
{

    private static final String a[] = {
        "", ".", "..", "..."
    };
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private Runnable h;
    ImageView mImageView;
    TextView mTextDots;
    TextView mTextMessage;

    public ProgressView(Context context)
    {
        this(context, null);
    }

    public ProgressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProgressView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        f = false;
        g = 0;
    }

    static boolean a(ProgressView progressview)
    {
        return progressview.f;
    }

    static int b(ProgressView progressview)
    {
        int j = progressview.g;
        progressview.g = j + 1;
        return j;
    }

    static int c(ProgressView progressview)
    {
        return progressview.g;
    }

    static int d(ProgressView progressview)
    {
        progressview.g = 0;
        return 0;
    }

    static String[] i()
    {
        return a;
    }

    public final void a()
    {
        b = 0x7f0201b1;
    }

    public final void b()
    {
        d = 0x7f070400;
    }

    public final void c()
    {
        c = 0x7f0201b1;
    }

    public final void d()
    {
        e = 0x7f070401;
    }

    public final void e()
    {
        mTextDots.setVisibility(0);
        mTextMessage.setVisibility(0);
        mImageView.setVisibility(0);
        f = true;
        mImageView.setImageResource(b);
        mTextMessage.setText(getResources().getString(d));
        h = new Runnable() {

            final ProgressView a;

            public final void run()
            {
                if (ProgressView.a(a))
                {
                    a.mTextDots.setText(ProgressView.i()[ProgressView.b(a)]);
                    if (ProgressView.c(a) == ProgressView.i().length)
                    {
                        ProgressView.d(a);
                    }
                    a.postDelayed(this, 250L);
                }
            }

            
            {
                a = ProgressView.this;
                super();
            }
        };
        postDelayed(h, 250L);
    }

    public final void f()
    {
        h();
        mTextDots.setVisibility(8);
        mImageView.setImageResource(c);
        mTextMessage.setText(getResources().getString(e));
    }

    public final void g()
    {
        h();
        mTextDots.setVisibility(8);
        mImageView.setVisibility(8);
        mTextMessage.setVisibility(8);
    }

    public final void h()
    {
        f = false;
        if (h != null && getHandler() != null)
        {
            getHandler().removeCallbacks(h);
        }
    }

    protected void onDetachedFromWindow()
    {
        h();
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }

}
