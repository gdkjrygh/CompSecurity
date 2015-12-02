// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat

public class ViewCompat
{

    static final ViewCompatImpl IMPL;

    public static boolean canScrollHorizontally(View view, int i)
    {
        return IMPL.canScrollHorizontally(view, i);
    }

    public static boolean canScrollVertically(View view, int i)
    {
        return IMPL.canScrollVertically(view, i);
    }

    public static boolean getFitsSystemWindows(View view)
    {
        return IMPL.getFitsSystemWindows(view);
    }

    public static int getImportantForAccessibility(View view)
    {
        return IMPL.getImportantForAccessibility(view);
    }

    public static int getLayerType(View view)
    {
        return IMPL.getLayerType(view);
    }

    public static int getLayoutDirection(View view)
    {
        return IMPL.getLayoutDirection(view);
    }

    public static int getOverScrollMode(View view)
    {
        return IMPL.getOverScrollMode(view);
    }

    public static ViewParent getParentForAccessibility(View view)
    {
        return IMPL.getParentForAccessibility(view);
    }

    public static float getScaleX(View view)
    {
        return IMPL.getScaleX(view);
    }

    public static boolean isOpaque(View view)
    {
        return IMPL.isOpaque(view);
    }

    public static void postInvalidateOnAnimation(View view)
    {
        IMPL.postInvalidateOnAnimation(view);
    }

