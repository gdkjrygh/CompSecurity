// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.a1g;

// Referenced classes of package com.whatsapp.util:
//            z

final class b3
    implements z
{

    b3()
    {
    }

    public Drawable a(Drawable drawable, Context context)
    {
        drawable.setBounds(0, 0, (int)a1g.a().b(drawable.getIntrinsicWidth()), (int)a1g.a().b(drawable.getIntrinsicWidth()));
        return drawable;
    }
}
