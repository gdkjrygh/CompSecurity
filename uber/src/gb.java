// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class gb extends fz
{

    public gb()
    {
    }

    public final void a()
    {
        hz.c = new ia() {

            final gb a;

            public final void a(Canvas canvas, RectF rectf, float f, Paint paint)
            {
                canvas.drawRoundRect(rectf, f, f, paint);
            }

            
            {
                a = gb.this;
                super();
            }
        };
    }
}
