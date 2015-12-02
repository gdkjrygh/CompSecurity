// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


public class ViewPropertyAnimatorCompat
{

    static final ViewPropertyAnimatorCompatImpl IMPL;

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            IMPL = new KitKatViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 18)
        {
            IMPL = new JBMr2ViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 16)
        {
            IMPL = new JBViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 14)
        {
            IMPL = new ICSViewPropertyAnimatorCompatImpl();
        } else
        {
            IMPL = new BaseViewPropertyAnimatorCompatImpl();
        }
    }

    private class KitKatViewPropertyAnimatorCompatImpl extends JBMr2ViewPropertyAnimatorCompatImpl
    {
        private class JBMr2ViewPropertyAnimatorCompatImpl extends JBViewPropertyAnimatorCompatImpl
        {
            private class JBViewPropertyAnimatorCompatImpl extends ICSViewPropertyAnimatorCompatImpl
            {
                private class ICSViewPropertyAnimatorCompatImpl extends BaseViewPropertyAnimatorCompatImpl
                {
                    private class BaseViewPropertyAnimatorCompatImpl
                        implements ViewPropertyAnimatorCompatImpl
                    {

                        WeakHashMap mStarterMap;

                        BaseViewPropertyAnimatorCompatImpl()
                        {
                            mStarterMap = null;
                        }
                    }


                    WeakHashMap mLayerMap;

                    ICSViewPropertyAnimatorCompatImpl()
                    {
                        mLayerMap = null;
                    }
                }


                JBViewPropertyAnimatorCompatImpl()
                {
                }
            }


            JBMr2ViewPropertyAnimatorCompatImpl()
            {
            }
        }


        KitKatViewPropertyAnimatorCompatImpl()
        {
        }
    }

}
