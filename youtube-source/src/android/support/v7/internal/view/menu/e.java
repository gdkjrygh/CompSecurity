// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.a.c;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i, ActionMenuPresenter

final class e extends ImageButton
    implements i
{

    final ActionMenuPresenter a;

    public e(ActionMenuPresenter actionmenupresenter, Context context)
    {
        a = actionmenupresenter;
        super(context, null, c.g);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return false;
    }

    public final boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            a.b();
            return true;
        }
    }
}
