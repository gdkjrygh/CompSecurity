// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, WindowInsetsCompat, AccessibilityDelegateCompat, OnApplyWindowInsetsListener, 
//            ScrollingView, NestedScrollingChild, ViewCompatBase, ViewCompatEclairMr1, 
//            ViewCompatGingerbread, ViewCompatHC, ViewCompatICS, ViewCompatJB, 
//            ViewCompatJellybeanMr1, ViewCompatKitKat, ViewCompatLollipop

public class ViewCompat
{
    static class BaseViewCompatImpl
        implements ViewCompatImpl
    {

        private Method mDispatchFinishTemporaryDetach;
        private Method mDispatchStartTemporaryDetach;
        private boolean mTempDetachBound;
        WeakHashMap mViewPropertyAnimatorCompatMap;

        private void bindTempDetach()
        {
            try
            {
                mDispatchStartTemporaryDetach = android/view/View.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
                mDispatchFinishTemporaryDetach = android/view/View.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewCompat", "Couldn't find method", nosuchmethodexception);
            }
            mTempDetachBound = true;
        }

        private boolean canScrollingViewScrollHorizontally(ScrollingView scrollingview, int i)
        {
            int j;
            int k;
            boolean flag;
            flag = true;
            j = scrollingview.computeHorizontalScrollOffset();
            k = scrollingview.computeHorizontalScrollRange() - scrollingview.computeHorizontalScrollExtent();
            if (k != 0) goto _L2; else goto _L1
_L1:
            flag = false;
_L4:
            return flag;
_L2:
            if (i >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j > 0) goto _L4; else goto _L3
_L3:
            return false;
            if (j < k - 1) goto _L4; else goto _L5
_L5:
            return false;
        }

        private boolean canScrollingViewScrollVertically(ScrollingView scrollingview, int i)
        {
            int j;
            int k;
            boolean flag;
            flag = true;
            j = scrollingview.computeVerticalScrollOffset();
            k = scrollingview.computeVerticalScrollRange() - scrollingview.computeVerticalScrollExtent();
            if (k != 0) goto _L2; else goto _L1
_L1:
            flag = false;
_L4:
            return flag;
_L2:
            if (i >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j > 0) goto _L4; else goto _L3
_L3:
            return false;
            if (j < k - 1) goto _L4; else goto _L5
_L5:
            return false;
        }

        public ViewPropertyAnimatorCompat animate(View view)
        {
            return new ViewPropertyAnimatorCompat(view);
        }

        public boolean canScrollHorizontally(View view, int i)
        {
            return (view instanceof ScrollingView) && canScrollingViewScrollHorizontally((ScrollingView)view, i);
        }

        public boolean canScrollVertically(View view, int i)
        {
            return (view instanceof ScrollingView) && canScrollingViewScrollVertically((ScrollingView)view, i);
        }

        public int combineMeasuredStates(int i, int j)
        {
            return i | j;
        }

        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return windowinsetscompat;
        }

        public void dispatchFinishTemporaryDetach(View view)
        {
            if (!mTempDetachBound)
            {
                bindTempDetach();
            }
            if (mDispatchFinishTemporaryDetach != null)
            {
                try
                {
                    mDispatchFinishTemporaryDetach.invoke(view, new Object[0]);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", view);
                }
                return;
            } else
            {
                view.onFinishTemporaryDetach();
                return;
            }
        }

