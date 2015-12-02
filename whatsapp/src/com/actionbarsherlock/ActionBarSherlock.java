// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.ActionBarSherlockCompat;
import com.actionbarsherlock.internal.ActionBarSherlockNative;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class ActionBarSherlock
{

    private static final Class CONSTRUCTOR_ARGS[];
    private static final HashMap IMPLEMENTATIONS;
    public static int a;
    public static boolean isRtl;
    private static final String z[];
    protected final Activity mActivity;
    protected final boolean mIsDelegate;
    protected MenuInflater mMenuInflater;

    protected ActionBarSherlock(Activity activity, int i)
    {
        int j = a;
        super();
        mActivity = activity;
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            mIsDelegate = flag;
            if (SherlockActivity.a)
            {
                a = j + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
    }

    public static void registerImplementation(Class class1)
    {
        try
        {
            if (!class1.isAnnotationPresent(com/actionbarsherlock/ActionBarSherlock$Implementation))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(class1.getSimpleName()).append(z[1]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw class1;
        }
        boolean flag;
        try
        {
            flag = IMPLEMENTATIONS.containsValue(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw class1;
        }
        if (flag)
        {
            return;
        } else
        {
            Implementation implementation = (Implementation)class1.getAnnotation(com/actionbarsherlock/ActionBarSherlock$Implementation);
            IMPLEMENTATIONS.put(implementation, class1);
            return;
        }
    }

    public static ActionBarSherlock wrap(Activity activity, int i)
    {
        Object obj;
        Iterator iterator;
        int j;
        int k;
        int k1;
        k = 0;
        k1 = a;
        obj = new HashMap(IMPLEMENTATIONS);
        iterator = ((HashMap) (obj)).keySet().iterator();
        j = 0;
_L4:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Implementation)iterator.next()).dpi() != 213)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        Iterator iterator1;
        int l;
        int j1;
        boolean flag;
        try
        {
            flag = SherlockActivity.a;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        }
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        SherlockActivity.a = flag;
        j = 1;
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        if (j != 0)
        {
            try
            {
                j = activity.getResources().getDisplayMetrics().densityDpi;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                try
                {
                    throw activity;
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    throw activity;
                }
            }
            if (j == 213)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            iterator1 = ((HashMap) (obj)).keySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                l = ((Implementation)iterator1.next()).dpi();
                if (j != 0 && l != 213 || j == 0 && l == 213)
                {
                    try
                    {
                        iterator1.remove();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Activity activity)
                    {
                        throw activity;
                    }
                }
            } while (k1 == 0);
        }
        iterator1 = ((HashMap) (obj)).keySet().iterator();
        j = 0;
_L8:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Implementation)iterator1.next()).api() == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        j = 1;
        if (k1 == 0) goto _L8; else goto _L7
