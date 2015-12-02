// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

public class ViewConfigurationCompat
{

    static final ViewConfigurationVersionImpl IMPL;

    public static int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
    {
        return IMPL.getScaledPagingTouchSlop(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new IcsViewConfigurationVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombViewConfigurationVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            IMPL = new FroyoViewConfigurationVersionImpl();
        } else
        {
            IMPL = new BaseViewConfigurationVersionImpl();
        }
    }

    private class ViewConfigurationVersionImpl
    {

        public abstract int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration);
    }


    private class IcsViewConfigurationVersionImpl extends HoneycombViewConfigurationVersionImpl
    {
        private class HoneycombViewConfigurationVersionImpl extends FroyoViewConfigurationVersionImpl
        {
            private class FroyoViewConfigurationVersionImpl extends BaseViewConfigurationVersionImpl
            {
                private class BaseViewConfigurationVersionImpl
                    implements ViewConfigurationVersionImpl
                {

                    public int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
                    {
                        return viewconfiguration.getScaledTouchSlop();
                    }

                    BaseViewConfigurationVersionImpl()
                    {
                    }
                }


                public int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
                {
                    return ViewConfigurationCompatFroyo.getScaledPagingTouchSlop(viewconfiguration);
                }

                FroyoViewConfigurationVersionImpl()
                {
                }
            }


            HoneycombViewConfigurationVersionImpl()
            {
            }
        }


        IcsViewConfigurationVersionImpl()
        {
        }
    }

}
