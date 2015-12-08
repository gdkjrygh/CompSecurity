// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package com.go.weatherex.sidebar:
//            SidebarDrawerLayout

class k extends AccessibilityDelegateCompat
{

    final SidebarDrawerLayout a;
    private final Rect b = new Rect();

    k(SidebarDrawerLayout sidebardrawerlayout)
    {
        a = sidebardrawerlayout;
        super();
    }

    private void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
    {
        Rect rect = b;
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

    private void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
    {
        int i;
        int j;
        j = viewgroup.getChildCount();
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        View view = viewgroup.getChildAt(i);
        if (!a(view)) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        switch (ViewCompat.getImportantForAccessibility(view))
        {
        case 0: // '\0'
            ViewCompat.setImportantForAccessibility(view, 1);
            // fall through

        case 1: // '\001'
            accessibilitynodeinfocompat.addChild(view);
            break;

        case 2: // '\002'
            if (view instanceof ViewGroup)
            {
                a(accessibilitynodeinfocompat, (ViewGroup)view);
            }
            break;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public boolean a(View view)
    {
        View view1 = a.a();
        return view1 != null && view1 != view;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = SidebarDrawerLayout.a(a);
            if (accessibilityevent != null)
            {
                int i = a.e(accessibilityevent);
                accessibilityevent = a.c(i);
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
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
        accessibilitynodeinfocompat.setClassName(android/support/v4/widget/DrawerLayout.getName());
        accessibilitynodeinfocompat.setSource(view);
        android.view.ViewParent viewparent = ViewCompat.getParentForAccessibility(view);
        if (viewparent instanceof View)
        {
            accessibilitynodeinfocompat.setParent((View)viewparent);
        }
        a(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
        accessibilitynodeinfocompat1.recycle();
        a(accessibilitynodeinfocompat, (ViewGroup)view);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (!a(view))
        {
            return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }
}
