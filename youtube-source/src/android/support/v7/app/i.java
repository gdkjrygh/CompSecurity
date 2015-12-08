// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.app:
//            h

final class i
    implements android.view.Window.Callback
{

    final android.view.Window.Callback a;
    final h b;

    public i(h h1, android.view.Window.Callback callback)
    {
        b = h1;
        super();
        a = callback;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionevent)
    {
        return a.dispatchGenericMotionEvent(motionevent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.dispatchKeyEvent(keyevent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return a.dispatchKeyShortcutEvent(keyevent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return a.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return a.dispatchTouchEvent(motionevent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return a.dispatchTrackballEvent(motionevent);
    }

    public final void onActionModeFinished(ActionMode actionmode)
    {
        a.onActionModeFinished(actionmode);
        b.b(actionmode);
    }

    public final void onActionModeStarted(ActionMode actionmode)
    {
        a.onActionModeStarted(actionmode);
        b.a(actionmode);
    }

    public final void onAttachedToWindow()
    {
        a.onAttachedToWindow();
    }

    public final void onContentChanged()
    {
        a.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int j, Menu menu)
    {
        return a.onCreatePanelMenu(j, menu);
    }

    public final View onCreatePanelView(int j)
    {
        return a.onCreatePanelView(j);
    }

    public final void onDetachedFromWindow()
    {
        a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int j, MenuItem menuitem)
    {
        return a.onMenuItemSelected(j, menuitem);
    }

    public final boolean onMenuOpened(int j, Menu menu)
    {
        return a.onMenuOpened(j, menu);
    }

    public final void onPanelClosed(int j, Menu menu)
    {
        a.onPanelClosed(j, menu);
    }

    public final boolean onPreparePanel(int j, View view, Menu menu)
    {
        return a.onPreparePanel(j, view, menu);
    }

    public final boolean onSearchRequested()
    {
        return a.onSearchRequested();
    }

    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
    {
        a.onWindowAttributesChanged(layoutparams);
    }

    public final void onWindowFocusChanged(boolean flag)
    {
        a.onWindowFocusChanged(flag);
    }

    public final ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return a.onWindowStartingActionMode(callback);
    }
}
