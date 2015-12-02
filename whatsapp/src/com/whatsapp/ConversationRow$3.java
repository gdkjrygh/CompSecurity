// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            ConversationRow, a1g

class a extends View
{

    final ConversationRow a;
    private final Rect b = new Rect();

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (isSelected())
        {
            getDrawingRect(b);
            b.top = a.l.top - (int)(1.5F * a1g.a().g);
            b.bottom = a.l.bottom + Math.max(1, (int)(0.5F * a1g.a().g));
            canvas.drawRect(b, ConversationRow.b());
        }
    }

    (ConversationRow conversationrow, Context context)
    {
        a = conversationrow;
        super(context);
    }
}
