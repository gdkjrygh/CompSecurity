// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.hb;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a, f

public final class e
{

    final f a;
    int b;
    private int c;
    private int d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private int h;
    private boolean i;
    private boolean j;

    private static et a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof et)
            {
                drawable2 = ((et)drawable).a();
            }
        } else
        {
            drawable2 = null;
        }
        return new et(drawable2, drawable1);
    }

    private void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        int k = 1;
        b;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 55
    //                   3 230;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if ((a)e.get() != null)
        {
            drawable = a.a;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ImageView imageview = (ImageView)f.get();
        if (imageview == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        eb eb1;
        int i1;
        if (flag2)
        {
            k = 0;
        }
        if (k == 0 || !(imageview instanceof eb))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((eb)imageview).a();
        if (c != 0 && i1 == c) goto _L1; else goto _L5
_L5:
        flag = a(flag, false);
        if (flag)
        {
            drawable = a(imageview.getDrawable(), drawable);
        }
        imageview.setImageDrawable(drawable);
        if (imageview instanceof eb)
        {
            eb1 = (eb)imageview;
            android.net.Uri uri;
            if (flag2)
            {
                uri = a.a;
            } else
            {
                uri = null;
            }
            eb1.a(uri);
            if (k != 0)
            {
                k = c;
            } else
            {
                k = 0;
            }
            eb1.a(k);
        }
        if (flag)
        {
            ((et)drawable).a(250);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        TextView textview = (TextView)g.get();
        if (textview != null)
        {
            int l = h;
            flag = a(flag, false);
            Object obj;
            Drawable drawable1;
            Drawable drawable2;
            Drawable drawable3;
            if (hb.c())
            {
                obj = textview.getCompoundDrawablesRelative();
            } else
            {
                obj = textview.getCompoundDrawables();
            }
            drawable1 = obj[l];
            if (flag)
            {
                drawable = a(drawable1, drawable);
            }
            if (l == 0)
            {
                drawable1 = drawable;
            } else
            {
                drawable1 = obj[0];
            }
            if (l == 1)
            {
                drawable2 = drawable;
            } else
            {
                drawable2 = obj[1];
            }
            if (l == 2)
            {
                drawable3 = drawable;
            } else
            {
                drawable3 = obj[2];
            }
            if (l == 3)
            {
                obj = drawable;
            } else
            {
                obj = obj[3];
            }
            if (hb.c())
            {
                textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, ((Drawable) (obj)));
            } else
            {
                textview.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, ((Drawable) (obj)));
            }
            if (flag)
            {
                ((et)drawable).a(250);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private boolean a(boolean flag, boolean flag1)
    {
        return i && !flag1 && (!flag || j);
    }

    final void a(Context context, Bitmap bitmap, boolean flag)
    {
        fa.a(bitmap);
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap))), false, false, true);
    }

    final void a(Context context, boolean flag)
    {
        Drawable drawable = null;
        if (c != 0)
        {
            drawable = context.getResources().getDrawable(c);
        }
        a(drawable, false, false, false);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof e)
        {
            if (this == obj)
            {
                return true;
            }
            if (((e)obj).hashCode() == hashCode())
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return d;
    }
}
