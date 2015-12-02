// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.internal:
//            ActionBarSherlockCompat

class mWrapped
    implements com.actionbarsherlock.view.per
{

    private final com.actionbarsherlock.view.per.mWrapped mWrapped;
    final ActionBarSherlockCompat this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return mWrapped.mWrapped(actionmode, menuitem);
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        return mWrapped.mWrapped(actionmode, menu);
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        mWrapped.mWrapped(actionmode);
        if (ActionBarSherlockCompat.access$300(ActionBarSherlockCompat.this) != null)
        {
            ActionBarSherlockCompat.access$300(ActionBarSherlockCompat.this).setVisibility(8);
            ActionBarSherlockCompat.access$300(ActionBarSherlockCompat.this).removeAllViews();
        }
        if (ActionBarSherlockCompat.access$400(ActionBarSherlockCompat.this) instanceof com.actionbarsherlock.kWrapper.this._cls0)
        {
            ((com.actionbarsherlock.kWrapper.this._cls0)ActionBarSherlockCompat.access$600(ActionBarSherlockCompat.this)).ctionModeFinished(ActionBarSherlockCompat.access$500(ActionBarSherlockCompat.this));
        }
        ActionBarSherlockCompat.access$502(ActionBarSherlockCompat.this, null);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return mWrapped.mWrapped(actionmode, menu);
    }

    public (com.actionbarsherlock.view.per per)
    {
        this$0 = ActionBarSherlockCompat.this;
        super();
        mWrapped = per;
    }
}
