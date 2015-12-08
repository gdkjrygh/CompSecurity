// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.Activity;
import com.walmartlabs.utils.WLog;
import java.util.Stack;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebPresenter

private class <init>
    implements tener
{

    final WebPresenter this$0;

    public void back()
    {
        WLog.d(WebPresenter.access$000(), "JSPageListener.back()");
        if (!WebPresenter.access$800(WebPresenter.this))
        {
            WLog.d(WebPresenter.access$000(), "Can't go back anymore. Sending back press to activity.");
            WebPresenter.access$900(WebPresenter.this).onBackPressed();
        }
    }

    public void onStatePushed(this._cls0 _pcls0)
    {
        WLog.d(WebPresenter.access$000(), "JSPageListener.onStatePushed()");
        if (_pcls0 != null)
        {
            _pcls0 = new this._cls0(_pcls0);
        } else
        {
            _pcls0 = WebPresenter.access$300(WebPresenter.this);
        }
        _pcls0.Refresh = false;
        WebPresenter.access$400(WebPresenter.this, _pcls0);
    }

    public void onStateReplaced(this._cls0 _pcls0)
    {
        WLog.d(WebPresenter.access$000(), "JSPageListener.onStateReplaced()");
        if (WebPresenter.access$500(WebPresenter.this) != null)
        {
            WebPresenter.access$500(WebPresenter.this)._mth0(_pcls0);
            WLog.d(WebPresenter.access$000(), "replacing state of page that has not yet been pushed (onPageFinished not yet received)");
            return;
        }
        if (!WebPresenter.access$600(WebPresenter.this).isEmpty())
        {
            ((this._cls0)WebPresenter.access$600(WebPresenter.this).peek())._mth0(_pcls0);
            WebPresenter.access$700(WebPresenter.this, _pcls0);
            WLog.d(WebPresenter.access$000(), "replacing state of top page");
            return;
        } else
        {
            WLog.e(WebPresenter.access$000(), "Illegal State. Tried to replace page when there was nothing previously pushed!");
            return;
        }
    }

    private tener()
    {
        this$0 = WebPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