        public boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).dispatchNestedFling(f, f1, flag);
            } else
            {
                return false;
            }
        }

        public boolean dispatchNestedPreFling(View view, float f, float f1)
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).dispatchNestedPreFling(f, f1);
            } else
            {
                return false;
            }
        }

        public boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).dispatchNestedPreScroll(i, j, ai, ai1);
            } else
            {
                return false;
            }
        }

        public boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).dispatchNestedScroll(i, j, k, l, ai);
            } else
            {
                return false;
            }
        }

        public void dispatchStartTemporaryDetach(View view)
        {
            if (!mTempDetachBound)
            {
                bindTempDetach();
            }
            if (mDispatchStartTemporaryDetach != null)
            {
                try
                {
                    mDispatchStartTemporaryDetach.invoke(view, new Object[0]);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", view);
                }
                return;
            } else
            {
                view.onStartTemporaryDetach();
                return;
            }
        }

        public int getAccessibilityLiveRegion(View view)
        {
            return 0;
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
        {
            return null;
        }

        public float getAlpha(View view)
        {
            return 1.0F;
        }

        public ColorStateList getBackgroundTintList(View view)
        {
            return ViewCompatBase.getBackgroundTintList(view);
        }

        public android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
        {
            return ViewCompatBase.getBackgroundTintMode(view);
        }

        public float getElevation(View view)
        {
            return 0.0F;
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

        public int getLabelFor(View view)
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

        public int getMeasuredHeightAndState(View view)
        {
            return view.getMeasuredHeight();
        }

        public int getMeasuredState(View view)
        {
            return 0;
        }

        public int getMeasuredWidthAndState(View view)
        {
            return view.getMeasuredWidth();
        }

        public int getMinimumHeight(View view)
        {
            return ViewCompatBase.getMinimumHeight(view);
        }

        public int getMinimumWidth(View view)
        {
            return ViewCompatBase.getMinimumWidth(view);
        }

        public int getOverScrollMode(View view)
        {
            return 2;
        }

        public int getPaddingEnd(View view)
        {
            return view.getPaddingRight();
        }

        public int getPaddingStart(View view)
        {
            return view.getPaddingLeft();
        }

        public ViewParent getParentForAccessibility(View view)
        {
            return view.getParent();
        }

        public float getPivotX(View view)
        {
            return 0.0F;
        }

        public float getPivotY(View view)
        {
            return 0.0F;
        }

        public float getRotation(View view)
        {
            return 0.0F;
        }

        public float getRotationX(View view)
        {
            return 0.0F;
        }

        public float getRotationY(View view)
        {
            return 0.0F;
        }

        public float getScaleX(View view)
        {
            return 0.0F;
        }

        public float getScaleY(View view)
        {
            return 0.0F;
        }

        public String getTransitionName(View view)
        {
            return null;
        }

        public float getTranslationX(View view)
        {
            return 0.0F;
        }

        public float getTranslationY(View view)
        {
            return 0.0F;
        }

        public float getTranslationZ(View view)
        {
            return 0.0F;
        }

        public int getWindowSystemUiVisibility(View view)
        {
            return 0;
        }

        public float getX(View view)
        {
            return 0.0F;
        }

        public float getY(View view)
        {
            return 0.0F;
        }

        public float getZ(View view)
        {
            return getTranslationZ(view) + getElevation(view);
        }

        public boolean hasAccessibilityDelegate(View view)
        {
            return false;
        }

        public boolean hasNestedScrollingParent(View view)
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).hasNestedScrollingParent();
            } else
            {
                return false;
            }
        }

        public boolean hasTransientState(View view)
        {
            return false;
        }

        public boolean isAttachedToWindow(View view)
        {
            return ViewCompatBase.isAttachedToWindow(view);
        }

        public boolean isImportantForAccessibility(View view)
        {
            return true;
        }

        public boolean isLaidOut(View view)
        {
            return ViewCompatBase.isLaidOut(view);
        }

        public boolean isNestedScrollingEnabled(View view)
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).isNestedScrollingEnabled();
            } else
            {
                return false;
            }
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

        public boolean isPaddingRelative(View view)
        {
            return false;
        }

        public void jumpDrawablesToCurrentState(View view)
        {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return windowinsetscompat;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            return false;
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

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            view.postDelayed(runnable, getFrameTime() + l);
        }

        public void requestApplyInsets(View view)
        {
        }

        public int resolveSizeAndState(int i, int j, int k)
        {
            return View.resolveSize(i, j);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        }

        public void setAccessibilityLiveRegion(View view, int i)
        {
        }

        public void setActivated(View view, boolean flag)
        {
        }

        public void setAlpha(View view, float f)
        {
        }

        public void setBackgroundTintList(View view, ColorStateList colorstatelist)
        {
            ViewCompatBase.setBackgroundTintList(view, colorstatelist);
        }

        public void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
        {
            ViewCompatBase.setBackgroundTintMode(view, mode);
        }

        public void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
        {
        }

        public void setElevation(View view, float f)
        {
        }

        public void setFitsSystemWindows(View view, boolean flag)
        {
        }

        public void setHasTransientState(View view, boolean flag)
        {
        }

        public void setImportantForAccessibility(View view, int i)
        {
        }

        public void setLabelFor(View view, int i)
        {
        }

        public void setLayerPaint(View view, Paint paint)
        {
        }

        public void setLayerType(View view, int i, Paint paint)
        {
        }

        public void setLayoutDirection(View view, int i)
        {
        }

        public void setNestedScrollingEnabled(View view, boolean flag)
        {
            if (view instanceof NestedScrollingChild)
            {
                ((NestedScrollingChild)view).setNestedScrollingEnabled(flag);
            }
        }

        public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
        {
        }

        public void setOverScrollMode(View view, int i)
        {
        }

        public void setPaddingRelative(View view, int i, int j, int k, int l)
        {
            view.setPadding(i, j, k, l);
        }

        public void setPivotX(View view, float f)
        {
        }

        public void setPivotY(View view, float f)
        {
        }

        public void setRotation(View view, float f)
        {
        }

        public void setRotationX(View view, float f)
        {
        }

        public void setRotationY(View view, float f)
        {
        }

        public void setSaveFromParentEnabled(View view, boolean flag)
        {
        }

        public void setScaleX(View view, float f)
        {
        }

        public void setScaleY(View view, float f)
        {
        }

        public void setTransitionName(View view, String s)
        {
        }

        public void setTranslationX(View view, float f)
        {
        }

        public void setTranslationY(View view, float f)
        {
        }

        public void setTranslationZ(View view, float f)
        {
        }

        public void setX(View view, float f)
        {
        }

        public void setY(View view, float f)
        {
        }

        public boolean startNestedScroll(View view, int i)
        {
            if (view instanceof NestedScrollingChild)
            {
                return ((NestedScrollingChild)view).startNestedScroll(i);
            } else
            {
                return false;
            }
        }

        public void stopNestedScroll(View view)
        {
            if (view instanceof NestedScrollingChild)
            {
                ((NestedScrollingChild)view).stopNestedScroll();
            }
        }

        BaseViewCompatImpl()
        {
            mViewPropertyAnimatorCompatMap = null;
        }
    }

    static class EclairMr1ViewCompatImpl extends BaseViewCompatImpl
    {

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

    static class GBViewCompatImpl extends EclairMr1ViewCompatImpl
    {

        public int getOverScrollMode(View view)
        {
            return ViewCompatGingerbread.getOverScrollMode(view);
        }

        public void setOverScrollMode(View view, int i)
        {
            ViewCompatGingerbread.setOverScrollMode(view, i);
        }

        GBViewCompatImpl()
        {
        }
    }

    static class HCViewCompatImpl extends GBViewCompatImpl
    {

        public int combineMeasuredStates(int i, int j)
        {
            return ViewCompatHC.combineMeasuredStates(i, j);
        }

        public float getAlpha(View view)
        {
            return ViewCompatHC.getAlpha(view);
        }

        long getFrameTime()
        {
            return ViewCompatHC.getFrameTime();
        }

        public int getLayerType(View view)
        {
            return ViewCompatHC.getLayerType(view);
        }

        public int getMeasuredHeightAndState(View view)
        {
            return ViewCompatHC.getMeasuredHeightAndState(view);
        }

        public int getMeasuredState(View view)
        {
            return ViewCompatHC.getMeasuredState(view);
        }

        public int getMeasuredWidthAndState(View view)
        {
            return ViewCompatHC.getMeasuredWidthAndState(view);
        }

        public float getPivotX(View view)
        {
            return ViewCompatHC.getPivotX(view);
        }

        public float getPivotY(View view)
        {
            return ViewCompatHC.getPivotY(view);
        }

        public float getRotation(View view)
        {
            return ViewCompatHC.getRotation(view);
        }

        public float getRotationX(View view)
        {
            return ViewCompatHC.getRotationX(view);
        }

        public float getRotationY(View view)
        {
            return ViewCompatHC.getRotationY(view);
        }

        public float getScaleX(View view)
        {
            return ViewCompatHC.getScaleX(view);
        }

        public float getScaleY(View view)
        {
            return ViewCompatHC.getScaleY(view);
        }

        public float getTranslationX(View view)
        {
            return ViewCompatHC.getTranslationX(view);
        }

        public float getTranslationY(View view)
        {
            return ViewCompatHC.getTranslationY(view);
        }

        public float getX(View view)
        {
            return ViewCompatHC.getX(view);
        }

        public float getY(View view)
        {
            return ViewCompatHC.getY(view);
        }

        public void jumpDrawablesToCurrentState(View view)
        {
            ViewCompatHC.jumpDrawablesToCurrentState(view);
        }

        public int resolveSizeAndState(int i, int j, int k)
        {
            return ViewCompatHC.resolveSizeAndState(i, j, k);
        }

        public void setActivated(View view, boolean flag)
        {
            ViewCompatHC.setActivated(view, flag);
        }

        public void setAlpha(View view, float f)
        {
            ViewCompatHC.setAlpha(view, f);
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

        public void setPivotX(View view, float f)
        {
            ViewCompatHC.setPivotX(view, f);
        }

        public void setPivotY(View view, float f)
        {
            ViewCompatHC.setPivotY(view, f);
        }

        public void setRotation(View view, float f)
        {
            ViewCompatHC.setRotation(view, f);
        }

        public void setRotationX(View view, float f)
        {
            ViewCompatHC.setRotationX(view, f);
        }

        public void setRotationY(View view, float f)
        {
            ViewCompatHC.setRotationY(view, f);
        }

        public void setSaveFromParentEnabled(View view, boolean flag)
        {
            ViewCompatHC.setSaveFromParentEnabled(view, flag);
        }

        public void setScaleX(View view, float f)
        {
            ViewCompatHC.setScaleX(view, f);
        }

        public void setScaleY(View view, float f)
        {
            ViewCompatHC.setScaleY(view, f);
        }

        public void setTranslationX(View view, float f)
        {
            ViewCompatHC.setTranslationX(view, f);
        }

        public void setTranslationY(View view, float f)
        {
            ViewCompatHC.setTranslationY(view, f);
        }

        public void setX(View view, float f)
        {
            ViewCompatHC.setX(view, f);
        }

        public void setY(View view, float f)
        {
            ViewCompatHC.setY(view, f);
        }

        HCViewCompatImpl()
        {
        }
    }

    static class ICSViewCompatImpl extends HCViewCompatImpl
    {

        static boolean accessibilityDelegateCheckFailed = false;
        static Field mAccessibilityDelegateField;

        public ViewPropertyAnimatorCompat animate(View view)
        {
            if (mViewPropertyAnimatorCompatMap == null)
            {
                mViewPropertyAnimatorCompatMap = new WeakHashMap();
            }
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)mViewPropertyAnimatorCompatMap.get(view);
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
            if (viewpropertyanimatorcompat1 == null)
            {
                viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
                mViewPropertyAnimatorCompatMap.put(view, viewpropertyanimatorcompat);
            }
            return viewpropertyanimatorcompat;
        }

        public boolean canScrollHorizontally(View view, int i)
        {
            return ViewCompatICS.canScrollHorizontally(view, i);
        }

        public boolean canScrollVertically(View view, int i)
        {
            return ViewCompatICS.canScrollVertically(view, i);
        }

        public boolean hasAccessibilityDelegate(View view)
        {
            boolean flag = true;
            if (accessibilityDelegateCheckFailed)
            {
                return false;
            }
            if (mAccessibilityDelegateField == null)
            {
                try
                {
                    mAccessibilityDelegateField = android/view/View.getDeclaredField("mAccessibilityDelegate");
                    mAccessibilityDelegateField.setAccessible(true);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    accessibilityDelegateCheckFailed = true;
                    return false;
                }
            }
            try
            {
                view = ((View) (mAccessibilityDelegateField.get(view)));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                accessibilityDelegateCheckFailed = true;
                return false;
            }
            if (view == null)
            {
                flag = false;
            }
            return flag;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            ViewCompatICS.onInitializeAccessibilityEvent(view, accessibilityevent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            ViewCompatICS.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat.getInfo());
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            ViewCompatICS.onPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            if (accessibilitydelegatecompat == null)
            {
                accessibilitydelegatecompat = null;
            } else
            {
                accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.getBridge()));
            }
            ViewCompatICS.setAccessibilityDelegate(view, accessibilitydelegatecompat);
        }

        public void setFitsSystemWindows(View view, boolean flag)
        {
            ViewCompatICS.setFitsSystemWindows(view, flag);
        }


        ICSViewCompatImpl()
        {
        }
    }

    static class JBViewCompatImpl extends ICSViewCompatImpl
    {

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
        {
            view = ((View) (ViewCompatJB.getAccessibilityNodeProvider(view)));
            if (view != null)
            {
                return new AccessibilityNodeProviderCompat(view);
            } else
            {
                return null;
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

        public int getMinimumHeight(View view)
        {
            return ViewCompatJB.getMinimumHeight(view);
        }

        public int getMinimumWidth(View view)
        {
            return ViewCompatJB.getMinimumWidth(view);
        }

        public ViewParent getParentForAccessibility(View view)
        {
            return ViewCompatJB.getParentForAccessibility(view);
        }

        public boolean hasTransientState(View view)
        {
            return ViewCompatJB.hasTransientState(view);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            return ViewCompatJB.performAccessibilityAction(view, i, bundle);
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

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            ViewCompatJB.postOnAnimationDelayed(view, runnable, l);
        }

        public void requestApplyInsets(View view)
        {
            ViewCompatJB.requestApplyInsets(view);
        }

        public void setHasTransientState(View view, boolean flag)
        {
            ViewCompatJB.setHasTransientState(view, flag);
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

    static class JbMr1ViewCompatImpl extends JBViewCompatImpl
    {

        public int getLabelFor(View view)
        {
            return ViewCompatJellybeanMr1.getLabelFor(view);
        }

        public int getLayoutDirection(View view)
        {
            return ViewCompatJellybeanMr1.getLayoutDirection(view);
        }

        public int getPaddingEnd(View view)
        {
            return ViewCompatJellybeanMr1.getPaddingEnd(view);
        }

        public int getPaddingStart(View view)
        {
            return ViewCompatJellybeanMr1.getPaddingStart(view);
        }

        public int getWindowSystemUiVisibility(View view)
        {
            return ViewCompatJellybeanMr1.getWindowSystemUiVisibility(view);
        }

        public boolean isPaddingRelative(View view)
        {
            return ViewCompatJellybeanMr1.isPaddingRelative(view);
        }

        public void setLabelFor(View view, int i)
        {
            ViewCompatJellybeanMr1.setLabelFor(view, i);
        }

        public void setLayerPaint(View view, Paint paint)
        {
            ViewCompatJellybeanMr1.setLayerPaint(view, paint);
        }

        public void setLayoutDirection(View view, int i)
        {
            ViewCompatJellybeanMr1.setLayoutDirection(view, i);
        }

        public void setPaddingRelative(View view, int i, int j, int k, int l)
        {
            ViewCompatJellybeanMr1.setPaddingRelative(view, i, j, k, l);
        }

        JbMr1ViewCompatImpl()
        {
        }
    }

    static class KitKatViewCompatImpl extends JbMr1ViewCompatImpl
    {

        public int getAccessibilityLiveRegion(View view)
        {
            return ViewCompatKitKat.getAccessibilityLiveRegion(view);
        }

        public boolean isAttachedToWindow(View view)
        {
            return ViewCompatKitKat.isAttachedToWindow(view);
        }

        public boolean isLaidOut(View view)
        {
            return ViewCompatKitKat.isLaidOut(view);
        }

        public void setAccessibilityLiveRegion(View view, int i)
        {
            ViewCompatKitKat.setAccessibilityLiveRegion(view, i);
        }

        public void setImportantForAccessibility(View view, int i)
        {
            ViewCompatJB.setImportantForAccessibility(view, i);
        }

        KitKatViewCompatImpl()
        {
        }
    }

    static class LollipopViewCompatImpl extends KitKatViewCompatImpl
    {

        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return ViewCompatLollipop.dispatchApplyWindowInsets(view, windowinsetscompat);
        }

        public boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
        {
            return ViewCompatLollipop.dispatchNestedFling(view, f, f1, flag);
        }

        public boolean dispatchNestedPreFling(View view, float f, float f1)
        {
            return ViewCompatLollipop.dispatchNestedPreFling(view, f, f1);
        }

        public boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
        {
            return ViewCompatLollipop.dispatchNestedPreScroll(view, i, j, ai, ai1);
        }

        public boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
        {
            return ViewCompatLollipop.dispatchNestedScroll(view, i, j, k, l, ai);
        }

        public ColorStateList getBackgroundTintList(View view)
        {
            return ViewCompatLollipop.getBackgroundTintList(view);
        }

        public android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
        {
            return ViewCompatLollipop.getBackgroundTintMode(view);
        }

        public float getElevation(View view)
        {
            return ViewCompatLollipop.getElevation(view);
        }

        public String getTransitionName(View view)
        {
            return ViewCompatLollipop.getTransitionName(view);
        }

        public float getTranslationZ(View view)
        {
            return ViewCompatLollipop.getTranslationZ(view);
        }

        public float getZ(View view)
        {
            return ViewCompatLollipop.getZ(view);
        }

        public boolean hasNestedScrollingParent(View view)
        {
            return ViewCompatLollipop.hasNestedScrollingParent(view);
        }

        public boolean isImportantForAccessibility(View view)
        {
            return ViewCompatLollipop.isImportantForAccessibility(view);
        }

        public boolean isNestedScrollingEnabled(View view)
        {
            return ViewCompatLollipop.isNestedScrollingEnabled(view);
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return ViewCompatLollipop.onApplyWindowInsets(view, windowinsetscompat);
        }

        public void requestApplyInsets(View view)
        {
            ViewCompatLollipop.requestApplyInsets(view);
        }

        public void setBackgroundTintList(View view, ColorStateList colorstatelist)
        {
            ViewCompatLollipop.setBackgroundTintList(view, colorstatelist);
        }

        public void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
        {
            ViewCompatLollipop.setBackgroundTintMode(view, mode);
        }

        public void setElevation(View view, float f)
        {
            ViewCompatLollipop.setElevation(view, f);
        }

        public void setNestedScrollingEnabled(View view, boolean flag)
        {
            ViewCompatLollipop.setNestedScrollingEnabled(view, flag);
        }

        public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
        {
            ViewCompatLollipop.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
        }

        public void setTransitionName(View view, String s)
        {
            ViewCompatLollipop.setTransitionName(view, s);
        }

        public void setTranslationZ(View view, float f)
        {
            ViewCompatLollipop.setTranslationZ(view, f);
        }

        public boolean startNestedScroll(View view, int i)
        {
            return ViewCompatLollipop.startNestedScroll(view, i);
        }

        public void stopNestedScroll(View view)
        {
            ViewCompatLollipop.stopNestedScroll(view);
        }

        LollipopViewCompatImpl()
        {
        }
    }

    static interface ViewCompatImpl
    {

        public abstract ViewPropertyAnimatorCompat animate(View view);

        public abstract boolean canScrollHorizontally(View view, int i);

        public abstract boolean canScrollVertically(View view, int i);

        public abstract int combineMeasuredStates(int i, int j);

        public abstract WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat);

        public abstract void dispatchFinishTemporaryDetach(View view);

        public abstract boolean dispatchNestedFling(View view, float f, float f1, boolean flag);

        public abstract boolean dispatchNestedPreFling(View view, float f, float f1);

        public abstract boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[]);

        public abstract boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[]);

        public abstract void dispatchStartTemporaryDetach(View view);

        public abstract int getAccessibilityLiveRegion(View view);

        public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view);

        public abstract float getAlpha(View view);

        public abstract ColorStateList getBackgroundTintList(View view);

        public abstract android.graphics.PorterDuff.Mode getBackgroundTintMode(View view);

        public abstract float getElevation(View view);

        public abstract boolean getFitsSystemWindows(View view);

        public abstract int getImportantForAccessibility(View view);

        public abstract int getLabelFor(View view);

        public abstract int getLayerType(View view);

        public abstract int getLayoutDirection(View view);

        public abstract int getMeasuredHeightAndState(View view);

        public abstract int getMeasuredState(View view);

        public abstract int getMeasuredWidthAndState(View view);

        public abstract int getMinimumHeight(View view);

        public abstract int getMinimumWidth(View view);

        public abstract int getOverScrollMode(View view);

        public abstract int getPaddingEnd(View view);

        public abstract int getPaddingStart(View view);

        public abstract ViewParent getParentForAccessibility(View view);

        public abstract float getPivotX(View view);

        public abstract float getPivotY(View view);

        public abstract float getRotation(View view);

        public abstract float getRotationX(View view);

        public abstract float getRotationY(View view);

        public abstract float getScaleX(View view);

        public abstract float getScaleY(View view);

        public abstract String getTransitionName(View view);

        public abstract float getTranslationX(View view);

        public abstract float getTranslationY(View view);

        public abstract float getTranslationZ(View view);

        public abstract int getWindowSystemUiVisibility(View view);

        public abstract float getX(View view);

        public abstract float getY(View view);

        public abstract float getZ(View view);

        public abstract boolean hasAccessibilityDelegate(View view);

        public abstract boolean hasNestedScrollingParent(View view);

        public abstract boolean hasTransientState(View view);

        public abstract boolean isAttachedToWindow(View view);

        public abstract boolean isImportantForAccessibility(View view);

        public abstract boolean isLaidOut(View view);

        public abstract boolean isNestedScrollingEnabled(View view);

        public abstract boolean isOpaque(View view);

        public abstract boolean isPaddingRelative(View view);

        public abstract void jumpDrawablesToCurrentState(View view);

        public abstract WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat);

        public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

        public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean performAccessibilityAction(View view, int i, Bundle bundle);

        public abstract void postInvalidateOnAnimation(View view);

        public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

        public abstract void postOnAnimation(View view, Runnable runnable);

        public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

        public abstract void requestApplyInsets(View view);

        public abstract int resolveSizeAndState(int i, int j, int k);

        public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void setAccessibilityLiveRegion(View view, int i);

        public abstract void setActivated(View view, boolean flag);

        public abstract void setAlpha(View view, float f);

        public abstract void setBackgroundTintList(View view, ColorStateList colorstatelist);

        public abstract void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode);

        public abstract void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag);

        public abstract void setElevation(View view, float f);

        public abstract void setFitsSystemWindows(View view, boolean flag);

        public abstract void setHasTransientState(View view, boolean flag);

        public abstract void setImportantForAccessibility(View view, int i);

        public abstract void setLabelFor(View view, int i);

        public abstract void setLayerPaint(View view, Paint paint);

        public abstract void setLayerType(View view, int i, Paint paint);

        public abstract void setLayoutDirection(View view, int i);

        public abstract void setNestedScrollingEnabled(View view, boolean flag);

        public abstract void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener);

        public abstract void setOverScrollMode(View view, int i);

        public abstract void setPaddingRelative(View view, int i, int j, int k, int l);

        public abstract void setPivotX(View view, float f);

        public abstract void setPivotY(View view, float f);

        public abstract void setRotation(View view, float f);

        public abstract void setRotationX(View view, float f);

        public abstract void setRotationY(View view, float f);

        public abstract void setSaveFromParentEnabled(View view, boolean flag);

        public abstract void setScaleX(View view, float f);

        public abstract void setScaleY(View view, float f);

        public abstract void setTransitionName(View view, String s);

        public abstract void setTranslationX(View view, float f);

        public abstract void setTranslationY(View view, float f);

        public abstract void setTranslationZ(View view, float f);

        public abstract void setX(View view, float f);

        public abstract void setY(View view, float f);

        public abstract boolean startNestedScroll(View view, int i);

        public abstract void stopNestedScroll(View view);
    }


    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    private static final long FAKE_FRAME_TIME = 10L;
    static final ViewCompatImpl IMPL;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 0xffffff;
    public static final int MEASURED_STATE_MASK = 0xff000000;
    public static final int MEASURED_STATE_TOO_SMALL = 0x1000000;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    private static final String TAG = "ViewCompat";

    public ViewCompat()
    {
    }

    public static ViewPropertyAnimatorCompat animate(View view)
    {
        return IMPL.animate(view);
    }

    public static boolean canScrollHorizontally(View view, int i)
    {
        return IMPL.canScrollHorizontally(view, i);
    }

    public static boolean canScrollVertically(View view, int i)
    {
        return IMPL.canScrollVertically(view, i);
    }

    public static int combineMeasuredStates(int i, int j)
    {
        return IMPL.combineMeasuredStates(i, j);
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return IMPL.dispatchApplyWindowInsets(view, windowinsetscompat);
    }

    public static void dispatchFinishTemporaryDetach(View view)
    {
        IMPL.dispatchFinishTemporaryDetach(view);
    }

    public static boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
    {
        return IMPL.dispatchNestedFling(view, f, f1, flag);
    }

    public static boolean dispatchNestedPreFling(View view, float f, float f1)
    {
        return IMPL.dispatchNestedPreFling(view, f, f1);
    }

    public static boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
    {
        return IMPL.dispatchNestedPreScroll(view, i, j, ai, ai1);
    }

    public static boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
    {
        return IMPL.dispatchNestedScroll(view, i, j, k, l, ai);
    }

    public static void dispatchStartTemporaryDetach(View view)
    {
        IMPL.dispatchStartTemporaryDetach(view);
    }

    public static int getAccessibilityLiveRegion(View view)
    {
        return IMPL.getAccessibilityLiveRegion(view);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        return IMPL.getAccessibilityNodeProvider(view);
    }

    public static float getAlpha(View view)
    {
        return IMPL.getAlpha(view);
    }

    public static ColorStateList getBackgroundTintList(View view)
    {
        return IMPL.getBackgroundTintList(view);
    }

    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
    {
        return IMPL.getBackgroundTintMode(view);
    }

    public static float getElevation(View view)
    {
        return IMPL.getElevation(view);
    }

    public static boolean getFitsSystemWindows(View view)
    {
        return IMPL.getFitsSystemWindows(view);
    }

    public static int getImportantForAccessibility(View view)
    {
        return IMPL.getImportantForAccessibility(view);
    }

    public static int getLabelFor(View view)
    {
        return IMPL.getLabelFor(view);
    }

    public static int getLayerType(View view)
    {
        return IMPL.getLayerType(view);
    }

    public static int getLayoutDirection(View view)
    {
        return IMPL.getLayoutDirection(view);
    }

    public static int getMeasuredHeightAndState(View view)
    {
        return IMPL.getMeasuredHeightAndState(view);
    }

    public static int getMeasuredState(View view)
    {
        return IMPL.getMeasuredState(view);
    }

    public static int getMeasuredWidthAndState(View view)
    {
        return IMPL.getMeasuredWidthAndState(view);
    }

    public static int getMinimumHeight(View view)
    {
        return IMPL.getMinimumHeight(view);
    }

    public static int getMinimumWidth(View view)
    {
        return IMPL.getMinimumWidth(view);
    }

    public static int getOverScrollMode(View view)
    {
        return IMPL.getOverScrollMode(view);
    }

    public static int getPaddingEnd(View view)
    {
        return IMPL.getPaddingEnd(view);
    }

    public static int getPaddingStart(View view)
    {
        return IMPL.getPaddingStart(view);
    }

    public static ViewParent getParentForAccessibility(View view)
    {
        return IMPL.getParentForAccessibility(view);
    }

    public static float getPivotX(View view)
    {
        return IMPL.getPivotX(view);
    }

    public static float getPivotY(View view)
    {
        return IMPL.getPivotY(view);
    }

    public static float getRotation(View view)
    {
        return IMPL.getRotation(view);
    }

    public static float getRotationX(View view)
    {
        return IMPL.getRotationX(view);
    }

    public static float getRotationY(View view)
    {
        return IMPL.getRotationY(view);
    }

    public static float getScaleX(View view)
    {
        return IMPL.getScaleX(view);
    }

    public static float getScaleY(View view)
    {
        return IMPL.getScaleY(view);
    }

    public static String getTransitionName(View view)
    {
        return IMPL.getTransitionName(view);
    }

    public static float getTranslationX(View view)
    {
        return IMPL.getTranslationX(view);
    }

    public static float getTranslationY(View view)
    {
        return IMPL.getTranslationY(view);
    }

    public static float getTranslationZ(View view)
    {
        return IMPL.getTranslationZ(view);
    }

    public static int getWindowSystemUiVisibility(View view)
    {
        return IMPL.getWindowSystemUiVisibility(view);
    }

    public static float getX(View view)
    {
        return IMPL.getX(view);
    }

    public static float getY(View view)
    {
        return IMPL.getY(view);
    }

    public static float getZ(View view)
    {
        return IMPL.getZ(view);
    }

    public static boolean hasAccessibilityDelegate(View view)
    {
        return IMPL.hasAccessibilityDelegate(view);
    }

    public static boolean hasNestedScrollingParent(View view)
    {
        return IMPL.hasNestedScrollingParent(view);
    }

    public static boolean hasTransientState(View view)
    {
        return IMPL.hasTransientState(view);
    }

    public static boolean isAttachedToWindow(View view)
    {
        return IMPL.isAttachedToWindow(view);
    }

    public static boolean isLaidOut(View view)
    {
        return IMPL.isLaidOut(view);
    }

    public static boolean isNestedScrollingEnabled(View view)
    {
        return IMPL.isNestedScrollingEnabled(view);
    }

    public static boolean isOpaque(View view)
    {
        return IMPL.isOpaque(view);
    }

    public static boolean isPaddingRelative(View view)
    {
        return IMPL.isPaddingRelative(view);
    }

    public static void jumpDrawablesToCurrentState(View view)
    {
        IMPL.jumpDrawablesToCurrentState(view);
    }

    public static void offsetLeftAndRight(View view, int i)
    {
        view.offsetLeftAndRight(i);
        if (i != 0 && android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidate();
        }
    }

    public static void offsetTopAndBottom(View view, int i)
    {
        view.offsetTopAndBottom(i);
        if (i != 0 && android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidate();
        }
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return IMPL.onApplyWindowInsets(view, windowinsetscompat);
    }

    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onInitializeAccessibilityEvent(view, accessibilityevent);
    }

    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        IMPL.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public static boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return IMPL.performAccessibilityAction(view, i, bundle);
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

    public static void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
        IMPL.postOnAnimationDelayed(view, runnable, l);
    }

    public static void requestApplyInsets(View view)
    {
        IMPL.requestApplyInsets(view);
    }

    public static int resolveSizeAndState(int i, int j, int k)
    {
        return IMPL.resolveSizeAndState(i, j, k);
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        IMPL.setAccessibilityDelegate(view, accessibilitydelegatecompat);
    }

    public static void setAccessibilityLiveRegion(View view, int i)
    {
        IMPL.setAccessibilityLiveRegion(view, i);
    }

    public static void setActivated(View view, boolean flag)
    {
        IMPL.setActivated(view, flag);
    }

    public static void setAlpha(View view, float f)
    {
        IMPL.setAlpha(view, f);
    }

    public static void setBackgroundTintList(View view, ColorStateList colorstatelist)
    {
        IMPL.setBackgroundTintList(view, colorstatelist);
    }

    public static void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
    {
        IMPL.setBackgroundTintMode(view, mode);
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setChildrenDrawingOrderEnabled(viewgroup, flag);
    }

    public static void setElevation(View view, float f)
    {
        IMPL.setElevation(view, f);
    }

    public static void setFitsSystemWindows(View view, boolean flag)
    {
        IMPL.setFitsSystemWindows(view, flag);
    }

    public static void setHasTransientState(View view, boolean flag)
    {
        IMPL.setHasTransientState(view, flag);
    }

    public static void setImportantForAccessibility(View view, int i)
    {
        IMPL.setImportantForAccessibility(view, i);
    }

    public static void setLabelFor(View view, int i)
    {
        IMPL.setLabelFor(view, i);
    }

    public static void setLayerPaint(View view, Paint paint)
    {
        IMPL.setLayerPaint(view, paint);
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        IMPL.setLayerType(view, i, paint);
    }

    public static void setLayoutDirection(View view, int i)
    {
        IMPL.setLayoutDirection(view, i);
    }

    public static void setNestedScrollingEnabled(View view, boolean flag)
    {
        IMPL.setNestedScrollingEnabled(view, flag);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        IMPL.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
    }

    public static void setOverScrollMode(View view, int i)
    {
        IMPL.setOverScrollMode(view, i);
    }

    public static void setPaddingRelative(View view, int i, int j, int k, int l)
    {
        IMPL.setPaddingRelative(view, i, j, k, l);
    }

    public static void setPivotX(View view, float f)
    {
        IMPL.setPivotX(view, f);
    }

    public static void setPivotY(View view, float f)
    {
        IMPL.setPivotX(view, f);
    }

    public static void setRotation(View view, float f)
    {
        IMPL.setRotation(view, f);
    }

    public static void setRotationX(View view, float f)
    {
        IMPL.setRotationX(view, f);
    }

    public static void setRotationY(View view, float f)
    {
        IMPL.setRotationY(view, f);
    }

    public static void setSaveFromParentEnabled(View view, boolean flag)
    {
        IMPL.setSaveFromParentEnabled(view, flag);
    }

    public static void setScaleX(View view, float f)
    {
        IMPL.setScaleX(view, f);
    }

    public static void setScaleY(View view, float f)
    {
        IMPL.setScaleY(view, f);
    }

    public static void setTransitionName(View view, String s)
    {
        IMPL.setTransitionName(view, s);
    }

    public static void setTranslationX(View view, float f)
    {
        IMPL.setTranslationX(view, f);
    }

    public static void setTranslationY(View view, float f)
    {
        IMPL.setTranslationY(view, f);
    }

    public static void setTranslationZ(View view, float f)
    {
        IMPL.setTranslationZ(view, f);
    }

    public static void setX(View view, float f)
    {
        IMPL.setX(view, f);
    }

    public static void setY(View view, float f)
    {
        IMPL.setY(view, f);
    }

    public static boolean startNestedScroll(View view, int i)
    {
        return IMPL.startNestedScroll(view, i);
    }

    public static void stopNestedScroll(View view)
    {
        IMPL.stopNestedScroll(view);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new LollipopViewCompatImpl();
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
}
