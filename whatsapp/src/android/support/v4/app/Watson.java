// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, FragmentManagerImpl, Fragment

public abstract class Watson extends FragmentActivity
    implements com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener, com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener, com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener
{

    public static int b;
    private ArrayList mCreatedMenus;

    public Watson()
    {
    }

    public abstract MenuInflater getSupportMenuInflater();

    public abstract boolean onCreateOptionsMenu(Menu menu);

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        boolean flag;
        int l;
        boolean flag1;
        flag1 = false;
        flag = false;
        l = b;
        if (i != 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        ArrayList arraylist1;
        MenuInflater menuinflater;
        int k;
        flag1 = onCreateOptionsMenu(menu);
        menuinflater = getSupportMenuInflater();
        arraylist1 = null;
        arraylist = null;
        if (mFragments.mAdded == null)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        k = 0;
        i = 0;
_L6:
        int j;
        j = i;
        arraylist1 = arraylist;
        if (k >= mFragments.mAdded.size()) goto _L4; else goto _L3
_L3:
        Fragment fragment = (Fragment)mFragments.mAdded.get(k);
        j = i;
        arraylist1 = arraylist;
        if (fragment != null)
        {
            j = i;
            arraylist1 = arraylist;
            if (!fragment.mHidden)
            {
                j = i;
                arraylist1 = arraylist;
                if (fragment.mHasMenu)
                {
                    j = i;
                    arraylist1 = arraylist;
                    if (fragment.mMenuVisible)
                    {
                        j = i;
                        arraylist1 = arraylist;
                        if (fragment instanceof OnCreateOptionsMenuListener)
                        {
                            ((OnCreateOptionsMenuListener)fragment).onCreateOptionsMenu(menu, menuinflater);
                            if (arraylist == null)
                            {
                                arraylist = new ArrayList();
                            }
                            arraylist.add(fragment);
                            j = 1;
                            arraylist1 = arraylist;
                        }
                    }
                }
            }
        }
        if (l == 0) goto _L5; else goto _L4
_L4:
        if (mCreatedMenus != null)
        {
            i = ((flag) ? 1 : 0);
            do
            {
                if (i >= mCreatedMenus.size())
                {
                    break;
                }
                menu = (Fragment)mCreatedMenus.get(i);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    menu.onDestroyOptionsMenu();
                }
                i++;
            } while (l == 0);
        }
        mCreatedMenus = arraylist1;
        flag1 |= j;
_L2:
        return flag1;
_L5:
        k++;
        i = j;
        arraylist = arraylist1;
          goto _L6
        j = 0;
          goto _L4
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        int j;
        boolean flag;
        boolean flag1;
        flag1 = false;
        j = b;
        flag = flag1;
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!onOptionsItemSelected(menuitem)) goto _L4; else goto _L3
_L3:
        flag = true;
_L2:
        return flag;
_L4:
        flag = flag1;
        if (mFragments.mAdded == null) goto _L2; else goto _L5
_L5:
        i = 0;
_L8:
        flag = flag1;
        if (i >= mFragments.mAdded.size()) goto _L2; else goto _L6
_L6:
        Fragment fragment = (Fragment)mFragments.mAdded.get(i);
        if (fragment != null && !fragment.mHidden && fragment.mHasMenu && fragment.mMenuVisible && (fragment instanceof OnOptionsItemSelectedListener) && ((OnOptionsItemSelectedListener)fragment).onOptionsItemSelected(menuitem))
        {
            return true;
        }
        flag = flag1;
        if (j != 0) goto _L2; else goto _L7
_L7:
        i++;
          goto _L8
    }

    public abstract boolean onOptionsItemSelected(MenuItem menuitem);

    public abstract boolean onPrepareOptionsMenu(Menu menu);

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        int l;
        boolean flag;
        flag = false;
        l = b;
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k;
        flag = onPrepareOptionsMenu(menu);
        if (mFragments.mAdded == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        k = 0;
        i = 0;
_L6:
        int j = i;
        if (k >= mFragments.mAdded.size()) goto _L4; else goto _L3
_L3:
        view = (Fragment)mFragments.mAdded.get(k);
        j = i;
        if (view != null)
        {
            j = i;
            if (!((Fragment) (view)).mHidden)
            {
                j = i;
                if (((Fragment) (view)).mHasMenu)
                {
                    j = i;
                    if (((Fragment) (view)).mMenuVisible)
                    {
                        j = i;
                        if (view instanceof OnPrepareOptionsMenuListener)
                        {
                            j = 1;
                            ((OnPrepareOptionsMenuListener)view).onPrepareOptionsMenu(menu);
                        }
                    }
                }
            }
        }
        if (l == 0) goto _L5; else goto _L4
_L4:
        flag = (flag | j) & menu.hasVisibleItems();
_L2:
        return flag;
_L5:
        k++;
        i = j;
          goto _L6
        j = 0;
          goto _L4
    }

    private class OnCreateOptionsMenuListener
    {

        public abstract void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater);
    }


    private class OnOptionsItemSelectedListener
    {

        public abstract boolean onOptionsItemSelected(MenuItem menuitem);
    }


    private class OnPrepareOptionsMenuListener
    {

        public abstract void onPrepareOptionsMenu(Menu menu);
    }

}
