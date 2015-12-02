// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, LoaderManagerImpl, Fragment, ActivityCompat, 
//            ActivityCompatHoneycomb, FragmentContainer, FragmentManager, LoaderManager

public class FragmentActivity extends Activity
{

    public static int a;
    private static final String z[];
    SimpleArrayMap mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final FragmentContainer mContainer = new _cls2();
    boolean mCreated;
    final FragmentManagerImpl mFragments = new FragmentManagerImpl();
    final Handler mHandler = new _cls1();
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    public FragmentActivity()
    {
    }

    private void dumpViewHierarchy(String s, PrintWriter printwriter, View view)
    {
        int j;
        j = a;
        try
        {
            printwriter.print(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (view != null) goto _L2; else goto _L1
_L1:
        printwriter.println(z[26]);
_L4:
        return;
_L2:
        int i;
        int k;
        boolean flag;
        try
        {
            printwriter.println(viewToString(view));
            flag = view instanceof ViewGroup;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = (ViewGroup)view;
        k = view.getChildCount();
        if (k <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = (new StringBuilder()).append(s).append(z[25]).toString();
        i = 0;
        do
        {
            if (i >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            dumpViewHierarchy(s, printwriter, view.getChildAt(i));
            i++;
        } while (j == 0);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String viewToString(View view)
    {
        byte byte0;
        byte byte1;
        byte byte2;
        StringBuilder stringbuilder;
        int i;
        byte2 = 86;
        byte1 = 70;
        byte0 = 46;
        i = a;
        stringbuilder = new StringBuilder(128);
        int j;
        stringbuilder.append(view.getClass().getName());
        stringbuilder.append('{');
        stringbuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringbuilder.append(' ');
        j = view.getVisibility();
        j;
        JVM INSTR lookupswitch 3: default 112
    //                   0: 579
    //                   4: 592
    //                   8: 605;
           goto _L1 _L2 _L3 _L4
_L1:
        char c;
        Object obj;
        boolean flag;
        try
        {
            stringbuilder.append('.');
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
_L11:
        try
        {
            flag = view.isFocusable();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = 'F';
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isEnabled();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = 'E';
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.willNotDraw();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = '.';
        } else
        {
            c = 'D';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isHorizontalScrollBarEnabled();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = 'H';
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isVerticalScrollBarEnabled();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = byte2;
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isClickable();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = 'C';
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isLongClickable();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = 'L';
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            stringbuilder.append(' ');
            flag = view.isFocused();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = byte1;
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isSelected();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            c = 'S';
        } else
        {
            c = '.';
        }
        try
        {
            stringbuilder.append(c);
            flag = view.isPressed();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        c = byte0;
        if (flag)
        {
            c = 'P';
        }
        stringbuilder.append(c);
        stringbuilder.append(' ');
        stringbuilder.append(view.getLeft());
        stringbuilder.append(',');
        stringbuilder.append(view.getTop());
        stringbuilder.append('-');
        stringbuilder.append(view.getRight());
        stringbuilder.append(',');
        stringbuilder.append(view.getBottom());
        j = view.getId();
        if (j == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(z[19]);
        stringbuilder.append(Integer.toHexString(j));
        obj = view.getResources();
        if (j == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & j;
        JVM INSTR lookupswitch 2: default 492
    //                   16777216: 729
    //                   2130706432: 717;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(j);
_L12:
        String s = ((Resources) (obj)).getResourceTypeName(j);
        obj = ((Resources) (obj)).getResourceEntryName(j);
        stringbuilder.append(" ");
        stringbuilder.append(view);
        stringbuilder.append(":");
        stringbuilder.append(s);
        stringbuilder.append("/");
        stringbuilder.append(((String) (obj)));
_L6:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L2:
        stringbuilder.append('V');
        if (i == 0) goto _L11; else goto _L3
_L3:
        stringbuilder.append('I');
        if (i == 0) goto _L11; else goto _L4
_L4:
        stringbuilder.append('G');
        if (i == 0) goto _L11; else goto _L1
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
_L10:
        view = z[21];
        if (i == 0) goto _L12; else goto _L9
_L9:
        view = z[20];
        if (i == 0) goto _L12; else goto _L8
        view;
          goto _L6
    }

    void doReallyStop(boolean flag)
    {
        try
        {
            if (!mReallyStopped)
            {
                mReallyStopped = true;
                mRetaining = flag;
                mHandler.removeMessages(1);
                onReallyStop();
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        printwriter.print(s);
        printwriter.print(z[5]);
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(z[3]);
        String s1 = (new StringBuilder()).append(s).append(z[11]).toString();
        try
        {
            printwriter.print(s1);
            printwriter.print(z[7]);
            printwriter.print(mCreated);
            printwriter.print(z[2]);
            printwriter.print(mResumed);
            printwriter.print(z[6]);
            printwriter.print(mStopped);
            printwriter.print(z[9]);
            printwriter.println(mReallyStopped);
            printwriter.print(s1);
            printwriter.print(z[13]);
            printwriter.println(mLoadersStarted);
            if (mLoaderManager != null)
            {
                printwriter.print(s);
                printwriter.print(z[12]);
                printwriter.print(Integer.toHexString(System.identityHashCode(mLoaderManager)));
                printwriter.println(":");
                mLoaderManager.dump((new StringBuilder()).append(s).append(z[4]).toString(), filedescriptor, printwriter, as);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        mFragments.dump(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.println(z[10]);
        dumpViewHierarchy((new StringBuilder()).append(s).append(z[8]).toString(), printwriter, getWindow().getDecorView());
    }

    LoaderManagerImpl getLoaderManager(String s, boolean flag, boolean flag1)
    {
        LoaderManagerImpl loadermanagerimpl;
        LoaderManagerImpl loadermanagerimpl1;
        try
        {
            if (mAllLoaderManagers == null)
            {
                mAllLoaderManagers = new SimpleArrayMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        loadermanagerimpl1 = (LoaderManagerImpl)mAllLoaderManagers.get(s);
        loadermanagerimpl = loadermanagerimpl1;
        if (loadermanagerimpl1 != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        loadermanagerimpl = loadermanagerimpl1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        loadermanagerimpl1 = new LoaderManagerImpl(s, this, flag);
        try
        {
            mAllLoaderManagers.put(s, loadermanagerimpl1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        loadermanagerimpl = loadermanagerimpl1;
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        loadermanagerimpl = loadermanagerimpl1;
        loadermanagerimpl.updateActivity(this);
        return loadermanagerimpl;
    }

    public FragmentManager getSupportFragmentManager()
    {
        return mFragments;
    }

    public LoaderManager getSupportLoaderManager()
    {
label0:
        {
            LoaderManagerImpl loadermanagerimpl;
            try
            {
                if (mLoaderManager == null)
                {
                    break label0;
                }
                loadermanagerimpl = mLoaderManager;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
            return loadermanagerimpl;
        }
        mCheckedForLoaderManager = true;
        mLoaderManager = getLoaderManager(z[0], mLoadersStarted, true);
        return mLoaderManager;
    }

    void invalidateSupportFragment(String s)
    {
        LoaderManagerImpl loadermanagerimpl;
        if (mAllLoaderManagers == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(s);
        if (loadermanagerimpl == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (!loadermanagerimpl.mRetaining)
        {
            loadermanagerimpl.doDestroy();
            mAllLoaderManagers.remove(s);
        }
        return;
        s;
        throw s;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        int k;
        mFragments.noteStateNotSaved();
        k = i >> 16;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        k--;
        ArrayList arraylist;
        try
        {
            arraylist = mFragments.mActive;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (arraylist == null || k < 0) goto _L2; else goto _L1
_L1:
        if (k < mFragments.mActive.size()) goto _L3; else goto _L2
_L2:
        Log.w(z[17], (new StringBuilder()).append(z[15]).append(Integer.toHexString(i)).toString());
_L5:
        return;
_L3:
        Fragment fragment;
        fragment = (Fragment)mFragments.mActive.get(k);
        if (fragment != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.w(z[16], (new StringBuilder()).append(z[14]).append(Integer.toHexString(i)).toString());
        if (a == 0) goto _L5; else goto _L4
_L4:
        fragment.onActivityResult(0xffff & i, j, intent);
        return;
        intent;
        throw intent;
        super.onActivityResult(i, j, intent);
        return;
    }

    public void onAttachFragment(Fragment fragment)
    {
    }

    public void onBackPressed()
    {
        try
        {
            if (!mFragments.popBackStackImmediate())
            {
                supportFinishAfterTransition();
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mFragments.dispatchConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        android.os.Parcelable parcelable;
        FragmentManagerImpl fragmentmanagerimpl;
        NonConfigurationInstances nonconfigurationinstances;
        try
        {
            mFragments.attachActivity(this, mContainer, null);
            if (getLayoutInflater().getFactory() == null)
            {
                getLayoutInflater().setFactory(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        super.onCreate(bundle);
        nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
        if (nonconfigurationinstances != null)
        {
            try
            {
                mAllLoaderManagers = nonconfigurationinstances.loaders;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcelable = bundle.getParcelable(z[1]);
        try
        {
            fragmentmanagerimpl = mFragments;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (nonconfigurationinstances == null) goto _L4; else goto _L3
_L3:
        bundle = nonconfigurationinstances.fragments;
_L6:
        fragmentmanagerimpl.restoreAllState(parcelable, bundle);
_L2:
        mFragments.dispatchCreate();
        return;
_L4:
        bundle = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = super.onCreatePanelMenu(i, menu);
            boolean flag1 = mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater());
            try
            {
                i = android.os.Build.VERSION.SDK_INT;
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        if (z[24].equals(s)) goto _L2; else goto _L1
_L1:
        View view = super.onCreateView(s, context, attributeset);
_L4:
        return view;
        s;
        throw s;
_L2:
        View view1 = mFragments.onCreateView(s, context, attributeset);
        view = view1;
        if (view1 == null)
        {
            try
            {
                s = super.onCreateView(s, context, attributeset);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDestroy()
    {
        try
        {
            super.onDestroy();
            doReallyStop(false);
            mFragments.dispatchDestroy();
            if (mLoaderManager != null)
            {
                mLoaderManager.doDestroy();
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        int j;
        try
        {
            j = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            try
            {
                throw keyevent;
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent) { }
            try
            {
                throw keyevent;
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
        }
        if (j >= 5 || i != 4)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (keyevent.getRepeatCount() != 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        onBackPressed();
        return true;
        return super.onKeyDown(i, keyevent);
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        mFragments.dispatchLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        boolean flag;
        try
        {
            flag = super.onMenuItemSelected(i, menuitem);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (flag)
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            boolean flag1;
            try
            {
                flag1 = mFragments.dispatchOptionsItemSelected(menuitem);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            return flag1;

        case 6: // '\006'
            return mFragments.dispatchContextItemSelected(menuitem);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        mFragments.noteStateNotSaved();
    }

    public void onPanelClosed(int i, Menu menu)
    {
        switch (i)
        {
        default:
            super.onPanelClosed(i, menu);
            return;

        case 0: // '\0'
            break;
        }
        try
        {
            mFragments.dispatchOptionsMenuClosed(menu);
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
    }

    protected void onPause()
    {
        try
        {
            super.onPause();
            mResumed = false;
            if (mHandler.hasMessages(2))
            {
                mHandler.removeMessages(2);
                onResumeFragments();
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        mFragments.dispatchPause();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        mHandler.removeMessages(2);
        onResumeFragments();
        mFragments.execPendingActions();
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0 && menu != null)
        {
            try
            {
                if (mOptionsMenuInvalidated)
                {
                    mOptionsMenuInvalidated = false;
                    menu.clear();
                    onCreatePanelMenu(i, menu);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            return onPrepareOptionsPanel(view, menu) | mFragments.dispatchPrepareOptionsMenu(menu);
        } else
        {
            return super.onPreparePanel(i, view, menu);
        }
    }

    void onReallyStop()
    {
        boolean flag = mLoadersStarted;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        LoaderManagerImpl loadermanagerimpl;
        mLoadersStarted = false;
        loadermanagerimpl = mLoaderManager;
        if (loadermanagerimpl == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        android.content.res.Resources.NotFoundException notfoundexception;
        boolean flag1;
        try
        {
            flag1 = mRetaining;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception1)
        {
            try
            {
                throw notfoundexception1;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception2)
            {
                throw notfoundexception2;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        mLoaderManager.doStop();
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        mLoaderManager.doRetain();
        mFragments.dispatchReallyStop();
        return;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
    }

    protected void onResume()
    {
        super.onResume();
        mHandler.sendEmptyMessage(2);
        mResumed = true;
        mFragments.execPendingActions();
    }

    protected void onResumeFragments()
    {
        mFragments.dispatchResume();
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return null;
    }

    public final Object onRetainNonConfigurationInstance()
    {
        Object obj;
        ArrayList arraylist;
        int i;
        int j;
        int k = 0;
        int l = a;
        LoaderManagerImpl aloadermanagerimpl[];
        LoaderManagerImpl loadermanagerimpl;
        int i1;
        try
        {
            if (mStopped)
            {
                doReallyStop(true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = onRetainCustomNonConfigurationInstance();
        arraylist = mFragments.retainNonConfig();
        if (mAllLoaderManagers == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        i1 = mAllLoaderManagers.size();
        aloadermanagerimpl = new LoaderManagerImpl[i1];
        i = i1 - 1;
_L11:
        if (i < 0) goto _L2; else goto _L1
_L1:
        aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
        if (l == 0) goto _L3; else goto _L2
_L2:
        i = 0;
_L9:
        j = i;
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        loadermanagerimpl = aloadermanagerimpl[k];
        if (!loadermanagerimpl.mRetaining) goto _L5; else goto _L4
_L4:
        if (l == 0) goto _L7; else goto _L6
_L6:
        i = 1;
_L5:
        try
        {
            loadermanagerimpl.doDestroy();
            mAllLoaderManagers.remove(loadermanagerimpl.mWho);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        j = i;
_L10:
        k++;
        i = j;
        if (l == 0) goto _L9; else goto _L8
_L8:
        if (arraylist == null && j == 0 && obj == null)
        {
            return null;
        } else
        {
            NonConfigurationInstances nonconfigurationinstances = new NonConfigurationInstances();
            nonconfigurationinstances.activity = null;
            nonconfigurationinstances.custom = obj;
            nonconfigurationinstances.children = null;
            nonconfigurationinstances.fragments = arraylist;
            nonconfigurationinstances.loaders = mAllLoaderManagers;
            return nonconfigurationinstances;
        }
_L7:
        j = 1;
          goto _L10
_L3:
        i--;
          goto _L11
        j = 0;
          goto _L8
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        android.os.Parcelable parcelable;
        super.onSaveInstanceState(bundle);
        parcelable = mFragments.saveAllState();
        if (parcelable == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        bundle.putParcelable(z[18], parcelable);
        return;
        bundle;
        throw bundle;
    }

    protected void onStart()
    {
        int i;
        int j = a;
        LoaderManagerImpl loadermanagerimpl;
        LoaderManagerImpl aloadermanagerimpl[];
        LoaderManagerImpl loadermanagerimpl1;
        int k;
        boolean flag;
        try
        {
            super.onStart();
            mStopped = false;
            mReallyStopped = false;
            mHandler.removeMessages(1);
            if (!mCreated)
            {
                mCreated = true;
                mFragments.dispatchActivityCreated();
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        mFragments.noteStateNotSaved();
        mFragments.execPendingActions();
        flag = mLoadersStarted;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        mLoadersStarted = true;
        loadermanagerimpl = mLoaderManager;
        if (loadermanagerimpl == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        mLoaderManager.doStart();
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        flag = mCheckedForLoaderManager;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        mLoaderManager = getLoaderManager(z[27], mLoadersStarted, false);
        loadermanagerimpl = mLoaderManager;
        android.content.res.Resources.NotFoundException notfoundexception1;
        if (loadermanagerimpl != null)
        {
            try
            {
                if (!mLoaderManager.mStarted)
                {
                    mLoaderManager.doStart();
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception2)
            {
                throw notfoundexception2;
            }
        }
        mCheckedForLoaderManager = true;
        mFragments.dispatchStart();
        if (mAllLoaderManagers == null) goto _L2; else goto _L1
_L1:
        k = mAllLoaderManagers.size();
        aloadermanagerimpl = new LoaderManagerImpl[k];
        i = k - 1;
_L7:
        if (i < 0) goto _L4; else goto _L3
_L3:
        aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
        if (j == 0) goto _L5; else goto _L4
_L4:
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            loadermanagerimpl1 = aloadermanagerimpl[i];
            loadermanagerimpl1.finishRetain();
            loadermanagerimpl1.doReportStart();
            i++;
        } while (j == 0);
_L2:
        return;
        notfoundexception1;
        throw notfoundexception1;
        notfoundexception1;
        throw notfoundexception1;
        notfoundexception1;
        throw notfoundexception1;
        notfoundexception1;
        throw notfoundexception1;
        notfoundexception1;
        throw notfoundexception1;
_L5:
        i--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onStop()
    {
        super.onStop();
        mStopped = true;
        mHandler.sendEmptyMessage(1);
        mFragments.dispatchStop();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        if (i != -1 && (0xffff0000 & i) != 0)
        {
            try
            {
                throw new IllegalArgumentException(z[23]);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        } else
        {
            super.startActivityForResult(intent, i);
            return;
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
    {
        if (i == -1)
        {
            try
            {
                super.startActivityForResult(intent, -1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        }
        if ((0xffff0000 & i) != 0)
        {
            try
            {
                throw new IllegalArgumentException(z[22]);
            }
            // Misplaced declaration of an exception variable
            catch (Fragment fragment)
            {
                throw fragment;
            }
        } else
        {
            super.startActivityForResult(intent, (fragment.mIndex + 1 << 16) + (0xffff & i));
            return;
        }
    }

    public void supportFinishAfterTransition()
    {
        ActivityCompat.finishAfterTransition(this);
    }

    public void supportInvalidateOptionsMenu()
    {
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                ActivityCompatHoneycomb.invalidateOptionsMenu(this);
                return;
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        mOptionsMenuInvalidated = true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[28];
        obj = "zN.4;{";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "3R%) ;X{(:\"L.);hZ3:(?Y//<";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "?n$(:?Y%f";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "ro5:;7\006";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "r\034";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\036S\":#rz3:(?Y//\0161H(-&&Ea";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "rQ\022/ \"L$?r";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "?\1773>.&Y%f";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "r\034";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "rQ\023>.>P8\b;=L1>+o";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\004U$,o\032U$). _)\"u";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "r\034";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\036S ?* \034\f:!3[$)o";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "?p.:+7N2\b;3N5>+o";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\023_529;H8{=7O47;rR.{) ]&6*<Ha>7;O5(o4S3{&<X$#ur\f9";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\023_529;H8{=7O47;rZ3:(?Y//o;R%>7rS4/o=Za).<[$aobD";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\024N <\"7R5\032,&U72;+";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\024N <\"7R5\032,&U72;+";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "3R%) ;X{(:\"L.);hZ3:(?Y//<";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "r\037";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "3R%) ;X";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "3L1";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\021]/{ <P8{:!Ya7 %Y3{~d\034#2;!\034'4=rN$*:7O5\030 6Y";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\021]/{ <P8{:!Ya7 %Y3{~d\034#2;!\034'4=rN$*:7O5\030 6Y";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "4N <\"7R5";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "r\034";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "<I-7";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "zN.4;{";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 696
    //                   0 719
    //                   1 726
    //                   2 733
    //                   3 740;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_740;
_L3:
        byte byte1 = 79;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 82;
          goto _L9
_L5:
        byte1 = 60;
          goto _L9
_L6:
        byte1 = 65;
          goto _L9
        byte1 = 91;
          goto _L9
    }

    private class _cls1 extends Handler
    {

        final FragmentActivity this$0;

        public void handleMessage(Message message)
        {
            int i = FragmentActivity.a;
            message.what;
            JVM INSTR tableswitch 1 2: default 32
        //                       1 38
        //                       2 60;
               goto _L1 _L2 _L3
_L1:
            super.handleMessage(message);
_L5:
            return;
_L2:
            if (!mStopped) goto _L5; else goto _L4
_L4:
            doReallyStop(false);
            if (i == 0) goto _L5; else goto _L3
_L3:
            onResumeFragments();
            mFragments.execPendingActions();
            if (i == 0) goto _L5; else goto _L1
        }

        _cls1()
        {
            this$0 = FragmentActivity.this;
            super();
        }
    }


    private class _cls2
        implements FragmentContainer
    {

        final FragmentActivity this$0;

        public View findViewById(int i)
        {
            return FragmentActivity.this.findViewById(i);
        }

        public boolean hasView()
        {
            Window window = getWindow();
            return window != null && window.peekDecorView() != null;
        }

        _cls2()
        {
            this$0 = FragmentActivity.this;
            super();
        }
    }


    private class NonConfigurationInstances
    {

        Object activity;
        SimpleArrayMap children;
        Object custom;
        ArrayList fragments;
        SimpleArrayMap loaders;

        NonConfigurationInstances()
        {
        }
    }

}
