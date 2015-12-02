// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.MotionEvent;

// Referenced classes of package com.whatsapp:
//            GalleryView, TouchImageView

class a1s extends android.view.GestureDetector.SimpleOnGestureListener
{

    final GalleryView a;

    a1s(GalleryView galleryview)
    {
        a = galleryview;
        super();
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        f1 = Math.abs(motionevent.getY() - motionevent1.getY());
        if (f1 > 250F)
        {
            return false;
        }
        if (motionevent.getX() - motionevent1.getX() <= 120F) goto _L2; else goto _L1
_L1:
        f1 = Math.abs(f);
        if (f1 <= 200F) goto _L2; else goto _L3
_L3:
        int i = GalleryView.a(a);
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        boolean flag = ((TouchImageView)a.getChildAt(GalleryView.b(a))).q;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        int j;
        i = GalleryView.b(a);
        j = a.getChildCount();
        if (i >= j - 1)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        a.a(GalleryView.b(a) + 1);
        return true;
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
_L5:
        return false;
_L2:
        if (motionevent1.getX() - motionevent.getX() <= 120F) goto _L5; else goto _L4
_L4:
        f = Math.abs(f);
        if (f <= 200F) goto _L5; else goto _L6
_L6:
        i = GalleryView.a(a);
        if (i == 1) goto _L5; else goto _L7
_L7:
        flag = ((TouchImageView)a.getChildAt(GalleryView.b(a))).q;
        if (flag) goto _L5; else goto _L8
_L8:
        i = GalleryView.b(a);
        if (i <= 0) goto _L5; else goto _L9
_L9:
        a.a(GalleryView.b(a) - 1);
        return true;
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        throw motionevent;
    }
}
