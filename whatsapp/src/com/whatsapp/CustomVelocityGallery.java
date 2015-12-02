// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

// Referenced classes of package com.whatsapp:
//            a93

public class CustomVelocityGallery extends Gallery
{

    private a93 a;

    public CustomVelocityGallery(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        float f2 = f;
        if (a != null)
        {
            f2 = a.a(f);
        }
        return super.onFling(motionevent, motionevent1, f2, f1);
    }

    public void setVelocityTransformer(a93 a93_1)
    {
        a = a93_1;
    }
}
