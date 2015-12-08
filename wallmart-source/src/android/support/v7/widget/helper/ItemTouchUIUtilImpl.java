// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchUIUtil

class ItemTouchUIUtilImpl
{
    static class Gingerbread
        implements ItemTouchUIUtil
    {

        private void draw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1)
        {
            canvas.save();
            canvas.translate(f, f1);
            recyclerview.drawChild(canvas, view, 0L);
            canvas.restore();
        }

        public void clearView(View view)
        {
            view.setVisibility(0);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
        {
            if (i != 2)
            {
                draw(canvas, recyclerview, view, f, f1);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
        {
            if (i == 2)
            {
                draw(canvas, recyclerview, view, f, f1);
            }
        }

        public void onSelected(View view)
        {
            view.setVisibility(4);
        }

        Gingerbread()
        {
        }
    }

    static class Honeycomb
        implements ItemTouchUIUtil
    {

        public void clearView(View view)
        {
            ViewCompat.setTranslationX(view, 0.0F);
            ViewCompat.setTranslationY(view, 0.0F);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
        {
            ViewCompat.setTranslationX(view, f);
            ViewCompat.setTranslationY(view, f1);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
        {
        }

        public void onSelected(View view)
        {
        }

        Honeycomb()
        {
        }
    }

    static class Lollipop extends Honeycomb
    {

        private float findMaxElevation(RecyclerView recyclerview, View view)
        {
            int j = recyclerview.getChildCount();
            float f = 0.0F;
            int i = 0;
            while (i < j) 
            {
                View view1 = recyclerview.getChildAt(i);
                float f1;
                if (view1 == view)
                {
                    f1 = f;
                } else
                {
                    float f2 = ViewCompat.getElevation(view1);
                    f1 = f;
                    if (f2 > f)
                    {
                        f1 = f2;
                    }
                }
                i++;
                f = f1;
            }
            return f;
        }

        public void clearView(View view)
        {
            Object obj = view.getTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation);
            if (obj != null && (obj instanceof Float))
            {
                ViewCompat.setElevation(view, ((Float)obj).floatValue());
            }
            view.setTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation, null);
            super.clearView(view);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
        {
            if (flag && view.getTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation) == null)
            {
                float f2 = ViewCompat.getElevation(view);
                ViewCompat.setElevation(view, 1.0F + findMaxElevation(recyclerview, view));
                view.setTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation, Float.valueOf(f2));
            }
            super.onDraw(canvas, recyclerview, view, f, f1, i, flag);
        }

        Lollipop()
        {
        }
    }


    ItemTouchUIUtilImpl()
    {
    }
}
