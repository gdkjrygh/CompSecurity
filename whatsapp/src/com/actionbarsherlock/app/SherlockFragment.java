// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.app;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.actionbarsherlock.internal.view.menu.MenuItemWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;

// Referenced classes of package com.actionbarsherlock.app:
//            SherlockFragmentActivity

public class SherlockFragment extends Fragment
    implements android.support.v4.app.Watson.OnCreateOptionsMenuListener, android.support.v4.app.Watson.OnPrepareOptionsMenuListener, android.support.v4.app.Watson.OnOptionsItemSelectedListener
{

    private static final String z;
    private SherlockFragmentActivity mActivity;

    public SherlockFragment()
    {
    }

    public void onAttach(Activity activity)
    {
        try
        {
            if (!(activity instanceof SherlockFragmentActivity))
            {
                throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(z).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        mActivity = (SherlockFragmentActivity)activity;
        super.onAttach(activity);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        onCreateOptionsMenu(((com.actionbarsherlock.view.Menu) (new MenuWrapper(menu))), mActivity.getSupportMenuInflater());
    }

    public void onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu, com.actionbarsherlock.view.MenuInflater menuinflater)
    {
    }

    public void onDetach()
    {
        mActivity = null;
        super.onDetach();
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return onOptionsItemSelected(((com.actionbarsherlock.view.MenuItem) (new MenuItemWrapper(menuitem))));
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuitem)
    {
        return false;
    }

    public final void onPrepareOptionsMenu(Menu menu)
    {
        onPrepareOptionsMenu(((com.actionbarsherlock.view.Menu) (new MenuWrapper(menu))));
    }

    public void onPrepareOptionsMenu(com.actionbarsherlock.view.Menu menu)
    {
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "=b\036m}=m\016>hi{\n}axkKjf=nKMax}\007qjvI\031\177npj\005jH~{\002h`ivE".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 9;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 29;
          goto _L8
_L3:
        byte0 = 15;
          goto _L8
_L4:
        byte0 = 107;
          goto _L8
        byte0 = 30;
          goto _L8
    }
}
