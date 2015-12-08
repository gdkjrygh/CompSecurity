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
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            t, u, a, f

public class AppCompatActivity extends FragmentActivity
    implements android.support.v4.app.TaskStackBuilder.SupportParentable, t
{

    private u a;

    public AppCompatActivity()
    {
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().b(view, layoutparams);
    }

    public u getDelegate()
    {
        if (a == null)
        {
            a = android.support.v7.app.u.a(this, this);
        }
        return a;
    }

    public f getDrawerToggleDelegate()
    {
        return getDelegate().g();
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().b();
    }

    public android.support.v7.app.a getSupportActionBar()
    {
        return getDelegate().a();
    }

    public Intent getSupportParentActivityIntent()
    {
        return NavUtils.getParentActivityIntent(this);
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().e();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getDelegate().a(configuration);
    }

    public void onContentChanged()
    {
        onSupportContentChanged();
    }

    protected void onCreate(Bundle bundle)
    {
        getDelegate().h();
        super.onCreate(bundle);
        getDelegate().a(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
        taskstackbuilder.addParentStack(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getDelegate().f();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        android.support.v7.app.a a1 = getSupportActionBar();
        if (menuitem.getItemId() == 0x102002c && a1 != null && (a1.a() & 4) != 0)
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
        getDelegate().b(bundle);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getDelegate().d();
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
    }

    protected void onStop()
    {
        super.onStop();
        getDelegate().c();
    }

    public void onSupportActionModeFinished(a a1)
    {
    }

    public void onSupportActionModeStarted(a a1)
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
        getDelegate().a(charsequence);
    }

    public a onWindowStartingSupportActionMode(b b)
    {
        return null;
    }

    public void setContentView(int i)
    {
        getDelegate().a(i);
    }

    public void setContentView(View view)
    {
        getDelegate().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().a(view, layoutparams);
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        getDelegate().a(toolbar);
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

    public a startSupportActionMode(b b)
    {
        return getDelegate().a(b);
    }

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().e();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        NavUtils.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return getDelegate().b(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }
}
