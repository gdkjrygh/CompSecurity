// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.utils.Typefaces;
import com.google.android.youtube.r;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            ab

public class YouTubeTextView extends TextView
{

    private boolean a;
    private boolean b;

    public YouTubeTextView(Context context)
    {
        super(context);
        a(context, 0, 0, false);
    }

    public YouTubeTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, r.M);
        a(context, attributeset, typedarray);
        typedarray.recycle();
    }

    public YouTubeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, r.M, i, 0);
        a(context, attributeset, typedarray);
        typedarray.recycle();
    }

    private void a(Context context, int i, int j, boolean flag)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 29
    //                   1 58;
           goto _L1 _L2 _L3
_L1:
        L.c("Missing or invalid font preference on a RobotoTextView.");
_L2:
        Typefaces typefaces = Typefaces.ROBOTO_LIGHT;
_L5:
        context = typefaces.toTypeface(context);
        if (context != null)
        {
            setTypeface(context, j);
        }
        setAllCaps(flag);
        return;
_L3:
        typefaces = Typefaces.ROBOTO_REGULAR;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(Context context, AttributeSet attributeset, TypedArray typedarray)
    {
        a(context, typedarray.getInt(0, -1), attributeset.getAttributeIntValue("android", "textStyle", 0), typedarray.getBoolean(1, false));
        if (typedarray.getBoolean(2, false))
        {
            b = true;
            setMovementMethod(ab.a());
            return;
        } else
        {
            b = false;
            setMovementMethod(getDefaultMovementMethod());
            return;
        }
    }

    static void a(YouTubeTextView youtubetextview)
    {
        youtubetextview.a = true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (b)
        {
            a = false;
            super.onTouchEvent(motionevent);
            return a;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
