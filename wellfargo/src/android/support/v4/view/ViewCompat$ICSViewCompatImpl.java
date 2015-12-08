// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewCompatICS, AccessibilityDelegateCompat

class deInfoCompat extends deInfoCompat
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


    deInfoCompat()
    {
    }
}
