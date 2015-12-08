// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


public class PopupMenuCompat
{

    static final PopupMenuImpl IMPL;

    private PopupMenuCompat()
    {
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(Object obj)
    {
        return IMPL.getDragToOpenListener(obj);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new KitKatPopupMenuImpl();
        } else
        {
            IMPL = new BasePopupMenuImpl();
        }
    }

    private class PopupMenuImpl
    {

        public abstract android.view.View.OnTouchListener getDragToOpenListener(Object obj);
    }


    private class KitKatPopupMenuImpl extends BasePopupMenuImpl
    {
        private class BasePopupMenuImpl
            implements PopupMenuImpl
        {

            public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
            {
                return null;
            }

            BasePopupMenuImpl()
            {
            }
        }


        public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
        {
            return PopupMenuCompatKitKat.getDragToOpenListener(obj);
        }

        KitKatPopupMenuImpl()
        {
        }
    }

}
