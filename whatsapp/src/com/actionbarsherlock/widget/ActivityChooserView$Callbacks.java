// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.actionbarsherlock.view.ActionProvider;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserView, SearchView, ActivityChooserModel

class <init>
    implements android.widget.r, android.view.ner, android.view.ner, android.widget.r
{

    final ActivityChooserView this$0;

    private void notifyOnDismissListener()
    {
        try
        {
            if (ActivityChooserView.access$1100(ActivityChooserView.this) != null)
            {
                ActivityChooserView.access$1100(ActivityChooserView.this).onDismiss();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void onClick(View view)
    {
        boolean flag = SearchView.a;
        if (view == ActivityChooserView.access$800(ActivityChooserView.this))
        {
            dismissPopup();
            Object obj = ActivityChooserView.access$000(ActivityChooserView.this).getDefaultActivity();
            int i = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().getActivityIndex(((android.content.pm.ResolveInfo) (obj)));
            obj = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().chooseActivity(i);
            if (obj != null)
            {
                try
                {
                    ActivityChooserView.access$700(ActivityChooserView.this).startActivity(((android.content.Intent) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_143;
            }
        }
        obj = ActivityChooserView.access$900(ActivityChooserView.this);
        if (view == obj)
        {
            try
            {
                ActivityChooserView.access$602(ActivityChooserView.this, false);
                ActivityChooserView.access$500(ActivityChooserView.this, ActivityChooserView.access$1000(ActivityChooserView.this));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_143;
            }
        }
        throw new IllegalArgumentException();
        view;
        throw view;
    }

    public void onDismiss()
    {
        try
        {
            notifyOnDismissListener();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(false);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = SearchView.a;
        ((ooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 40
    //                   0 65
    //                   1 51;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalArgumentException();
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            throw adapterview;
        }
_L3:
        ActivityChooserView.access$500(ActivityChooserView.this, 0x7fffffff);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        boolean flag1;
        dismissPopup();
        flag1 = ActivityChooserView.access$600(ActivityChooserView.this);
        if (!flag1) goto _L5; else goto _L4
_L4:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().setDefaultActivity(i);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        boolean flag2;
        try
        {
            flag2 = ActivityChooserView.access$000(ActivityChooserView.this).getShowDefaultActivity();
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            throw adapterview;
        }
        if (!flag2)
        {
            i++;
        }
        adapterview = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel().chooseActivity(i);
        if (adapterview != null)
        {
            try
            {
                ActivityChooserView.access$700(ActivityChooserView.this).startActivity(adapterview);
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                throw adapterview;
            }
        }
        if (flag) goto _L1; else goto _L6
_L6:
        return;
        adapterview;
        try
        {
            throw adapterview;
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview) { }
        try
        {
            throw adapterview;
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview) { }
        try
        {
            throw adapterview;
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview) { }
        throw adapterview;
    }

    public boolean onLongClick(View view)
    {
        android.widget.FrameLayout framelayout;
        int i;
        try
        {
            framelayout = ActivityChooserView.access$800(ActivityChooserView.this);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
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
            catch (View view)
            {
                throw view;
            }
        }
        if (view != framelayout)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        i = ActivityChooserView.access$000(ActivityChooserView.this).getCount();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ActivityChooserView.access$602(ActivityChooserView.this, true);
        ActivityChooserView.access$500(ActivityChooserView.this, ActivityChooserView.access$1000(ActivityChooserView.this));
        if (!SearchView.a)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        throw new IllegalArgumentException();
        return true;
    }

    private ooserViewAdapter()
    {
        this$0 = ActivityChooserView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
