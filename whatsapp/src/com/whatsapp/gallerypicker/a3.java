// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class a3
    implements android.view.View.OnTouchListener
{

    final ImagePreview a;
    final ImagePreview.ThumbImageView b;

    a3(ImagePreview.ThumbImageView thumbimageview, ImagePreview imagepreview)
    {
        b = thumbimageview;
        a = imagepreview;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        case 2: // '\002'
        default:
            return false;

        case 0: // '\0'
            ImagePreview.a(b.z, b);
            ImagePreview.a(b.z, ImagePreview.ThumbImageView.a(b));
            ImagePreview.e(b.z).setImageDrawable(b.getDrawable());
            ImagePreview.e(b.z).setMaxWidth(b.getWidth());
            ImagePreview.e(b.z).setMaxHeight(b.getHeight());
            ImagePreview.e(b.z).setLayoutParams(new android.widget.FrameLayout.LayoutParams(b.getWidth(), b.getHeight()));
            ImagePreview.a(b.z, motionevent.getY());
            ImagePreview.b(b.z, motionevent.getX());
            ImagePreview.j(b.z).invalidate();
            if (ImagePreview.i(b.z) >= 0)
            {
                view = ImagePreview.p(b.z).getChildAt(ImagePreview.i(b.z));
                if (view != ImagePreview.j(b.z))
                {
                    view.setSelected(false);
                }
            }
            ImagePreview.b(b.z).removeCallbacks(ImagePreview.w(b.z));
            ImagePreview.b(b.z).postDelayed(ImagePreview.w(b.z), 100L);
            ImagePreview.c(b.z).setBackgroundColor(0);
            ImagePreview.m(b.z).setTextColor(0);
            ImagePreview.a(b.z).setAlpha(0);
            ImagePreview.r(b.z).setVisibility(0);
            ImagePreview.x(b.z).getLocationOnScreen(ImagePreview.u(b.z));
            int i = ImagePreview.u(b.z)[0];
            int j = ImagePreview.u(b.z)[1];
            ImagePreview.j(b.z).getLocationOnScreen(ImagePreview.u(b.z));
            int k = ImagePreview.u(b.z)[0];
            int l = ImagePreview.u(b.z)[1];
            ImagePreview.x(b.z).setPadding(k - i, l - j, 0, 0);
            ImagePreview.c(b.z).setPadding(0, 0, 0, ImagePreview.r(b.z).getHeight() - ImagePreview.t(b.z).getHeight());
            ImagePreview.m(b.z).getLocationOnScreen(ImagePreview.u(b.z));
            return false;

        case 1: // '\001'
        case 3: // '\003'
            ImagePreview.b(b.z).removeCallbacks(ImagePreview.w(b.z));
            return false;
        }
    }
}
