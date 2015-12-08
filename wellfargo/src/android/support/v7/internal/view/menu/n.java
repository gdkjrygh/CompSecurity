// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;


// Referenced classes of package android.support.v7.internal.view.menu:
//            m, i

class n
    implements android.support.v4.view.ActionProvider.VisibilityListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        m.a(a).a(a);
    }
}
