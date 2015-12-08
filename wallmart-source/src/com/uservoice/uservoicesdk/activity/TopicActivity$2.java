// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.ui.LoadAllAdapter;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            TopicActivity

class this._cls0
    implements android.support.v7.app.gationListener
{

    final TopicActivity this$0;

    public boolean onNavigationItemSelected(int i, long l)
    {
        Topic topic = (Topic)Session.getInstance().getTopics().get(i);
        Session.getInstance().setTopic(topic);
        ((LoadAllAdapter)getListAdapter()).reload();
        return true;
    }

    r()
    {
        this$0 = TopicActivity.this;
        super();
    }
}
