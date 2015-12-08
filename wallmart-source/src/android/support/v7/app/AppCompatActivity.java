// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatCallback, AppCompatDelegate, ActionBar

public class AppCompatActivity extends FragmentActivity
    implements android.support.v4.app.TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider, AppCompatCallback
{

    private AppCompatDelegate mDelegate;

    public AppCompatActivity()
    {
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public AppCompatDelegate getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = AppCompatDelegate.create(this, this);
        }
        return mDelegate;
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return getDelegate().getDrawerToggleDelegate();
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().getMenuInflater();
    }

    public ActionBar getSupportActionBar()
    {
        return getDelegate().getSupportActionBar();
    }

    public Intent getSupportParentActivityIntent()
    {
        return NavUtils.getParentActivityIntent(this);
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getDelegate().onConfigurationChanged(configuration);
    }

    public void onContentChanged()
    {
        onSupportContentChanged();
    }

    protected void onCreate(Bundle bundle)
    {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
        taskstackbuilder.addParentStack(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = getSupportActionBar();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.getDisplayOptions() & 4) != 0)
        {
            return onSupportNavigateUp();
        } else
        {
            return false;
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
    }

    protected void onStop()
    {
        super.onStop();
        getDelegate().onStop();
    }

    public void onSupportActionModeFinished(ActionMode actionmode)
    {
    }

    public void onSupportActionModeStarted(ActionMode actionmode)
    {
    }

    public void onSupportContentChanged()
    {
    }

    public boolean onSupportNavigateUp()
    {
        Object obj = getSupportParentActivityIntent();
        if (obj != null)
        {
            if (supportShouldUpRecreateTask(((Intent) (obj))))
            {
                obj = TaskStackBuilder.create(this);
                onCreateSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
                onPrepareSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
                ((TaskStackBuilder) (obj)).startActivities();
                try
                {
                    ActivityCompat.finishAffinity(this);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    finish();
                }
            } else
            {
                supportNavigateUpTo(((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        getDelegate().setTitle(charsequence);
    }

    public ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return null;
    }

    public void setContentView(int i)
    {
        getDelegate().setContentView(i);
    }

    public void setContentView(View view)
    {
        getDelegate().setContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().setContentView(view, layoutparams);
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        getDelegate().setSupportActionBar(toolbar);
    }

    public void setSupportProgress(int i)
    {
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return getDelegate().startSupportActionMode(callback);
    }

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        NavUtils.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return getDelegate().requestWindowFeature(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }
}
