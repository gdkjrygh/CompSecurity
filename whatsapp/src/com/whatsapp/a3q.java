// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.whatsapp:
//            ConversationRow

class a3q extends Drawable
{

    final ConversationRow a;

    a3q(ConversationRow conversationrow)
    {
        a = conversationrow;
        super();
    }

    public void draw(Canvas canvas)
    {
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isStateful()
    {
        return true;
    }

    protected boolean onLevelChange(int i)
    {
        return true;
    }

    protected boolean onStateChange(int ai[])
    {
        return true;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public boolean setState(int ai[])
    {
        invalidateSelf();
        return true;
    }
}
