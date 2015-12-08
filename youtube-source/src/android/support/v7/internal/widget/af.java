// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

final class af
    implements Runnable
{

    final ListPopupWindow a;

    private af(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    af(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void run()
    {
        a.e();
    }
}
