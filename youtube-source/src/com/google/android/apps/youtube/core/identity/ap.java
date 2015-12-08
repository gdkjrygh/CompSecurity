// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.CheckedTextView;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.youtube.g;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            ao, UserProfile

final class ap
    implements b
{

    final CheckedTextView a;
    final UserProfile b;
    final ao c;

    ap(ao ao1, CheckedTextView checkedtextview, UserProfile userprofile)
    {
        c = ao1;
        a = checkedtextview;
        b = userprofile;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        if (a.getTag() == b)
        {
            int i = ao.a(c).getDimensionPixelSize(g.r);
            obj = Bitmap.createScaledBitmap(((Bitmap) (obj)), i, i, true);
            obj = new BitmapDrawable(ao.a(c), ((Bitmap) (obj)));
            a.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (obj)), null, null, null);
            c.notifyDataSetChanged();
        }
    }
}
