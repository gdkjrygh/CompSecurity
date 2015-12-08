// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public class ViewParentCompat
{

    static final ViewParentCompatImpl IMPL;

    private ViewParentCompat()
    {
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
    {
        IMPL.notifySubtreeAccessibilityStateChanged(viewparent, view, view1, i);
    }

    public static boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        return IMPL.onNestedFling(viewparent, view, f, f1, flag);
    }

    public static boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
    {
        return IMPL.onNestedPreFling(viewparent, view, f, f1);
    }

    public static void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        IMPL.onNestedPreScroll(viewparent, view, i, j, ai);
    }

    public static void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        IMPL.onNestedScroll(viewparent, view, i, j, k, l);
    }

    public static void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
    {
        IMPL.onNestedScrollAccepted(viewparent, view, view1, i);
    }

    public static boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
    {
        return IMPL.onStartNestedScroll(viewparent, view, view1, i);
    }

    public static void onStopNestedScroll(ViewParent viewparent, View view)
    {
        IMPL.onStopNestedScroll(viewparent, view);
    }

    public static boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
    {
        return IMPL.requestSendAccessibilityEvent(viewparent, view, accessibilityevent);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new ViewParentCompatLollipopImpl();
        } else
        if (i >= 19)
        {
            IMPL = new ViewParentCompatKitKatImpl();
        } else
        if (i >= 14)
        {
            IMPL = new ViewParentCompatICSImpl();
        } else
        {
            IMPL = new ViewParentCompatStubImpl();
        }
    }

    private class ViewParentCompatImpl
    {

        public abstract void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i);

        public abstract boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag);

        public abstract boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1);

        public abstract void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[]);

        public abstract void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l);

        public abstract void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i);

        public abstract boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i);

        public abstract void onStopNestedScroll(ViewParent viewparent, View view);

        public abstract boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent);
    }


    private class ViewParentCompatLollipopImpl extends ViewParentCompatKitKatImpl
    {
        private class ViewParentCompatKitKatImpl extends ViewParentCompatICSImpl
        {
            private class ViewParentCompatICSImpl extends ViewParentCompatStubImpl
            {
                private class ViewParentCompatStubImpl
                    implements ViewParentCompatImpl
                {

                    public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
                    {
                    }

                    public boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            return ((NestedScrollingParent)viewparent).onNestedFling(view, f, f1, flag);
                        } else
                        {
                            return false;
                        }
                    }

                    public boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            return ((NestedScrollingParent)viewparent).onNestedPreFling(view, f, f1);
                        } else
                        {
                            return false;
                        }
                    }

                    public void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onNestedPreScroll(view, i, j, ai);
                        }
                    }

                    public void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onNestedScroll(view, i, j, k, l);
                        }
                    }

                    public void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onNestedScrollAccepted(view, view1, i);
                        }
                    }

                    public boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            return ((NestedScrollingParent)viewparent).onStartNestedScroll(view, view1, i);
                        } else
                        {
                            return false;
                        }
                    }

                    public void onStopNestedScroll(ViewParent viewparent, View view)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onStopNestedScroll(view);
                        }
                    }

                    public boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
                    {
                        if (view == null)
                        {
                            return false;
                        } else
                        {
                            ((AccessibilityManager)view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(accessibilityevent);
                            return true;
                        }
                    }

                    ViewParentCompatStubImpl()
                    {
                    }
                }


                public boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
                {
                    return ViewParentCompatICS.requestSendAccessibilityEvent(viewparent, view, accessibilityevent);
                }

                ViewParentCompatICSImpl()
                {
                }
            }


            public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
            {
                ViewParentCompatKitKat.notifySubtreeAccessibilityStateChanged(viewparent, view, view1, i);
            }

            ViewParentCompatKitKatImpl()
            {
            }
        }


        public boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
        {
            return ViewParentCompatLollipop.onNestedFling(viewparent, view, f, f1, flag);
        }

        public boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
        {
            return ViewParentCompatLollipop.onNestedPreFling(viewparent, view, f, f1);
        }

        public void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
        {
            ViewParentCompatLollipop.onNestedPreScroll(viewparent, view, i, j, ai);
        }

        public void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
        {
            ViewParentCompatLollipop.onNestedScroll(viewparent, view, i, j, k, l);
        }

        public void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
        {
            ViewParentCompatLollipop.onNestedScrollAccepted(viewparent, view, view1, i);
        }

        public boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
        {
            return ViewParentCompatLollipop.onStartNestedScroll(viewparent, view, view1, i);
        }

        public void onStopNestedScroll(ViewParent viewparent, View view)
        {
            ViewParentCompatLollipop.onStopNestedScroll(viewparent, view);
        }

        ViewParentCompatLollipopImpl()
        {
        }
    }

}
