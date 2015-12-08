// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.walmart.android.app.item.view:
//            ModuleView

public static class mModuleView
{

    private final ModuleView mModuleView;

    public ModuleView build()
    {
        return mModuleView;
    }

    public mModuleView setContent(View view)
    {
        mModuleView.setContent(view);
        if (view instanceof WebView)
        {
            view.setOnTouchListener(new android.view.View.OnTouchListener() {

                final ModuleView.Builder this$0;

                public boolean onTouch(View view1, MotionEvent motionevent)
                {
                    return mModuleView.onTouchEvent(motionevent);
                }

            
            {
                this$0 = ModuleView.Builder.this;
                super();
            }
            });
        }
        return this;
    }

    public vent setContent(CharSequence charsequence)
    {
        mModuleView.setContent(charsequence);
        return this;
    }

    public nt setTitle(int i)
    {
        mModuleView.setTitle(i);
        return this;
    }

    public  setTitle(CharSequence charsequence)
    {
        mModuleView.setTitle(charsequence);
        return this;
    }


    public _cls1.this._cls0(Context context)
    {
        mModuleView = new ModuleView(context);
    }
}