_L7:
label0:
        {
            if (j == 0)
            {
                break label0;
            }
            int i1;
            try
            {
                flag = isRtl;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                try
                {
                    throw activity;
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    throw activity;
                }
            }
            if (flag)
            {
                i1 = 7;
            } else
            {
                i1 = android.os.Build.VERSION.SDK_INT;
            }
            iterator1 = ((HashMap) (obj)).keySet().iterator();
            j = k;
label1:
            do
            {
label2:
                {
                    k = j;
                    if (!iterator1.hasNext())
                    {
                        break label1;
                    }
                    j1 = ((Implementation)iterator1.next()).api();
                    if (j1 > i1)
                    {
                        try
                        {
                            iterator1.remove();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Activity activity)
                        {
                            try
                            {
                                throw activity;
                            }
                            // Misplaced declaration of an exception variable
                            catch (Activity activity)
                            {
                                throw activity;
                            }
                        }
                        k = j;
                        if (k1 == 0)
                        {
                            break label2;
                        }
                    }
                    k = j;
                    if (j1 > j)
                    {
                        k = j1;
                    }
                }
                j = k;
            } while (k1 == 0);
            iterator1 = ((HashMap) (obj)).keySet().iterator();
label3:
            do
            {
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break label3;
                    }
                } while (((Implementation)iterator1.next()).api() == k);
                iterator1.remove();
            } while (k1 == 0);
        }
        try
        {
            if (((HashMap) (obj)).size() > 1)
            {
                throw new IllegalStateException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        try
        {
            if (((HashMap) (obj)).isEmpty())
            {
                throw new IllegalStateException(z[3]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        obj = (Class)((HashMap) (obj)).values().iterator().next();
        try
        {
            activity = (ActionBarSherlock)((Class) (obj)).getConstructor(CONSTRUCTOR_ARGS).newInstance(new Object[] {
                activity, Integer.valueOf(i)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        return activity;
_L6:
        j = 1;
        if (true) goto _L7; else goto _L2
_L2:
        j = 1;
        if (true) goto _L3; else goto _L9
_L9:
    }

    public abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    protected final boolean callbackCreateOptionsMenu(Menu menu)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        if (!(mActivity instanceof OnCreatePanelMenuListener))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        flag1 = ((OnCreatePanelMenuListener)mActivity).onCreatePanelMenu(0, menu);
        flag = flag1;
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = flag1;
        boolean flag2;
        try
        {
            flag2 = mActivity instanceof OnCreateOptionsMenuListener;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (flag2)
        {
            flag = ((OnCreateOptionsMenuListener)mActivity).onCreateOptionsMenu(menu);
        }
        return flag;
    }

    protected final boolean callbackOptionsItemSelected(MenuItem menuitem)
    {
        if (!(mActivity instanceof OnMenuItemSelectedListener)) goto _L2; else goto _L1
_L1:
        boolean flag;
        boolean flag1;
        flag1 = ((OnMenuItemSelectedListener)mActivity).onMenuItemSelected(0, menuitem);
        flag = flag1;
        if (a == 0) goto _L4; else goto _L3
_L3:
        flag = flag1;
_L6:
        boolean flag2;
        try
        {
            flag2 = mActivity instanceof OnOptionsItemSelectedListener;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (flag2)
        {
            flag = ((OnOptionsItemSelectedListener)mActivity).onOptionsItemSelected(menuitem);
        }
_L4:
        return flag;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final boolean callbackPrepareOptionsMenu(Menu menu)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        if (!(mActivity instanceof OnPreparePanelListener))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag1 = ((OnPreparePanelListener)mActivity).onPreparePanel(0, null, menu);
        flag = flag1;
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = flag1;
        boolean flag2;
        try
        {
            flag2 = mActivity instanceof OnPrepareOptionsMenuListener;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (flag2)
        {
            flag = ((OnPrepareOptionsMenuListener)mActivity).onPrepareOptionsMenu(menu);
        }
        return flag;
    }

    public boolean dispatchCloseOptionsMenu()
    {
        return false;
    }

    public void dispatchConfigurationChanged(Configuration configuration)
    {
    }

    public abstract boolean dispatchCreateOptionsMenu(android.view.Menu menu);

    public void dispatchDestroy()
    {
    }

    public abstract void dispatchInvalidateOptionsMenu();

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return false;
    }

    public boolean dispatchMenuOpened(int i, android.view.Menu menu)
    {
        return false;
    }

    public boolean dispatchOpenOptionsMenu()
    {
        return false;
    }

    public abstract boolean dispatchOptionsItemSelected(android.view.MenuItem menuitem);

    public void dispatchPanelClosed(int i, android.view.Menu menu)
    {
    }

    public void dispatchPause()
    {
    }

    public void dispatchPostCreate(Bundle bundle)
    {
    }

    public void dispatchPostResume()
    {
    }

    public abstract boolean dispatchPrepareOptionsMenu(android.view.Menu menu);

    public void dispatchRestoreInstanceState(Bundle bundle)
    {
    }

    public void dispatchSaveInstanceState(Bundle bundle)
    {
    }

    public void dispatchStop()
    {
    }

    public void dispatchTitleChanged(CharSequence charsequence, int i)
    {
    }

    public abstract ActionBar getActionBar();

    public MenuInflater getMenuInflater()
    {
        Object obj = mMenuInflater;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            obj = getActionBar();
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            try
            {
                throw illegalargumentexception1;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        mMenuInflater = new MenuInflater(getThemedContext(), mActivity);
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        mMenuInflater = new MenuInflater(mActivity);
        return mMenuInflater;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    protected abstract Context getThemedContext();

    public abstract boolean requestFeature(int i);

    public abstract void setContentView(int i);

    public void setContentView(View view)
    {
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void setProgressBarIndeterminateVisibility(boolean flag);

    public abstract ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback);

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\005\013\024\0136f";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "f\016\006X+)\023U\031+(\b\001\0311#\003U\017,2\017U8\f+\027\031\035(#\t\001\0311/\b\033";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\013\b\007\035e2\017\024\026e)\t\020X,+\027\031\035(#\t\001\0311/\b\033X('\023\026\020 5G\026\027+ \016\022\r7'\023\034\027+h";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\b\bU\021(6\013\020\025 (\023\024\f,)\t\006X('\023\026\020e%\b\033\036,!\022\007\0311/\b\033V";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                CONSTRUCTOR_ARGS = (new Class[] {
                    android/app/Activity, Integer.TYPE
                });
                IMPLEMENTATIONS = new HashMap();
                isRtl = true;
                registerImplementation(com/actionbarsherlock/internal/ActionBarSherlockCompat);
                registerImplementation(com/actionbarsherlock/internal/ActionBarSherlockNative);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 220
    //                   0 241
    //                   1 247
    //                   2 253
    //                   3 259;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_259;
_L3:
        byte byte0 = 69;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 70;
          goto _L9
_L5:
        byte0 = 103;
          goto _L9
_L6:
        byte0 = 117;
          goto _L9
        byte0 = 120;
          goto _L9
    }

    private class Implementation
        implements Annotation
    {

        public abstract int api();

        public abstract int dpi();
    }


    private class OnCreatePanelMenuListener
    {

        public abstract boolean onCreatePanelMenu(int i, Menu menu);
    }


    private class OnCreateOptionsMenuListener
    {

        public abstract boolean onCreateOptionsMenu(Menu menu);
    }


    private class OnMenuItemSelectedListener
    {

        public abstract boolean onMenuItemSelected(int i, MenuItem menuitem);
    }


    private class OnOptionsItemSelectedListener
    {

        public abstract boolean onOptionsItemSelected(MenuItem menuitem);
    }


    private class OnPreparePanelListener
    {

        public abstract boolean onPreparePanel(int i, View view, Menu menu);
    }


    private class OnPrepareOptionsMenuListener
    {

        public abstract boolean onPrepareOptionsMenu(Menu menu);
    }

}
