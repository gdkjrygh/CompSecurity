// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzki;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            zza

public static final class zzZl extends zza
{

    private WeakReference zzZl;

    private void zza(ImageView imageview, Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3;
        int j;
        if (!flag1 && !flag2)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3 || !(imageview instanceof zzki)) goto _L2; else goto _L1
_L1:
        j = ((zzki)imageview).zznr();
        if (zzZe == 0 || j != zzZe) goto _L2; else goto _L3
_L3:
        return;
_L2:
        flag = zzb(flag, flag1);
        if (zzZf && drawable != null)
        {
            drawable = drawable.getConstantState().newDrawable();
        }
        Object obj = drawable;
        if (flag)
        {
            obj = zza(imageview.getDrawable(), drawable);
        }
        imageview.setImageDrawable(((Drawable) (obj)));
        if (imageview instanceof zzki)
        {
            drawable = (zzki)imageview;
            int i;
            if (flag2)
            {
                imageview = zzZc.uri;
            } else
            {
                imageview = null;
            }
            drawable.zzi(imageview);
            if (flag3)
            {
                i = zzZe;
            } else
            {
                i = 0;
            }
            drawable.zzbo(i);
        }
        if (flag)
        {
            ((zzkg)obj).startTransition(250);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof nsition))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        Object obj1 = (nsition)obj;
        obj = (ImageView)zzZl.get();
        obj1 = (ImageView)((zzZl) (obj1)).zzZl.get();
        boolean flag;
        if (obj1 != null && obj != null && zzt.equal(obj1, obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public int hashCode()
    {
        return 0;
    }

    protected void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        ImageView imageview = (ImageView)zzZl.get();
        if (imageview != null)
        {
            zza(imageview, drawable, flag, flag1, flag2);
        }
    }

    public ate(ImageView imageview, int i)
    {
        super(null, i);
        com.google.android.gms.common.internal.zzb.zzq(imageview);
        zzZl = new WeakReference(imageview);
    }

    public zzZl(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        com.google.android.gms.common.internal.zzb.zzq(imageview);
        zzZl = new WeakReference(imageview);
    }
}