    public static void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
        IMPL.postInvalidateOnAnimation(view, i, j, k, l);
    }

    public static void postOnAnimation(View view, Runnable runnable)
    {
        IMPL.postOnAnimation(view, runnable);
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        IMPL.setAccessibilityDelegate(view, accessibilitydelegatecompat);
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setChildrenDrawingOrderEnabled(viewgroup, flag);
    }

    public static void setElevation(View view, float f)
    {
        IMPL.setElevation(view, f);
    }

    public static void setImportantForAccessibility(View view, int i)
    {
        IMPL.setImportantForAccessibility(view, i);
    }

    public static void setLayerPaint(View view, Paint paint)
    {
        IMPL.setLayerPaint(view, paint);
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        IMPL.setLayerType(view, i, paint);
    }

    public static void setScaleX(View view, float f)
    {
        IMPL.setScaleX(view, f);
    }

    public static void setScaleY(View view, float f)
    {
        IMPL.setScaleY(view, f);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new Api21ViewCompatImpl();
        } else
        if (i >= 19)
        {
            IMPL = new KitKatViewCompatImpl();
        } else
        if (i >= 17)
        {
            IMPL = new JbMr1ViewCompatImpl();
        } else
        if (i >= 16)
        {
            IMPL = new JBViewCompatImpl();
        } else
        if (i >= 14)
        {
            IMPL = new ICSViewCompatImpl();
        } else
        if (i >= 11)
        {
            IMPL = new HCViewCompatImpl();
        } else
        if (i >= 9)
        {
            IMPL = new GBViewCompatImpl();
        } else
        if (i >= 7)
        {
            IMPL = new EclairMr1ViewCompatImpl();
        } else
        {
            IMPL = new BaseViewCompatImpl();
        }
    }

    private class ViewCompatImpl
    {

        public abstract boolean canScrollHorizontally(View view, int i);

        public abstract boolean canScrollVertically(View view, int i);

        public abstract boolean getFitsSystemWindows(View view);

        public abstract int getImportantForAccessibility(View view);

        public abstract int getLayerType(View view);

        public abstract int getLayoutDirection(View view);

        public abstract int getOverScrollMode(View view);

        public abstract ViewParent getParentForAccessibility(View view);

        public abstract float getScaleX(View view);

        public abstract boolean isOpaque(View view);

        public abstract void postInvalidateOnAnimation(View view);

        public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

        public abstract void postOnAnimation(View view, Runnable runnable);

        public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag);

        public abstract void setElevation(View view, float f);

        public abstract void setImportantForAccessibility(View view, int i);

        public abstract void setLayerPaint(View view, Paint paint);

        public abstract void setLayerType(View view, int i, Paint paint);

        public abstract void setScaleX(View view, float f);

        public abstract void setScaleY(View view, float f);
    }


    private class Api21ViewCompatImpl extends KitKatViewCompatImpl
    {
        private class KitKatViewCompatImpl extends JbMr1ViewCompatImpl
        {
            private class JbMr1ViewCompatImpl extends JBViewCompatImpl
            {
                private class JBViewCompatImpl extends ICSViewCompatImpl
                {
                    private class ICSViewCompatImpl extends HCViewCompatImpl
                    {
                        private class HCViewCompatImpl extends GBViewCompatImpl
                        {
                            private class GBViewCompatImpl extends EclairMr1ViewCompatImpl
                            {
                                private class EclairMr1ViewCompatImpl extends BaseViewCompatImpl
                                {
                                    private class BaseViewCompatImpl
                                        implements ViewCompatImpl
                                    {

                                        WeakHashMap mViewPropertyAnimatorCompatMap;

                                        public boolean canScrollHorizontally(View view, int i)
                                        {
                                            return false;
                                        }

                                        public boolean canScrollVertically(View view, int i)
                                        {
                                            return false;
                                        }

                                        public boolean getFitsSystemWindows(View view)
                                        {
                                            return false;
                                        }

                                        long getFrameTime()
                                        {
                                            return 10L;
                                        }

                                        public int getImportantForAccessibility(View view)
                                        {
                                            return 0;
                                        }

                                        public int getLayerType(View view)
                                        {
                                            return 0;
                                        }

                                        public int getLayoutDirection(View view)
                                        {
                                            return 0;
                                        }

                                        public int getOverScrollMode(View view)
                                        {
                                            return 2;
                                        }

                                        public ViewParent getParentForAccessibility(View view)
                                        {
                                            return view.getParent();
                                        }

                                        public float getScaleX(View view)
                                        {
                                            return 0.0F;
                                        }

                                        public boolean isOpaque(View view)
                                        {
                                            boolean flag1 = false;
                                            view = view.getBackground();
                                            boolean flag = flag1;
                                            if (view != null)
                                            {
                                                flag = flag1;
                                                if (view.getOpacity() == -1)
                                                {
                                                    flag = true;
                                                }
                                            }
                                            return flag;
                                        }

                                        public void postInvalidateOnAnimation(View view)
                                        {
                                            view.invalidate();
                                        }

                                        public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
                                        {
                                            view.invalidate(i, j, k, l);
                                        }

                                        public void postOnAnimation(View view, Runnable runnable)
                                        {
                                            view.postDelayed(runnable, getFrameTime());
                                        }

                                        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
                                        {
                                        }

                                        public void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
                                        {
                                        }

                                        public void setElevation(View view, float f)
                                        {
                                        }

                                        public void setImportantForAccessibility(View view, int i)
                                        {
                                        }

                                        public void setLayerPaint(View view, Paint paint)
                                        {
                                        }

                                        public void setLayerType(View view, int i, Paint paint)
                                        {
                                        }

                                        public void setScaleX(View view, float f)
                                        {
                                        }

                                        public void setScaleY(View view, float f)
                                        {
                                        }

                                        BaseViewCompatImpl()
                                        {
                                            mViewPropertyAnimatorCompatMap = null;
                                        }
                                    }


                                    public boolean isOpaque(View view)
                                    {
                                        return ViewCompatEclairMr1.isOpaque(view);
                                    }

                                    public void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
                                    {
                                        ViewCompatEclairMr1.setChildrenDrawingOrderEnabled(viewgroup, flag);
                                    }

                                    EclairMr1ViewCompatImpl()
                                    {
                                    }
                                }


                                public int getOverScrollMode(View view)
                                {
                                    return ViewCompatGingerbread.getOverScrollMode(view);
                                }

                                GBViewCompatImpl()
                                {
                                }
                            }


                            long getFrameTime()
                            {
                                return ViewCompatHC.getFrameTime();
                            }

                            public int getLayerType(View view)
                            {
                                return ViewCompatHC.getLayerType(view);
                            }

                            public float getScaleX(View view)
                            {
                                return ViewCompatHC.getScaleX(view);
                            }

                            public void setLayerPaint(View view, Paint paint)
                            {
                                setLayerType(view, getLayerType(view), paint);
                                view.invalidate();
                            }

                            public void setLayerType(View view, int i, Paint paint)
                            {
                                ViewCompatHC.setLayerType(view, i, paint);
                            }

                            public void setScaleX(View view, float f)
                            {
                                ViewCompatHC.setScaleX(view, f);
                            }

                            public void setScaleY(View view, float f)
                            {
                                ViewCompatHC.setScaleY(view, f);
                            }

                            HCViewCompatImpl()
                            {
                            }
                        }


                        static boolean accessibilityDelegateCheckFailed = false;

                        public boolean canScrollHorizontally(View view, int i)
                        {
                            return ViewCompatICS.canScrollHorizontally(view, i);
                        }

                        public boolean canScrollVertically(View view, int i)
                        {
                            return ViewCompatICS.canScrollVertically(view, i);
                        }

                        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
                        {
                            ViewCompatICS.setAccessibilityDelegate(view, accessibilitydelegatecompat.getBridge());
                        }


                        ICSViewCompatImpl()
                        {
                        }
                    }


                    public boolean getFitsSystemWindows(View view)
                    {
                        return ViewCompatJB.getFitsSystemWindows(view);
                    }

                    public int getImportantForAccessibility(View view)
                    {
                        return ViewCompatJB.getImportantForAccessibility(view);
                    }

                    public ViewParent getParentForAccessibility(View view)
                    {
                        return ViewCompatJB.getParentForAccessibility(view);
                    }

                    public void postInvalidateOnAnimation(View view)
                    {
                        ViewCompatJB.postInvalidateOnAnimation(view);
                    }

                    public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
                    {
                        ViewCompatJB.postInvalidateOnAnimation(view, i, j, k, l);
                    }

                    public void postOnAnimation(View view, Runnable runnable)
                    {
                        ViewCompatJB.postOnAnimation(view, runnable);
                    }

                    public void setImportantForAccessibility(View view, int i)
                    {
                        int j = i;
                        if (i == 4)
                        {
                            j = 2;
                        }
                        ViewCompatJB.setImportantForAccessibility(view, j);
                    }

                    JBViewCompatImpl()
                    {
                    }
                }


                public int getLayoutDirection(View view)
                {
                    return ViewCompatJellybeanMr1.getLayoutDirection(view);
                }

                public void setLayerPaint(View view, Paint paint)
                {
                    ViewCompatJellybeanMr1.setLayerPaint(view, paint);
                }

                JbMr1ViewCompatImpl()
                {
                }
            }


            public void setImportantForAccessibility(View view, int i)
            {
                ViewCompatJB.setImportantForAccessibility(view, i);
            }

            KitKatViewCompatImpl()
            {
            }
        }


        public void setElevation(View view, float f)
        {
            ViewCompatApi21.setElevation(view, f);
        }

        Api21ViewCompatImpl()
        {
        }
    }

}
