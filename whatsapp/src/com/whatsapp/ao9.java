// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
import java.util.Stack;

// Referenced classes of package com.whatsapp:
//            App, b8, ada, i7, 
//            og

public class ao9
{

    private b8 a;
    private i7 b;
    private final float c;
    private final int d;

    public ao9()
    {
        this(App.au.getResources().getDimensionPixelSize(0x7f0a0059), App.au.getResources().getDimensionPixelSize(0x7f0a0058));
    }

    public ao9(int i, float f)
    {
        b = null;
        a = new b8(null);
        d = i;
        c = f;
    }

    static b8 a(ao9 ao9_1)
    {
        return ao9_1.a;
    }

    static float b(ao9 ao9_1)
    {
        return ao9_1.c;
    }

    private void b(og og1, ImageView imageview)
    {
        synchronized (b8.a(a))
        {
            a.a(imageview);
        }
        imageview = new ada(og1, imageview);
        synchronized (b8.a(a))
        {
            b8.a(a).add(0, imageview);
            b8.a(a).notifyAll();
        }
        if (b == null)
        {
            b = new i7(this);
            b.setPriority(4);
            b.start();
        }
        return;
        og1;
        stack;
        JVM INSTR monitorexit ;
        throw og1;
        imageview;
        og1;
        JVM INSTR monitorexit ;
        throw imageview;
    }

    static int c(ao9 ao9_1)
    {
        return ao9_1.d;
    }

    public void a()
    {
        if (b != null)
        {
            b.interrupt();
            b = null;
        }
    }

    public void a(og og1, ImageView imageview)
    {
        Object obj = og1.b(d, c);
        if (obj == null)
        {
            imageview.setImageBitmap(og1.j());
        } else
        {
            boolean flag = ((String) (obj)).equals(imageview.getTag());
            imageview.setTag(obj);
            obj = (Bitmap)App.Q.get(obj);
            if (obj != null)
            {
                imageview.setImageBitmap(((Bitmap) (obj)));
                return;
            }
            if (!flag)
            {
                imageview.setImageBitmap(og1.j());
            }
            if (og1.C)
            {
                b(og1, imageview);
                return;
            }
        }
    }
}
