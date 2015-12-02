// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.undobar;

import android.app.Activity;
import android.os.Parcelable;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.util.undobar:
//            UndoBarController, a, f

public class d
{

    private final Activity a;
    private Parcelable b;
    private long c;
    private a d;
    private f e;
    private CharSequence f;
    private int g;

    public d(Activity activity)
    {
        g = -1;
        a = activity;
    }

    public UndoBarController a()
    {
        return a(true);
    }

    public UndoBarController a(boolean flag)
    {
        boolean flag1 = UndoBarController.i;
        if (e == null && d == null)
        {
            d = UndoBarController.a;
        }
        if (d == null)
        {
            d = UndoBarController.r;
        }
        if (f == null)
        {
            f = "";
        }
        if (c > 0L)
        {
            d.e = c;
        }
        Object obj = a;
        CharSequence charsequence = f;
        f f1 = e;
        Parcelable parcelable = b;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = UndoBarController.a(((Activity) (obj)), charsequence, f1, parcelable, flag, d, g);
        if (flag1)
        {
            DialogToastActivity.g++;
        }
        return ((UndoBarController) (obj));
    }

    public d a(int i)
    {
        f = a.getText(i);
        return this;
    }

    public d a(Parcelable parcelable)
    {
        b = parcelable;
        return this;
    }

    public d a(f f1)
    {
        e = f1;
        return this;
    }
}
