// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.wallpaper:
//            ImageViewTouchBase, o

public class WallPaperView extends ImageView
{

    private static final String z[];
    private o a;
    private boolean b;
    private Rect c;
    private Bitmap d;

    public WallPaperView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public void a()
    {
        b = false;
        setImageDrawable(null);
        if (d != null)
        {
            d.recycle();
        }
        d = null;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        boolean flag1;
        int i;
        int j;
        flag1 = true;
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        if (c != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        Log.i((new StringBuilder()).append(z[1]).append(i).append(z[2]).append(j).toString());
        c = new Rect(0, 0, i, j);
        flag = flag1;
        if (!ImageViewTouchBase.e) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        if (c.width() != i || c.height() != j)
        {
            c.set(0, 0, i, j);
            Log.i((new StringBuilder()).append(z[0]).append(i).append(z[3]).append(j).toString());
            flag = flag1;
        }
_L4:
        super.onDraw(canvas);
        if ((flag || b) && j > 0 && i > 0)
        {
            if (a != null)
            {
                a.a(i, j);
            }
            if (d != null)
            {
                b = false;
            }
        }
        return;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setDrawable(Drawable drawable)
    {
        b = true;
        d = ((BitmapDrawable)drawable).getBitmap();
        setImageBitmap(d);
        invalidate();
    }

    protected boolean setFrame(int i, int j, int k, int l)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            Matrix matrix = getImageMatrix();
            float f = Math.max((float)(k - i) / (float)drawable.getIntrinsicWidth(), (float)(l - j) / (float)drawable.getIntrinsicHeight());
            matrix.setScale(f, f, 0.0F, 0.0F);
            setImageMatrix(matrix);
        }
        return super.setFrame(i, j, k, l);
    }

    public void setOnSizeChangedListener(o o1)
    {
        a = o1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\031I?<6\034\f8&6\005K>*m";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\031I?<6\034\026";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "KP{";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "KP{";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 87;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 107;
          goto _L9
_L5:
        byte0 = 44;
          goto _L9
_L6:
        byte0 = 91;
          goto _L9
        byte0 = 78;
          goto _L9
    }
}
