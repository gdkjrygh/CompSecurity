// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class j
    implements android.view.Window.Callback
{

    final android.view.Window.Callback c;

    public j(android.view.Window.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("Window callback may not be null");
        } else
        {
            c = callback;
            return;
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
    {
        return c.dispatchGenericMotionEvent(motionevent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return c.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return c.dispatchKeyShortcutEvent(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return c.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return c.dispatchTouchEvent(motionevent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return c.dispatchTrackballEvent(motionevent);
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        c.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        c.onActionModeStarted(actionmode);
    }

    public void onAttachedToWindow()
    {
        c.onAttachedToWindow();
    }

    public void onContentChanged()
    {
        c.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return c.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        return c.onCreatePanelView(i);
    }

    public void onDetachedFromWindow()
    {
        c.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        return c.onMenuItemSelected(i, menuitem);
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return c.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        c.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return c.onPreparePanel(i, view, menu);
    }

    public boolean onSearchRequested()
    {
        return c.onSearchRequested();
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
    {
        c.onWindowAttributesChanged(layoutparams);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        c.onWindowFocusChanged(flag);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return c.onWindowStartingActionMode(callback);
    }
}
