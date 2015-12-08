// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

class this._cls0 extends AccessibilityDelegateCompat
{

    private final Rect mTmpRect = new Rect();
    final DrawerLayout this$0;

    private void addChildrenForAccessibility(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
    {
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = viewgroup.getChildAt(i);
            if (DrawerLayout.access$400(view))
            {
                accessibilitynodeinfocompat.addChild(view);
            }
        }

    }

    private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
    {
        Rect rect = mTmpRect;
        accessibilitynodeinfocompat1.getBoundsInParent(rect);
        accessibilitynodeinfocompat.setBoundsInParent(rect);
        accessibilitynodeinfocompat1.getBoundsInScreen(rect);
        accessibilitynodeinfocompat.setBoundsInScreen(rect);
        accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
        accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
        accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
        accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
        accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
        accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
        accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
        accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
        accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
        accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
        accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
        accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = DrawerLayout.access$300(DrawerLayout.this);
            if (accessibilityevent != null)
            {
                int i = getDrawerViewAbsoluteGravity(accessibilityevent);
                accessibilityevent = getDrawerTitle(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        if (DrawerLayout.access$200())
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        } else
        {
            AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat.setSource(view);
            android.view.ViewParent viewparent = ViewCompat.getParentForAccessibility(view);
            if (viewparent instanceof View)
            {
                accessibilitynodeinfocompat.setParent((View)viewparent);
            }
            copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat1.recycle();
            addChildrenForAccessibility(accessibilitynodeinfocompat, (ViewGroup)view);
        }
        accessibilitynodeinfocompat.setClassName(android/support/v4/widget/DrawerLayout.getName());
        accessibilitynodeinfocompat.setFocusable(false);
        accessibilitynodeinfocompat.setFocused(false);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.access$200() || DrawerLayout.access$400(view))
        {
            return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    mpat()
    {
        this$0 = DrawerLayout.this;
        super();
    }
}
