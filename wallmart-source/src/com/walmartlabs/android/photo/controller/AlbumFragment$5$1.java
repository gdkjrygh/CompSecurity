// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.walmartlabs.android.photo.util.PhotoSettings;
import com.walmartlabs.android.photo.util.PhotoUtils;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment

class val.animator extends AnimatorListenerAdapter
{

    final is._cls0 this$1;
    final ViewPropertyAnimator val$animator;

    public void onAnimationEnd(Animator animator1)
    {
        val$animator.setListener(null);
        AlbumFragment.access$300(_fld0).findViewById(com.walmartlabs.android.photo.t).setVisibility(8);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$animator = ViewPropertyAnimator.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/photo/controller/AlbumFragment$5

/* anonymous class */
    class AlbumFragment._cls5
        implements android.view.View.OnClickListener
    {

        final AlbumFragment this$0;

        public void onClick(View view)
        {
            PhotoSettings.get(getActivity()).setFirstStartMessageDisplayed(true);
            if (PhotoUtils.canAnimate())
            {
                view = AlbumFragment.access$300(AlbumFragment.this).findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).animate();
                view.alpha(0.0F).setListener(view. new AlbumFragment._cls5._cls1());
            } else
            {
                AlbumFragment.access$300(AlbumFragment.this).findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).setVisibility(8);
            }
            AlbumFragment.access$400(AlbumFragment.this, true);
        }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
    }

}
