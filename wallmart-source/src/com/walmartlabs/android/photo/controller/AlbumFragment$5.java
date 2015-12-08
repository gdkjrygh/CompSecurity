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

class this._cls0
    implements android.view.ener
{

    final AlbumFragment this$0;

    public void onClick(final View animator)
    {
        PhotoSettings.get(getActivity()).setFirstStartMessageDisplayed(true);
        if (PhotoUtils.canAnimate())
        {
            animator = AlbumFragment.access$300(AlbumFragment.this).findViewById(com.walmartlabs.android.photo.out).animate();
            animator.alpha(0.0F).setListener(new AnimatorListenerAdapter() {

                final AlbumFragment._cls5 this$1;
                final ViewPropertyAnimator val$animator;

                public void onAnimationEnd(Animator animator1)
                {
                    animator.setListener(null);
                    AlbumFragment.access$300(this$0).findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).setVisibility(8);
                }

            
            {
                this$1 = AlbumFragment._cls5.this;
                animator = viewpropertyanimator;
                super();
            }
            });
        } else
        {
            AlbumFragment.access$300(AlbumFragment.this).findViewById(com.walmartlabs.android.photo.out).setVisibility(8);
        }
        AlbumFragment.access$400(AlbumFragment.this, true);
    }

    _cls1.val.animator()
    {
        this$0 = AlbumFragment.this;
        super();
    }
}
