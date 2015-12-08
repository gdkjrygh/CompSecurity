// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, b, a, ab

class c extends android.support.v7.internal.view.menu.c
{

    final ActionMenuPresenter a;

    private c(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    c(ActionMenuPresenter actionmenupresenter, a a1)
    {
        this(actionmenupresenter);
    }

    public ab a()
    {
        if (ActionMenuPresenter.h(a) != null)
        {
            return ActionMenuPresenter.h(a).c();
        } else
        {
            return null;
        }
    }
}
