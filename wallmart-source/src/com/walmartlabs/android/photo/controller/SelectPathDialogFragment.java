// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment

public class SelectPathDialogFragment extends DialogFragment
{

    public SelectPathDialogFragment()
    {
    }

    private void doDismiss()
    {
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public static SelectPathDialogFragment newInstance()
    {
        return new SelectPathDialogFragment();
    }

    private void onDone(boolean flag)
    {
        AlbumFragment albumfragment = (AlbumFragment)getTargetFragment();
        if (albumfragment != null)
        {
            albumfragment.onPathSelected(flag);
        }
        doDismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, com.walmartlabs.android.photo.R.style.ViewOnlyDialog);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_dialog_path_selection, viewgroup, false);
        layoutinflater.findViewById(com.walmartlabs.android.photo.R.id.for_all_button).setOnClickListener(new android.view.View.OnClickListener() {

            final SelectPathDialogFragment this$0;

            public void onClick(View view)
            {
                onDone(true);
            }

            
            {
                this$0 = SelectPathDialogFragment.this;
                super();
            }
        });
        layoutinflater.findViewById(com.walmartlabs.android.photo.R.id.for_each_button).setOnClickListener(new android.view.View.OnClickListener() {

            final SelectPathDialogFragment this$0;

            public void onClick(View view)
            {
                onDone(false);
            }

            
            {
                this$0 = SelectPathDialogFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

}
